package com.jphome.system.mapper;

import com.jphome.system.domain.Department;

import java.util.List;

/**
 * 部门管理Mapper接口
 * 
 * @author Jpanda
 * @date 2022-11-12
 */
public interface DepartmentMapper 
{
    /**
     * 查询部门管理
     * 
     * @param id 部门管理主键
     * @return 部门管理
     */
    public Department selectDepartmentById(Long id);

    /**
     * 查询部门管理列表
     * 
     * @param department 部门管理
     * @return 部门管理集合
     */
    public List<Department> selectDepartmentList(Department department);

    /**
     * 新增部门管理
     * 
     * @param department 部门管理
     * @return 结果
     */
    public int insertDepartment(Department department);

    /**
     * 修改部门管理
     * 
     * @param department 部门管理
     * @return 结果
     */
    public int updateDepartment(Department department);

    /**
     * 删除部门管理
     * 
     * @param id 部门管理主键
     * @return 结果
     */
    public int deleteDepartmentById(Long id);

    /**
     * 批量删除部门管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDepartmentByIds(String[] ids);
}
