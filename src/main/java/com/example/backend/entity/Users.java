package com.example.backend.entity;

import com.example.backend.entity.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)



    private UUID id;
    @Column(nullable = false , unique = true)
    private String username;
    @Column(nullable = false )
    private String password;
    @Column(nullable = false , unique = true )
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String phone;

    public Users(){
        this.role = Role.USER;
    }


}
