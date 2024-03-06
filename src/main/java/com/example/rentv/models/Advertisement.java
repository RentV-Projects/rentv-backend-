package com.example.rentv.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long carId;
    private Long userId;
    private String content;
    private String status;

    public Advertisement(Long id, Long carId, Long userId, String content, String status) {
        this.id = id;
        this.carId = carId;
        this.userId = userId;
        this.content = content;
        this.status = status;
    }

    public void updateContent(String content) {
        this.content = content;
    }

    public void changeStatus(String status) {
        this.status = status;
    }
}


