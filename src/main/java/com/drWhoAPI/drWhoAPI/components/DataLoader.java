package com.drWhoAPI.drWhoAPI.components;


import com.drWhoAPI.drWhoAPI.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;

@Profile("!test")
//    @Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner {

    @Autowired
    CompanionRepository companionRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    StoryRepository storyRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

    }
}
