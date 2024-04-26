package com.drWhoAPI.drWhoAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String info;
    @JsonIgnoreProperties({"person"})
    @OneToMany(mappedBy = "person")
    private List<Cast> castRoles;
    @JsonIgnoreProperties({"person"})
    @OneToMany(mappedBy = "person")
    private List<Crew> crewRoles;

    public Person() {
    }

    public Person(String name, String info) {
        this.name = name;
        this.info = info;
        this.castRoles = new ArrayList<>();
        this.crewRoles = new ArrayList<>();
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

    public List<Cast> getCastRoles() {
        return castRoles;
    }

    public void setCastRoles(List<Cast> castRoles) {
        this.castRoles = castRoles;
    }

    public void addToCast(Cast person){ this.castRoles.add(person);}

    public void removeFromCast(Cast person) { this.castRoles.remove(person);}
    public List<Crew> getCrewRoles() {
        return crewRoles;
    }

    public void setCrewRoles(List<Crew> crewRoles) {
        this.crewRoles = crewRoles;
    }

    public void addToCrew(Crew person){ this.crewRoles.add(person);}

    public void removeFromCrew(Crew person) { this.crewRoles.remove(person);}
}
