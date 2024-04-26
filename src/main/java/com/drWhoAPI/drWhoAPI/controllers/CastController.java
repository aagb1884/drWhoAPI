//package com.drWhoAPI.drWhoAPI.controllers;
//
//import com.drWhoAPI.drWhoAPI.models.Cast;
//import com.drWhoAPI.drWhoAPI.repositories.CastRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//class CastController {
//
//    @Autowired
//    CastRepository castRepository;
//
//    @GetMapping(value = "/cast")
//    public ResponseEntity<List<Cast>> getAllCast(){
//        return new ResponseEntity<>(castRepository.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/cast/{id}")
//    public ResponseEntity getSingleCastMember(@PathVariable Long id) {
//        return new ResponseEntity(castRepository.findById(id), HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = "/cast/{id}")
//    public ResponseEntity<Optional> deleteCastMember(@PathVariable Long id){
//        castRepository.deleteById(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @PutMapping(value = "/cast/{id}")
//    public ResponseEntity<Cast> updateCastMember(
//            @RequestBody Cast cast,
//            @PathVariable Long id){
//        Cast updatedCastMember = castRepository.findById(id).get();
//        updatedCastMember.setPerson(cast.getPerson());
//        updatedCastMember.setRole(cast.getRole());
//        updatedCastMember.setStory(cast.getStory());
//
//        castRepository.save(updatedCastMember);
//
//        return new ResponseEntity<>(updatedCastMember, HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/cast")
//    public ResponseEntity<Cast> createCastMember(@RequestBody Cast cast) {
//        Cast newCastMember = new Cast();
//        newCastMember.setPerson(cast.getPerson());
//        newCastMember.setRole(cast.getRole());
//        newCastMember.setStory(cast.getStory());
//
//        castRepository.save(newCastMember);
//
//        return new ResponseEntity<>(newCastMember, HttpStatus.CREATED);
//    }
//}
