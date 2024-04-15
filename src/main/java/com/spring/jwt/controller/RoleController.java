package com.spring.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jwt.dto.RoleDTO;
import com.spring.jwt.service.Interfaces.RoleInterface;
import com.spring.jwt.utils.BaseResponseDTO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleInterface roleInterface;
    
    @GetMapping("")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Welcome to my page!");
    }

    @PostMapping("/create")
    public ResponseEntity<BaseResponseDTO> create(@RequestBody RoleDTO roleDTO) {
        return ResponseEntity.ok(roleInterface.createRole(roleDTO));
    }

    @PostMapping("/delete")
    public ResponseEntity<BaseResponseDTO> delete(@RequestBody RoleDTO roleDTO) {
        return ResponseEntity.ok(roleInterface.deleteRole(roleDTO));
    }

    @PostMapping("/update")
    public ResponseEntity<BaseResponseDTO> update(@RequestBody RoleDTO roleDTO) {
        return ResponseEntity.ok(roleInterface.updateRole(roleDTO));
    }

    @PostMapping("/get")
    public ResponseEntity<BaseResponseDTO> get(@RequestBody RoleDTO roleDTO) {
        return ResponseEntity.ok(roleInterface.getRole(roleDTO));
    }

    @GetMapping("/getAll")
    public ResponseEntity<BaseResponseDTO> getAll() {
        return ResponseEntity.ok(roleInterface.getAllRole());
    }

}
