package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@RestController
@Api(tags = "User Management", description = "Operations pertaining to users in the system")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "View a list of available users", response = List.class)
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @ApiOperation(value = "View the user page")
    @GetMapping("/")
    public String index() {
        return "user";
    }
}
