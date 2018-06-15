package com.mpl.bootdemo;

import com.mpl.bootdemo.data.User;
import com.mpl.bootdemo.data.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitialization implements ApplicationRunner {
    private final UserRepository userRepository;

    public DataInitialization(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        userRepository.saveAll(Arrays.asList(
                new User("user1", "User", "Test 1"),
                new User("user2", "User", "Test 2")
        ));

        userRepository.findAll().forEach(System.out::println);
    }
}
