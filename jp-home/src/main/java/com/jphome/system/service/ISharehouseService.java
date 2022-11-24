package com.jphome.system.service;

import java.util.List;
import com.jphome.system.domain.Sharehouse;

/**
 * 建物管理Service接口
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
public interface ISharehouseService 
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
     * 批量删除建物管理
     * 
     * @param sharehouseIds 需要删除的建物管理主键集合
     * @return 结果
     */
    public int deleteSharehouseBySharehouseIds(String sharehouseIds);

    /**
     * 删除建物管理信息
     * 
     * @param sharehouseId 建物管理主键
     * @return 结果
     */
    public int deleteSharehouseBySharehouseId(Long sharehouseId);
}
