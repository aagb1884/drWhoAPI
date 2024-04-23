package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.awt.print.Book;
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
    @JsonIgnoreProperties({"doctors"})
    @ManyToMany
    @JoinTable(
            name = "doctor_stories",
            joinColumns = {
                    @JoinColumn(
                            name = "doctor_id",
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "story_id",
                            nullable = false,
                            updatable = false
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
}
