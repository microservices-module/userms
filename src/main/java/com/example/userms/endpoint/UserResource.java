package com.example.userms.endpoint;

import com.example.userms.domain.User;
import com.example.userms.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/hello")
    public String getHello() {
        System.out.println("****************");
        return "Hello World!";
    }
}
