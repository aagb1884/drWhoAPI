package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.Companion;
import com.drWhoAPI.drWhoAPI.repositories.CompanionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class CompanionController {
    @Autowired
    CompanionRepository companionRepository;

    @GetMapping(value = "/companions")
    public ResponseEntity<List<Companion>> getAllCompanions(){
        return new ResponseEntity<>(companionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/companions/{id}")
    public ResponseEntity getSingleCompanion(@PathVariable Long id){
        return new ResponseEntity(companionRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/companions/{id}")
    public ResponseEntity<Optional> deleteCompanion(@PathVariable Long id){
        companionRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/companions/{id}")
    public ResponseEntity<Companion> updateCompanion(
            @RequestBody Companion companion,
            @PathVariable Long id){
        Companion updatedCompanion = companionRepository.findById(id).get();
        updatedCompanion.setFirstName(companion.getFirstName());
        updatedCompanion.setLastName(companion.getLastName());
        updatedCompanion.setNickname(companion.getNickname());
        updatedCompanion.setPrimaryEra(companion.getPrimaryEra());
        updatedCompanion.setPrimaryMedia(companion.getPrimaryMedia());
        updatedCompanion.setMainActor(companion.getMainActor());
        updatedCompanion.setBio(companion.getBio());

        companionRepository.save(updatedCompanion);

        return new ResponseEntity<>(updatedCompanion, HttpStatus.OK);
    }

    @PostMapping(value = "/companions")
    public ResponseEntity<Companion> createCompanion(@RequestBody Companion companion) {
        Companion newCompanion = new Companion();
        newCompanion.setFirstName(companion.getFirstName());
        newCompanion.setLastName(companion.getLastName());
        newCompanion.setNickname(companion.getNickname());
        newCompanion.setPrimaryEra(companion.getPrimaryEra());
        newCompanion.setPrimaryMedia(companion.getPrimaryMedia());
        newCompanion.setMainActor(companion.getMainActor());
        newCompanion.setBio(companion.getBio());

        companionRepository.save(newCompanion);

        return new ResponseEntity<>(newCompanion, HttpStatus.CREATED);
    }
}
