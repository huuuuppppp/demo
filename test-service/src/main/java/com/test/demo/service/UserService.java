package com.test.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.demo.entity.User;
import com.test.demo.request.LoginRequest;

public interface UserService extends IService<User> {

    /**
     * 简易登陆
     *
     * @param request
     * @return
     */
    boolean login(LoginRequest request);
}
