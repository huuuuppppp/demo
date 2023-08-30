package com.test.demo.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.demo.entity.Employees;
import com.test.demo.mapper.EmployeesMapper;
import com.test.demo.request.EmployeesPageRequest;
import com.test.demo.request.EmployeesSaveRequest;
import com.test.demo.service.EmployeesService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;


@Service
public class EmployeesServiceImpl extends ServiceImpl<EmployeesMapper, Employees> implements EmployeesService {

    @Override
    public Page<Employees> getPage(EmployeesPageRequest request) {
        Page<Employees> page = new Page<>(request.getPageNum(), request.getPageSize());
        LambdaQueryWrapper<Employees> lqw = new LambdaQueryWrapper<>();
        lqw.like(!StringUtils.isBlank(request.getEmployeesName()), Employees::getEmpName, request.getEmployeesName());
        lqw.eq(!StringUtils.isBlank(request.getDeptName()), Employees::getDeptName, request.getDeptName());
        lqw.like(!StringUtils.isBlank(request.getDegreeName()), Employees::getEmpDegreeName, request.getDegreeName());
        return this.page(page, lqw);
    }

    @Override
    public Boolean saveEmployees(EmployeesSaveRequest request) {
        Employees employees = new Employees();
        BeanUtils.copyProperties(request, employees);
        return this.saveOrUpdate(employees);
    }
}
