package com.yin.boot.mapper;

import com.yin.boot.model.User;

import java.util.List;

public interface UserMapper {
    User getUserById(int id);

    List<User> getAll();

    User getOne();

    void insert(User user);

    void update(User user);

    void delete(int id);
}