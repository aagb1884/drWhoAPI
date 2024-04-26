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
    @JsonIgnoreProperties({"person", "story"})
    @OneToMany(mappedBy = "story")
    private List<Cast> cast;
    @JsonIgnoreProperties({"person", "story"})
    @OneToMany(mappedBy = "story")
    private List<Crew> crew;
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
    private List<Review> reviews;

    public Story() {
    }

    public Story(String title, Format media, String broadcast, String releases, String imgURL, String synopsis, String keywords, Series series, String productionCode) {
        this.title = title;
        this.cast = new ArrayList<>();
        this.crew = new ArrayList<>();
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
        this.reviews = new ArrayList<>();
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

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public void addCast(Cast castMember){
        this.cast.add(castMember);
    }

    public void removeCast(Cast castMember){
        this.cast.remove(castMember);
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }

    public void addCrew(Crew crewMember){
        this.crew.add(crewMember);
    }

    public void removeCrew(Crew crewMember){
        this.crew.remove(crewMember);
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

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        this.reviews.add(review);
    }

    public void removeReview(Review review){ this.reviews.remove(review);}
}
