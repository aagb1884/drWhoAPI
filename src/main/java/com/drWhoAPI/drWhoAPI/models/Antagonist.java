package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="antagonists")
public class Antagonist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String primaryMedia;
    @JsonIgnoreProperties({"antagonists", "doctors", "companions", "castAndCrew", "stories"})
    @ManyToMany
    @JoinTable(
            name = "antagonist_stories",
            joinColumns = {
                    @JoinColumn(
                            name = "antagonist_id",
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

    public Antagonist(){

    }

    public Antagonist(String name, String description, String primaryMedia) {
        this.name = name;
        this.description = description;
        this.primaryMedia = primaryMedia;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrimaryMedia() {
        return primaryMedia;
    }

    public void setPrimaryMedia(String primaryMedia) {
        this.primaryMedia = primaryMedia;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }
}
