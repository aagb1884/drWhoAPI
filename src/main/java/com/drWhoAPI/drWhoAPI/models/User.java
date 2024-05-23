package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String email;
    @Column
    private String display_name;
    @Column
    private String location;
    @Column
    private String userImgURL;
    @Column
    private String userBio;
    @Column
    private String userWebsite;
    @JsonBackReference
    @OneToMany(mappedBy = "user", fetch= FetchType.LAZY)
    private List<UserStories> userStories;

    public User() {
    }

    public User(String firstname, String lastname, String email, String display_name, String location, String userImgURL, String userBio, String userWebsite) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.display_name = display_name;
        this.location = location;
        this.userImgURL = userImgURL;
        this.userBio = userBio;
        this.userWebsite = userWebsite;
        this.userStories = new ArrayList<UserStories>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public List<UserStories> getUserStories() {
        return userStories;
    }

    public void setUserStories(List<UserStories> userStories) {
        this.userStories = userStories;
    }

    public void addUserStory(UserStories userStory) {
        this.userStories.add(userStory);
    }

    public void removeUserStory(UserStories userStory) {
        this.userStories.remove(userStory);
    }
}
