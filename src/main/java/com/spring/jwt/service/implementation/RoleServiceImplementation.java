package com.spring.jwt.service.implementation;

import org.springframework.stereotype.Service;

import com.spring.jwt.dto.RoleDTO;
import com.spring.jwt.entity.Role;
import com.spring.jwt.repository.RoleRepository;
import com.spring.jwt.service.Interfaces.RoleInterface;
import com.spring.jwt.utils.BaseResponseDTO;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleServiceImplementation implements RoleInterface{

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

    @Override
    public BaseResponseDTO deleteRole(RoleDTO roleDTO) {
        try {
            Role role = roleRepository.findByName(roleDTO.getRoleName());
            roleRepository.delete(role);
            return new BaseResponseDTO("200", "Delete role successfully");
        } catch (Exception e) {
            return new BaseResponseDTO("503", "Service unavailable");
        }
    }

    @Override
    public BaseResponseDTO updateRole(RoleDTO roleDTO) {
        try {
            Role role = roleRepository.findByName(roleDTO.getRoleName());
            role.setName(roleDTO.getRoleName());
            roleRepository.save(role);
            return new BaseResponseDTO("200", "Update role successfully");
        } catch (Exception e) {
            return new BaseResponseDTO("503", "Service unavailable");
        }
    }

    @Override
    public BaseResponseDTO getRole(RoleDTO roleDTO) {
        try {
            Role role = roleRepository.findByName(roleDTO.getRoleName());
            return new BaseResponseDTO("200", role.toString());
        } catch (Exception e) {
            return new BaseResponseDTO("503", "Service unavailable");
        }
    }

    @Override
    public BaseResponseDTO getAllRole() {
        try {
            return new BaseResponseDTO("200", roleRepository.findAll().toString());
        } catch (Exception e) {
            return new BaseResponseDTO("503", "Service unavailable");
        }
    }

}
