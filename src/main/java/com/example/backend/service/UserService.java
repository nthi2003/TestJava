package com.example.backend.service;


import com.example.backend.dao.UserRespository;
import com.example.backend.entity.Users;
import com.example.backend.config.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    public String newUser(Users user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));


        Users newUser = userRespository.save(user);


        return jwtTokenUtil.generateToken(newUser.getUsername());
    }
}
