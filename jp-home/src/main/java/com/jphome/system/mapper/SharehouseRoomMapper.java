package com.jphome.system.mapper;

import java.util.List;
import com.jphome.system.domain.SharehouseRoom;

/**
 * 部屋管理Mapper接口
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
public interface SharehouseRoomMapper 
{
    /**
     * 查询部屋管理
     * 
     * @param sharehouseId 部屋管理主键
     * @return 部屋管理
     */
    public SharehouseRoom selectSharehouseRoomBySharehouseId(Long sharehouseId);

    /**
     * 查询部屋管理列表
     * 
     * @param sharehouseRoom 部屋管理
     * @return 部屋管理集合
     */
    public List<SharehouseRoom> selectSharehouseRoomList(SharehouseRoom sharehouseRoom);

    /**
     * 新增部屋管理
     * 
     * @param sharehouseRoom 部屋管理
     * @return 结果
     */
    public int insertSharehouseRoom(SharehouseRoom sharehouseRoom);

    /**
     * 修改部屋管理
     * 
     * @param sharehouseRoom 部屋管理
     * @return 结果
     */
    public int updateSharehouseRoom(SharehouseRoom sharehouseRoom);

    /**
     * 删除部屋管理
     * 
     * @param sharehouseId 部屋管理主键
     * @return 结果
     */
    public int deleteSharehouseRoomBySharehouseId(Long sharehouseId);

    /**
     * 批量删除部屋管理
     * 
     * @param sharehouseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSharehouseRoomBySharehouseIds(String[] sharehouseIds);
}
