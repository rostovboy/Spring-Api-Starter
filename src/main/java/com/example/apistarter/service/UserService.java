package com.example.apistarter.service;

import com.example.apistarter.model.User;

import java.util.List;

public interface UserService {

    User register(User user);

    User update(User user);

    User create(User user);

    List<User> getAll();

    User getByUsername(String username);

    User getById(Long id);

    void delete(Long id);
}
