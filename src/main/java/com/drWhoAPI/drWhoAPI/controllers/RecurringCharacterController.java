package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.RecurringCharacter;
import com.drWhoAPI.drWhoAPI.repositories.RecurringCharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class RecurringCharacterController {

    @Autowired
    RecurringCharacterRepository recurringCharacterRepository;

    @GetMapping(value = "/recurringCharacters")
    public ResponseEntity<List<RecurringCharacter>> getAllRecurringCharacters(){
        return new ResponseEntity<>(recurringCharacterRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/recurringCharacters/{id}")
    public ResponseEntity getSingleRecurringCharacter(@PathVariable Long id){
        return new ResponseEntity(recurringCharacterRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/recurringCharacters/{id}")
    public ResponseEntity<Optional> deleteRecurringCharacter(@PathVariable Long id){
        recurringCharacterRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @PutMapping(value = "/recurringCharacters/{id}")
    public ResponseEntity<RecurringCharacter> updateRecurringCharacter(
            @RequestBody RecurringCharacter recurringCharacter,
            @PathVariable Long id){
        RecurringCharacter updatedRecurringCharacter = recurringCharacterRepository.findById(id).get();
        updatedRecurringCharacter.setName(recurringCharacter.getName());
        updatedRecurringCharacter.setDescription(recurringCharacter.getDescription());
        updatedRecurringCharacter.setPrimaryMedia(recurringCharacter.getPrimaryMedia());

        recurringCharacterRepository.save(updatedRecurringCharacter);

        return new ResponseEntity<>(updatedRecurringCharacter, HttpStatus.OK);
    }

    @PostMapping(value = "/recurringCharacters")
    public ResponseEntity<RecurringCharacter> createRecurringCharacter(@RequestBody RecurringCharacter recurringCharacter) {
        RecurringCharacter newRecurringCharacter = new RecurringCharacter();
        newRecurringCharacter.setName(recurringCharacter.getName());
        newRecurringCharacter.setDescription(recurringCharacter.getDescription());
        newRecurringCharacter.setPrimaryMedia(recurringCharacter.getPrimaryMedia());

        recurringCharacterRepository.save(newRecurringCharacter);

        return new ResponseEntity<>(newRecurringCharacter, HttpStatus.CREATED);
    }
}
