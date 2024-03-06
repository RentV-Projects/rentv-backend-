package com.example.rentv.dtos;

import lombok.Data;

@Data
public class UserRegistrationRequest {
    private String username;
    private String password;
    private String email;
    private String name;
    private String address;
    private String additionalInfo;
}

