package com.example.rentv.services;

import com.example.rentv.models.ReviewModeration;
import org.springframework.stereotype.Service;

@Service
public class ReviewModerationService {


    public void changeReviewStatus(ReviewModeration reviewModeration, String newStatus) {
        reviewModeration.changeStatus(newStatus);
    }

    public void moderateReview(Long reviewId, String status) {
    }
}

