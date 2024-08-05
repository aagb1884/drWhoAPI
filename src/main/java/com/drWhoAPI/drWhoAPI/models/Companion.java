package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="companions")
public class Companion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String nickname;
    @Column
    private String primaryEra;
    @Column
    private String primaryMedia;
    @Column
    private String mainActor;
    @Column
    private String bio;
    @JsonIgnoreProperties({"doctors", "companions", "castAndCrew", "stories"})
    @ManyToMany
    @JoinTable(
            name = "companion_stories",
            joinColumns = {
                    @JoinColumn(
                            name = "companion_id",
                            nullable = false,
                            updatable = false,
                            insertable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "story_id",
                            nullable = false,
                            updatable = false,
                            insertable = false
                    )
            }
    )
    private List<Story> stories;

    public Companion() {
    }

    public Companion(String firstName, String lastName, String nickname, String primaryEra, String primaryMedia, String mainActor, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.primaryEra = primaryEra;
        this.primaryMedia = primaryMedia;
        this.mainActor = mainActor;
        this.bio = bio;
        this.stories = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPrimaryEra() {
        return primaryEra;
    }

    public void setPrimaryEra(String primaryEra) {
        this.primaryEra = primaryEra;
    }

    public String getPrimaryMedia() {
        return primaryMedia;
    }

    public void setPrimaryMedia(String primaryMedia) {
        this.primaryMedia = primaryMedia;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
