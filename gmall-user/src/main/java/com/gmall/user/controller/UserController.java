package com.gmall.user.controller;

import com.gmall.user.bean.UmsMember;
import com.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: aqua
 * @create: 2019-09-12 09:22
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getAllUser")
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

}