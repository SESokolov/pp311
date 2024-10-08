package ru.sokoloff.pp.springbootpp311.service;


import ru.sokoloff.pp.springbootpp311.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User readUser(long id);

    User deleteUser(long parseUnsignedInt);

    void createOrUpdateUser(User user);
}
