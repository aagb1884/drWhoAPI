package com.drWhoAPI.drWhoAPI.models;

public class Review {

    private Long id;
    private Story story;
    private User user;
    private String review;
    private Integer rating;

    public Review() {
    }

    public Review(Story story, User user, String review, Integer rating) {
        this.story = story;
        this.user = user;
        this.review = review;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
