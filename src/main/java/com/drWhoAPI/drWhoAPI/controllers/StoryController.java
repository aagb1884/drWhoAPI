package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.Story;
import com.drWhoAPI.drWhoAPI.repositories.StoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class StoryController {

    @Autowired
    StoryRepository storyRepository;

    @GetMapping(value = "/stories")
    public ResponseEntity<List<Story>> getAllStories(){
        return new ResponseEntity<>(storyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/stories/{id}")
    public ResponseEntity getSingleStory(@PathVariable Long id){
        return new ResponseEntity(storyRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/stories/{id}")
    public ResponseEntity<Optional> deleteStory(@PathVariable Long id){
        storyRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/stories/{id}")
    public ResponseEntity<Story> updateStory(
            @RequestBody Story story,
            @PathVariable Long id){
        Story updatedStory = storyRepository.findById(id).get();
        updatedStory.setTitle(updatedStory.getTitle());
//        updatedStory.setCast(updatedStory.getCast());
        updatedStory.setCastAndCrew(updatedStory.getCastAndCrew());
        updatedStory.setMedia(updatedStory.getMedia());
        updatedStory.setFirstEpBroadcast(updatedStory.getFirstEpBroadcast());
        updatedStory.setLastEpBroadcast(updatedStory.getLastEpBroadcast());
        updatedStory.setReleases(updatedStory.getReleases());
        updatedStory.setDoctors(updatedStory.getDoctors());
        updatedStory.setCompanions(updatedStory.getCompanions());
        updatedStory.setImgURL(updatedStory.getImgURL());
        updatedStory.setSynopsis(updatedStory.getSynopsis());
        updatedStory.setKeywords(updatedStory.getKeywords());
        updatedStory.setSeries(updatedStory.getSeries());
        updatedStory.setStoryNumber(updatedStory.getStoryNumber());
        updatedStory.setProductionCode(updatedStory.getProductionCode());
        updatedStory.setWikiLink(updatedStory.getWikiLink());
        updatedStory.setStoryConnections(updatedStory.getStoryConnections());

        storyRepository.save(updatedStory);

        return new ResponseEntity<>(updatedStory, HttpStatus.OK);
    }

    @PostMapping(value = "/stories")
    public ResponseEntity<Story> createStory(@RequestBody Story Story) {
        Story newStory = new Story();
        newStory.setTitle(newStory.getTitle());
//        newStory.setCast(newStory.getCast());
        newStory.setCastAndCrew(newStory.getCastAndCrew());
        newStory.setMedia(newStory.getMedia());
        newStory.setFirstEpBroadcast(newStory.getFirstEpBroadcast());
        newStory.setLastEpBroadcast(newStory.getLastEpBroadcast());
        newStory.setReleases(newStory.getReleases());
        newStory.setDoctors(newStory.getDoctors());
        newStory.setCompanions(newStory.getCompanions());
        newStory.setImgURL(newStory.getImgURL());
        newStory.setSynopsis(newStory.getSynopsis());
        newStory.setKeywords(newStory.getKeywords());
        newStory.setSeries(newStory.getSeries());
        newStory.setStoryNumber(newStory.getStoryNumber());
        newStory.setProductionCode(newStory.getProductionCode());
        newStory.setWikiLink(newStory.getWikiLink());
        newStory.setStoryConnections(newStory.getStoryConnections());

        storyRepository.save(newStory);

        return new ResponseEntity<>(newStory, HttpStatus.CREATED);
    }
}
