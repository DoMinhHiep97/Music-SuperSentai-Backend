package com.codegym.music_backend.service;

import com.codegym.music_backend.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IUserService {

    Optional<User> findByUsername(String username);
    User findById(Long id);
Boolean existsByUsername(String username);
Boolean existsByEmail(String email);

}
