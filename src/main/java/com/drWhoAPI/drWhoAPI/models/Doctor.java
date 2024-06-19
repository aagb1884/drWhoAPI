package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String primaryEra;
    @Column
    private String mainActor;
    @Column
    private String bio;
    @JsonIgnoreProperties({"doctors", "companions", "castAndCrew"})
    @ManyToMany
    @JoinTable(
            name = "doctor_stories",
            joinColumns = {
                    @JoinColumn(
                            name = "doctor_id",
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

    public Doctor() {
    }

    public Doctor(String name, String primaryEra, String mainActor, String bio) {
        this.name = name;
        this.primaryEra = primaryEra;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrimaryEra() {
        return primaryEra;
    }

    public void setPrimaryEra(String primaryEra) {
        this.primaryEra = primaryEra;
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

    public void addStory(Story story){
        this.stories.add(story);
    }
    public void removeStory(Story story){
        this.stories.remove(story);
    }
}
