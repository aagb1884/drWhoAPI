package com.drWhoAPI.drWhoAPI.controllers;

import com.drWhoAPI.drWhoAPI.models.Doctor;
import com.drWhoAPI.drWhoAPI.models.User;
import com.drWhoAPI.drWhoAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getSingleUser(@PathVariable Long id){
        return new ResponseEntity(userRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<Optional> deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/users/{id}")
    public ResponseEntity<User> updateUser(
            @RequestBody User user,
            @PathVariable Long id){
        User updatedUser = userRepository.findById(id).get();
        updatedUser.setAuth0uniqueID(user.getAuth0uniqueID());
        updatedUser.setUserType(user.getUserType());
        updatedUser.setFirstname(user.getFirstname());
        updatedUser.setLastname(user.getLastname());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setLocation(user.getDisplay_name());
        updatedUser.setLocation(user.getLocation());
        updatedUser.setUserImgURL(user.getUserImgURL());
        updatedUser.setUserBio(user.getUserBio());
        updatedUser.setUserWebsite(user.getUserWebsite());
        updatedUser.setUserStories(user.getUserStories());

        userRepository.save(updatedUser);

        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setAuth0uniqueID(user.getAuth0uniqueID());
        newUser.setUserType(user.getUserType());
        newUser.setFirstname(user.getFirstname());
        newUser.setLastname(user.getLastname());
        newUser.setEmail(user.getEmail());
        newUser.setLocation(user.getDisplay_name());
        newUser.setLocation(user.getLocation());
        newUser.setUserImgURL(user.getUserImgURL());
        newUser.setUserBio(user.getUserBio());
        newUser.setUserWebsite(user.getUserWebsite());
        newUser.setUserStories(user.getUserStories());

        userRepository.save(newUser);

        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
