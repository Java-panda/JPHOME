package com.jphome.system.controller;

import java.util.List;

import com.jphome.system.domain.Department;
import com.jphome.system.service.IDepartmentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 部门管理Controller
 * 
 * @author Jpanda
 * @date 2022-11-12
 */
@Controller
@RequestMapping("/jphome/department")
public class DepartmentController extends BaseController
{
    private String prefix = "jphome/department";

    @Autowired
    private IDepartmentService departmentService;

    @RequiresPermissions("jphome:department:view")
    @GetMapping()
    public String department()
    {
        return prefix + "/department";
    }

    /**
     * 查询部门管理列表
     */
    @RequiresPermissions("jphome:department:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Department department)
    {
        startPage();
        List<Department> list = departmentService.selectDepartmentList(department);
        return getDataTable(list);
    }

    /**
     * 导出部门管理列表
     */
    @RequiresPermissions("jphome:department:export")
    @Log(title = "部门管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Department department)
    {
        List<Department> list = departmentService.selectDepartmentList(department);
        ExcelUtil<Department> util = new ExcelUtil<Department>(Department.class);
        return util.exportExcel(list, "部门管理数据");
    }

    /**
     * 新增部门管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存部门管理
     */
    @RequiresPermissions("jphome:department:add")
    @Log(title = "部门管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Department department)
    {
        return toAjax(departmentService.insertDepartment(department));
    }

    /**
     * 修改部门管理
     */
    @RequiresPermissions("jphome:department:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Department department = departmentService.selectDepartmentById(id);
        mmap.put("department", department);
        return prefix + "/edit";
    }

    /**
     * 修改保存部门管理
     */
    @RequiresPermissions("jphome:department:edit")
    @Log(title = "部门管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Department department)
    {
        return toAjax(departmentService.updateDepartment(department));
    }

    /**
     * 删除部门管理
     */
    @RequiresPermissions("jphome:department:remove")
    @Log(title = "部门管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(departmentService.deleteDepartmentByIds(ids));
    }
}
