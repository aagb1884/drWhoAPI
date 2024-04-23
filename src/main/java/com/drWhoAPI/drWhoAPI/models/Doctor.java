package com.drWhoAPI.drWhoAPI.models;

import jakarta.persistence.*;

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
