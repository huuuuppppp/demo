package com.test.demo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 员工删除请求对象
 */
@Data
public class EmployeesDelRequest {

    @ApiModelProperty("职工id")
    private Integer id;
}
