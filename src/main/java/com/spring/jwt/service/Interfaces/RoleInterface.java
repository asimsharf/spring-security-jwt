package com.spring.jwt.service.Interfaces;

import com.spring.jwt.dto.RoleDTO;
import com.spring.jwt.utils.BaseResponseDTO;

public interface RoleInterface {
    BaseResponseDTO createRole(RoleDTO roleDTO);
    BaseResponseDTO deleteRole(RoleDTO roleDTO);
    BaseResponseDTO updateRole(RoleDTO roleDTO);
    BaseResponseDTO getRole(RoleDTO roleDTO);
    BaseResponseDTO getAllRole();
}
