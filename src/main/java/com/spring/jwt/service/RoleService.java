package com.spring.jwt.service;

import com.spring.jwt.dto.RoleDTO;
import com.spring.jwt.utils.BaseResponseDTO;

public interface RoleService {
    BaseResponseDTO createRole(RoleDTO roleDTO);
}
