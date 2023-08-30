package com.test.demo.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.test.demo.common.AjaxResult;
import com.test.demo.common.BaseController;
import com.test.demo.entity.Employees;
import com.test.demo.request.EmployeesDelRequest;
import com.test.demo.request.EmployeesPageRequest;
import com.test.demo.request.EmployeesSaveRequest;
import com.test.demo.service.EmployeesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/employees")
@Api(tags = "职员管理")
public class EmployeesController extends BaseController {

    @Resource
    private EmployeesService employeesService;

    @PostMapping("/page")
    @ApiOperation("分页查询职员信息")
    public AjaxResult page(@RequestBody EmployeesPageRequest request) {
        Page<Employees> page = employeesService.getPage(request);
        return success(page);
    }

    @PostMapping("/addOrUpdate")
    @ApiOperation("新增或编辑职员信息")
    public AjaxResult save(@RequestBody EmployeesSaveRequest request) {
        return toAjax(employeesService.saveEmployees(request));
    }

    @PostMapping("/del")
    @ApiOperation("删除员工信息")
    public AjaxResult del(@RequestBody EmployeesDelRequest request) {
        return toAjax(employeesService.removeById(request.getId()));
    }

    @GetMapping("/getInfo/{id}")
    @ApiOperation("获取职员详情")
    public AjaxResult del(@PathVariable("id") Integer id) {
        return success(employeesService.getById(id));
    }

}


