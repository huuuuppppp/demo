package com.test.demo.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.test.demo.entity.Employees;
import com.test.demo.request.EmployeesPageRequest;
import com.test.demo.request.EmployeesSaveRequest;

public interface EmployeesService extends IService<Employees> {


    /**
     * 分页查询员工信息
     */
    Page<Employees> getPage(EmployeesPageRequest request);

    /**
     * 保存员工信息
     */
    Boolean saveEmployees(EmployeesSaveRequest request);
}
