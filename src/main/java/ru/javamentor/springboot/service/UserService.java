package ru.javamentor.springboot.service;

import ru.javamentor.springboot.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    List<User> getAllUsers();
    User readUser(Long id);
    User deleteUser(Long parseUnsignedInt);
}
