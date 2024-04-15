package com.spring.jwt.service.impl;

import org.springframework.stereotype.Service;

import com.spring.jwt.dto.RoleDTO;
import com.spring.jwt.entity.Role;
import com.spring.jwt.repository.RoleRepository;
import com.spring.jwt.service.RoleService;
import com.spring.jwt.utils.BaseResponseDTO;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;

    @Override
    public BaseResponseDTO createRole(RoleDTO roleDTO) {
        try {
            Role role = new Role();
            role.setName(roleDTO.getRoleName());
            roleRepository.save(role);
            return new BaseResponseDTO("200", "Create role successfully");
        } catch (Exception e) {
            return new BaseResponseDTO("503", "Service unavailable");
        }
    }

}
