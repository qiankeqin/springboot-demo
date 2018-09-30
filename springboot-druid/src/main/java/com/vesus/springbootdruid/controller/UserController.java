package com.vesus.springbootdruid.controller;

import com.vesus.springbootdruid.model.User;
import com.vesus.springbootdruid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService ;

    @RequestMapping(value = "/userlist")
    public List<User> getUserList(){
        return userService.findAll() ;
    }


}
