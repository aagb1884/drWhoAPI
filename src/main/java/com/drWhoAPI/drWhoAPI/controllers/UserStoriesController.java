package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.UserStories;
import com.drWhoAPI.drWhoAPI.models.enums.UserStoryType;
import com.drWhoAPI.drWhoAPI.repositories.UserStoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class UserStoriesController {

    @Autowired
    UserStoriesRepository userStoriesRepository;

    @GetMapping(value = "/user_stories")
    public ResponseEntity<List<UserStories>> getAllReviews(){
        return new ResponseEntity<>(userStoriesRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/user_stories/{id}")
    public ResponseEntity getSingleReview(@PathVariable Long id){
        return new ResponseEntity(userStoriesRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/user_stories/users")
    public ResponseEntity<List<UserStories>> findByUserId(
            @RequestParam(name="id") Long id){
        return new ResponseEntity<>(userStoriesRepository.findByUserId(id), HttpStatus.OK);
    }

    @GetMapping(value = "/user_stories/users/{id}/watchlist")
    public ResponseEntity<List<UserStories>> findByUserIdAndWatchlist(
            @PathVariable Long id) {
        return new ResponseEntity<>(userStoriesRepository.findByUserIdAndType(id, UserStoryType.WATCHLIST), HttpStatus.OK);
    }

        @GetMapping(value = "/user_stories/users/{id}/reviews")
        public ResponseEntity<List<UserStories>> findByUserIdAndReview(
                @PathVariable Long id) {
            return new ResponseEntity<>(userStoriesRepository.findByUserIdAndType(id, UserStoryType.REVIEW), HttpStatus.OK);
        }

    @DeleteMapping(value = "/user_stories/{id}")
    public ResponseEntity<Optional> deleteReview(@PathVariable Long id){
        userStoriesRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/user_stories/{id}")
    public ResponseEntity<UserStories> updateReview(
            @RequestBody UserStories review,
            @PathVariable Long id){
        UserStories updatedReview = userStoriesRepository.findById(id).get();
        updatedReview.setStory(review.getStory());
        updatedReview.setUser(review.getUser());
        updatedReview.setType(review.getType());
        updatedReview.setReview(review.getReview());
        updatedReview.setRating(review.getRating());
        updatedReview.setReviewPrivate(review.getReviewPrivate());
        updatedReview.setCreationOfReviewDateTime(review.getCreationOfReviewDateTime());

        userStoriesRepository.save(updatedReview);

        return new ResponseEntity<>(updatedReview, HttpStatus.OK);
    }


    @PostMapping(value = "/user_stories", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserStories> createReview(@RequestBody UserStories review) {
        UserStories newReview = new UserStories();
        newReview.setStory(review.getStory());
        newReview.setUser(review.getUser());
        newReview.setType(review.getType());
        newReview.setReview(review.getReview());
        newReview.setRating(review.getRating());
        newReview.setReviewPrivate(review.getReviewPrivate());
        newReview.setCreationOfReviewDateTime(review.getCreationOfReviewDateTime());

        userStoriesRepository.save(newReview);

        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
    }
}
