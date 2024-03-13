package com.example.springbootmybatisplus.controller;

import com.example.springbootmybatisplus.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/niu")
    public String hallo2(){
        System.out.println("is moving");
        System.out.println(userMapper.selectAll());
        return "success"; // 这里返回的字符串会被解析为视图名称
    }

}