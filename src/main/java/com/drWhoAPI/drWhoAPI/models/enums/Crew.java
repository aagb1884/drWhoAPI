package com.drWhoAPI.drWhoAPI.models.enums;

import com.drWhoAPI.drWhoAPI.models.Story;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Crew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    @Column
    private String name;
    @Column
    private String role;
    @Column
    private String info;
    @JsonIgnoreProperties({"cast"})
    @ManyToMany
    @JoinTable(
            name = "story_crew",
            joinColumns = {
                    @JoinColumn(
                            name = "crew_id",
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
    )private List<Story> stories;

    public Crew() {
    }

    public Crew(String name, String role, String info) {
        this.name = name;
        this.role = role;
        this.info = info;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
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

    public void removeStory(Story story){ this.stories.remove(story);}

}
