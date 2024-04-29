package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.Person;
import com.drWhoAPI.drWhoAPI.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/people")
    public ResponseEntity<List<Person>> getAllPeople(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/people/{id}")
    public ResponseEntity getSinglePerson(@PathVariable Long id) {
        return new ResponseEntity(personRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/people/{id}")
    public ResponseEntity<Optional> deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/people/{id}")
    public ResponseEntity<Person> updatePerson(
            @RequestBody Person person,
            @PathVariable Long id){
        Person updatedPerson = personRepository.findById(id).get();
        updatedPerson.setName(person.getName());
        updatedPerson.setInfo(person.getInfo());
//        updatedPerson.setCastRoles(person.getCastRoles());
        updatedPerson.setCastCrewRoles(person.getCastCrewRoles());

        personRepository.save(updatedPerson);

        return new ResponseEntity<>(updatedPerson, HttpStatus.OK);
    }

    @PostMapping(value = "/people")
    public ResponseEntity<Person> createPerson(@RequestBody Person person) {
        Person newPerson = new Person();
        newPerson.setName(person.getName());
        newPerson.setInfo(person.getInfo());
//        newPerson.setCastRoles(person.getCastRoles());
        newPerson.setCastCrewRoles(person.getCastCrewRoles());

        personRepository.save(newPerson);

        return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }
}
