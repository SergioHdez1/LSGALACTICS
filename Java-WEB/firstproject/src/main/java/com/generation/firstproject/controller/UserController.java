package com.generation.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.firstproject.model.User;
import com.generation.firstproject.service.UserService;

@RestController
public class UserController {

    public UserService userService;

    public UserController(@Autowired UserService userService){
        this.userService = userService;
        userService.add(new User(1, "Juan", "Barria"));
    }

    @GetMapping("/user")
    public User getUser() {
        return userService.getUser(0);
    }
}
