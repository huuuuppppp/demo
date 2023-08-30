package com.test.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
