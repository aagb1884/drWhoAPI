//package com.drWhoAPI.drWhoAPI.components;
//
//
//import com.drWhoAPI.drWhoAPI.models.*;
//import com.drWhoAPI.drWhoAPI.models.CastAndCrew;
//import com.drWhoAPI.drWhoAPI.models.Story;
//import com.drWhoAPI.drWhoAPI.models.Person;
//import com.drWhoAPI.drWhoAPI.models.enums.CastOrCrew;
//import com.drWhoAPI.drWhoAPI.models.enums.Format;
//import com.drWhoAPI.drWhoAPI.models.enums.Series;
//import com.drWhoAPI.drWhoAPI.repositories.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDate;
//
//@Profile("!test")
//// @Component
//public class DataLoader implements ApplicationRunner {
//
//    @Autowired
//    CompanionRepository companionRepository;
//    @Autowired
//    DoctorRepository doctorRepository;
//    @Autowired
//    UserStoriesRepository reviewRepository;
//    @Autowired
//    StoryRepository storyRepository;
//    @Autowired
//    PersonRepository personRepository;
//    @Autowired
//    CastAndCrewRepository castAndCrewRepository;
//
//    public DataLoader() {
//    }
//
//    public void run(ApplicationArguments args) {
//
//        Doctor fourteenthDoctor = new Doctor ("Fourteenth Doctor", "2023", "David Tennant", "The Tenth Doctor with the benefit of hindsight.");
//        doctorRepository.save(fourteenthDoctor);
//
//        Doctor fifteenthDoctor = new Doctor ("Fifteenth Doctor", "2023 - ", "Ncuti Gatwa",
//                "Salt and sass. ");
//        doctorRepository.save(fifteenthDoctor);
//
//        Companion mel = new Companion ("Mel", "Bush", "", "1986 – 1987", "Bonnie Langford", "A health-conscious nerd with the energy and enthusiasm of a puppy.");
//        companionRepository.save(mel);
//
//        Companion donna = new Companion ("Donna", "Noble", "", "2008, 2023", "Catherine Tate", "The best temp in Chiswick.");
//        companionRepository.save(donna);
//
//        Companion ruby = new Companion ("Ruby", "Sunday", "", "2023 - ", "Millie Gibson",
//                "An adoptee with a thirst for knwoledge.");
//        companionRepository.save(ruby);
//
//        Person rtd = new Person("Russell T. Davies", "Writer and Doctor Who Showrunner (2005 - 2010, 2023 - )");
//        personRepository.save(rtd);
//
//        Person kHerron = new Person("Kate Herron", "Writer");
//        personRepository.save(kHerron);
//
//        Person bRedman = new Person("Briony Redman", "Writer");
//        personRepository.save(bRedman);
//
//        Person jARobinson = new Person("Julie Anne Robinson", "Director");
//        personRepository.save(jARobinson);
//
//        Person jGardner = new Person("Julie Gardner", "Executive Producer");
//        personRepository.save(jGardner);
//
//        Person cMay = new Person("Chris May", "Doctor Who Producer (2023 - )");
//        personRepository.save(cMay);
//
//        Person jTranter = new Person("Jane Tranter", "Former BBC Controller of Drama, Executive Producer");
//        personRepository.save(jTranter);
//
//        Person collinson = new Person("Phil Collinson", "Doctor Who Producer (2005 - 2008) and Executive Producer");
//        personRepository.save(collinson);
//
//        Person moffat = new Person("Steven Moffat", "Writer and Doctor Who Showrunner (2010 - 2017)");
//        personRepository.save(moffat);
//
//        Person tKingsley = new Person("Tom Kingsley", "Director");
//        personRepository.save(tKingsley);
//        Person mTonderai = new Person("Mark Tonderai", "Director");
//        personRepository.save(mTonderai);
//        Person cButton  = new Person("Chanya Button", "Director");
//        personRepository.save(cButton);
//        Person bChessell = new Person("Ben Chessell", "Director");
//        personRepository.save(bChessell);
//        Person jDonoughue = new Person("Jamie Donoughue", "Director");
//        personRepository.save(jDonoughue);
//        Person dHWilliams = new Person("Dylan Holmes Williams", "Director");
//        personRepository.save(dHWilliams);
//        Person delow = new Person("Vicki Delow", "Doctor Who Producer (2023 - )");
//        personRepository.save(delow);
//
//        Person jPeel = new Person("John Peel", "Writer");
//        personRepository.save(jPeel);
//        Person pCornell = new Person("Paul Cornell", "Writer");
//        personRepository.save(pCornell);
//        Person nRobinson = new Person("Nigel Robinson", "Range Editor, Writer");
//        personRepository.save(nRobinson);personRepository.save(pCornell);
//
//        Companion ace = new Companion ("Dorothy", "", "Ace", "1987 – 1989", "Sophie Aldred", "A teenager hiding her fear behind anger. Makes homemade explosives and has a fierce sense of justice.");
//        companionRepository.save(ace);
//        Doctor seventhDoctor = new Doctor ("Seventh Doctor", "1987 - 1989", "Sylvester McCoy",
//                "A small, melancholy clown who can be found either manipulating eons-old evil into destroying itself or playing the spoons on his bum.");
//        doctorRepository.save(seventhDoctor);
//
//        Person terranceD = new Person("Terrance Dicks", "Writer and Doctor Who Script Editor (1968 - 1974)");
//        personRepository.save(terranceD);
//
//        Story wildblueyonder = new Story(
//                "Wild Blue Yonder",
//                Format.TV,
//                LocalDate.of(2023, 12, 2),
//                LocalDate.of(2023, 12, 2),
//                "Novelisation (2023), DVD/Blu-ray (2023)",
//                "images/tennant2_gatwa_logo.png",
//                "Do you know how long your best friends arms are? Might be worth a check.",
//                "Mavity; Isaac Newton; same-sex attraction; not-things; salt; superstition; edge of the universe; doppelgangers; arms are too long; Wilf",
//                Series.SIXTYSPECIALS,
//                2,
//                1,
//                "",
//                "https://tardis.wiki/wiki/Wild_Blue_Yonder_(TV_story)"
//        );
//        wildblueyonder.addDoctor(fourteenthDoctor);
//        wildblueyonder.addCompanion(donna);
//        storyRepository.save(wildblueyonder);
//
//        CastAndCrew wildblueyonderwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, wildblueyonder);
//        castAndCrewRepository.save(wildblueyonderwriter);
//        CastAndCrew wildblueyonderdirector = new CastAndCrew(tKingsley, "Director", CastOrCrew.CREW, wildblueyonder);
//        castAndCrewRepository.save(wildblueyonderdirector);
//        CastAndCrew wildblueyondersRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, wildblueyonder);
//        castAndCrewRepository.save(wildblueyondersRunner);
//        CastAndCrew wildblueyonderproducer = new CastAndCrew(delow, "Producer", CastOrCrew.CREW, wildblueyonder);
//        castAndCrewRepository.save(wildblueyonderproducer);
//        CastAndCrew wildblueyonderexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, wildblueyonder);
//        castAndCrewRepository.save(wildblueyonderexecProducer);
//        CastAndCrew wildblueyonderexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, wildblueyonder);
//        castAndCrewRepository.save(wildblueyonderexecProducer2);
//
//
//        Story giggle = new Story(
//                "The Giggle",
//                Format.TV,
//                LocalDate.of(2023, 12,9),
//                LocalDate.of(2023, 12, 9),
//                "Novelisation (2023), DVD/Blu-ray (2023)",
//                "images/tennant2_gatwa_logo.png",
//                "synopsis",
//                "The Toymaker; Bi-generation; trauma; Stooky Bill; John Logie Baird; UNIT; Flux; the One Who Waits; Spice Up Your Life; catch",
//                Series.SIXTYSPECIALS,
//                3,
//                1,
//                "",
//                "https://tardis.wiki/wiki/The_Giggle_(TV_story)"
//        );
//        giggle.addDoctor(fourteenthDoctor);
//        giggle.addCompanion(donna);
//        giggle.addCompanion(mel);
//        storyRepository.save(giggle);
//
//        CastAndCrew gigglewriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, giggle);
//        castAndCrewRepository.save(gigglewriter);
//        CastAndCrew giggledirector = new CastAndCrew(cButton, "Director", CastOrCrew.CREW, giggle);
//        castAndCrewRepository.save(giggledirector);
//        CastAndCrew gigglesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, giggle);
//        castAndCrewRepository.save(gigglesRunner);
//        CastAndCrew giggleproducer = new CastAndCrew(delow, "Producer", CastOrCrew.CREW, giggle);
//        castAndCrewRepository.save(giggleproducer);
//        CastAndCrew giggleexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, giggle);
//        castAndCrewRepository.save(giggleexecProducer);
//        CastAndCrew giggleexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, giggle);
//        castAndCrewRepository.save(giggleexecProducer2);
//
//
//        Story rubyRoad = new Story(
//                "The Church on Ruby Road",
//                Format.TV,
//                LocalDate.of(2023, 12, 25),
//                LocalDate.of(2023, 12, 25),
//                "Novelisation (2024), DVD/Blu-Ray (2024).",
//                "images/tennant2_gatwa_logo.png",
//                "Ruby Sunday is having a lot of bad luck, and now some goblins want to eat the baby she's looking after.",
//                "Goblins; Goblin Song; Goblin King; flying boat; first appearance: Ruby Sunday; new companion; Christmas Special; Festive Special; never seen a TARDIS before? Mrs Flood",
//                Series.SEASON12024,
//                0,
//                1,
//                "",
//                "https://tardis.wiki/wiki/The_Church_on_Ruby_Road_(TV_story)"
//        );
//        rubyRoad.addDoctor(fifteenthDoctor);
//        rubyRoad.addCompanion(ruby);
//        storyRepository.save(rubyRoad);
//
//        CastAndCrew rubyRoadwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, rubyRoad);
//        castAndCrewRepository.save(rubyRoadwriter);
//        CastAndCrew rubyRoaddirector = new CastAndCrew(mTonderai, "Director", CastOrCrew.CREW, rubyRoad);
//        castAndCrewRepository.save(rubyRoaddirector);
//        CastAndCrew rubyRoadsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, rubyRoad);
//        castAndCrewRepository.save(rubyRoadsRunner);
//        CastAndCrew rubyRoadproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, rubyRoad);
//        castAndCrewRepository.save(rubyRoadproducer);
//        CastAndCrew rubyRoadexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, rubyRoad);
//        castAndCrewRepository.save(rubyRoadexecProducer);
//        CastAndCrew rubyRoadexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, rubyRoad);
//        castAndCrewRepository.save(rubyRoadexecProducer2);
//
//
//        Story spaceBabies = new Story(
//                "Space Babies",
//                Format.TV,
//                LocalDate.of(2024, 5, 11),
//                LocalDate.of(2024, 5, 11),
//                "DVD/Blu-Ray (2024).",
//                "images/tennant2_gatwa_logo.png",
//                "synopsis",
//                "keywords",
//                Series.SEASON12024,
//                1,
//                1,
//                "",
//                "https://tardis.wiki/wiki/Space_Babies_(TV_story)"
//        );
//        spaceBabies.addDoctor(fifteenthDoctor);
//        spaceBabies.addCompanion(ruby);
//        storyRepository.save(spaceBabies);
//
//        CastAndCrew spaceBabieswriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, spaceBabies);
//        castAndCrewRepository.save(spaceBabieswriter);
//        CastAndCrew spaceBabiesdirector = new CastAndCrew(jARobinson, "Director", CastOrCrew.CREW, spaceBabies);
//        castAndCrewRepository.save(spaceBabiesdirector);
//        CastAndCrew spaceBabiessRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, spaceBabies);
//        castAndCrewRepository.save(spaceBabiessRunner);
//        CastAndCrew spaceBabiesproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, spaceBabies);
//        castAndCrewRepository.save(spaceBabiesproducer);
//        CastAndCrew spaceBabiesexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, spaceBabies);
//        castAndCrewRepository.save(spaceBabiesexecProducer);
//        CastAndCrew spaceBabiesexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, spaceBabies);
//        castAndCrewRepository.save(spaceBabiesexecProducer2);
//
//        Story devilChord = new Story(
//                "The Devil's Chord",
//                Format.TV,
//                LocalDate.of(2024, 5, 11),
//                LocalDate.of(2024, 5, 11),
//                "DVD/Blu-Ray (2024).",
//                "images/tennant2_gatwa_logo.png",
//                "synopsis",
//                "keywords",
//                Series.SEASON12024,
//                2,
//                1,
//                "",
//                "https://tardis.wiki/wiki/The_Devil%27s_Chord_(TV_story)"
//        );
//        devilChord.addDoctor(fifteenthDoctor);
//        devilChord.addCompanion(ruby);
//        storyRepository.save(devilChord);
//
//        CastAndCrew devilChordwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, devilChord);
//        castAndCrewRepository.save(devilChordwriter);
//        CastAndCrew devilChorddirector = new CastAndCrew(bChessell, "Director", CastOrCrew.CREW, devilChord);
//        castAndCrewRepository.save(devilChorddirector);
//        CastAndCrew devilChordsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, devilChord);
//        castAndCrewRepository.save(devilChordsRunner);
//        CastAndCrew devilChordproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, devilChord);
//        castAndCrewRepository.save(devilChordproducer);
//        CastAndCrew devilChordexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, devilChord);
//        castAndCrewRepository.save(devilChordexecProducer);
//        CastAndCrew devilChordexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, devilChord);
//        castAndCrewRepository.save(devilChordexecProducer2);
//
//        Story boom = new Story(
//                "Boom",
//                Format.TV,
//                LocalDate.of(2024, 5, 18),
//                LocalDate.of(2024, 5, 18),
//                "DVD/Blu-Ray (2024).",
//                "images/tennant2_gatwa_logo.png",
//                "synopsis",
//                "keywords",
//                Series.SEASON12024,
//                3,
//                1,
//                "",
//                "https://tardis.wiki/wiki/Boom_(TV_story)"
//        );
//        boom.addDoctor(fifteenthDoctor);
//        boom.addCompanion(ruby);
//        storyRepository.save(boom);
//
//        CastAndCrew boomwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, boom);
//        castAndCrewRepository.save(boomwriter);
//        CastAndCrew boomdirector = new CastAndCrew(jARobinson, "Director", CastOrCrew.CREW, boom);
//        castAndCrewRepository.save(boomdirector);
//        CastAndCrew boomsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, boom);
//        castAndCrewRepository.save(boomsRunner);
//        CastAndCrew boomproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, boom);
//        castAndCrewRepository.save(boomproducer);
//        CastAndCrew boomexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, boom);
//        castAndCrewRepository.save(boomexecProducer);
//        CastAndCrew boomexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, boom);
//        castAndCrewRepository.save(boomexecProducer2);
//
//        Story yards = new Story(
//                "73 Yards",
//                Format.TV,
//                LocalDate.of(2024, 5, 25),
//                LocalDate.of(2024, 5, 25),
//                "DVD/Blu-Ray (2024).",
//                "images/tennant2_gatwa_logo.png",
//                "synopsis",
//                "keywords",
//                Series.SEASON12024,
//                4,
//                1,
//                "",
//                "https://tardis.wiki/wiki/73_Yards_(TV_story)"
//        );
//        yards.addDoctor(fifteenthDoctor);
//        yards.addCompanion(ruby);
//        storyRepository.save(yards);
//
//        CastAndCrew yardswriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, yards);
//        castAndCrewRepository.save(yardswriter);
//        CastAndCrew yardsdirector = new CastAndCrew(dHWilliams, "Director", CastOrCrew.CREW, yards);
//        castAndCrewRepository.save(yardsdirector);
//        CastAndCrew yardssRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, yards);
//        castAndCrewRepository.save(yardssRunner);
//        CastAndCrew yardsproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, yards);
//        castAndCrewRepository.save(yardsproducer);
//        CastAndCrew yardsexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, yards);
//        castAndCrewRepository.save(yardsexecProducer);
//        CastAndCrew yardsexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, yards);
//        castAndCrewRepository.save(yardsexecProducer2);
//
//        Story dotBubble = new Story(
//                "Dot and Bubble",
//                Format.TV,
//                LocalDate.of(2024, 6, 1),
//                LocalDate.of(2024, 6, 1),
//                "DVD/Blu-Ray (2024).",
//                "images/tennant2_gatwa_logo.png",
//                "synopsis",
//                "keywords",
//                Series.SEASON12024,
//                5,
//                1,
//                "",
//                "https://tardis.wiki/wiki/Dot_and_Bubble_(TV_story)"
//        );
//        dotBubble.addDoctor(fifteenthDoctor);
//        dotBubble.addCompanion(ruby);
//        storyRepository.save(dotBubble);
//
//        CastAndCrew dotBubblewriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, dotBubble);
//        castAndCrewRepository.save(dotBubblewriter);
//        CastAndCrew dotBubbledirector = new CastAndCrew(dHWilliams, "Director", CastOrCrew.CREW, dotBubble);
//        castAndCrewRepository.save(dotBubbledirector);
//        CastAndCrew dotBubblesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, dotBubble);
//        castAndCrewRepository.save(dotBubblesRunner);
//        CastAndCrew dotBubbleproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, dotBubble);
//        castAndCrewRepository.save(dotBubbleproducer);
//        CastAndCrew dotBubbleexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, dotBubble);
//        castAndCrewRepository.save(dotBubbleexecProducer);
//        CastAndCrew dotBubbleexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, dotBubble);
//        castAndCrewRepository.save(dotBubbleexecProducer2);
//
//        Story rogue = new Story(
//                "Rogue",
//                Format.TV,
//                LocalDate.of(2024, 6, 8),
//                LocalDate.of(2024, 6, 8),
//                "DVD/Blu-Ray (2024).",
//                "images/tennant2_gatwa_logo.png",
//                "synopsis",
//                "keywords",
//                Series.SEASON12024,
//                6,
//                1,
//                "",
//                "https://tardis.wiki/wiki/Rogue_(TV_story)"
//        );
//        rogue.addDoctor(fifteenthDoctor);
//        rogue.addCompanion(ruby);
//        rogue.addCompanion(mel);
//        storyRepository.save(rogue);
//
//        CastAndCrew roguewriter = new CastAndCrew(kHerron, "Writer", CastOrCrew.CREW, rogue);
//        castAndCrewRepository.save(roguewriter);
//        CastAndCrew roguewriter2 = new CastAndCrew(bRedman, "Writer", CastOrCrew.CREW, rogue);
//        castAndCrewRepository.save(roguewriter2);
//        CastAndCrew roguedirector = new CastAndCrew(bChessell, "Director", CastOrCrew.CREW, rogue);
//        castAndCrewRepository.save(roguedirector);
//        CastAndCrew roguesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, rogue);
//        castAndCrewRepository.save(roguesRunner);
//        CastAndCrew rogueproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, rogue);
//        castAndCrewRepository.save(rogueproducer);
//        CastAndCrew rogueexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, rogue);
//        castAndCrewRepository.save(rogueexecProducer);
//        CastAndCrew rogueexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, rogue);
//        castAndCrewRepository.save(rogueexecProducer2);
//
//        Story legendRubyEmpireDeath = new Story(
//                "The Legend of Ruby Sunday/Empire of Death",
//                Format.TV,
//                LocalDate.of(2024, 6, 15),
//                LocalDate.of(2024, 6, 22),
//                "DVD/Blu-Ray (2024).",
//                "images/tennant2_gatwa_logo.png",
//                "synopsis",
//                "keywords",
//                Series.SEASON12024,
//                7,
//                2,
//                "",
//                "https://tardis.wiki/wiki/The_Legend_of_Ruby_Sunday_(TV_story)"
//        );
//        legendRubyEmpireDeath.addDoctor(fifteenthDoctor);
//        legendRubyEmpireDeath.addCompanion(ruby);
//        storyRepository.save(legendRubyEmpireDeath);
//
//        CastAndCrew legendRubyEmpireDeathwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, legendRubyEmpireDeath);
//        castAndCrewRepository.save(legendRubyEmpireDeathwriter);
//        CastAndCrew legendRubyEmpireDeathdirector = new CastAndCrew(jDonoughue, "Director", CastOrCrew.CREW, legendRubyEmpireDeath);
//        castAndCrewRepository.save(legendRubyEmpireDeathdirector);
//        CastAndCrew legendRubyEmpireDeathsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, legendRubyEmpireDeath);
//        castAndCrewRepository.save(legendRubyEmpireDeathsRunner);
//        CastAndCrew legendRubyEmpireDeathproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, legendRubyEmpireDeath);
//        castAndCrewRepository.save(legendRubyEmpireDeathproducer);
//        CastAndCrew legendRubyEmpireDeathexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, legendRubyEmpireDeath);
//        castAndCrewRepository.save(legendRubyEmpireDeathexecProducer);
//        CastAndCrew legendRubyEmpireDeathexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, legendRubyEmpireDeath);
//        castAndCrewRepository.save(legendRubyEmpireDeathexecProducer2);
//
//        Story twyrm1 = new Story(
//                "Timewyrm: Genesys",
//                Format.PROSE,
//                LocalDate.of(1991, 6, 20),
//                LocalDate.of(1991, 6, 20),
//                "",
//                "img_url",
//                "synopsis",
//                "Gilgamesh",
//                Series.NEWADVENTURES,
//                1,
//                1,
//                "",
//                "https://tardis.fandom.com/wiki/Timewyrm:_Genesys_(novel)");
//        twyrm1.addDoctor(seventhDoctor);
//        twyrm1.addCompanion(ace);
//        storyRepository.save(twyrm1);
//
//        CastAndCrew twyrm1writer = new CastAndCrew(jPeel, "Writer", CastOrCrew.CREW, twyrm1);
//        castAndCrewRepository.save(twyrm1writer);
//
//        Story twyrm2 = new Story(
//                "Timewyrm: Exodus",
//                Format.PROSE,
//                LocalDate.of(1991, 8, 15),
//                LocalDate.of(1991, 8, 15),
//                "",
//                "img_url",
//                "synopsis",
//                "War Chief; Hitler;",
//                Series.NEWADVENTURES,
//                2,
//                1,
//                "",
//                "https://tardis.fandom.com/wiki/Timewyrm:_Exodus_(novel)");
//        twyrm2.addDoctor(seventhDoctor);
//        twyrm2.addCompanion(ace);
//        storyRepository.save(twyrm2);
//
//        CastAndCrew twyrm2writer = new CastAndCrew(terranceD, "Writer", CastOrCrew.CREW, twyrm2);
//        castAndCrewRepository.save(twyrm2writer);
//
//        Story twyrm3 = new Story(
//                "Timewyrm: Apocalypse",
//                Format.PROSE,
//                LocalDate.of(1991, 10, 17),
//                LocalDate.of(1991, 10, 17),
//                "",
//                "img_url",
//                "synopsis",
//                "keywords",
//                Series.NEWADVENTURES,
//                3,
//                1,
//                "",
//                "https://tardis.fandom.com/wiki/Timewyrm:_Apocalypse_(novel)");
//        twyrm3.addDoctor(seventhDoctor);
//        twyrm3.addCompanion(ace);
//        storyRepository.save(twyrm3);
//
//        CastAndCrew twyrm3writer = new CastAndCrew(nRobinson, "Writer", CastOrCrew.CREW, twyrm3);
//        castAndCrewRepository.save(twyrm3writer);
//
//        Story twyrm4 = new Story(
//                "Timewyrm: Revelation",
//                Format.PROSE,
//                LocalDate.of(1991, 12, 5),
//                LocalDate.of(1991, 12, 5),
//                "",
//                "img_url",
//                "synopsis",
//                "keywords",
//                Series.NEWADVENTURES,
//                4,
//                1,
//                "",
//                "https://tardis.fandom.com/wiki/Timewyrm:_Revelation_(novel)");
//        twyrm4.addDoctor(seventhDoctor);
//        twyrm4.addCompanion(ace);
//        storyRepository.save(twyrm4);
//        CastAndCrew twyrm4writer = new CastAndCrew(pCornell, "Writer", CastOrCrew.CREW, twyrm4);
//        castAndCrewRepository.save(twyrm4writer);
//    }
//}
