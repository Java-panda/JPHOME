package com.jphome.system.controller;

import com.jphome.system.domain.Employee;
import com.jphome.system.service.IEmployeeService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.file.FileUploadUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 员工管理Controller
 * 
 * @author Jpanda
 * @date 2022-11-12
 */
@Controller
@RequestMapping("/jphome/homeImageUpload")
public class HomeImageUploadController extends BaseController
{
    private String prefix = "jphome/employee";

//    @PostMapping("/add")
//    @ResponseBody
//    public AjaxResult addSave(@RequestParam("file") MultipartFile file, FileInfo fileInfo) throws IOException, IOException {
//        // 上传文件路径
//        String filePath = RuoYiConfig.getUploadPath();
//        // 上传并返回新文件名称
//        String fileName = FileUploadUtils.upload(filePath, file);
//        fileInfo.setFilePath(fileName);
//        return toAjax(fileInfoService.insertFileInfo(fileInfo));
//    }
}
