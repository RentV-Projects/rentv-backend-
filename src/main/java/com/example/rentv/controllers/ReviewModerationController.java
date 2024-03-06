package com.example.rentv.controllers;

import com.example.rentv.services.ReviewModerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/review-moderations")
public class ReviewModerationController {

    @Autowired
    private ReviewModerationService reviewModerationService;

    @PostMapping("/moderate/{reviewId}")
    public ResponseEntity<String> moderateReview(@PathVariable Long reviewId, @RequestParam String status) {
        reviewModerationService.moderateReview(reviewId, status);
        return ResponseEntity.ok("Review moderated successfully");
    }

}

