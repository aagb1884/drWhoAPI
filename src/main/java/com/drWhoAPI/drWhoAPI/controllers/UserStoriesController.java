package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.UserStories;
import com.drWhoAPI.drWhoAPI.repositories.UserStoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class UserStoriesController {

    @Autowired
    UserStoriesRepository reviewRepository;

    @GetMapping(value = "/user_stories")
    public ResponseEntity<List<UserStories>> getAllReviews(){
        return new ResponseEntity<>(reviewRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/user_stories/{id}")
    public ResponseEntity getSingleReview(@PathVariable Long id){
        return new ResponseEntity(reviewRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/user_stories/{id}")
    public ResponseEntity<Optional> deleteReview(@PathVariable Long id){
        reviewRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/user_stories/{id}")
    public ResponseEntity<UserStories> updateReview(
            @RequestBody UserStories review,
            @PathVariable Long id){
        UserStories updatedReview = reviewRepository.findById(id).get();
        updatedReview.setStory(review.getStory());
        updatedReview.setUser(review.getUser());
        updatedReview.setReview(review.getReview());
        updatedReview.setRating(review.getRating());
        updatedReview.setReviewPrivate(review.getReviewPrivate());

        reviewRepository.save(updatedReview);

        return new ResponseEntity<>(updatedReview, HttpStatus.OK);
    }

    @PostMapping(value = "/user_stories")
    public ResponseEntity<UserStories> createReview(@RequestBody UserStories review) {
        UserStories newReview = new UserStories();
        newReview.setStory(review.getStory());
        newReview.setUser(review.getUser());
        newReview.setReview(review.getReview());
        newReview.setRating(review.getRating());
        newReview.setReviewPrivate(review.getReviewPrivate());

        reviewRepository.save(newReview);

        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
    }
}
