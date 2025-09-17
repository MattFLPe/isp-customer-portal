package com.project.customerportal.Service;

import com.project.customerportal.DTOs.UserDTO;
import com.project.customerportal.Repository.UserRepository;
import org.springframework.http.ResponseEntity;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<UserDTO> createUser (long Id) {
        if(user)
            return userRepository.
    }
}
