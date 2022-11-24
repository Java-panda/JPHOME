package com.jphome.system.controller;

import java.util.List;
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
import com.jphome.system.domain.Sharehouse;
import com.jphome.system.service.ISharehouseService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 建物管理Controller
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
@Controller
@RequestMapping("/system/sharehouse")
public class SharehouseController extends BaseController
{
    private String prefix = "system/sharehouse";

    @Autowired
    private ISharehouseService sharehouseService;

    @RequiresPermissions("system:sharehouse:view")
    @GetMapping()
    public String sharehouse()
    {
        return prefix + "/sharehouse";
    }

    /**
     * 查询建物管理列表
     */
    @RequiresPermissions("system:sharehouse:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Sharehouse sharehouse)
    {
        startPage();
        List<Sharehouse> list = sharehouseService.selectSharehouseList(sharehouse);
        return getDataTable(list);
    }

    /**
     * 导出建物管理列表
     */
    @RequiresPermissions("system:sharehouse:export")
    @Log(title = "建物管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Sharehouse sharehouse)
    {
        List<Sharehouse> list = sharehouseService.selectSharehouseList(sharehouse);
        ExcelUtil<Sharehouse> util = new ExcelUtil<Sharehouse>(Sharehouse.class);
        return util.exportExcel(list, "建物管理数据");
    }

    /**
     * 新增建物管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存建物管理
     */
    @RequiresPermissions("system:sharehouse:add")
    @Log(title = "建物管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Sharehouse sharehouse)
    {
        return toAjax(sharehouseService.insertSharehouse(sharehouse));
    }

    /**
     * 修改建物管理
     */
    @RequiresPermissions("system:sharehouse:edit")
    @GetMapping("/edit/{sharehouseId}")
    public String edit(@PathVariable("sharehouseId") Long sharehouseId, ModelMap mmap)
    {
        Sharehouse sharehouse = sharehouseService.selectSharehouseBySharehouseId(sharehouseId);
        mmap.put("sharehouse", sharehouse);
        return prefix + "/edit";
    }

    /**
     * 修改保存建物管理
     */
    @RequiresPermissions("system:sharehouse:edit")
    @Log(title = "建物管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Sharehouse sharehouse)
    {
        return toAjax(sharehouseService.updateSharehouse(sharehouse));
    }

    /**
     * 删除建物管理
     */
    @RequiresPermissions("system:sharehouse:remove")
    @Log(title = "建物管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sharehouseService.deleteSharehouseBySharehouseIds(ids));
    }
}
