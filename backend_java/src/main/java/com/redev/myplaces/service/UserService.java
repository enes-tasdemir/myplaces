package com.redev.myplaces.service;

import com.redev.myplaces.entity.User;
import com.redev.myplaces.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }
    public User getUserById(String id)
    {
        return userRepository.findById(id).orElse(null);
    }
    public User getUserByEmail(String email)
    {
        return userRepository.findByEmail(email);
    }
    public User save(User user)
    {
        return userRepository.save(user);
    }
}