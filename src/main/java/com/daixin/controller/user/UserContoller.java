package com.daixin.controller.user;

import java.util.List;

import com.daixin.model.User;
import com.daixin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daixin on 17-3-21.
 */
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public List<User> login(){
        return userService.addUser();
    }
}
