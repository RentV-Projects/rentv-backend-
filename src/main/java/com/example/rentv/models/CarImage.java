package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CarImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imageData;
    @OneToOne
    private Car carImage;

    public CarImage(Long id, String imageData, Car carImage) {
        this.id = id;
        this.imageData = imageData;
        this.carImage = carImage;
    }
}

