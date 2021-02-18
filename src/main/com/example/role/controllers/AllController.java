package com.example.role.controllers;

import com.example.role.dao.UserMapper;
import com.example.role.entitis.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class AllController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/test")
    public String test(){
        User user = new User();
        user.setUserName("lkm");
        user.setPassWord("123");
        userMapper.insert(user);
        return user.toString();
    }

}
