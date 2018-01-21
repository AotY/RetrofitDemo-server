package com.xjtu.controller;

import com.xjtu.bean.User;
import com.xjtu.common.CommonResponse;
import com.xjtu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by LeonTao on 2018/1/21.
 */

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping(value = "/list")
    public CommonResponse<List<User>> getUsers() {
        return userService.getUsers();
    }

    @PostMapping(value = "/add")
    public CommonResponse addUser(User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/user/{id}")
    public CommonResponse<User> getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

    @PutMapping(value = "/update")
    public CommonResponse<User> updateUser(User user) {
        return userService.updateUser(user);
    }
}
