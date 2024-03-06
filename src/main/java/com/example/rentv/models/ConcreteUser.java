package com.example.rentv.models;


import lombok.Data;

@Data
public class ConcreteUser extends User {
    public ConcreteUser(Security security, Profile profile) {
        super(security, profile);
    }

}

