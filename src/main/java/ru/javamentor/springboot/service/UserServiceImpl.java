package ru.javamentor.springboot.service;

import org.springframework.stereotype.Service;
import ru.javamentor.springboot.repositories.UserRepository;
import ru.javamentor.springboot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User readUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User deleteUser(Long id) {
        User user = readUser(id);
        if (user != null) {
            userRepository.delete(user);
        }
        return user;
    }
}