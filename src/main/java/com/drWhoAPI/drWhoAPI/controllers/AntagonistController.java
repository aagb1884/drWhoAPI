package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.Antagonist;
import com.drWhoAPI.drWhoAPI.models.Companion;
import com.drWhoAPI.drWhoAPI.repositories.AntagonistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class AntagonistController {

    @Autowired
    AntagonistRepository antagonistRepository;

    @GetMapping(value = "/antagonists")
    public ResponseEntity<List<Antagonist>> getAllAntagonists(){
        return new ResponseEntity<>(antagonistRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/antagonists/{id}")
    public ResponseEntity getSingleAntagonist(@PathVariable Long id){
        return new ResponseEntity(antagonistRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/anagonists/{id}")
    public ResponseEntity<Optional> deleteAntagonist(@PathVariable Long id){
        antagonistRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping(value = "/antagonists/{id}")
    public ResponseEntity<Antagonist> updateAntagonist(
            @RequestBody Antagonist antagonist,
            @PathVariable Long id){
        Antagonist updatedAntagonist = antagonistRepository.findById(id).get();
        updatedAntagonist.setName(antagonist.getName());
        updatedAntagonist.setDescription(antagonist.getDescription());
        updatedAntagonist.setPrimaryMedia(antagonist.getPrimaryMedia());

        antagonistRepository.save(updatedAntagonist);

        return new ResponseEntity<>(updatedAntagonist, HttpStatus.OK);
    }

    @PostMapping(value = "/antagonists")
    public ResponseEntity<Antagonist> createAntagonist(@RequestBody Antagonist antagonist) {
        Antagonist newAntagonist = new Antagonist();
        newAntagonist.setName(antagonist.getName());
        newAntagonist.setDescription(antagonist.getDescription());
        newAntagonist.setPrimaryMedia(antagonist.getPrimaryMedia());

        antagonistRepository.save(newAntagonist);

        return new ResponseEntity<>(newAntagonist, HttpStatus.CREATED);
    }
}
