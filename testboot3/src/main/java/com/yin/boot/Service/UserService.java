package com.yin.boot.Service;

import com.yin.boot.model.User;

import java.util.List;

public interface UserService {
    User getUserById(int id);

    List<User> getAll();

    User getOne();

    void insert(User user);

    void update(User user);

    void delete(int id);
}
