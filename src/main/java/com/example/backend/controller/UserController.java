package com.example.backend.controller;

import com.example.backend.entity.Users;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
        public ResponseEntity<String> createUser(@RequestBody Users user){
        String jwt = userService.newUser(user);
        return ResponseEntity.ok(jwt);
    }
}
