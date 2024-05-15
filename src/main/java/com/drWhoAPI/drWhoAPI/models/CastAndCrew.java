package com.drWhoAPI.drWhoAPI.models;

import com.drWhoAPI.drWhoAPI.models.enums.CastOrCrew;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table
public class CastAndCrew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnoreProperties({"castAndCrew"})
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @Column
    private String role;
    @Enumerated(EnumType.STRING)
    @Column
    private CastOrCrew category;
    @ManyToOne
    @JsonIgnoreProperties({"castAndCrew"})
    @JoinColumn(name = "story_id", nullable = false)
    private Story story;

    public CastAndCrew() {
    }

    public CastAndCrew(Person person, String role, CastOrCrew category, Story story) {
        this.person = person;
        this.role = role;
        this.category = category;
        this.story = story;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public CastOrCrew getCategory() {
        return category;
    }

    public void setCategory(CastOrCrew category) {
        this.category = category;
    }

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

}
