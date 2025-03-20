package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    //fake list
    List<User> list = List.of(
            new User(101L, "Raj Chandanan", "1234567891"),
            new User(102L, "Joy Singh", "1234567892"),
            new User(103L, "Sam Sharma", "1234567853"));

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserID().equals(id)).findAny().orElse(null);
    }
}
