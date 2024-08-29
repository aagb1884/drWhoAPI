package com.drWhoAPI.drWhoAPI.models;

import com.drWhoAPI.drWhoAPI.models.enums.Format;
import com.drWhoAPI.drWhoAPI.models.enums.Series;
import com.drWhoAPI.drWhoAPI.repositories.RecurringCharacterRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="storys")
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @OneToMany(mappedBy = "story", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"story", "castCrewRoles"})
    private List<CastAndCrew> castAndCrew;
    @Enumerated(EnumType.STRING)
    @Column
    private Format media;
    @Column
    private String firstEpBroadcast;
    @Column
    private String lastEpBroadcast;
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

    @JsonIgnoreProperties({"stories"})
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
    @JsonIgnoreProperties({"stories"})
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "antagonist_stories",
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
                            name = "antagonist_id",
                            nullable = false,
                            updatable = false,
                            insertable = false
                    )
            }
    )
    private List<Antagonist> antagonists;
    @JsonIgnoreProperties({"stories"})
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "recurringCharacter_stories",
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
                            name = "recurringCharacter_id",
                            nullable = false,
                            updatable = false,
                            insertable = false
                    )
            }
    )
    private List<RecurringCharacter> recurringCharacters;
    @Column
    private String imgURL;
    @Column(length = 1000)
    private String synopsis;
    @Column(length = 1000)
    private String keywords;
    @Enumerated(EnumType.STRING)
    @Column
    private Series series;
    @Column
    private String subSeries;
    @Column
    private Integer storyNumber;
    @Column
    private Integer noOfEpisodes;
    @Column
    private String productionCode;
    @Column
    private String wikiLink;
    @JsonIgnoreProperties({"user", "story"})
    @OneToMany(mappedBy = "story")
    private List<UserStories> story_connections;

    public Story() {
    }

    public Story(String title, Format media, String firstEpBroadcast, String lastEpBroadcast, String releases, String imgURL, String synopsis, String keywords, Series series, String subSeries, Integer storyNumber, Integer noOfEpisodes, String productionCode, String wikiLink) {
        this.title = title;
        this.castAndCrew = new ArrayList<>();
        this.media = media;
        this.firstEpBroadcast = firstEpBroadcast;
        this.lastEpBroadcast = lastEpBroadcast;
        this.releases = releases;
        this.doctors = new ArrayList<>();
        this.companions = new ArrayList<>();
        this.antagonists = new ArrayList<>();
        this.recurringCharacters = new ArrayList<>();
        this.imgURL = imgURL;
        this.synopsis = synopsis;
        this.keywords = keywords;
        this.series = series;
        this.subSeries = subSeries;
        this.storyNumber = storyNumber;
        this.noOfEpisodes = noOfEpisodes;
        this.productionCode = productionCode;
        this.wikiLink = wikiLink;
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

    public List<CastAndCrew> getCastAndCrew() {
        return castAndCrew;
    }

    public void setCastAndCrew(List<CastAndCrew> castAndCrew) {
        this.castAndCrew = castAndCrew;
    }

    public void addCastAndCrew(CastAndCrew castAndCrewMember){
        this.castAndCrew.add(castAndCrewMember);
    }

    public void removeCastAndCrew(CastAndCrew castAndCrewMember){
        this.castAndCrew.remove(castAndCrewMember);
    }

    public Format getMedia() {
        return media;
    }

    public void setMedia(Format media) {
        this.media = media;
    }

    public String getFirstEpBroadcast() {
        return firstEpBroadcast;
    }

    public void setFirstEpBroadcast(String firstEpBroadcast) {
        this.firstEpBroadcast = firstEpBroadcast;
    }

    public String getLastEpBroadcast() {
        return lastEpBroadcast;
    }

    public void setLastEpBroadcast(String lastEpBroadcast) {
        this.lastEpBroadcast = lastEpBroadcast;
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

    public List<Antagonist> getAntagonists() {
        return antagonists;
    }

    public void setAntagonists(List<Antagonist> antagonists) {
        this.antagonists = antagonists;
    }

    public void addAntagonist(Antagonist antagonist){
        this.antagonists.add(antagonist);
    }

    public void removeAntagonist(Antagonist antagonist){ this.antagonists.remove(antagonist);}

    public List<RecurringCharacter> getRecurringCharacters() {
        return recurringCharacters;
    }

    public void setRecurringCharacters(List<RecurringCharacter> recurringCharacters) {
        this.recurringCharacters = recurringCharacters;
    }

    public void addRecurringCharacter(RecurringCharacter recurringCharacter){
        this.recurringCharacters.add(recurringCharacter);
    }

    public void removeRecurringCharacter(RecurringCharacter recurringCharacter){ this.recurringCharacters.remove(recurringCharacter);}

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

    public String getSubSeries() {
        return subSeries;
    }

    public void setSubSeries(String subSeries) {
        this.subSeries = subSeries;
    }

    public Integer getStoryNumber() {
        return storyNumber;
    }

    public void setStoryNumber(Integer storyNumber) {
        this.storyNumber = storyNumber;
    }

    public Integer getNoOfEpisodes() {
        return noOfEpisodes;
    }

    public void setNoOfEpisodes(Integer noOfEpisodes) {
        this.noOfEpisodes = noOfEpisodes;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    public String getWikiLink() {
        return wikiLink;
    }

    public void setWikiLink(String wikiLink) {
        this.wikiLink = wikiLink;
    }

    public List<UserStories> getStoryConnections() {
        return story_connections;
    }

    public void setStoryConnections(List<UserStories> story_connections) {
        this.story_connections = story_connections;
    }

    public void addStoryConnection(UserStories storyConnection){
        this.story_connections.add(storyConnection);
    }

    public void removeStoryConnection(UserStories storyConnection){ this.story_connections.remove(storyConnection);}
}
