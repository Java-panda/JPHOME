package com.jphome.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jphome.system.mapper.SharehouseRoomMapper;
import com.jphome.system.domain.SharehouseRoom;
import com.jphome.system.service.ISharehouseRoomService;
import com.ruoyi.common.core.text.Convert;

/**
 * 部屋管理Service业务层处理
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
@Service
public class SharehouseRoomServiceImpl implements ISharehouseRoomService 
{
    @Autowired
    private SharehouseRoomMapper sharehouseRoomMapper;

    /**
     * 查询部屋管理
     * 
     * @param sharehouseId 部屋管理主键
     * @return 部屋管理
     */
    @Override
    public SharehouseRoom selectSharehouseRoomBySharehouseId(Long sharehouseId)
    {
        return sharehouseRoomMapper.selectSharehouseRoomBySharehouseId(sharehouseId);
    }

    /**
     * 查询部屋管理列表
     * 
     * @param sharehouseRoom 部屋管理
     * @return 部屋管理
     */
    @Override
    public List<SharehouseRoom> selectSharehouseRoomList(SharehouseRoom sharehouseRoom)
    {
        return sharehouseRoomMapper.selectSharehouseRoomList(sharehouseRoom);
    }

    /**
     * 新增部屋管理
     * 
     * @param sharehouseRoom 部屋管理
     * @return 结果
     */
    @Override
    public int insertSharehouseRoom(SharehouseRoom sharehouseRoom)
    {
        sharehouseRoom.setCreateTime(DateUtils.getNowDate());
        return sharehouseRoomMapper.insertSharehouseRoom(sharehouseRoom);
    }

    /**
     * 修改部屋管理
     * 
     * @param sharehouseRoom 部屋管理
     * @return 结果
     */
    @Override
    public int updateSharehouseRoom(SharehouseRoom sharehouseRoom)
    {
        sharehouseRoom.setUpdateTime(DateUtils.getNowDate());
        return sharehouseRoomMapper.updateSharehouseRoom(sharehouseRoom);
    }

    /**
     * 批量删除部屋管理
     * 
     * @param sharehouseIds 需要删除的部屋管理主键
     * @return 结果
     */
    @Override
    public int deleteSharehouseRoomBySharehouseIds(String sharehouseIds)
    {
        return sharehouseRoomMapper.deleteSharehouseRoomBySharehouseIds(Convert.toStrArray(sharehouseIds));
    }

    /**
     * 删除部屋管理信息
     * 
     * @param sharehouseId 部屋管理主键
     * @return 结果
     */
    @Override
    public int deleteSharehouseRoomBySharehouseId(Long sharehouseId)
    {
        return sharehouseRoomMapper.deleteSharehouseRoomBySharehouseId(sharehouseId);
    }
}
