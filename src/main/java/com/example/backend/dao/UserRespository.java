package com.example.backend.dao;

import com.example.backend.entity.Users; // Chắc chắn rằng bạn có thực thể người dùng trong package này
import org.springframework.data.jpa.repository.JpaRepository;

 public interface UserRespository extends JpaRepository<Users, Long> {

    Users findByUsername(String username);
}
