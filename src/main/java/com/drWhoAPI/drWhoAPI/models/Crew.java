package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Crew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @JsonIgnoreProperties({"crewRoles"})
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    @Column
    private String role;
    @ManyToOne
    @JoinColumn(name = "story_id", nullable = false)
    private Story story;

    public Crew() {
    }

    public Crew(Person person, String role, Story story) {
        this.person = person;
        this.role = role;
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

    public Story getStory() {
        return story;
    }

    public void setStory(Story story) {
        this.story = story;
    }

}
