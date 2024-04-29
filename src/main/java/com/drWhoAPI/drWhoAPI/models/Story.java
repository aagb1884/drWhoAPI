package com.drWhoAPI.drWhoAPI.models;

import com.drWhoAPI.drWhoAPI.models.enums.Format;
import com.drWhoAPI.drWhoAPI.models.enums.Series;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="stories")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
//    @JsonIgnoreProperties({"person", "story"})
//    @OneToMany(mappedBy = "story")
//    private List<Cast> cast;
    @JsonIgnoreProperties({"person", "story"})
    @OneToMany(mappedBy = "story")
    private List<CastAndCrew> castAndCrew;
    @Enumerated(EnumType.STRING)
    @Column
    private Format media;
    @Column
    private String broadcast;
    @Column
    private String releases;
    @JsonIgnoreProperties({"stories"})
    @ManyToMany
    @JoinTable(
            name = "doctor_stories",
            joinColumns = {
                    @JoinColumn(
                            name = "story_id",
                            nullable = false,
                            updatable = false,
                            insertable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "doctor_id",
                            nullable = false,
                            updatable = false,
                            insertable = false
                    )
            }
    )
    private List<Doctor> doctors;
    @JsonBackReference
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "companion_stories",
            joinColumns = {
                    @JoinColumn(
                            name = "story_id",
                            nullable = false,
                            updatable = false,
                            insertable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "companion_id",
                            nullable = false,
                            updatable = false,
                            insertable = false
                    )
            }
    )
    private List<Companion> companions;
    @Column
    private String imgURL;
    @Column
    private String synopsis;
    @Column
    private String keywords;
    @Enumerated(EnumType.STRING)
    @Column
    private Series series;
    @Column
    private String productionCode;
    @JsonIgnoreProperties({"user", "story"})
    @OneToMany(mappedBy = "story")
    private List<UserStories> story_connections;

    public Story() {
    }

    public Story(String title, Format media, String broadcast, String releases, String imgURL, String synopsis, String keywords, Series series, String productionCode) {
        this.title = title;
//        this.cast = new ArrayList<>();
        this.castAndCrew = new ArrayList<>();
        this.media = media;
        this.broadcast = broadcast;
        this.releases = releases;
        this.doctors = new ArrayList<>();
        this.companions = new ArrayList<>();
        this.imgURL = imgURL;
        this.synopsis = synopsis;
        this.keywords = keywords;
        this.series = series;
        this.productionCode = productionCode;
        this.story_connections = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CastAndCrew> getCastCrew() {
        return castAndCrew;
    }

    public void setCastCrew(List<CastAndCrew> castAndCrew) {
        this.castAndCrew = castAndCrew;
    }

    public void addCastCrew(CastAndCrew castCrewMember){
        this.castAndCrew.add(castCrewMember);
    }

    public void removeCrew(CastAndCrew castCrewMember){
        this.castAndCrew.remove(castCrewMember);
    }

    public Format getMedia() {
        return media;
    }

    public void setMedia(Format media) {
        this.media = media;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public String getReleases() {
        return releases;
    }

    public void setReleases(String releases) {
        this.releases = releases;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void addDoctor(Doctor doctor){
        this.doctors.add(doctor);
    }

    public void removeDoctor(Doctor doctor){ this.doctors.remove(doctor);}

    public List<Companion> getCompanions() {
        return companions;
    }

    public void setCompanions(List<Companion> companions) {
        this.companions = companions;
    }

    public void addCompanion(Companion companion){
        this.companions.add(companion);
    }

    public void removeCompanion(Companion companion){ this.companions.remove(companion);}

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    public List<UserStories> getStoryConnections() {
        return story_connections;
    }

    public void setStoryConnections(List<UserStories> storyConnection) {
        this.story_connections = story_connections;
    }

    public void addStoryConnection(UserStories storyConnection){
        this.story_connections.add(storyConnection);
    }

    public void removeStoryConnection(UserStories storyConnection){ this.story_connections.remove(storyConnection);}
}
