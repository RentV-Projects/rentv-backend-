package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Entity
@Data
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    private int year;
    private String type;
    @ElementCollection
    private List<String> features;
    private boolean availability;
    @ElementCollection
    private List<String> images;

    public Car(Long id, String make, String model, int year, String type, List<String> features, boolean availability, List<String> images) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.type = type;
        this.features = features;
        this.availability = availability;
        this.images = images;
    }
}