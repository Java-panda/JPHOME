package com.jphome.system.service;

import java.util.List;
import com.jphome.system.domain.SharehouseRoom;

/**
 * 部屋管理Service接口
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
public interface ISharehouseRoomService 
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
     * 批量删除部屋管理
     * 
     * @param sharehouseIds 需要删除的部屋管理主键集合
     * @return 结果
     */
    public int deleteSharehouseRoomBySharehouseIds(String sharehouseIds);

    /**
     * 删除部屋管理信息
     * 
     * @param sharehouseId 部屋管理主键
     * @return 结果
     */
    public int deleteSharehouseRoomBySharehouseId(Long sharehouseId);
}
