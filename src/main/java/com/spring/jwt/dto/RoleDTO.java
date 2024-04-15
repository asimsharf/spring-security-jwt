package com.spring.jwt.dto;

import lombok.Data;

@Data
public class RoleDTO {
    private String roleName;

    public RoleDTO(String roleName) {
        this.roleName = roleName;
    }

    public RoleDTO() {
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return String.format("RoleDTO{roleName='%s'}", roleName);
    }
    
}
