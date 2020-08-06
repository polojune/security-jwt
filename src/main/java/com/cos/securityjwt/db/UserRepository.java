package com.cos.securityjwt.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.securityjwt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
   User findByUsername(String username);
}
