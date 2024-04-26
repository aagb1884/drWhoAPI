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
//    @JsonIgnoreProperties({"person"})
//    @OneToMany(mappedBy = "person")
//    private List<Cast> castRoles;
    @JsonIgnoreProperties({"person"})
    @OneToMany(mappedBy = "person")
    private List<CastAndCrew> castCrewRoles;

    public Person() {
    }

    public Person(String name, String info) {
        this.name = name;
        this.info = info;
//        this.castRoles = new ArrayList<>();
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

//    public List<Cast> getCastRoles() {
//        return castRoles;
//    }
//
//    public void setCastRoles(List<Cast> castRoles) {
//        this.castRoles = castRoles;
//    }
//
//    public void addToCast(Cast person){ this.castRoles.add(person);}
//
//    public void removeFromCast(Cast person) { this.castRoles.remove(person);}
    public List<CastAndCrew> getCastrewRoles() {
        return castCrewRoles;
    }

    public void setCastCrewRoles(List<CastAndCrew> castCrewRoles) {
        this.castCrewRoles = castCrewRoles;
    }

    public void addToCastCrew(CastAndCrew person){ this.castCrewRoles.add(person);}

    public void removeFromCastCrew(CastAndCrew person) { this.castCrewRoles.remove(person);}
}
