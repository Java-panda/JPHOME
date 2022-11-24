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
import com.jphome.system.domain.SharehouseRoom;
import com.jphome.system.service.ISharehouseRoomService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 部屋管理Controller
 * 
 * @author Jpanda
 * @date 2022-11-17
 */
@Controller
@RequestMapping("/system/room")
public class SharehouseRoomController extends BaseController
{
    private String prefix = "system/room";

    @Autowired
    private ISharehouseRoomService sharehouseRoomService;

    @RequiresPermissions("system:room:view")
    @GetMapping()
    public String room()
    {
        return prefix + "/room";
    }

    /**
     * 查询部屋管理列表
     */
    @RequiresPermissions("system:room:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SharehouseRoom sharehouseRoom)
    {
        startPage();
        List<SharehouseRoom> list = sharehouseRoomService.selectSharehouseRoomList(sharehouseRoom);
        return getDataTable(list);
    }

    /**
     * 导出部屋管理列表
     */
    @RequiresPermissions("system:room:export")
    @Log(title = "部屋管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SharehouseRoom sharehouseRoom)
    {
        List<SharehouseRoom> list = sharehouseRoomService.selectSharehouseRoomList(sharehouseRoom);
        ExcelUtil<SharehouseRoom> util = new ExcelUtil<SharehouseRoom>(SharehouseRoom.class);
        return util.exportExcel(list, "部屋管理数据");
    }

    /**
     * 新增部屋管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存部屋管理
     */
    @RequiresPermissions("system:room:add")
    @Log(title = "部屋管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SharehouseRoom sharehouseRoom)
    {
        return toAjax(sharehouseRoomService.insertSharehouseRoom(sharehouseRoom));
    }

    /**
     * 修改部屋管理
     */
    @RequiresPermissions("system:room:edit")
    @GetMapping("/edit/{sharehouseId}")
    public String edit(@PathVariable("sharehouseId") Long sharehouseId, ModelMap mmap)
    {
        SharehouseRoom sharehouseRoom = sharehouseRoomService.selectSharehouseRoomBySharehouseId(sharehouseId);
        mmap.put("sharehouseRoom", sharehouseRoom);
        return prefix + "/edit";
    }

    /**
     * 修改保存部屋管理
     */
    @RequiresPermissions("system:room:edit")
    @Log(title = "部屋管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SharehouseRoom sharehouseRoom)
    {
        return toAjax(sharehouseRoomService.updateSharehouseRoom(sharehouseRoom));
    }

    /**
     * 删除部屋管理
     */
    @RequiresPermissions("system:room:remove")
    @Log(title = "部屋管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sharehouseRoomService.deleteSharehouseRoomBySharehouseIds(ids));
    }
}
