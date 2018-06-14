package com.yin.boot.Service.impl;

import com.yin.boot.mapper.UserMapper;
import com.yin.boot.model.User;
import com.yin.boot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public User getUserById(int id) {
        return mapper.getUserById(id);
    }

    @Override
    public List<User> getAll() {
        return mapper.getAll();
    }

    @Override
    public User getOne() {
        return mapper.getOne();
    }

    @Override
    public void insert(User user) {
        mapper.insert(user);
    }

    @Override
    public void update(User user) {
        mapper.update(user);
    }

    @Override
    public void delete(int id) {
        mapper.delete(id);
    }
}