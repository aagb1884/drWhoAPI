package com.drWhoAPI.drWhoAPI.components;

import com.drWhoAPI.drWhoAPI.models.Story;
import com.drWhoAPI.drWhoAPI.models.enums.Format;
import com.drWhoAPI.drWhoAPI.models.enums.Series;
import com.drWhoAPI.drWhoAPI.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
// @Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CompanionRepository companionRepository;
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    UserStoriesRepository reviewRepository;
    @Autowired
    StoryRepository storyRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    CastAndCrewRepository castAndCrewRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Story joyToTheWorld = new Story(
                "Joy to the World",
                Format.TV,
                "2024/12/25",
                "2024/12/25",
                "DVD/Blu-Ray (2025).",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "Christmas Special, Nicola Coughlan",
                Series.SEASON22025,
                0,
                1,
                "",
                "https://tardis.wiki/wiki/Joy_to_the_World_(TV_story)"
        );
        storyRepository.save(joyToTheWorld);


    }
}
