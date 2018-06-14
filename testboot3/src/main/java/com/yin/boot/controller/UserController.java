package com.yin.boot.controller;

import com.alibaba.fastjson.JSONArray;
import com.yin.boot.model.User;
import com.yin.boot.Service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    //@ResponseBody
    public User getUserById(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(id);
        if (user != null) {
            logger.info(JSONArray.toJSON(user));
        }
        return user;
    }

    @RequestMapping(value = "/getUserById/{id}", method = RequestMethod.GET)
    //@ResponseBody
    public User getUserByIdNew(@PathVariable("id") int id) {
        //int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(id);
        if (user != null) {
            logger.info(JSONArray.toJSON(user));
        }
        return user;
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll() {
        List<User> userList = userService.getAll();
        if (userList != null) {
            logger.info(JSONArray.toJSON(userList));
        }
        return userList;
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public User getOne() {
        User user = userService.getOne();
        if (user != null) {
            logger.info(JSONArray.toJSON(user));
        }
        return user;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public void insert(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name").toString();
        String age = request.getParameter("age").toString();
        String password = request.getParameter("password").toString();
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setPassword(password);
        userService.insert(user);
    }

    @RequestMapping("/update")
    @ResponseBody
    public void update(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name").toString();
        String age = request.getParameter("age").toString();
        String password = request.getParameter("password").toString();
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        user.setPassword(password);
        userService.update(user);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public void delete(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.delete(id);
    }


}

