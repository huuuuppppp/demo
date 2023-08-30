package com.test.demo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 员工列表分页请求对象
 */
@Data
public class EmployeesPageRequest {

    @ApiModelProperty("第几页")
    private int pageNum;

    @ApiModelProperty("每页长度")
    private int pageSize;

    @ApiModelProperty("职工名称")
    private String employeesName;

    @ApiModelProperty("部门名称")
    private String deptName;

    @ApiModelProperty("学历名称")
    private String degreeName;

}
