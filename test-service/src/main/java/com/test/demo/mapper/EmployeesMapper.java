package com.test.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.demo.entity.Employees;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeesMapper extends BaseMapper<Employees> {
}
