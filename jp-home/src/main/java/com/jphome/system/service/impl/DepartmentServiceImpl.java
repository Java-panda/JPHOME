package com.jphome.system.service.impl;

import com.jphome.system.domain.Department;
import com.jphome.system.mapper.DepartmentMapper;
import com.jphome.system.service.IDepartmentService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 部门管理Service业务层处理
 * 
 * @author Jpanda
 * @date 2022-11-12
 */
@Service
public class DepartmentServiceImpl implements IDepartmentService
{
    @Autowired
    private DepartmentMapper departmentMapper;

    /**
     * 查询部门管理
     * 
     * @param id 部门管理主键
     * @return 部门管理
     */
    @Override
    public Department selectDepartmentById(Long id)
    {
        return departmentMapper.selectDepartmentById(id);
    }

    /**
     * 查询部门管理列表
     * 
     * @param department 部门管理
     * @return 部门管理
     */
    @Override
    public List<Department> selectDepartmentList(Department department)
    {
        return departmentMapper.selectDepartmentList(department);
    }

    /**
     * 新增部门管理
     * 
     * @param department 部门管理
     * @return 结果
     */
    @Override
    public int insertDepartment(Department department)
    {
        return departmentMapper.insertDepartment(department);
    }

    /**
     * 修改部门管理
     * 
     * @param department 部门管理
     * @return 结果
     */
    @Override
    public int updateDepartment(Department department)
    {
        return departmentMapper.updateDepartment(department);
    }

    /**
     * 批量删除部门管理
     * 
     * @param ids 需要删除的部门管理主键
     * @return 结果
     */
    @Override
    public int deleteDepartmentByIds(String ids)
    {
        return departmentMapper.deleteDepartmentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除部门管理信息
     * 
     * @param id 部门管理主键
     * @return 结果
     */
    @Override
    public int deleteDepartmentById(Long id)
    {
        return departmentMapper.deleteDepartmentById(id);
    }
}
