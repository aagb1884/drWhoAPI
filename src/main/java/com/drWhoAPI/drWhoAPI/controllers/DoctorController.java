package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.Doctor;
import com.drWhoAPI.drWhoAPI.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    @GetMapping(value = "/doctors")
    public ResponseEntity<List<Doctor>> getAllDoctors(){
        return new ResponseEntity<>(doctorRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/doctors/{id}")
    public ResponseEntity getSingleDoctor(@PathVariable Long id){
        return new ResponseEntity(doctorRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/doctors/{id}")
    public ResponseEntity<Optional> deleteDoctor(@PathVariable Long id){
        doctorRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/doctors/{id}")
    public ResponseEntity<Doctor> updateDoctor(
            @RequestBody Doctor doctor,
            @PathVariable Long id){
        Doctor updatedDoctor = doctorRepository.findById(id).get();
        updatedDoctor.setName(doctor.getName());
        updatedDoctor.setPrimaryEra(doctor.getPrimaryEra());
        updatedDoctor.setMainActor(doctor.getMainActor());
        updatedDoctor.setBio(doctor.getBio());
        updatedDoctor.setStories(doctor.getStories());

        doctorRepository.save(updatedDoctor);

        return new ResponseEntity<>(updatedDoctor, HttpStatus.OK);
    }

    @PostMapping(value = "/doctors")
    public ResponseEntity<Doctor> createDoctor(@RequestBody Doctor doctor) {
        Doctor newDoctor = new Doctor();
        newDoctor.setName(doctor.getName());
        newDoctor.setPrimaryEra(doctor.getPrimaryEra());
        newDoctor.setMainActor(doctor.getMainActor());
        newDoctor.setBio(doctor.getBio());
        newDoctor.setStories(doctor.getStories());

        doctorRepository.save(newDoctor);

        return new ResponseEntity<>(newDoctor, HttpStatus.CREATED);
    }
}
