package com.example.service;

import com.example.dto.UserDto;
import com.example.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserDto userDto);

    User findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

    List<UserDto> findAllUsers();
}
