package com.mpl.bootdemo.web;

import com.mpl.bootdemo.data.User;
import com.mpl.bootdemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userService.findAll();
    }

    @GetMapping(path = "/{username}")
    public User getUserByUsername(@PathVariable("username") String username) {
        return userService.findByUsername(username);
    }

}
