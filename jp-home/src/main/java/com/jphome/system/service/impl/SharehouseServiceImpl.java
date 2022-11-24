package com.jphome.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.jphome.system.domain.SharehouseRoom;
import com.jphome.system.mapper.SharehouseMapper;
import com.jphome.system.domain.Sharehouse;
import com.jphome.system.service.ISharehouseService;
import com.ruoyi.common.core.text.Convert;

/**
 * 建物管理Service业务层处理
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
@Service
public class SharehouseServiceImpl implements ISharehouseService 
{
    @Autowired
    private SharehouseMapper sharehouseMapper;

    /**
     * 查询建物管理
     * 
     * @param sharehouseId 建物管理主键
     * @return 建物管理
     */
    @Override
    public Sharehouse selectSharehouseBySharehouseId(Long sharehouseId)
    {
        return sharehouseMapper.selectSharehouseBySharehouseId(sharehouseId);
    }

    /**
     * 查询建物管理列表
     * 
     * @param sharehouse 建物管理
     * @return 建物管理
     */
    @Override
    public List<Sharehouse> selectSharehouseList(Sharehouse sharehouse)
    {
        return sharehouseMapper.selectSharehouseList(sharehouse);
    }

    /**
     * 新增建物管理
     * 
     * @param sharehouse 建物管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertSharehouse(Sharehouse sharehouse)
    {
        sharehouse.setCreateTime(DateUtils.getNowDate());
        int rows = sharehouseMapper.insertSharehouse(sharehouse);
        insertSharehouseRoom(sharehouse);
        return rows;
    }

    /**
     * 修改建物管理
     * 
     * @param sharehouse 建物管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updateSharehouse(Sharehouse sharehouse)
    {
        sharehouse.setUpdateTime(DateUtils.getNowDate());
        sharehouseMapper.deleteSharehouseRoomBySharehouseId(sharehouse.getSharehouseId());
        insertSharehouseRoom(sharehouse);
        return sharehouseMapper.updateSharehouse(sharehouse);
    }

    /**
     * 批量删除建物管理
     * 
     * @param sharehouseIds 需要删除的建物管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteSharehouseBySharehouseIds(String sharehouseIds)
    {
        sharehouseMapper.deleteSharehouseRoomBySharehouseIds(Convert.toStrArray(sharehouseIds));
        return sharehouseMapper.deleteSharehouseBySharehouseIds(Convert.toStrArray(sharehouseIds));
    }

    /**
     * 删除建物管理信息
     * 
     * @param sharehouseId 建物管理主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteSharehouseBySharehouseId(Long sharehouseId)
    {
        sharehouseMapper.deleteSharehouseRoomBySharehouseId(sharehouseId);
        return sharehouseMapper.deleteSharehouseBySharehouseId(sharehouseId);
    }

    /**
     * 新增部屋管理信息
     * 
     * @param sharehouse 建物管理对象
     */
    public void insertSharehouseRoom(Sharehouse sharehouse)
    {
        List<SharehouseRoom> sharehouseRoomList = sharehouse.getSharehouseRoomList();
        Long sharehouseId = sharehouse.getSharehouseId();
        if (StringUtils.isNotNull(sharehouseRoomList))
        {
            List<SharehouseRoom> list = new ArrayList<SharehouseRoom>();
            for (SharehouseRoom sharehouseRoom : sharehouseRoomList)
            {
                sharehouseRoom.setSharehouseId(sharehouseId);
                list.add(sharehouseRoom);
            }
            if (list.size() > 0)
            {
                sharehouseMapper.batchSharehouseRoom(list);
            }
        }
    }
}
