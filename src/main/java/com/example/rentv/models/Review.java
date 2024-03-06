package com.example.rentv.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User author;

    @ManyToOne
    private Car car;
    @ManyToOne
    private Customer customer;
    private int rating;
    private String comment;

    public Review(Long id, User author, Car car, Customer customer, int rating, String comment) {
        this.id = id;
        this.author = author;
        this.car = car;
        this.customer = customer;
        this.rating = rating;
        this.comment = comment;
    }

    public void editReview() {
    }

    public void deleteReview() {
    }
}
