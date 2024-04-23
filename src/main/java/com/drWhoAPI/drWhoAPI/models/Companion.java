package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

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
    private String mainActor;
    @Column
    private String bio;
    @JsonIgnoreProperties({"doctors", "companions"})
    @ManyToMany
    @JoinTable(
            name = "companion_stories",
            joinColumns = {
                    @JoinColumn(
                            name = "companion_id",
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

    public Companion() {
    }

    public Companion(String firstName, String lastName, String nickname, String primaryEra, String mainActor, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
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
