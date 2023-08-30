package com.test.demo.controller;


import com.test.demo.common.AjaxResult;
import com.test.demo.common.BaseController;
import com.test.demo.request.LoginRequest;
import com.test.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@Api(tags = "登陆")
public class LogInController extends BaseController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation("简易登陆")
    public AjaxResult login(@RequestBody @Valid LoginRequest request) {
        return toAjaxLogin(userService.login(request));
    }
}
