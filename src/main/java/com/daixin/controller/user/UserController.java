package com.daixin.controller.user;

import com.daixin.model.User;
import com.daixin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by daixin on 17-3-21.
 */
@Controller
@RequestMapping(value = "/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "register", method = {RequestMethod.POST, RequestMethod.GET})
    public void register(User user){
        userService.addUser(user);
    }
    @RequestMapping(value = "registerPage", method = {RequestMethod.POST, RequestMethod.GET})
    public String registerPage(){
        return "/user/register";
    }
    @RequestMapping(value = "loginPage", method = {RequestMethod.POST, RequestMethod.GET})
    public String loginPage(){
        return "/user/login";
    }
}
