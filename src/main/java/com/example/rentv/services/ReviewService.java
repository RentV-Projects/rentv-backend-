package com.example.rentv.services;

import com.example.rentv.dtos.ReviewDto;
import com.example.rentv.models.Car;
import com.example.rentv.models.Review;
import com.example.rentv.models.User;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {


    public void writeReview(User author, Car car, int rating, String comment) {
    }

    public void editReview(Review review, int newRating, String newComment) {
    }

    public void deleteReview(Review review) {
    }

    public void createReview(ReviewDto reviewDto) {
    }
}

