package com.example.rentv.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Individual extends User {
    public Individual(Security security, Profile profile) {
        super(security, profile);
    }

    public void registerCar() {
    }

    public void uploadCarPictures() {
    }
}

