package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class ReviewModeration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Review review;
    private String status;

    public ReviewModeration(Review review, String status) {
        this.review = review;
        this.status = status;
    }

    public void changeStatus(String status) {
        this.status = status;
    }

}

