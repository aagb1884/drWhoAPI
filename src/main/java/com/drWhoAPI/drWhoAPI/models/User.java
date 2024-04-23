package com.drWhoAPI.drWhoAPI.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private Long id;
    private String email;
    private String display_name;
    private String location;
    private String userImgURL;
    private String userBio;
    private String userWebsite;
    private List<Review> userReviews;

    public User() {
    }

    public User(String email, String display_name, String location, String userImgURL, String userBio, String userWebsite) {
        this.email = email;
        this.display_name = display_name;
        this.location = location;
        this.userImgURL = userImgURL;
        this.userBio = userBio;
        this.userWebsite = userWebsite;
        this.userReviews = new ArrayList<Review>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUserImgURL() {
        return userImgURL;
    }

    public void setUserImgURL(String userImgURL) {
        this.userImgURL = userImgURL;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public String getUserWebsite() {
        return userWebsite;
    }

    public void setUserWebsite(String userWebsite) {
        this.userWebsite = userWebsite;
    }

    public List<Review> getUserReviews() {
        return userReviews;
    }

    public void setUserReviews(List<Review> userReviews) {
        this.userReviews = userReviews;
    }

    public void addUserReview(Review review) {
        this.userReviews.add(review);
    }

    public void removeUserReview(Review review) {
        this.userReviews.remove(review);
    }
}
