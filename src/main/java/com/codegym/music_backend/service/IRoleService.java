package com.codegym.music_backend.service;

import com.codegym.music_backend.model.Role;
import com.codegym.music_backend.model.RoleName;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IRoleService {
    Optional<Role> findByName(RoleName roleName);
}
