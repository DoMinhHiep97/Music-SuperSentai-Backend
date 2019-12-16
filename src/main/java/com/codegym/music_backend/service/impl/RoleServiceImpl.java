package com.codegym.music_backend.service.impl;

import com.codegym.music_backend.model.Role;
import com.codegym.music_backend.model.RoleName;
import com.codegym.music_backend.repository.RoleRepository;
import com.codegym.music_backend.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public Optional<Role> findByName(RoleName roleName) {
        return roleRepository.findByName(roleName);
    }
}

