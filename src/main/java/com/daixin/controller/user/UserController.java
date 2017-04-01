package com.daixin.controller.user;

import com.daixin.model.User;
import com.daixin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by daixin on 17-3-21.
 */
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    public void register(User user){
        userService.addUser(user);
    }
}
