package com.spring.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jwt.dto.RoleDTO;
import com.spring.jwt.service.RoleService;
import com.spring.jwt.utils.BaseResponseDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;
    
    @GetMapping("")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Welcome to my page!");
    }

    @PostMapping("/create")
    public ResponseEntity<BaseResponseDTO> create(@RequestBody RoleDTO roleDTO) {
        return ResponseEntity.ok(roleService.createRole(roleDTO));
    }

}
