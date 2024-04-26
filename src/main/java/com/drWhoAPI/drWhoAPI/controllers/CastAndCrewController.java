package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.CastAndCrew;
import com.drWhoAPI.drWhoAPI.repositories.CastAndCrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class CastAndCrewController {

    @Autowired
    CastAndCrewRepository castAndCrewRepository;

    @GetMapping(value = "/cast_crew")
    public ResponseEntity<List<CastAndCrew>> getAllCastCrew(){
        return new ResponseEntity<>(castAndCrewRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/cast_crew/{id}")
    public ResponseEntity getSingleCastCrewMember(@PathVariable Long id) {
        return new ResponseEntity(castAndCrewRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/cast_crew/{id}")
    public ResponseEntity<Optional> deleteCastCrewMember(@PathVariable Long id){
        castAndCrewRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/cast_crew/{id}")
    public ResponseEntity<CastAndCrew> updateCastCrewMember(
            @RequestBody CastAndCrew castCrew,
            @PathVariable Long id){
        CastAndCrew updatedCastCrewMember = castAndCrewRepository.findById(id).get();
        updatedCastCrewMember.setPerson(castCrew.getPerson());
        updatedCastCrewMember.setRole(castCrew.getRole());
        updatedCastCrewMember.setCategory(castCrew.getCategory());
        updatedCastCrewMember.setStory(castCrew.getStory());

        castAndCrewRepository.save(updatedCastCrewMember);

        return new ResponseEntity<>(updatedCastCrewMember, HttpStatus.OK);
    }

    @PostMapping(value = "/cast_crew")
    public ResponseEntity<CastAndCrew> createCastCrewMember(@RequestBody CastAndCrew castCrew) {
        CastAndCrew newCastCrewMember = new CastAndCrew();
        newCastCrewMember.setPerson(castCrew.getPerson());
        newCastCrewMember.setRole(castCrew.getRole());
        newCastCrewMember.setCategory(castCrew.getCategory());
        newCastCrewMember.setStory(castCrew.getStory());

        castAndCrewRepository.save(newCastCrewMember);

        return new ResponseEntity<>(newCastCrewMember, HttpStatus.CREATED);
    }
}
