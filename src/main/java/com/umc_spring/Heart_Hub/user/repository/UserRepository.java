package com.umc_spring.Heart_Hub.user.repository;

import com.umc_spring.Heart_Hub.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String username);

}
