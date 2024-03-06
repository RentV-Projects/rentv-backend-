package com.example.rentv.services;

import com.example.rentv.models.Security;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {


    public void grantPermission(Security security, String permission) {
        security.grantPermission(permission);
    }

    public void revokePermission(Security security, String permission) {
        security.revokePermission(permission);
    }

}

