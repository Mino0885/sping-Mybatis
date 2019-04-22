package com.aoao.spbtuser.service.impl;

import com.aoao.spbtuser.mapper.UserMapper;
import com.aoao.spbtuser.model.User;
import com.aoao.spbtuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }
}
