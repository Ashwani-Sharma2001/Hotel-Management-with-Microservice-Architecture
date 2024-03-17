package com.example.SecurityConfiguration.Service.Interface;

import com.example.SecurityConfiguration.Entity.User;

import java.util.List;

public interface UserInterface {
    List<User> getUsers();

    User createUser(User user);
}
