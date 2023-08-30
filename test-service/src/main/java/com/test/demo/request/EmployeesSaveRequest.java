package com.test.demo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 员工信息保存请求对象
 */
@Data
public class EmployeesSaveRequest {

    @ApiModelProperty("员工id,为空新增,否则是编辑")
    private Long id;

    @ApiModelProperty("员工姓名")
    private String empName;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty("部门名称")
    private String deptName;

    @ApiModelProperty("学历")
    private String empDegreeName;
}
