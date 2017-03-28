package com.daixin.service.impl;

import com.daixin.model.User;
import com.daixin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daixin on 17-3-28.
 */
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User addUser(User user) {
        return userMapper.addUser(user);
    }
}
