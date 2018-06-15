package com.mpl.bootdemo.service;

import com.mpl.bootdemo.data.User;
import com.mpl.bootdemo.data.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
