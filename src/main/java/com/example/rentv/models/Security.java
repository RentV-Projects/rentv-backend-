package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loginCredentials;
    @ElementCollection
    private List<String> roles;
    @ElementCollection
    private List<String> permissions;

    public Security(String loginCredentials, List<String> roles, List<String> permissions) {
        this.loginCredentials = loginCredentials;
        this.roles = roles;
        this.permissions = permissions;
    }

    public Security() {
    }

    public void grantPermission(String permission) {
        permissions.add(permission);
    }

    public void revokePermission(String permission) {
        permissions.remove(permission);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
