package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String info;
    @OneToMany(mappedBy = "person")
    @JsonIgnoreProperties({"person", "story"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private List<CastAndCrew> castCrewRoles;

    public Person() {
    }

    public Person(String name, String info) {
        this.name = name;
        this.info = info;
        this.castCrewRoles = new ArrayList<>();
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<CastAndCrew> getCastCrewRoles() {
        return castCrewRoles;
    }

    public void setCastCrewRoles(List<CastAndCrew> castCrewRoles) {
        this.castCrewRoles = castCrewRoles;
    }

    public void addToCastCrew(CastAndCrew person){ this.castCrewRoles.add(person);}

    public void removeFromCastCrew(CastAndCrew person) { this.castCrewRoles.remove(person);}
}
