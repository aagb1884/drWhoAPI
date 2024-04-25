package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.enums.Crew;
import com.drWhoAPI.drWhoAPI.repositories.CrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class CrewController {

    @Autowired
    CrewRepository crewRepository;

    @GetMapping(value = "/crew")
    public ResponseEntity<List<Crew>> getAllCrew(){
        return new ResponseEntity<>(crewRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/crew/{id}")
    public ResponseEntity getSingleCrewMember(@PathVariable Long id) {
        return new ResponseEntity(crewRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/crew/{id}")
    public ResponseEntity<Optional> deleteCrewMember(@PathVariable Long id){
        crewRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/crew/{id}")
    public ResponseEntity<Crew> updateCrewMember(
            @RequestBody Crew crew,
            @PathVariable Long id){
        Crew updatedCrewMember = crewRepository.findById(id).get();
        updatedCrewMember.setName(crew.getName());
        updatedCrewMember.setRole(crew.getRole());
        updatedCrewMember.setInfo(crew.getInfo());
        updatedCrewMember.setStories(crew.getStories());

        crewRepository.save(updatedCrewMember);

        return new ResponseEntity<>(updatedCrewMember, HttpStatus.OK);
    }

    @PostMapping(value = "/crew")
    public ResponseEntity<Crew> createCrewMember(@RequestBody Crew crew) {
        Crew newCrewMember = new Crew();
        newCrewMember.setName(crew.getName());
        newCrewMember.setRole(crew.getRole());
        newCrewMember.setInfo(crew.getInfo());
        newCrewMember.setStories(crew.getStories());

        crewRepository.save(newCrewMember);

        return new ResponseEntity<>(newCrewMember, HttpStatus.CREATED);
    }
}
