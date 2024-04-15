package com.spring.jwt.service.Interfaces;

import com.spring.jwt.dto.UserDTO;
import com.spring.jwt.utils.BaseResponseDTO;

public interface UserInterface {
    BaseResponseDTO registerAccount(UserDTO userDTO);
}
