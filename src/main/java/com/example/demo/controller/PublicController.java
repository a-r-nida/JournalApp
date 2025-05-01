package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
public class PublicController {
    @Autowired
    private UserService userservice;
    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok";
    }

    @PostMapping("create-user")
    public void createUser(@RequestBody User user){
        userservice.saveNewUser(user);
    }

}
