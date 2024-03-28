package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author rumman
 * @since 03/28,2024
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
