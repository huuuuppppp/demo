package com.test.demo.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.demo.entity.User;
import com.test.demo.mapper.UserMapper;
import com.test.demo.request.LoginRequest;
import com.test.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public boolean login(LoginRequest request) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.eq(User::getUserName, request.getUsername());
        lqw.eq(User::getPassword, request.getPassword());
        return this.list(lqw).size() > 0;
    }
}
