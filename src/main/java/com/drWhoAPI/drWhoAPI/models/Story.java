package com.drWhoAPI.drWhoAPI.models;

import com.drWhoAPI.drWhoAPI.models.enums.Format;
import com.drWhoAPI.drWhoAPI.models.enums.Series;

import java.util.ArrayList;
import java.util.List;

public class Story {

    private Long id;
    private String title;
    private Format media;
    private String broadcast;
    private String releases;
    private List<Doctor> doctors;
    private List<Companion> companions;
    private String imgURL;
    private String synopsis;
    private String keywords;
    private Series series;
    private String productionCode;
    private List<Review> reviews;

    public Story() {
    }

    public Story(String title, Format media, String broadcast, String releases, String imgURL, String synopsis, String keywords, Series series, String productionCode) {
        this.title = title;
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
