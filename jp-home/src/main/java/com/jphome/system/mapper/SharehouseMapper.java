package com.jphome.system.mapper;

import java.util.List;
import com.jphome.system.domain.Sharehouse;
import com.jphome.system.domain.SharehouseRoom;

/**
 * 建物管理Mapper接口
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
public interface SharehouseMapper 
{
    /**
     * 查询建物管理
     * 
     * @param sharehouseId 建物管理主键
     * @return 建物管理
     */
    public Sharehouse selectSharehouseBySharehouseId(Long sharehouseId);

    /**
     * 查询建物管理列表
     * 
     * @param sharehouse 建物管理
     * @return 建物管理集合
     */
    public List<Sharehouse> selectSharehouseList(Sharehouse sharehouse);

    /**
     * 新增建物管理
     * 
     * @param sharehouse 建物管理
     * @return 结果
     */
    public int insertSharehouse(Sharehouse sharehouse);

    /**
     * 修改建物管理
     * 
     * @param sharehouse 建物管理
     * @return 结果
     */
    public int updateSharehouse(Sharehouse sharehouse);

    /**
     * 删除建物管理
     * 
     * @param sharehouseId 建物管理主键
     * @return 结果
     */
    public int deleteSharehouseBySharehouseId(Long sharehouseId);

    /**
     * 批量删除建物管理
     * 
     * @param sharehouseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSharehouseBySharehouseIds(String[] sharehouseIds);

    /**
     * 批量删除部屋管理
     * 
     * @param sharehouseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSharehouseRoomBySharehouseIds(String[] sharehouseIds);
    
    /**
     * 批量新增部屋管理
     * 
     * @param sharehouseRoomList 部屋管理列表
     * @return 结果
     */
    public int batchSharehouseRoom(List<SharehouseRoom> sharehouseRoomList);
    

    /**
     * 通过建物管理主键删除部屋管理信息
     * 
     * @param sharehouseId 建物管理ID
     * @return 结果
     */
    public int deleteSharehouseRoomBySharehouseId(Long sharehouseId);
}
