package com.project.customerportal.Service;

import com.project.customerportal.DTOs.UserDTO;
import com.project.customerportal.Entity.User;
import com.project.customerportal.Repository.UserRepository;
import org.springframework.http.ResponseEntity;

public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser (UserDTO userdto, long id) {
        if() {
            throw new RuntimeException("User already exists!");
        }
        User user = new User();
        user.setLogin(userdto.getLogin());
        user.setPassword(userdto.getPassword());
        return userRepository.save(user);
    }
}
