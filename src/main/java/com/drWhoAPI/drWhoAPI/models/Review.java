package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name="reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "story_id", nullable = false)
    @JsonIgnoreProperties({"reviews"})
    private Story story;
    @JsonIgnoreProperties({"userReviews"})
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Column
    private String review;
    @Column
    private Integer rating;
    @Column
    private Boolean reviewPrivate;

    public Review() {
    }

    public Review(Story story, User user, String review, Integer rating, Boolean reviewPrivate) {
        this.story = story;
        this.user = user;
        this.review = review;
        this.rating = rating;
        this.reviewPrivate = reviewPrivate;
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

    public Boolean getReviewPrivate() {
        return reviewPrivate;
    }

    public void setReviewPrivate(Boolean reviewPrivate) {
        this.reviewPrivate = reviewPrivate;
    }
}
