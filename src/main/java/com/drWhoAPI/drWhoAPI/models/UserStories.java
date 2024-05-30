package com.drWhoAPI.drWhoAPI.models;

import com.drWhoAPI.drWhoAPI.models.enums.UserStoryType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.time.LocalDateTime;

@Entity
@Table(name="user_stories")
public class UserStories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "story_id", nullable = false)
    @JsonIgnoreProperties({"userStories", "storyConnections", "castAndCrew"})
    private Story story;
    @JsonIgnoreProperties({"userStories"})
    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    @Enumerated(EnumType.STRING)
    @Column
    private UserStoryType type;
    @Column
    private String review;
    @Column
    private Integer rating;
    @Column
    private Boolean reviewPrivate;
    @Column(name = "date_time")
    private LocalDateTime creationOfReviewDateTime;

    public UserStories() {
    }

    public UserStories(Story story, User user, UserStoryType type, String review, Integer rating, Boolean reviewPrivate, LocalDateTime creationOfReviewDateTime) {
        this.story = story;
        this.user = user;
        this.type = type;
        this.review = review;
        this.rating = rating;
        this.reviewPrivate = reviewPrivate;
        this.creationOfReviewDateTime = LocalDateTime.now();
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

    public UserStoryType getType() {
        return type;
    }

    public void setType(UserStoryType type) {
        this.type = type;
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

    public LocalDateTime getCreationOfReviewDateTime() {
        return creationOfReviewDateTime;
    }

    public void setCreationOfReviewDateTime(LocalDateTime creationOfReviewDateTime) {
        this.creationOfReviewDateTime = creationOfReviewDateTime;
    }
}
