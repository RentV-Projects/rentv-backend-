package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class AdvertisementTier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double cost;
    @ElementCollection
    private List<String> features;

    public AdvertisementTier(String name, String description, double cost, List<String> features) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.features = features;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public void updateCost(double cost) {
        this.cost = cost;
    }

    public void addFeature(String feature) {
        this.features.add(feature);
    }

    public void removeFeature(String feature) {
        this.features.remove(feature);
    }
}

