package com.example.controller;

import com.example.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    User user01;

    @GetMapping("/hello")
    public String handle01() {
        return "hello";
    }


    @GetMapping("/user")
    public User user01() {
        return user01;
    }
}
