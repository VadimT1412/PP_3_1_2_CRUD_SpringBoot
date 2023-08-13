package com.example.Project2Boot.dao;



import com.example.Project2Boot.model.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);

    User getUser(int id);

    void updateUser(int id, User user);

    List<User> getAllUsers();

    void deleteUser(int id);
}
