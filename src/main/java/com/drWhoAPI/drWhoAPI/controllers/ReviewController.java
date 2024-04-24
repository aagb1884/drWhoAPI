package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.Review;
import com.drWhoAPI.drWhoAPI.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping(value = "/reviews")
    public ResponseEntity<List<Review>> getAllReviews(){
        return new ResponseEntity<>(reviewRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/reviews/{id}")
    public ResponseEntity getSingleReview(@PathVariable Long id){
        return new ResponseEntity(reviewRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/reviews/{id}")
    public ResponseEntity<Optional> deleteReview(@PathVariable Long id){
        reviewRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/reviews/{id}")
    public ResponseEntity<Review> updateReview(
            @RequestBody Review doctor,
            @PathVariable Long id){
        Review updatedReview = reviewRepository.findById(id).get();
        updatedReview.setStory(doctor.getStory());
        updatedReview.setUser(doctor.getUser());
        updatedReview.setReview(doctor.getReview());
        updatedReview.setRating(doctor.getRating());

        reviewRepository.save(updatedReview);

        return new ResponseEntity<>(updatedReview, HttpStatus.OK);
    }

    @PostMapping(value = "/reviews")
    public ResponseEntity<Review> createReview(@RequestBody Review doctor) {
        Review newReview = new Review();
        newReview.setStory(doctor.getStory());
        newReview.setUser(doctor.getUser());
        newReview.setReview(doctor.getReview());
        newReview.setRating(doctor.getRating());


        reviewRepository.save(newReview);

        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
    }
}
