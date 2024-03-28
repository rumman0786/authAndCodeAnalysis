package com.example.repository;

import com.example.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author rumman
 * @since 03/28,2024
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);

}