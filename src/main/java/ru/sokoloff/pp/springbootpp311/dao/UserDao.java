package ru.sokoloff.pp.springbootpp311.dao;

import ru.sokoloff.pp.springbootpp311.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User readUser(long id);

    User deleteUser(long id);
}