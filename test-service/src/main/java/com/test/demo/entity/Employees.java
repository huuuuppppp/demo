package com.test.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 员工信息表
 */
@Data
@TableName("employees")
public class Employees {


    /**
     * 职工id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 职工姓名
     */
    private String empName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 学历
     */
    private String empDegreeName;
}
