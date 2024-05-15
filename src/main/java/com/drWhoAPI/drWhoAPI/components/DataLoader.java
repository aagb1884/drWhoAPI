
package com.drWhoAPI.drWhoAPI.components;


import com.drWhoAPI.drWhoAPI.models.*;
import com.drWhoAPI.drWhoAPI.models.CastAndCrew;
import com.drWhoAPI.drWhoAPI.models.Story;
import com.drWhoAPI.drWhoAPI.models.Person;
import com.drWhoAPI.drWhoAPI.models.enums.CastOrCrew;
import com.drWhoAPI.drWhoAPI.models.enums.Format;
import com.drWhoAPI.drWhoAPI.models.enums.Series;
import com.drWhoAPI.drWhoAPI.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

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
    UserRepository userRepository;
    @Autowired
    PersonRepository personRepository;
    @Autowired
    CastAndCrewRepository castAndCrewRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Doctor ninthDoctor = new Doctor ("Ninth Doctor", "2005", "Christopher Eccleston",
                "A damaged and occasionally brutal shell who is slowly rediscovering how to be the Doctor again.");
        doctorRepository.save(ninthDoctor);

        Doctor tenthDoctor = new Doctor ("Tenth Doctor", "2005 - 2010", "David Tennant",
                "A mercurial motormouth, both deeply charismatic and attractive but dangerous to get close to.");
        doctorRepository.save(tenthDoctor);

        Doctor eleventhDoctor = new Doctor ("Eleventh Doctor", "2010 - 2013", "Matt Smith",
                "An ancient amateur and young trickster. Prone to flailing.");
        doctorRepository.save(eleventhDoctor);

        Doctor twelfthDoctor = new Doctor ("Twelfth Doctor", "2014 - 2017", "Peter Capaldi",
                "A winter frost, gradually thawing.");
        doctorRepository.save(twelfthDoctor);

        Doctor thirteenthDoctor = new Doctor ("Thirteenth Doctor", "2018 - 2022", "Jodie Whitttaker", "A goofy front that hides a teeming and aloof mind.");
        doctorRepository.save(thirteenthDoctor);

        Doctor fourteenthDoctor = new Doctor ("Fourteenth Doctor", "2023", "David Tennant", "The Tenth Doctor with the benefit of hindsight.");
        doctorRepository.save(fourteenthDoctor);

        Doctor fifteenthDoctor = new Doctor ("Fifteenth Doctor", "2023 - ", "Ncuti Gatwa",
                "Salt and sass. ");
        doctorRepository.save(fifteenthDoctor);

        Doctor filmDoctor = new Doctor ("Dr. Who", "1965 - 1966", "Peter Cushing",
                "An avuncular human inventor.");
        doctorRepository.save(filmDoctor);

        Doctor unboundDoctor = new Doctor ("Unbound Doctor", "2003 - ", "Various Actors",
                "A Doctor from a story free from constraints of continuity.");
        doctorRepository.save(unboundDoctor);

        Doctor warDoctor = new Doctor ("War Doctor", "2013", "John Hurt",
                "The Doctor who fought in the Time War. An increasingly tired warrior.");
        doctorRepository.save(warDoctor);

        Doctor fugitiveDoctor = new Doctor ("Fugitive Doctor", "2020 - 2022", "Jo Martin",
                "A mystery incarnation who worked for Division. Knows how to take care of herself.");
        doctorRepository.save(fugitiveDoctor);

        Doctor metacrisisDoctor = new Doctor("Metacrisis Doctor", "2008", "David Tennant",
                "A half human version of the Doctor who went a teensy bit genocidal.");
        doctorRepository.save(metacrisisDoctor);

        Doctor doctorMoon = new Doctor("Doctor Moon", "2008", "Colin Salmon",
                "The Doctor's consciousness uploaded to the Library's moon.");
        doctorRepository.save(doctorMoon);

        Doctor firstDoctor = new Doctor ("First Doctor", "1963 - 1966", "William Hartnell",
                "A cheeky wizard and cantankerous snob who learns how to become a hero.");
        doctorRepository.save(firstDoctor);

        Doctor fifthDoctor = new Doctor ("Fifth Doctor", "1982 - 1984", "Peter Davison",
                "A frustrated idealist continually crushed by the universe’s inability to be a fairy tale.");
        doctorRepository.save(fifthDoctor);

        Doctor sixthDoctor = new Doctor ("Sixth Doctor", "1984 - 1986", "Colin Baker",
                "A bullish and verbose force of nature, full of unrestrained passion.");
        doctorRepository.save(sixthDoctor);

        Doctor seventhDoctor = new Doctor ("Seventh Doctor", "1987 - 1989", "Sylvester McCoy",
                "A small, melancholy clown who can be found either manipulating eons-old evil into destroying itself or playing the spoons on his bum.");
        doctorRepository.save(seventhDoctor);

        Doctor eighthDoctor = new Doctor ("Eighth Doctor", "1996", "Paul McGann",
                "A romantic, an idealist, someone who delights in wonder, but is slowly let down by the universe he tries to protect.");
        doctorRepository.save(eighthDoctor);

        Doctor curator = new Doctor("The Curator", "2013", "Tom Baker",
                "A future, retired incarnation of the Doctor revisiting the appearance of his fourth incarnation.");
        doctorRepository.save(curator);

        Companion sarahJane = new Companion ("Sarah Jane", "Smith", "", "1973 – 1976",
                "Elisabeth Sladen", "A journalist with a sharp tongue who becomes the Doctor's best friend.");
        companionRepository.save(sarahJane);

        Companion tegan = new Companion ("Tegan", "Jovanka", "", "1981 – 1984", "Janet Fielding", "A talkative Australian who ends up in the TARDIS on her way to her air hostess job.");
        companionRepository.save(tegan);

        Companion mel = new Companion ("Mel", "Bush", "", "1986 – 1987", "Bonnie Langford", "A health-conscious nerd with the energy and enthusiasm of a puppy.");
        companionRepository.save(mel);

        Companion ace = new Companion ("Dorothy", "", "Ace", "1987 – 1989", "Sophie Aldred", "A teenager hiding her fear behind anger. Makes homemade explosives and has a fierce sense of justice.");
        companionRepository.save(ace);

        Companion rose = new Companion ("Rose", "Tyler", "", "2005 – 2006", "Billie Piper", "A shopgirl with dreams of something bigger.");
        companionRepository.save(rose);

        Companion adam = new Companion("Adam", "Mitchell", "", "2005", "Bruno Langley",
                "A smart young man who does stupid things.");
        companionRepository.save(adam);

        Companion jack = new Companion("Jack", "Harkness", "Captain Jack", "2005", "John Barrowman", "A pansexual conman, soldier and playboy.");
        companionRepository.save(jack);

        Companion mickey = new Companion ("Mickey", "Smith", "", "2005 – 2006", "Noel Clarke", "Rose's boyfriend who gradually comes to terms with her new life.");
        companionRepository.save(mickey);

        Companion martha = new Companion ("Martha", "Jones", "", "2007 – 2008", "Freema Agyeman", "A medical student who gets swept of her feet by the Doctor.");
        companionRepository.save(martha);

        Companion astrid = new Companion("Astrid", "Peth", "", "2007", "Kyle Minogue", "A waitress who wanted to see the stars.");
        companionRepository.save(astrid);

        Companion donna = new Companion ("Donna", "Noble", "", "2008, 2023", "Catherine Tate", "The best temp in Chiswick.");
        companionRepository.save(donna);

        Companion jTyler = new Companion("Jackie", "Tyler", "", "2005 - 2006, 2008", "Camille Coduri", "Rose's Mum, who misses her daughter but would do anything for her.");
        companionRepository.save(jTyler);

        Companion jacksonLake = new Companion ("Jackson", "Lake", "", "2008", "David Morrissey", "A man who thinks he is Doctor Who.");
        companionRepository.save(jacksonLake);

        Companion ladyChristina = new Companion ("Christina", "de Souza", "Lady Christina", "2009", "Michelle Ryan", "An aristocratic thief.");
        companionRepository.save(ladyChristina);

        Companion adelaide = new Companion ("Adelaide", "Brooke", "", "2009", "Lindsay Duncan", "Captain of Bowie Base One on Mars.");
        companionRepository.save(adelaide);

        Companion wilf = new Companion ("Wilfred", "Mott", "Wilf", "2009 – 2010", "Bernard Cribbins", "Donna's grandad, and general heartwarming presence.");
        companionRepository.save(wilf);

        Companion amy = new Companion ("Amy", "Pond", "", "2010 – 2012", "Karen Gillan",
                "A woman whose life has been rewritten as a dark fairytale.");
        companionRepository.save(amy);

        Companion rory = new Companion ("Rory", "Williams", "", "2010 – 2012", "Arthur Darvill", "Amy's fiancé. A nurse who grows in confidence as he travels.");
        companionRepository.save(rory);

        Companion clara = new Companion ("Clara", "Oswald", "", "2012 – 2015", "Jenna Coleman", "A nanny and teacher trying to hide the fact that she is a mad woman with a box.");
        companionRepository.save(clara);

        Companion bill = new Companion ("Bill", "Potts", "", "2017", "Pearl Mackie", "A confident, smart young woman the Doctor sees unrealised potential in.");
        companionRepository.save(bill);

        Companion nardole = new Companion ("Nardole", "", "", "2017", "Matt Lucas", "A prissy cyborg and former criminal, trying to keep the Doctor in line.");
        companionRepository.save(nardole);

        Companion graham = new Companion ("Graham", "O’Brien", "", "2018 – 2021",
                "Bradley Walsh", "A bereaved, retired bus driver and Ryan's father-in-law.");
        companionRepository.save(graham);

        Companion yaz = new Companion ("Yasmin", "Khan", "Yaz", "2018 – 2022", "Mandip Gill", "A Sheffield policewoman and long-serving companion to the Thirteenth Doctor.");
        companionRepository.save(yaz);

        Companion ryan = new Companion ("Ryan", "Sinclair", "", "2018 – 2021", "Tosin Cole", "A subdued young man with growing concerns about his planet.");
        companionRepository.save(ryan);

        Companion dan = new Companion ("Dan", "Lewis", "", "2021 – 2022", "John Bishop",
                "A good-natured Scouser.");
        companionRepository.save(dan);

        Companion ruby = new Companion ("Ruby", "Sunday", "", "2023 - ", "Millie Gibson",
                "An adoptee with a thirst for knwoledge.");
        companionRepository.save(ruby);

        Companion river = new Companion("River", "Song", "", "2008 - 2015", "Alex Kingston", "A time travelling archaeologist and the Doctor's wife.");
        companionRepository.save(river);

        Person mAlderton = new Person("Maxine Alderton", "Writer");
        personRepository.save(mAlderton);
        Person mbartlett = new Person("Mike Bartlett", "Writer");
        personRepository.save(mbartlett);
        Person mBlackman = new Person("Malorie Blackman", "Writer");
        personRepository.save(mBlackman);
        Person chibnall = new Person("Chris Chibnall", "Writer and Doctor Who Showrunner (2018 - 2022)");
        personRepository.save(chibnall);
        Person cottrellboyce = new Person("Frank Cottrell-Boyce", "Writer");
        personRepository.save(cottrellboyce);
        Person nCross = new Person("Neil Cross", "Writer");
        personRepository.save(nCross);
        Person pCornell = new Person("Paul Cornell", "Writer");
        personRepository.save(pCornell);
        Person rCurtis = new Person("Richard Curtis", "Writer");
        personRepository.save(rCurtis);
        Person rtd = new Person("Russell T. Davies", "Writer and Doctor Who Showrunner (2005 - 2010, 2023 - )");
        personRepository.save(rtd);
        Person sDollard = new Person("Sarah Dollard", "Writer");
        personRepository.save(sDollard);
        Person pFord = new Person("Phil Ford", "Writer");
        personRepository.save(pFord);
        Person gaiman = new Person("Neil Gaiman", "Writer");
        personRepository.save(gaiman);
        Person gatiss = new Person("Mark Gattiss", "Writer and Actor");
        personRepository.save(gatiss);
        Person mGraham = new Person("Matthew Graham", "Writer");
        personRepository.save(mGraham);
        Person greenhorn = new Person("Stephen Greenhorn", "Writer");
        personRepository.save(greenhorn);
        Person harness = new Person("Peter Harness", "Writer");
        personRepository.save(harness);
        Person hime = new Person("Ed Hime", "Writer");
        personRepository.save(hime);
        Person cJames = new Person("Charlene James", "Writer");
        personRepository.save(cJames);
        Person mJones = new Person("Matt Jones", "Writer");
        personRepository.save(mJones);
        Person tMacrae = new Person("Tom MacRae", "Writer");
        personRepository.save(tMacrae);
        Person mathieson = new Person("Jamie Mathieson", "Writer");
        personRepository.save(mathieson);
        Person mcTighe = new Person("Pete McTighe", "Writer and Director");
        personRepository.save(mcTighe);
        Person metivier = new Person("Nina Metivier", "Writer and Doctor Who Script Editor (2018)");
        personRepository.save(metivier);
        Person moffat = new Person("Steven Moffat", "Writer and Doctor Who Showrunner (2010 - 2017)");
        personRepository.save(moffat);
        Person moran = new Person("James Moran", "Writer");
        personRepository.save(moran);
        Person rMunro = new Person("Rona Munro", "Writer");
        personRepository.save(rMunro);
        Person nye = new Person("Simon Nye", "Writer");
        personRepository.save(nye);
        Person vPatel = new Person("Vinay Patel", "Writer");
        personRepository.save(vPatel);
        Person raynor = new Person("Helen Raynor", "Writer and Doctor Who Script Editor (2005 - 2008)");
        personRepository.save(raynor);
        Person eRoad = new Person("Ella Road", "Writer");
        personRepository.save(eRoad);
        Person gRoberts = new Person("Gareth Roberts", "Writer");
        personRepository.save(gRoberts);
        Person shearman = new Person("Rob Shearman", "Writer");
        personRepository.save(shearman);
        Person kTemple = new Person("Keith Temple", "Writer");
        personRepository.save(kTemple);
        Person sThompson = new Person("Stephen Thompson", "Writer");
        personRepository.save(sThompson);
        Person treganna = new Person("Catherine Treganna", "Writer");
        personRepository.save(treganna);
        Person whithouse = new Person("Toby Whithouse", "Writer");
        personRepository.save(whithouse);
        Person jWilkinson = new Person("Joy Wilkinson", "Writer");
        personRepository.save(jWilkinson);
        Person collinson = new Person("Phil Collinson", "Doctor Who Producer (2005 - 2008) and Executive Producer");
        personRepository.save(collinson);
        Person liggat = new Person("Susie Liggat", "Doctor Who Producer (2007 -2008)");
        personRepository.save(liggat);
        Person tSimpson = new Person("Tracie Simpson", "Doctor Who Producer (2009 - 2010)");
        personRepository.save(tSimpson);
        Person nWilson = new Person("Nikki Wilson", "Doctor Who Script Editor (2008) and Producer (2009, 2014 - 2022)");
        personRepository.save(nWilson);
        Person pBennett = new Person("Peter Bennett", "Doctor Who Producer (2010, 2014 - 2017)");
        personRepository.save(pBennett);
        Person schweitzer = new Person("Patrick Schweitzer", "Doctor Who Producer (2010)");
        personRepository.save(schweitzer);
        Person wohlenberg = new Person("Sanne Wohlenberg", "Doctor Who Producer (2010 - 2011)");
        personRepository.save(wohlenberg);
        Person mWilson = new Person("Marcus Wilson", "Doctor Who Producer (2011 - 2013)");
        personRepository.save(mWilson);
        Person dPaul = new Person("Denise Paul", "Doctor Who Associate Producer (2011 - 2013) and Script Producer (2012 - 2013)");
        personRepository.save(dPaul);
        Person pFrift = new Person("Paul Frift", "Doctor Who Producer (2014)");
        personRepository.save(pFrift);
        Person dRitchie = new Person("Derek Ritchie", "Doctor Who Script Editor (2013 - 2014) and Producer (2015)");
        personRepository.save(dRitchie);
        Person mercer = new Person("Alex Mercer", "Doctor Who Producer (2018 - 2021)");
        personRepository.save(mercer);
        Person levy = new Person("Pete Levy", "Doctor Who Producer (2021)");
        personRepository.save(levy);
        Person bucktowonsing = new Person("Sheena Bucktowonsing", "Doctor Who Series Script Editor (2018 - 2021) and Associate Producer (2022)");
        personRepository.save(bucktowonsing);
        Person delow = new Person("Vicki Delow", "Doctor Who Producer (2023 - )");
        personRepository.save(delow);
        Person cMay = new Person("Chris May", "Doctor Who Producer (2023 - )");
        personRepository.save(cMay);
        Person kHerron = new Person("Kate Herron", "Writer");
        personRepository.save(kHerron);
        Person bRedman = new Person("Briony Redman", "Writer");
        personRepository.save(bRedman);
        Person jGardner = new Person("Julie Gardner", "Executive Producer");
        personRepository.save(jGardner);
        Person pWenger = new Person("Piers Wenger", "Executive Producer");
        personRepository.save(pWenger);
        Person bWillis = new Person("Beth Willis", "Executive Producer");
        personRepository.save(bWillis);
        Person cSkinner = new Person("Caroline Skinner", "Executive Producer");
        personRepository.save(cSkinner);
        Person fPenhale = new Person("Faith Penhale", "Executive Producer");
        personRepository.save(fPenhale);
        Person bMinchin = new Person("Brian Minchin", "Script Editor, Producer, Executive Producer");
        personRepository.save(bMinchin);
        Person mStrevens = new Person("Matt Strevens", "Executive Producer");
        personRepository.save(mStrevens);
        Person jTranter = new Person("Jane Tranter", "Former BBC Controller of Drama, Executive Producer");

        Person jAhearne = new Person("Joe Ahearne", "Director");
        personRepository.save(jAhearne);
        Person bAnderson = new Person("Bill Anderson", "Director");
        personRepository.save(bAnderson);
        Person sAprahamian = new Person("Sallie Aprahamian", "Director");
        personRepository.save(sAprahamian);
        Person aLaufer = new Person("Annetta Laufer", "Director");
        personRepository.save(aLaufer);
        Person eurosLyn = new Person("Euros Lyn", "Director");
        personRepository.save(eurosLyn);
        Person eBazalgette = new Person("Ed Bazalgette", "Director");
        personRepository.save(eBazalgette);
        Person fBlackburn = new Person("Farren Blackburn", "Director");
        personRepository.save(fBlackburn);
        Person kBoak = new Person("Keith Boak", "Director");
        personRepository.save(kBoak);
        Person jcampbell = new Person("Johnny Campbell", "Director");
        personRepository.save(jcampbell);
        Person cButton  = new Person("Chanya Button", "Director");
        personRepository.save(cButton);
        Person bChessell = new Person("Ben Chessell", "Director");
        personRepository.save(bChessell);
        Person jChilds = new Person("Jamie Childs", "Director");
        personRepository.save(jChilds);
        Person rClark = new Person("Richard Clark", "Director");
        personRepository.save(rClark);
        Person jDonoughue = new Person("Jamie Donoughue", "Director");
        personRepository.save(jDonoughue);
        Person sFolkson = new Person("Sheree Folkson", "Director");
        personRepository.save(sFolkson);
        Person aGoddard = new Person("Andy Goddard", "Director");
        personRepository.save(aGoddard);
        Person bGrant = new Person("Brian Grant", "Director");
        personRepository.save(bGrant);
        Person aGunn = new Person("Andrew Gunn", "Director");
        personRepository.save(aGunn);
        Person lGough = new Person("Lawrence Gough", "Director");
        personRepository.save(lGough);
        Person jHawes = new Person("James Hawes", "Director");
        personRepository.save(jHawes);
        Person jHayes = new Person("John Hayes", "Director");
        personRepository.save(jHayes);
        Person gHarper = new Person("Graeme Harper", "Director, Production Assistant, Assistant Floor Manager.");
        personRepository.save(gHarper);
        Person tHaynes = new Person("Toby Haynes", "Director");
        personRepository.save(tHaynes);
        Person pHoar = new Person("Peter Hoar", "Director");
        personRepository.save(pHoar);
        Person nHurran = new Person("Nick Hurran", "Director");
        personRepository.save(nHurran);
        Person sHughes = new Person("Steve Hughes", "Director");
        personRepository.save(sHughes);
        Person lHJones = new Person("Lee Haven Jones", "Director");
        personRepository.save(lHJones);
        Person mKing = new Person("Mat King", "Director");
        personRepository.save(mKing);
        Person hMacDonald = new Person("Hettie MacDonald", "Director");
        personRepository.save(hMacDonald);
        Person dMacKinnon = new Person("Douglas MacKinnon", "Director");
        personRepository.save(dMacKinnon);
        Person jMStone = new Person("Jamie Magnus Stone", "Director");
        personRepository.save(jMStone);
        Person nManzoor = new Person("Nida Manzoor", "Director");
        personRepository.save(nManzoor);
        Person cMcCarthy = new Person("Colm McCarthy", "Director");
        personRepository.save(cMcCarthy);
        Person sMetzstein = new Person("Saul Metzstein", "Director");
        personRepository.save(sMetzstein);
        Person jMolotnikov = new Person("Justin Molotnikov", "Director");
        personRepository.save(jMolotnikov);
        Person cMorshead = new Person("Catherine Morshead", "Director");
        personRepository.save(cMorshead);
        Person pMurphy = new Person("Paul Murphy", "Director");
        personRepository.save(pMurphy);
        Person dNettheim = new Person("Daniel Nettheim", "Director");
        personRepository.save(dNettheim);
        Person dOHara = new Person("Daniel O'Hara", "Director");
        personRepository.save(dOHara);
        Person cPalmer = new Person("Charles Palmer", "Director");
        personRepository.save(cPalmer);
        Person jPayne = new Person("Jamie Payne", "Director");
        personRepository.save(jPayne);
        Person jPerrott = new Person("Jennifer Perrott", "Director");
        personRepository.save(jPerrott);
        Person jARobinson = new Person("Julie Anne Robinson", "Director");
        personRepository.save(jARobinson);
        Person aSaleem = new Person("Azhur Saleem", "Director");
        personRepository.save(aSaleem);
        Person rSenior = new Person("Richard Senior", "Director");
        personRepository.save(rSenior);
        Person jSimpson = new Person("Julian Simpson", "Director");
        personRepository.save(jSimpson);
        Person adamSmith = new Person("Adam Smith", "Director");
        personRepository.save(adamSmith);
        Person eSullivan = new Person("Emma Sullivan", "Director");
        personRepository.save(eSullivan);
        Person jStrong = new Person("James Strong", "Director");
        personRepository.save(jStrong);
        Person rTalalay = new Person("Rachel Talalay", "Director");
        personRepository.save(rTalalay);
        Person cTeague = new Person("Colin Teague", "Director");
        personRepository.save(cTeague);
        Person tKingsley = new Person("Tom Kingsley", "Director");
        personRepository.save(tKingsley);
        Person mTonderai = new Person("Mark Tonderai", "Director");
        personRepository.save(mTonderai);
        Person aTroughton = new Person("Alice Troughton", "Director");
        personRepository.save(aTroughton);
        Person aWay = new Person("Ashley Way", "Director");
        personRepository.save(aWay);
        Person jWebb = new Person("Jeremy Webb", "Director");
        personRepository.save(jWebb);
        Person bWheatley = new Person("Ben Wheatley", "Director");
        personRepository.save(bWheatley);
        Person hWang = new Person("Haolu Wang", "Director");
        personRepository.save(hWang);
        Person dHWilliams = new Person("Dylan Holmes Williams", "Director");
        personRepository.save(dHWilliams);
        Person pWilmshurst = new Person("Paul Wilmshurst", "Director");
        personRepository.save(pWilmshurst);
        Person sWoolfenden = new Person("Stephen Woolfenden", "Director");
        personRepository.save(sWoolfenden);
        Person wYip = new Person("Wayne Yip", "Director");
        personRepository.save(wYip);
        Person dZeff = new Person("Dan Zeff", "Director");
        personRepository.save(dZeff);

        Story roseStory = new Story(
                "Rose",
                Format.TV,
                LocalDate.of(2005, 3, 26),
                LocalDate.of(2005, 3, 26),
                "DVD (2005), Blu-Ray (2013), Novelisation (2018), Audiobook (2018).",
                "images/eccleston_logo.png",
                "Rose Tyler meets a tall, handsome Northerner who immediately blows up her work.",
                "New Who; Nu Who; first appearance Ninth Doctor Rose Mickey Jackie; Autons; Nestene;",
                Series.SERIES1,
                1,
                1,
                "1.1",
                "https://tardis.wiki/wiki/Rose_(TV_story)"
        );
        roseStory.addDoctor(ninthDoctor);
        roseStory.addCompanion(rose);
        storyRepository.save(roseStory);

        CastAndCrew roseStoryWriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, roseStory);
        castAndCrewRepository.save(roseStoryWriter);
        CastAndCrew roseStorydirector = new CastAndCrew(kBoak, "Director", CastOrCrew.CREW, roseStory);
        castAndCrewRepository.save(roseStorydirector);
        CastAndCrew roseStorysRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, roseStory);
        castAndCrewRepository.save(roseStorysRunner);
        CastAndCrew roseStoryproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, roseStory);
        castAndCrewRepository.save(roseStoryproducer);
        CastAndCrew roseStoryexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, roseStory);
        castAndCrewRepository.save(roseStoryexecProducer);

        Story endWorld = new Story(
                "The End of the World",
                Format.TV,
                LocalDate.of(2005, 4, 2),
                LocalDate.of(2005, 4, 2),
                "DVD (2005), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor takes Rose to watch the Earth being destroyed.",
                "Moxx of Balhoon; Face of Boe; Cassandra; Soft Cell; Toxic; blue people; everything has its time and everything dies; last of the Time Lords",
                Series.SERIES1,
                2,
                1,
                "1.2",
                "https://tardis.wiki/wiki/The_End_of_the_World_(TV_story)"
        );
        endWorld.addDoctor(ninthDoctor);
        endWorld.addCompanion(rose);
        storyRepository.save(endWorld);

        CastAndCrew endWorldWriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, endWorld);
        castAndCrewRepository.save(endWorldWriter);
        CastAndCrew endWorlddirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, endWorld);
        castAndCrewRepository.save(endWorlddirector);
        CastAndCrew endWorldsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, endWorld);
        castAndCrewRepository.save(endWorldsRunner);
        CastAndCrew endWorldproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, endWorld);
        castAndCrewRepository.save(endWorldproducer);
        CastAndCrew endWorldexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, endWorld);
        castAndCrewRepository.save(endWorldexecProducer);

        Story unquiet = new Story(
                "The Unquiet Dead",
                Format.TV,
                LocalDate.of(2005, 4, 9),
                LocalDate.of(2005, 4, 9),
                "DVD (2005), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor tries to persuade Rose and Charles Dickens to support an unusual recycling scheme.",
                "Dickens; gas; zombies; Gelth; Lawrence Miles; pseudohistorical; celebrity historical; Gwyneth; Rift; Cardiff",
                Series.SERIES1,
                3,
                1,
                "1.3",
                "https://tardis.wiki/wiki/The_Unquiet_Dead_(TV_story)"
        );
        unquiet.addDoctor(ninthDoctor);
        unquiet.addCompanion(rose);
        storyRepository.save(unquiet);

        CastAndCrew unquietWriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, unquiet);
        castAndCrewRepository.save(unquietWriter);
        CastAndCrew unquietdirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, unquiet);
        castAndCrewRepository.save(unquietdirector);
        CastAndCrew unquietsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, unquiet);
        castAndCrewRepository.save(unquietsRunner);
        CastAndCrew unquietproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, unquiet);
        castAndCrewRepository.save(unquietproducer);
        CastAndCrew unquietexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, unquiet);
        castAndCrewRepository.save(unquietexecProducer);

        Story aliensWW3 = new Story(
                "Aliens of London/World War Three",
                Format.TV,
                LocalDate.of(2005, 4, 16),
                LocalDate.of(2005, 4, 23),
                "DVD (2005), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor brings Rose back to her family, just as a flying saucer appears over London.",
                "farting aliens; space pig; vinegar; slap; Mickey the Idiot; massive weapons of destruction; Harriet Jones; two parter",
                Series.SERIES1,
                4,
                2,
                "1.4 - 1.5",
                "https://tardis.wiki/wiki/Aliens_of_London_(TV_story)"
        );
        aliensWW3.addDoctor(ninthDoctor);
        aliensWW3.addCompanion(rose);
        storyRepository.save(aliensWW3);

        CastAndCrew aliensWW3Writer = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, aliensWW3);
        castAndCrewRepository.save(aliensWW3Writer);
        CastAndCrew aliensWW3director = new CastAndCrew(kBoak, "Director", CastOrCrew.CREW, aliensWW3);
        castAndCrewRepository.save(aliensWW3director);
        CastAndCrew aliensWW3sRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, aliensWW3);
        castAndCrewRepository.save(aliensWW3sRunner);
        CastAndCrew aliensWW3producer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, aliensWW3);
        castAndCrewRepository.save(aliensWW3producer);
        CastAndCrew aliensWW3execProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, aliensWW3);
        castAndCrewRepository.save(aliensWW3execProducer);

        Story dalek = new Story("Dalek",
                Format.TV,
                LocalDate.of(2005, 4, 30),
                LocalDate.of(2005, 4, 30),
                "DVD (2005), Blu-Ray (2013), Novelisation (2021), Audiobook (2021).",
                "images/eccleston_logo.png",
                "The Doctor meets the other survivor of the Last Great Time War and works through some issues.",
                "Dalek; Jubilee; Plunger; Time War; You would make a good Dalek; Utah; first appearance; Adam",
                Series.SERIES1,
                5,
                1,
                "1.6",
                "https://tardis.wiki/wiki/Dalek_(TV_story)"
        );
        dalek.addDoctor(ninthDoctor);
        dalek.addCompanion(rose);
        storyRepository.save(dalek);

        CastAndCrew dalekWriter = new CastAndCrew(shearman, "Writer", CastOrCrew.CREW, dalek);
        castAndCrewRepository.save(dalekWriter);
        CastAndCrew dalekdirector = new CastAndCrew(jAhearne, "Director", CastOrCrew.CREW, dalek);
        castAndCrewRepository.save(dalekdirector);
        CastAndCrew daleksRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, dalek);
        castAndCrewRepository.save(daleksRunner);
        CastAndCrew dalekproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, dalek);
        castAndCrewRepository.save(dalekproducer);
        CastAndCrew dalekexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, dalek);
        castAndCrewRepository.save(dalekexecProducer);

        Story longGame = new Story(
                "The Long Game",
                Format.TV,
                LocalDate.of(2005, 5, 7),
                LocalDate.of(2005, 5, 7),
                "DVD (2005), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor takes Adam and Rose to the far future, but unfortunately journalists.",
                "last appearance; Adam Mitchell; Editor; journalism; Satellite 5; Fourth Great and Bountiful Human Empire; Mighty Jagrafess of the Holy Hadrojassic Maxarodenfoe; hole in the head; ",
                Series.SERIES1,
                6,
                1,
                "1.7",
                "https://tardis.wiki/wiki/The_Long_Game_(TV_story)"
        );
        longGame.addDoctor(ninthDoctor);
        longGame.addCompanion(rose);
        longGame.addCompanion(adam);
        storyRepository.save(longGame);

        CastAndCrew longGamewriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, longGame);
        castAndCrewRepository.save(longGamewriter);
        CastAndCrew longGamedirector = new CastAndCrew(bGrant, "Director", CastOrCrew.CREW, longGame);
        castAndCrewRepository.save(longGamedirector);
        CastAndCrew longGamesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, longGame);
        castAndCrewRepository.save(longGamesRunner);
        CastAndCrew longGameproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, longGame);
        castAndCrewRepository.save(longGameproducer);
        CastAndCrew longGameexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, longGame);
        castAndCrewRepository.save(longGameexecProducer);

        Story fathersday = new Story(
                "Father's Day",
                Format.TV,
                LocalDate.of(2005, 5, 14),
                LocalDate.of(2005, 5, 14),
                "DVD (2005), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "Rose asks the Doctor to go back and watch her Dad's death and the Doctor decides this is probably okay.",
                "Pete Tyler; car accident; vase; Reapers; it's my job for it to be my fault; Pete Tyler; Eighties; pseudohistorical",
                Series.SERIES1,
                7,
                1,
                "1.8",
                "https://tardis.wiki/wiki/Father%27s_Day_(TV_story)"
        );
        fathersday.addDoctor(ninthDoctor);
        fathersday.addCompanion(rose);
        storyRepository.save(fathersday);

        CastAndCrew fathersWriter = new CastAndCrew(pCornell, "Writer", CastOrCrew.CREW, fathersday);
        castAndCrewRepository.save(fathersWriter);
        CastAndCrew fathersdaydirector = new CastAndCrew(jAhearne, "Director", CastOrCrew.CREW, fathersday);
        castAndCrewRepository.save(fathersdaydirector);
        CastAndCrew fathersdaysRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, fathersday);
        castAndCrewRepository.save(fathersdaysRunner);
        CastAndCrew fathersdayproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, fathersday);
        castAndCrewRepository.save(fathersdayproducer);
        CastAndCrew fathersdayexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, fathersday);
        castAndCrewRepository.save(fathersdayexecProducer);

        Story emptyDances = new Story(
                "The Empty Child/The Doctor Dances",
                Format.TV,
                LocalDate.of(2005, 5, 21),
                LocalDate.of(2005, 5, 28),
                "DVD (2005), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor and Rose arrive in the London Blitz and discover a terrible plague.",
                "first appearance Captain Jack; pseudohistorical; Time Agent; Are you my mummy?; gas mask monsters",
                Series.SERIES1,
                8,
                2,
                "1.9 - 1.10",
                "https://tardis.wiki/wiki/The_Empty_Child_(TV_story)"
        );
        emptyDances.addDoctor(ninthDoctor);
        emptyDances.addCompanion(rose);
        storyRepository.save(emptyDances);

        CastAndCrew emptyDancesWriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, emptyDances);
        castAndCrewRepository.save(emptyDancesWriter);
        CastAndCrew emptyDancesdirector = new CastAndCrew(jHawes, "Director", CastOrCrew.CREW, emptyDances);
        castAndCrewRepository.save(emptyDancesdirector);
        CastAndCrew emptyDancessRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, emptyDances);
        castAndCrewRepository.save(emptyDancessRunner);
        CastAndCrew emptyDancesproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, emptyDances);
        castAndCrewRepository.save(emptyDancesproducer);
        CastAndCrew emptyDancesexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, emptyDances);
        castAndCrewRepository.save(emptyDancesexecProducer);

        Story boomTown = new Story(
                "Boom Town",
                Format.TV,
                LocalDate.of(2005, 6, 4),
                LocalDate.of(2005, 6, 4),
                "DVD (2005), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor has a meal with someone he thought he'd blown up.",
                "Slitheen; egg; heart TARDIS; Mickey; Cardiff; Rift",
                Series.SERIES1,
                9,
                1,
                "1.11",
                "https://tardis.wiki/wiki/Boom_Town_(TV_story)"
        );
        boomTown.addDoctor(ninthDoctor);
        boomTown.addCompanion(rose);
        boomTown.addCompanion(jack);
        storyRepository.save(boomTown);

        CastAndCrew boomTownWriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, boomTown);
        castAndCrewRepository.save(boomTownWriter);
        CastAndCrew boomTownDirector = new CastAndCrew(jAhearne, "Director", CastOrCrew.CREW, boomTown);
        castAndCrewRepository.save(boomTownDirector);
        CastAndCrew boomTownsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, boomTown);
        castAndCrewRepository.save(boomTownsRunner);
        CastAndCrew boomTownproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, boomTown);
        castAndCrewRepository.save(boomTownproducer);
        CastAndCrew boomTownexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, boomTown);
        castAndCrewRepository.save(boomTownexecProducer);

        Story badPartingWolf = new Story(
                "Bad Wolf/Parting of the Ways",
                Format.TV,
                LocalDate.of(2005, 6, 11),
                LocalDate.of(2005, 6, 18),
                "DVD (2005), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "synopsis",
                "Davina; Big Brother; Weakest Link; What Not To Wear; Emperor; Coward; Heart of the TARDIS; Ninth Doctor; regeneration; last appearance of; first appearance of; Tenth Doctor; Mickey; Jackie; Big Yellow Truck",
                Series.SERIES1,
                10,
                2,
                "1.12 - 1.13",
                "https://tardis.wiki/wiki/Bad_Wolf_(TV_story)"
        );
        badPartingWolf.addDoctor(ninthDoctor);
        badPartingWolf.addCompanion(rose);
        badPartingWolf.addCompanion(jack);
        storyRepository.save(badPartingWolf);

        CastAndCrew badPartingWolfWriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, badPartingWolf);
        castAndCrewRepository.save(badPartingWolfWriter);
        CastAndCrew badPartingWolfdirector = new CastAndCrew(jAhearne, "Director", CastOrCrew.CREW, badPartingWolf);
        castAndCrewRepository.save(badPartingWolfdirector);
        CastAndCrew badPartingWolfsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, badPartingWolf);
        castAndCrewRepository.save(badPartingWolfsRunner);
        CastAndCrew badPartingWolfproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, badPartingWolf);
        castAndCrewRepository.save(badPartingWolfproducer);
        CastAndCrew badPartingWolfexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, badPartingWolf);
        castAndCrewRepository.save(badPartingWolfexecProducer);

        Story xmasInvasion = new Story(
                "The Christmas Invasion",
                Format.TV,
                LocalDate.of(2005, 12, 25),
                LocalDate.of(2005, 12, 25),
                "DVD (2006), Blu-Ray(2013), Novelisation (2018), Audiobook (2018).",
                "images/eccleston_logo.png",
                "The Doctor has a bit of a rest while the world gets invaded.",
                "Christmas Special; Festive Special; Santa robots; Tea; Pilot fish; Mars; UNIT; Sycorax; Don't you think she looks tired?; Lion King; Regeneration; severed; regrown; hand; ",
                Series.SERIES2,
                0,
                1,
                "2.X",
                "https://tardis.wiki/wiki/The_Christmas_Invasion_(TV_story)"
        );
        xmasInvasion.addDoctor(tenthDoctor);
        xmasInvasion.addCompanion(rose);
        storyRepository.save(xmasInvasion);

        CastAndCrew xmasInvasionWriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, xmasInvasion);
        castAndCrewRepository.save(xmasInvasionWriter);
        CastAndCrew xmasInvasiondirector = new CastAndCrew(jHawes, "Director", CastOrCrew.CREW, xmasInvasion);
        castAndCrewRepository.save(xmasInvasiondirector);
        CastAndCrew xmasInvasionsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, xmasInvasion);
        castAndCrewRepository.save(xmasInvasionsRunner);
        CastAndCrew xmasInvasionproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, xmasInvasion);
        castAndCrewRepository.save(xmasInvasionproducer);
        CastAndCrew xmasInvasionexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, xmasInvasion);
        castAndCrewRepository.save(xmasInvasionexecProducer);

        Story newEarth = new Story(
                "New Earth",
                Format.TV,
                LocalDate.of(2006, 4, 15),
                LocalDate.of(2006, 4, 15),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "The Doctor takes Rose to New Earth and gets furious at some cats.",
                "Cat Nuns; Face of Boe; Medical Experiments; Cassandra; Body Swap",
                Series.SERIES2,
                1,
                1,
                "2.1",
                "https://tardis.wiki/wiki/New_Earth_(TV_story)"
        );
        newEarth.addDoctor(tenthDoctor);
        newEarth.addCompanion(rose);
        storyRepository.save(newEarth);

        CastAndCrew newEarthWriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, newEarth);
        castAndCrewRepository.save(newEarthWriter);
        CastAndCrew newEarthdirector = new CastAndCrew(jHawes, "Director", CastOrCrew.CREW, newEarth);
        castAndCrewRepository.save(newEarthdirector);
        CastAndCrew newEarthsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, newEarth);
        castAndCrewRepository.save(newEarthsRunner);
        CastAndCrew newEarthproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, newEarth);
        castAndCrewRepository.save(newEarthproducer);
        CastAndCrew newEarthexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, newEarth);
        castAndCrewRepository.save(newEarthexecProducer);

        Story toothClaw = new Story(
                "Tooth and Claw",
                Format.TV,
                LocalDate.of(2006, 4, 22),
                LocalDate.of(2006, 4, 22),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "The Doctor and Rose arrive in Scotland and irritate the hell out of everyone.",
                "Werewolf; Torchwood; Queen Victoria; kung fu monks; Scotland; Jamie; Balamory; we are not amused; diamond; Koh-i-noor; pseudohistorical; celebrity historical",
                Series.SERIES2,
                2,
                1,
                "2.2",
                "https://tardis.wiki/wiki/Tooth_and_Claw_(TV_story)"
        );
        toothClaw.addDoctor(tenthDoctor);
        toothClaw.addCompanion(rose);
        storyRepository.save(toothClaw);

        CastAndCrew toothClawWriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, toothClaw);
        castAndCrewRepository.save(toothClawWriter);
        CastAndCrew toothClawdirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, toothClaw);
        castAndCrewRepository.save(toothClawdirector);
        CastAndCrew toothClawsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, toothClaw);
        castAndCrewRepository.save(toothClawsRunner);
        CastAndCrew toothClawproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, toothClaw);
        castAndCrewRepository.save(toothClawproducer);
        CastAndCrew toothClawexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, toothClaw);
        castAndCrewRepository.save(toothClawexecProducer);

        Story schoolReunion = new Story(
                "School Reunion",
                Format.TV,
                LocalDate.of(2006, 4, 29),
                LocalDate.of(2006, 4, 29),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "The Doctor meets some old friends, and wishes the bat people he's met were somewhat quieter.",
                "K9; Sarah Jane Smith; Pool; Confrontation; Krillitane; blew up the school",
                Series.SERIES2,
                3,
                1,
                "2.3",
                "https://tardis.wiki/wiki/School_Reunion_(TV_story)"
        );
        schoolReunion.addDoctor(tenthDoctor);
        schoolReunion.addCompanion(rose);
        schoolReunion.addCompanion(sarahJane);
        storyRepository.save(schoolReunion);

        CastAndCrew schoolReunionwriter = new CastAndCrew(whithouse, "Writer", CastOrCrew.CREW, schoolReunion);
        castAndCrewRepository.save(schoolReunionwriter);
        CastAndCrew schoolReuniondirector = new CastAndCrew(jHawes, "Director", CastOrCrew.CREW, schoolReunion);
        castAndCrewRepository.save(schoolReuniondirector);
        CastAndCrew schoolReunionsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, schoolReunion);
        castAndCrewRepository.save(schoolReunionsRunner);
        CastAndCrew schoolReunionproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, schoolReunion);
        castAndCrewRepository.save(schoolReunionproducer);
        CastAndCrew schoolReunionexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, schoolReunion);
        castAndCrewRepository.save(schoolReunionexecProducer);

        Story girlFireplace = new Story(
                "The Girl in the Fireplace",
                Format.TV,
                LocalDate.of(2006, 5, 6),
                LocalDate.of(2006, 5, 6),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "For their first trip with Mickey, the Tenth Doctor and Rose end up on a spaceship in the future that contains several portals to pre-Revolutionary France.",
                "Clockwork; Robots; romance; dancing; horse; Droids; the; Silver; Turk; pseudohistorical",
                Series.SERIES2,
                4,
                1,
                "2.4",
                "https://tardis.wiki/wiki/The_Girl_in_the_Fireplace_(TV_story)"
        );
        girlFireplace.addDoctor(tenthDoctor);
        girlFireplace.addCompanion(rose);
        girlFireplace.addCompanion(mickey);
        storyRepository.save(girlFireplace);

        CastAndCrew girlFireplacewriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, girlFireplace);
        castAndCrewRepository.save(girlFireplacewriter);
        CastAndCrew girlFireplacedirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, girlFireplace);
        castAndCrewRepository.save(girlFireplacedirector);
        CastAndCrew girlFireplacesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, girlFireplace);
        castAndCrewRepository.save(girlFireplacesRunner);
        CastAndCrew girlFireplaceproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, girlFireplace);
        castAndCrewRepository.save(girlFireplaceproducer);
        CastAndCrew girlFireplaceexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, girlFireplace);
        castAndCrewRepository.save(girlFireplaceexecProducer);

        Story riseCybermenSteel = new Story(
                "Rise of the Cybermen/The Age of Steel",
                Format.TV,
                LocalDate.of(2006, 5, 13),
                LocalDate.of(2005, 5, 20),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "The Doctor, Rose and Mickey arrive in another dimension just as a new race of Cybermen are created.",
                "Cybermen; Lumic; alternate dimension; parallel world; Pete Tyler; Pete's World; delete; upgraded; Lion Sleeps Tonight; from beyond the grave; doppelganger",
                Series.SERIES2,
                5,
                2,
                "2.5 - 2.6",
                "https://tardis.wiki/wiki/Rise_of_the_Cybermen_(TV_story)"
        );
        riseCybermenSteel.addDoctor(tenthDoctor);
        riseCybermenSteel.addCompanion(rose);
        riseCybermenSteel.addCompanion(mickey);
        storyRepository.save(riseCybermenSteel);

        CastAndCrew riseCybermenSteelwriter = new CastAndCrew(tMacrae, "Writer", CastOrCrew.CREW, riseCybermenSteel);
        castAndCrewRepository.save(riseCybermenSteelwriter);
        CastAndCrew riseCybermenSteeldirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, riseCybermenSteel);
        castAndCrewRepository.save(riseCybermenSteeldirector);
        CastAndCrew riseCybermenSteelsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, riseCybermenSteel);
        castAndCrewRepository.save(riseCybermenSteelsRunner);
        CastAndCrew riseCybermenSteelproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, riseCybermenSteel);
        castAndCrewRepository.save(riseCybermenSteelproducer);
        CastAndCrew riseCybermenSteelexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, riseCybermenSteel);
        castAndCrewRepository.save(riseCybermenSteelexecProducer);

        Story idiotLantern = new Story(
                "The Idiot's Lantern",
                Format.TV,
                LocalDate.of(2006, 5, 27),
                LocalDate.of(2006, 5, 27),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "The Doctor and Rose arrive in London in the build up to Queen Elizabeth II's Coronation.",
                "television; coronation; Alexander Palace; Ally Pally; Fifties; The Wire; pseudohistorical; Sapphire and Steel; blank faces",
                Series.SERIES2,
                6,
                1,
                "2.7",
                "https://tardis.wiki/wiki/The_Idiot%27s_Lantern_(TV_story)"
        );
        idiotLantern.addDoctor(tenthDoctor);
        idiotLantern.addCompanion(rose);
        storyRepository.save(idiotLantern);

        CastAndCrew idiotLanternwriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, idiotLantern);
        castAndCrewRepository.save(idiotLanternwriter);
        CastAndCrew idiotLanterndirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, idiotLantern);
        castAndCrewRepository.save(idiotLanterndirector);
        CastAndCrew idiotLanternsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, idiotLantern);
        castAndCrewRepository.save(idiotLanternsRunner);
        CastAndCrew idiotLanternproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, idiotLantern);
        castAndCrewRepository.save(idiotLanternproducer);
        CastAndCrew idiotLanternexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, idiotLantern);
        castAndCrewRepository.save(idiotLanternexecProducer);

        Story impossibleSatan = new Story(
                "The Impossible Planet/The Satan Pit",
                Format.TV,
                LocalDate.of(2006, 6, 3),
                LocalDate.of(2006, 6, 10),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "The Doctor and Rose arrive on a planet in orbit around a black hole.",
                "Devil; Ood; possession; horror; black hole; Krop Tor; belief;",
                Series.SERIES2,
                7,
                2,
                "2.8 - 2.9",
                "https://tardis.wiki/wiki/The_Impossible_Planet_(TV_story)"
        );
        impossibleSatan.addDoctor(tenthDoctor);
        impossibleSatan.addCompanion(rose);
        storyRepository.save(impossibleSatan);

        CastAndCrew impossibleSatanwriter = new CastAndCrew(mJones, "Writer", CastOrCrew.CREW, impossibleSatan);
        castAndCrewRepository.save(impossibleSatanwriter);
        CastAndCrew impossibleSatandirector = new CastAndCrew(jStrong, "Director", CastOrCrew.CREW, impossibleSatan);
        castAndCrewRepository.save(impossibleSatandirector);
        CastAndCrew impossibleSatansRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, impossibleSatan);
        castAndCrewRepository.save(impossibleSatansRunner);
        CastAndCrew impossibleSatanproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, impossibleSatan);
        castAndCrewRepository.save(impossibleSatanproducer);
        CastAndCrew impossibleSatanexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, impossibleSatan);
        castAndCrewRepository.save(impossibleSatanexecProducer);

        Story loveMonsters = new Story(
                "Love & Monsters",
                Format.TV,
                LocalDate.of(2006, 6, 17),
                LocalDate.of(2006, 6, 17),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "Elton Pope's loved ones keep dying, and at the centre of it all is one man called 'The Doctor'.",
                "Abzorbaloff; Victor Kennedy; Elton Pope; paving slab; LINDA; Jackie Tyler; Il Divo;",
                Series.SERIES2,
                8,
                1,
                "2.10",
                "https://tardis.wiki/wiki/Love_%26_Monsters_(TV_story)"
        );
        loveMonsters.addDoctor(tenthDoctor);
        loveMonsters.addCompanion(rose);
        storyRepository.save(loveMonsters);

        CastAndCrew loveMonsterswriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, loveMonsters);
        castAndCrewRepository.save(loveMonsterswriter);
        CastAndCrew loveMonstersdirector = new CastAndCrew(dZeff, "Director", CastOrCrew.CREW, loveMonsters);
        castAndCrewRepository.save(loveMonstersdirector);
        CastAndCrew loveMonsterssRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, loveMonsters);
        castAndCrewRepository.save(loveMonsterssRunner);
        CastAndCrew loveMonstersproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, loveMonsters);
        castAndCrewRepository.save(loveMonstersproducer);
        CastAndCrew loveMonstersexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, loveMonsters);
        castAndCrewRepository.save(loveMonstersexecProducer);

        Story fearHer = new Story(
                "Fear Her",
                Format.TV,
                LocalDate.of(2006, 6, 24),
                LocalDate.of(2006, 6, 24),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "An ordinary suburban street is terrorised by a child's drawings.",
                "Isolus; Olympics; Olympic flame; I was a dad once; Not you too Bob; Huw Edwards; Kookaburra; domestic abuse; 2012",
                Series.SERIES2,
                9,
                1,
                "2.11",
                "https://tardis.wiki/wiki/Fear_Her_(TV_story)"
        );
        fearHer.addDoctor(tenthDoctor);
        fearHer.addCompanion(rose);
        storyRepository.save(fearHer);

        CastAndCrew fearHerwriter = new CastAndCrew(mGraham, "Writer", CastOrCrew.CREW, fearHer);
        castAndCrewRepository.save(fearHerwriter);
        CastAndCrew fearHerdirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, fearHer);
        castAndCrewRepository.save(fearHerdirector);
        CastAndCrew fearHersRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, fearHer);
        castAndCrewRepository.save(fearHersRunner);
        CastAndCrew fearHerproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, fearHer);
        castAndCrewRepository.save(fearHerproducer);
        CastAndCrew fearHerexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, fearHer);
        castAndCrewRepository.save(fearHerexecProducer);

        Story armyofdoomsday = new Story(
                "Army of Ghosts/Doomsday",
                Format.TV,
                LocalDate.of(2006, 7, 1),
                LocalDate.of(2005, 7, 8),
                "DVD (2006), Blu-Ray (2013)",
                "images/eccleston_logo.png",
                "Rose Tyler narrates the story of how she died.",
                "Cybermen; Daleks; Cult of Skaro; corridors; Pete; Jackie; Mickey; Torchwood; ghosts; Yvonne Hartman; last appearance Pete Tyler; Bad Wolf Bay; burning up a star",
                Series.SERIES2,
                10,
                2,
                "2.12 - 2.13",
                "https://tardis.wiki/wiki/Army_of_Ghosts_(TV_story)"
        );
        armyofdoomsday.addDoctor(tenthDoctor);
        armyofdoomsday.addCompanion(rose);
        storyRepository.save(armyofdoomsday);

        CastAndCrew armyofdoomsdaywriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, armyofdoomsday);
        castAndCrewRepository.save(armyofdoomsdaywriter);
        CastAndCrew armyofdoomsdaydirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, armyofdoomsday);
        castAndCrewRepository.save(armyofdoomsdaydirector);
        CastAndCrew armyofdoomsdaysRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, armyofdoomsday);
        castAndCrewRepository.save(armyofdoomsdaysRunner);
        CastAndCrew armyofdoomsdayproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, armyofdoomsday);
        castAndCrewRepository.save(armyofdoomsdayproducer);
        CastAndCrew armyofdoomsdayexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, armyofdoomsday);
        castAndCrewRepository.save(armyofdoomsdayexecProducer);

        Story runawayBride = new Story(
                "The Runaway Bride",
                Format.TV,
                LocalDate.of(2006, 12, 25),
                LocalDate.of(2006, 12, 25),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "Donna Noble is teleported away from her own wedding into a world of robot Santas, exploding baubles and extreme cackling.",
                "Christmas Special; Festive Special; giant spider; genocide; pockets; wedding; Mr Saxon",
                Series.SERIES3,
                0,
                1,
                "3.X",
                "https://tardis.wiki/wiki/The_Runaway_Bride_(TV_story)"
        );
        runawayBride.addDoctor(tenthDoctor);
        runawayBride.addCompanion(donna);
        storyRepository.save(runawayBride);

        CastAndCrew runawayBridewriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, runawayBride);
        castAndCrewRepository.save(runawayBridewriter);
        CastAndCrew runawayBridedirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, runawayBride);
        castAndCrewRepository.save(runawayBridedirector);
        CastAndCrew runawayBridesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, runawayBride);
        castAndCrewRepository.save(runawayBridesRunner);
        CastAndCrew runawayBrideproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, runawayBride);
        castAndCrewRepository.save(runawayBrideproducer);
        CastAndCrew runawayBrideexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, runawayBride);
        castAndCrewRepository.save(runawayBrideexecProducer);

        Story smithJones = new Story(
                "Smith and Jones",
                Format.TV,
                LocalDate.of(2007, 3, 31),
                LocalDate.of(2007, 3, 31),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "Medical student Martha Jones finds herself trapped on the moon with Space Rhinos.",
                "Straw; Vampire; Judoon; Benjamin Franklin; tie; platoon upon the moon; Mr Saxon",
                Series.SERIES3,
                1,
                1,
                "3.1",
                "https://tardis.wiki/wiki/Smith_and_Jones_(TV_story)"
        );
        smithJones.addDoctor(tenthDoctor);
        smithJones.addCompanion(martha);
        storyRepository.save(smithJones);

        CastAndCrew smithJoneswriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, smithJones);
        castAndCrewRepository.save(smithJoneswriter);
        CastAndCrew smithJonesdirector = new CastAndCrew(cPalmer, "Director", CastOrCrew.CREW, smithJones);
        castAndCrewRepository.save(smithJonesdirector);
        CastAndCrew smithJonessRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, smithJones);
        castAndCrewRepository.save(smithJonessRunner);
        CastAndCrew smithJonesproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, smithJones);
        castAndCrewRepository.save(smithJonesproducer);
        CastAndCrew smithJonesexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, smithJones);
        castAndCrewRepository.save(smithJonesexecProducer);

        Story shakespeareCode = new Story(
                "The Shakespeare Code",
                Format.TV,
                LocalDate.of(2007, 4, 7),
                LocalDate.of(2007, 4, 7),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "Shakespeare! Witches! Theatre!",
                "A Groatsworth of Wit; Witches; Carrionites; Lilith; theatre; pseudohistorical; celebrity historical; The Globe; poorly aged references to JK Rowling; bloke from Shameless; Love's Labours Won; lost play",
                Series.SERIES3,
                2,
                1,
                "3.2",
                "https://tardis.wiki/wiki/The_Shakespeare_Code_(TV_story)"
        );
        shakespeareCode.addDoctor(tenthDoctor);
        shakespeareCode.addCompanion(martha);
        storyRepository.save(shakespeareCode);

        CastAndCrew shakespeareCodewriter = new CastAndCrew(gRoberts, "Writer", CastOrCrew.CREW, shakespeareCode);
        castAndCrewRepository.save(shakespeareCodewriter);
        CastAndCrew shakespeareCodedirector = new CastAndCrew(cPalmer, "Director", CastOrCrew.CREW, shakespeareCode);
        castAndCrewRepository.save(shakespeareCodedirector);
        CastAndCrew shakespeareCodesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, shakespeareCode);
        castAndCrewRepository.save(shakespeareCodesRunner);
        CastAndCrew shakespeareCodeproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, shakespeareCode);
        castAndCrewRepository.save(shakespeareCodeproducer);
        CastAndCrew shakespeareCodeexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, shakespeareCode);
        castAndCrewRepository.save(shakespeareCodeexecProducer);

        Story gridlock = new Story(
                "Gridlock",
                Format.TV,
                LocalDate.of(2007, 4, 14),
                LocalDate.of(2007, 4, 14),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor takes Martha to New York, where they both get stuck in one hell of a traffic jam.",
                "Macra; Irish Cat; Gas; Cars; New Earth; Face of Boe; You are not alone; Motorway; Being Human lady; Old Rugged Cross; Gallifrey",
                Series.SERIES3,
                3,
                1,
                "3.3",
                "https://tardis.wiki/wiki/Gridlock_(TV_story)"
        );
        gridlock.addDoctor(tenthDoctor);
        gridlock.addCompanion(martha);
        storyRepository.save(gridlock);

        CastAndCrew gridlockwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, gridlock);
        castAndCrewRepository.save(gridlockwriter);
        CastAndCrew gridlockdirector = new CastAndCrew(rClark, "Director", CastOrCrew.CREW, gridlock);
        castAndCrewRepository.save(gridlockdirector);
        CastAndCrew gridlocksRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, gridlock);
        castAndCrewRepository.save(gridlocksRunner);
        CastAndCrew gridlockproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, gridlock);
        castAndCrewRepository.save(gridlockproducer);
        CastAndCrew gridlockexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, gridlock);
        castAndCrewRepository.save(gridlockexecProducer);

        Story evolDaleksManhattan = new Story(
                "Daleks in Manhattan/Evolution of the Daleks",
                Format.TV,
                LocalDate.of(2007, 4, 21),
                LocalDate.of(2007, 4, 28),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Cult of Skaro embark on a plan which, at some point, must have involved kidnapping a pig.",
                "Cult of Skaro; New York; Manhattan; Empire State Building; chorus girl; Human Dalek; Spider-man; Hooverville; Depression; Pig Slave;",
                Series.SERIES3,
                4,
                2,
                "3.4 - 3.5",
                "https://tardis.wiki/wiki/Daleks_in_Manhattan_(TV_story)"
        );
        evolDaleksManhattan.addDoctor(tenthDoctor);
        evolDaleksManhattan.addCompanion(martha);
        storyRepository.save(evolDaleksManhattan);

        CastAndCrew evolDaleksManhattanwriter = new CastAndCrew(raynor, "Writer", CastOrCrew.CREW, evolDaleksManhattan);
        castAndCrewRepository.save(evolDaleksManhattanwriter);
        CastAndCrew evolDaleksManhattandirector = new CastAndCrew(jStrong, "Director", CastOrCrew.CREW, evolDaleksManhattan);
        castAndCrewRepository.save(evolDaleksManhattandirector);
        CastAndCrew evolDaleksManhattansRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, evolDaleksManhattan);
        castAndCrewRepository.save(evolDaleksManhattansRunner);
        CastAndCrew evolDaleksManhattanproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, evolDaleksManhattan);
        castAndCrewRepository.save(evolDaleksManhattanproducer);
        CastAndCrew evolDaleksManhattanexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, evolDaleksManhattan);
        castAndCrewRepository.save(evolDaleksManhattanexecProducer);

        Story lazarus = new Story(
                "The Lazarus Experiment",
                Format.TV,
                LocalDate.of(2007, 5, 5),
                LocalDate.of(2007, 5, 5),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor and Martha go to a party with some old people.",
                "Reverse the polarity; Tish; Martha's Mum; Francine; Leo; weird scorpion monster thing; reverse the effects of ageing; reborn; Mr Saxon",
                Series.SERIES3,
                5,
                1,
                "3.6",
                "https://tardis.wiki/wiki/The_Lazarus_Experiment_(TV_story)"
        );
        lazarus.addDoctor(tenthDoctor);
        lazarus.addCompanion(martha);
        storyRepository.save(lazarus);

        CastAndCrew lazaruswriter = new CastAndCrew(greenhorn, "Writer", CastOrCrew.CREW, lazarus);
        castAndCrewRepository.save(lazaruswriter);
        CastAndCrew lazarusdirector = new CastAndCrew(rClark, "Director", CastOrCrew.CREW, lazarus);
        castAndCrewRepository.save(lazarusdirector);
        CastAndCrew lazarussRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, lazarus);
        castAndCrewRepository.save(lazarussRunner);
        CastAndCrew lazarusproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, lazarus);
        castAndCrewRepository.save(lazarusproducer);
        CastAndCrew lazarusexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, lazarus);
        castAndCrewRepository.save(lazarusexecProducer);

        Story fortytwo = new Story(
                "42",
                Format.TV,
                LocalDate.of(2007, 5, 19),
                LocalDate.of(2007, 5, 19),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Tenth Doctor and Martha follow a distress signal, only to be trapped on a spaceship hurtling towards a sun with forty-two minutes left till impact.",
                "Living Sun; pub quiz; Eastenders; Mr Saxon; Martha's Mum; Francine; possession; Burn with me",
                Series.SERIES3,
                6,
                1,
                "3.7",
                "https://tardis.wiki/wiki/42_(TV_story)"
        );
        fortytwo.addDoctor(tenthDoctor);
        fortytwo.addCompanion(martha);
        storyRepository.save(fortytwo);

        CastAndCrew fortytwowriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, fortytwo);
        castAndCrewRepository.save(fortytwowriter);
        CastAndCrew fortytwodirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, fortytwo);
        castAndCrewRepository.save(fortytwodirector);
        CastAndCrew fortytwosRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, fortytwo);
        castAndCrewRepository.save(fortytwosRunner);
        CastAndCrew fortytwoproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, fortytwo);
        castAndCrewRepository.save(fortytwoproducer);
        CastAndCrew fortytwoexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, fortytwo);
        castAndCrewRepository.save(fortytwoexecProducer);

        Story humanNaturefamBlood = new Story(
                "Human Nature/The Family of Blood",
                Format.TV,
                LocalDate.of(2007, 5, 26),
                LocalDate.of(2007, 6, 2),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor changes himself into a human to escape the Family of Blood, but without thinking through the true cost.",
                "To be a Pilgrim; New Adventures; adaptation; John Smith; World War One; Journal of Impossible Things; Nurse Redfern; Scarecrows",
                Series.SERIES3,
                7,
                2,
                "3.8 - 3.9",
                "https://tardis.wiki/wiki/Human_Nature_(TV_story)"
        );
        humanNaturefamBlood.addDoctor(tenthDoctor);
        humanNaturefamBlood.addCompanion(martha);
        storyRepository.save(humanNaturefamBlood);

        CastAndCrew humanNaturefamBloodwriter = new CastAndCrew(pCornell, "Writer", CastOrCrew.CREW, humanNaturefamBlood);
        castAndCrewRepository.save(humanNaturefamBloodwriter);
        CastAndCrew humanNaturefamBlooddirector = new CastAndCrew(cPalmer, "Director", CastOrCrew.CREW, humanNaturefamBlood);
        castAndCrewRepository.save(humanNaturefamBlooddirector);
        CastAndCrew humanNaturefamBloodsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, humanNaturefamBlood);
        castAndCrewRepository.save(humanNaturefamBloodsRunner);
        CastAndCrew humanNaturefamBloodproducer = new CastAndCrew(liggat, "Producer", CastOrCrew.CREW, humanNaturefamBlood);
        castAndCrewRepository.save(humanNaturefamBloodproducer);
        CastAndCrew humanNaturefamBloodexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, humanNaturefamBlood);
        castAndCrewRepository.save(humanNaturefamBloodexecProducer);

        Story blink = new Story(
                "Blink",
                Format.TV,
                LocalDate.of(2007, 6, 9),
                LocalDate.of(2007, 6, 9),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "Every statue that you've ever seen can come to life and get you when you're not looking.",
                "Weeping Angels; Angels have the phonebox; DVDs; Sally Sparrow; Nightingale; Carey Mulligan; Don't Blink",
                Series.SERIES3,
                8,
                1,
                "3.10",
                "https://tardis.wiki/wiki/Blink_(TV_story)"
        );
        blink.addDoctor(tenthDoctor);
        blink.addCompanion(martha);
        storyRepository.save(blink);

        CastAndCrew blinkwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, blink);
        castAndCrewRepository.save(blinkwriter);
        CastAndCrew blinkdirector = new CastAndCrew(hMacDonald, "Director", CastOrCrew.CREW, blink);
        castAndCrewRepository.save(blinkdirector);
        CastAndCrew blinksRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, blink);
        castAndCrewRepository.save(blinksRunner);
        CastAndCrew blinkproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, blink);
        castAndCrewRepository.save(blinkproducer);
        CastAndCrew blinkexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, blink);
        castAndCrewRepository.save(blinkexecProducer);

        Story utopia = new Story(
                "Utopia",
                Format.TV,
                LocalDate.of(2007, 6, 16),
                LocalDate.of(2007, 6, 16),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "Trying to shake off Captain Jack, the TARDIS journeys to the end of the universe.",
                "Master; Professor Yana; Rift; Futurekind; Chantho; end of the universe",
                Series.SERIES3,
                9,
                1,
                "3.11",
                "https://tardis.wiki/wiki/Utopia_(TV_story)"
        );
        utopia.addDoctor(tenthDoctor);
        utopia.addCompanion(martha);
        utopia.addCompanion(jack);
        storyRepository.save(utopia);

        CastAndCrew utopiawriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, utopia);
        castAndCrewRepository.save(utopiawriter);
        CastAndCrew utopiadirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, utopia);
        castAndCrewRepository.save(utopiadirector);
        CastAndCrew utopiasRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, utopia);
        castAndCrewRepository.save(utopiasRunner);
        CastAndCrew utopiaproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, utopia);
        castAndCrewRepository.save(utopiaproducer);
        CastAndCrew utopiaexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, utopia);
        castAndCrewRepository.save(utopiaexecProducer);

        Story lastTimelordsDrums = new Story(
                "The Sound of Drums/Last of the Time Lords",
                Format.TV,
                LocalDate.of(2007, 6, 23),
                LocalDate.of(2007, 6, 30),
                "DVD (2007), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "synopsis",
                "Mr Saxon; Toclafane; Francine; Tish; Clive; Valiant; Gallifrey; Untempered Schism; vortex manipulator; Face of Boe",
                Series.SERIES3,
                10,
                1,
                "3.12 - 3.13",
                "https://tardis.wiki/wiki/The_Sound_of_Drums_(TV_story)"
        );
        lastTimelordsDrums.addDoctor(tenthDoctor);
        lastTimelordsDrums.addCompanion(martha);
        lastTimelordsDrums.addCompanion(jack);
        storyRepository.save(lastTimelordsDrums);

        CastAndCrew lastTimelordsDrumswriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, lastTimelordsDrums);
        castAndCrewRepository.save(lastTimelordsDrumswriter);
        CastAndCrew lastTimelordsDrumsdirector = new CastAndCrew(cTeague, "Director", CastOrCrew.CREW, lastTimelordsDrums);
        castAndCrewRepository.save(lastTimelordsDrumsdirector);
        CastAndCrew lastTimelordsDrumssRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, lastTimelordsDrums);
        castAndCrewRepository.save(lastTimelordsDrumssRunner);
        CastAndCrew lastTimelordsDrumsproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, lastTimelordsDrums);
        castAndCrewRepository.save(lastTimelordsDrumsproducer);
        CastAndCrew lastTimelordsDrumsexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, lastTimelordsDrums);
        castAndCrewRepository.save(lastTimelordsDrumsexecProducer);


        Story voyageDamned = new Story(
                "Voyage of the Damned",
                Format.TV,
                LocalDate.of(2007, 12, 25),
                LocalDate.of(2007, 12, 25),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The TARDIS crashes into the Titanic...in space.",
                "first appearance: Max Capricorn; slow motion; fork lift truck; gold tooth; Wilf; Geoffrey Palmer Dies; Titanic; Kylie; Christmas Special; Festive Special; disaster movie",
                Series.SERIES4,
                0,
                1,
                "4.X",
                "https://tardis.wiki/wiki/Voyage_of_the_Damned_(TV_story)"
        );
        voyageDamned.addDoctor(tenthDoctor);
        voyageDamned.addCompanion(astrid);
        storyRepository.save(voyageDamned);

        CastAndCrew voyageDamnedwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, voyageDamned);
        castAndCrewRepository.save(voyageDamnedwriter);
        CastAndCrew voyageDamneddirector = new CastAndCrew(jStrong, "Director", CastOrCrew.CREW, voyageDamned);
        castAndCrewRepository.save(voyageDamneddirector);
        CastAndCrew voyageDamnedsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, voyageDamned);
        castAndCrewRepository.save(voyageDamnedsRunner);
        CastAndCrew voyageDamnedproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, voyageDamned);
        castAndCrewRepository.save(voyageDamnedproducer);
        CastAndCrew voyageDamnedexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, voyageDamned);
        castAndCrewRepository.save(voyageDamnedexecProducer);

        Story partnerscrime = new Story(
                "Partners in Crime",
                Format.TV,
                LocalDate.of(2008, 4, 5),
                LocalDate.of(2008, 4, 5),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "Donna Noble is determined to find the Tenth Doctor again, and starts investigating Adipose Industries in the hope of finding him.",
                "Missing planets; Rose; Health and Safety; screwball; pendant; Nanny; weight loss; Penny Carter;",
                Series.SERIES4,
                1,
                1,
                "4.1",
                "https://tardis.wiki/wiki/Partners_in_Crime_(TV_story)"
        );
        partnerscrime.addDoctor(tenthDoctor);
        partnerscrime.addCompanion(donna);
        storyRepository.save(partnerscrime);

        CastAndCrew partnerscrimewriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, partnerscrime);
        castAndCrewRepository.save(partnerscrimewriter);
        CastAndCrew partnerscrimedirector = new CastAndCrew(jStrong, "Director", CastOrCrew.CREW, partnerscrime);
        castAndCrewRepository.save(partnerscrimedirector);
        CastAndCrew partnerscrimesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, partnerscrime);
        castAndCrewRepository.save(partnerscrimesRunner);
        CastAndCrew partnerscrimeproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, partnerscrime);
        castAndCrewRepository.save(partnerscrimeproducer);
        CastAndCrew partnerscrimeexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, partnerscrime);
        castAndCrewRepository.save(partnerscrimeexecProducer);

        Story firepompeii = new Story(
                "The Fires of Pompeii",
                Format.TV,
                LocalDate.of(2008, 4, 12),
                LocalDate.of(2008, 4, 12),
                "DVD (2008), Blu-Ray (2013), Novelisation (2022), Audiobook (2022).",
                "images/eccleston_logo.png",
                "The TARDIS lands in Pompeii as Mount Vesuvius is due to erupt.",
                "pseudohistorical; Volcano; Cambridge Latin Course; Peter Capaldi; Karen Gillan; soothsayers; fixed points in time; Pyroviles; missing planets",
                Series.SERIES4,
                2,
                1,
                "4.3",
                "https://tardis.wiki/wiki/The_Fires_of_Pompeii_(TV_story)"
        );
        firepompeii.addDoctor(tenthDoctor);
        firepompeii.addCompanion(donna);
        storyRepository.save(firepompeii);

        CastAndCrew firepompeiiwriter = new CastAndCrew(moran, "Writer", CastOrCrew.CREW, firepompeii);
        castAndCrewRepository.save(firepompeiiwriter);
        CastAndCrew firepompeiidirector = new CastAndCrew(cTeague, "Director", CastOrCrew.CREW, firepompeii);
        castAndCrewRepository.save(firepompeiidirector);
        CastAndCrew firepompeiisRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, firepompeii);
        castAndCrewRepository.save(firepompeiisRunner);
        CastAndCrew firepompeiiproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, firepompeii);
        castAndCrewRepository.save(firepompeiiproducer);
        CastAndCrew firepompeiiexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, firepompeii);
        castAndCrewRepository.save(firepompeiiexecProducer);

        Story planetOod = new Story(
                "Planet of the Ood",
                Format.TV,
                LocalDate.of(2008, 4, 19),
                LocalDate.of(2008, 4, 19),
                "DVD (2008), Blu-Ray (2013), Novelisation (2023), Audiobook (2023).",
                "images/eccleston_logo.png",
                "The Doctor and Donna visit the Ood's home planet, and find a revolution brewing.",
                "Ood Sigma; Ood Sphere; song; DoctorDonna; giant brain; Friends of the Ood;",
                Series.SERIES4,
                3,
                1,
                "4.2",
                "https://tardis.wiki/wiki/Planet_of_the_Ood_(TV_story)"
        );
        planetOod.addDoctor(tenthDoctor);
        planetOod.addCompanion(donna);
        storyRepository.save(planetOod);

        CastAndCrew planetOodwriter = new CastAndCrew(kTemple, "Writer", CastOrCrew.CREW, planetOod);
        castAndCrewRepository.save(planetOodwriter);
        CastAndCrew planetOoddirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, planetOod);
        castAndCrewRepository.save(planetOoddirector);
        CastAndCrew planetOodsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, planetOod);
        castAndCrewRepository.save(planetOodsRunner);
        CastAndCrew planetOodproducer = new CastAndCrew(liggat, "Producer", CastOrCrew.CREW, planetOod);
        castAndCrewRepository.save(planetOodproducer);
        CastAndCrew planetOodexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, planetOod);
        castAndCrewRepository.save(planetOodexecProducer);

        Story sontaranpoison = new Story(
                "The Sontaran Stratagem/The Poison Sky",
                Format.TV,
                LocalDate.of(2008, 4, 26),
                LocalDate.of(2008, 5, 3),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Sontarans are back, and this time they're teaming up with a wee incel guy.",
                "evil SatNav; ATMOS; UNIT; annoying genius; clones; Private Ross; back of the neck; Rose",
                Series.SERIES4,
                4,
                2,
                "4.4 - 4.5",
                "https://tardis.wiki/wiki/The_Sontaran_Stratagem_(TV_story)"
        );
        sontaranpoison.addDoctor(tenthDoctor);
        sontaranpoison.addCompanion(donna);
        sontaranpoison.addCompanion(martha);
        storyRepository.save(sontaranpoison);

        CastAndCrew sontaranpoisonwriter = new CastAndCrew(raynor, "Writer", CastOrCrew.CREW, sontaranpoison);
        castAndCrewRepository.save(sontaranpoisonwriter);
        CastAndCrew sontaranpoisondirector = new CastAndCrew(dMacKinnon, "Director", CastOrCrew.CREW, sontaranpoison);
        castAndCrewRepository.save(sontaranpoisondirector);
        CastAndCrew sontaranpoisonsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, sontaranpoison);
        castAndCrewRepository.save(sontaranpoisonsRunner);
        CastAndCrew sontaranpoisonproducer = new CastAndCrew(liggat, "Producer", CastOrCrew.CREW, sontaranpoison);
        castAndCrewRepository.save(sontaranpoisonproducer);
        CastAndCrew sontaranpoisonexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, sontaranpoison);
        castAndCrewRepository.save(sontaranpoisonexecProducer);

        Story drDaughter = new Story(
                "The Doctor's Daughter",
                Format.TV,
                LocalDate.of(2008, 5, 10),
                LocalDate.of(2008, 5, 10),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "Jenny is a soldier created from the Doctor's DNA to fight some fish guys.",
                "Hath; Georgia Moffett; real-life daughter; Peter Davison; married; David Tennant; guy from Game of Thrones",
                Series.SERIES4,
                5,
                1,
                "4.6",
                "https://tardis.wiki/wiki/The_Doctor%27s_Daughter_(TV_story)"
        );
        drDaughter.addDoctor(tenthDoctor);
        drDaughter.addCompanion(donna);
        drDaughter.addCompanion(martha);
        storyRepository.save(drDaughter);

        CastAndCrew drDaughterwriter = new CastAndCrew(greenhorn, "Writer", CastOrCrew.CREW, drDaughter);
        castAndCrewRepository.save(drDaughterwriter);
        CastAndCrew drDaughterdirector = new CastAndCrew(aTroughton, "Director", CastOrCrew.CREW, drDaughter);
        castAndCrewRepository.save(drDaughterdirector);
        CastAndCrew drDaughtersRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, drDaughter);
        castAndCrewRepository.save(drDaughtersRunner);
        CastAndCrew drDaughterproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, drDaughter);
        castAndCrewRepository.save(drDaughterproducer);
        CastAndCrew drDaughterexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, drDaughter);
        castAndCrewRepository.save(drDaughterexecProducer);

        Story unicornWasp = new Story(
                "The Unicorn and the Wasp",
                Format.TV,
                LocalDate.of(2008, 5, 17),
                LocalDate.of(2008, 5, 17),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "What happened in 1926, when Agatha Christie disappeared for ten days?",
                "Harrogate Hotel; Vespiform; Missing Planets; big space wasp; pseudohistorical; murder mystery",
                Series.SERIES4,
                6,
                1,
                "4.7",
                "https://tardis.wiki/wiki/The_Unicorn_and_the_Wasp_(TV_story)"
        );
        unicornWasp.addDoctor(tenthDoctor);
        unicornWasp.addCompanion(donna);
        storyRepository.save(unicornWasp);

        CastAndCrew unicornWaspwriter = new CastAndCrew(gRoberts, "Writer", CastOrCrew.CREW, unicornWasp);
        castAndCrewRepository.save(unicornWaspwriter);
        CastAndCrew unicornWaspdirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, unicornWasp);
        castAndCrewRepository.save(unicornWaspdirector);
        CastAndCrew unicornWaspsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, unicornWasp);
        castAndCrewRepository.save(unicornWaspsRunner);
        CastAndCrew unicornWaspproducer = new CastAndCrew(liggat, "Producer", CastOrCrew.CREW, unicornWasp);
        castAndCrewRepository.save(unicornWaspproducer);
        CastAndCrew unicornWaspexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, unicornWasp);
        castAndCrewRepository.save(unicornWaspexecProducer);

        Story silenceForest = new Story(
                "Silence in the Library/Forest of the Dead",
                Format.TV,
                LocalDate.of(2008, 5, 31),
                LocalDate.of(2008, 6, 7),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor takes Donna to a planet sized library, which is mysteriously empty. However that's not the biggest mystery here.",
                "first appearance: River Song; dies; Vashta Nerada; CAL; ghosting; count the shadows; alternate reality; diary; spoilers; ",
                Series.SERIES4,
                7,
                2,
                "4.9 - 4.10",
                "https://tardis.wiki/wiki/Silence_in_the_Library_(TV_story)"
        );
        silenceForest.addDoctor(tenthDoctor);
        silenceForest.addDoctor(doctorMoon);
        silenceForest.addCompanion(donna);
        silenceForest.addCompanion(river);
        storyRepository.save(silenceForest);

        CastAndCrew silenceForestwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, silenceForest);
        castAndCrewRepository.save(silenceForestwriter);
        CastAndCrew silenceForestdirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, silenceForest);
        castAndCrewRepository.save(silenceForestdirector);
        CastAndCrew silenceForestsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, silenceForest);
        castAndCrewRepository.save(silenceForestsRunner);
        CastAndCrew silenceForestproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, silenceForest);
        castAndCrewRepository.save(silenceForestproducer);
        CastAndCrew silenceForestexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, silenceForest);
        castAndCrewRepository.save(silenceForestexecProducer);

        Story midnight = new Story(
                "Midnight",
                Format.TV,
                LocalDate.of(2008, 6, 14),
                LocalDate.of(2008, 6, 14),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Doctor gets on a bus.",
                "Rose; possession; entity; bus tour; Sapphire Waterfall; nameless;",
                Series.SERIES4,
                8,
                1,
                "4.8",
                "https://tardis.wiki/wiki/Midnight_(TV_story)"
        );
        midnight.addDoctor(tenthDoctor);
        midnight.addCompanion(donna);
        storyRepository.save(midnight);

        CastAndCrew midnightwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, midnight);
        castAndCrewRepository.save(midnightwriter);
        CastAndCrew midnightdirector = new CastAndCrew(aTroughton, "Director", CastOrCrew.CREW, midnight);
        castAndCrewRepository.save(midnightdirector);
        CastAndCrew midnightsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, midnight);
        castAndCrewRepository.save(midnightsRunner);
        CastAndCrew midnightproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, midnight);
        castAndCrewRepository.save(midnightproducer);
        CastAndCrew midnightexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, midnight);
        castAndCrewRepository.save(midnightexecProducer);

        Story turnLeft = new Story(
                "Turn Left",
                Format.TV,
                LocalDate.of(2008, 6, 21),
                LocalDate.of(2008, 6, 21),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "As the death toll rises, Donna is shown how crucial she was to past events.",
                "Parallel World; alternate reality; death; Trickster's Brigade; Rose; Bad Wolf; concentration camps; something on your back; Time Beetle",
                Series.SERIES4,
                9,
                1,
                "4.11",
                "https://tardis.wiki/wiki/Turn_Left_(TV_story)"
        );
        turnLeft.addDoctor(tenthDoctor);
        turnLeft.addCompanion(donna);
        turnLeft.addCompanion(rose);
        storyRepository.save(turnLeft);

        CastAndCrew turnLeftwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, turnLeft);
        castAndCrewRepository.save(turnLeftwriter);
        CastAndCrew turnLeftdirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, turnLeft);
        castAndCrewRepository.save(turnLeftdirector);
        CastAndCrew turnLeftsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, turnLeft);
        castAndCrewRepository.save(turnLeftsRunner);
        CastAndCrew turnLeftproducer = new CastAndCrew(liggat, "Producer", CastOrCrew.CREW, turnLeft);
        castAndCrewRepository.save(turnLeftproducer);
        CastAndCrew turnLeftexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, turnLeft);
        castAndCrewRepository.save(turnLeftexecProducer);

        Story stolenEnd = new Story(  "The Stolen Earth/Journey's End",
                Format.TV,
                LocalDate.of(2008, 6, 28),
                LocalDate.of(2008, 7, 5),
                "DVD (2008), Blu-Ray (2013).",
                "images/eccleston_logo.png",
                "The Earth has been stolen. The stars have gone out. The Doctor is nowhere to be seen.",
                "Missing Planets; doctorDonna; regeneration; Daleks; Caan; Davros; Torchwood; Sarah Jane Adventures; TARDIS scene; metacrisis; non consensual mindwipe; palming off a clingy ex with a genocidal sex clone; half human",
                Series.SERIES4,
                10,
                2,
                "4.12 - 4.13",
                "https://tardis.wiki/wiki/The_Stolen_Earth_(TV_story)"
        );
        stolenEnd.addDoctor(tenthDoctor);
        stolenEnd.addDoctor(metacrisisDoctor);
        stolenEnd.addCompanion(donna);
        stolenEnd.addCompanion(rose);
        stolenEnd.addCompanion(martha);
        stolenEnd.addCompanion(mickey);
        stolenEnd.addCompanion(sarahJane);
        stolenEnd.addCompanion(jack);
        stolenEnd.addCompanion(jTyler);
        storyRepository.save(stolenEnd);

        CastAndCrew stolenEndwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, stolenEnd);
        castAndCrewRepository.save(stolenEndwriter);
        CastAndCrew stolenEnddirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, stolenEnd);
        castAndCrewRepository.save(stolenEnddirector);
        CastAndCrew stolenEndsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, stolenEnd);
        castAndCrewRepository.save(stolenEndsRunner);
        CastAndCrew stolenEndproducer = new CastAndCrew(collinson, "Producer", CastOrCrew.CREW, stolenEnd);
        castAndCrewRepository.save(stolenEndproducer);
        CastAndCrew stolenEndexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, stolenEnd);
        castAndCrewRepository.save(stolenEndexecProducer);

        Story nextDr = new Story(
                "The Next Doctor",
                Format.TV,
                LocalDate.of(2008, 12, 25),
                LocalDate.of(2008, 12, 25),
                "DVD (2009), Blu-ray (2010).",
                "images/tennant_logo1.png",
                "Cybermen stalk Victorian London! The Doctor investigates and meets...another Doctor.",
                "Festive Special; Christmas Special; Future Doctor; Cybermen; Cybershades; Scarlet Lady; CyberKing; giant Cyberman; fugue state; workhouse",
                Series.TENNANTSPECIALS,
                1,
                1,
                "4.14",
                "https://tardis.wiki/wiki/The_Next_Doctor_(TV_story)"
        );
        nextDr.addDoctor(tenthDoctor);
        nextDr.addCompanion(jacksonLake);
        storyRepository.save(nextDr);

        CastAndCrew nextDrwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, nextDr);
        castAndCrewRepository.save(nextDrwriter);
        CastAndCrew nextDrdirector = new CastAndCrew(aGoddard, "Director", CastOrCrew.CREW, nextDr);
        castAndCrewRepository.save(nextDrdirector);
        CastAndCrew nextDrsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, nextDr);
        castAndCrewRepository.save(nextDrsRunner);
        CastAndCrew nextDrproducer = new CastAndCrew(liggat, "Producer", CastOrCrew.CREW, nextDr);
        castAndCrewRepository.save(nextDrproducer);
        CastAndCrew nextDrexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, nextDr);
        castAndCrewRepository.save(nextDrexecProducer);

        Story planetDead = new Story(
                "Planet of the Dead",
                Format.TV,
                LocalDate.of(2009, 4, 11),
                LocalDate.of(2009, 4, 11),
                "DVD (2009), Blu-ray (2010).",
                "images/tennant_logo1.png",
                "A bus ends up on another planet, and the Doctor attempts to get the passengers back to Earth before the Swarm arrives.",
                "Easter Special; UNIT; bus; crash; insects; Swarm; cat burglar; he will knock four times; something is returning",
                Series.TENNANTSPECIALS,
                2,
                1,
                "4.15",
                "https://tardis.wiki/wiki/Planet_of_the_Dead_(TV_story)"
        );
        planetDead.addDoctor(tenthDoctor);
        planetDead.addCompanion(ladyChristina);
        storyRepository.save(planetDead);

        CastAndCrew planetDeadwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, planetDead);
        castAndCrewRepository.save(planetDeadwriter);
        CastAndCrew planetDeadwriter2 = new CastAndCrew(gRoberts, "Writer", CastOrCrew.CREW, planetDead);
        castAndCrewRepository.save(planetDeadwriter2);
        CastAndCrew planetDeaddirector = new CastAndCrew(jStrong, "Director", CastOrCrew.CREW, planetDead);
        castAndCrewRepository.save(planetDeaddirector);
        CastAndCrew planetDeadsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, planetDead);
        castAndCrewRepository.save(planetDeadsRunner);
        CastAndCrew planetDeadproducer = new CastAndCrew(tSimpson, "Producer", CastOrCrew.CREW, planetDead);
        castAndCrewRepository.save(planetDeadproducer);
        CastAndCrew planetDeadexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, planetDead);
        castAndCrewRepository.save(planetDeadexecProducer);

        Story watersMars = new Story(
                "The Waters of Mars",
                Format.TV,
                LocalDate.of(2009, 11, 15),
                LocalDate.of(2009, 11, 15),
                "DVD (2010), Blu-ray (2010), Novelisation (2023), Audiobook (2023).",
                "images/tennant_logo1.png",
                "synopsis",
                "Bowie Base One; water virus; zombies; the Flood; fixed points in time; Time Lord Victorious; Ood; suicide; comedy robot",
                Series.TENNANTSPECIALS,
                3,
                1,
                "4.16",
                "https://tardis.wiki/wiki/The_Waters_of_Mars_(TV_story)"
        );
        watersMars.addDoctor(tenthDoctor);
        watersMars.addCompanion(adelaide);
        storyRepository.save(watersMars);

        CastAndCrew watersMarswriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, watersMars);
        castAndCrewRepository.save(watersMarswriter);
        CastAndCrew watersMarswriter2 = new CastAndCrew(pFord, "Writer", CastOrCrew.CREW, watersMars);
        castAndCrewRepository.save(watersMarswriter2);
        CastAndCrew watersMarsdirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, watersMars);
        castAndCrewRepository.save(watersMarsdirector);
        CastAndCrew watersMarssRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, watersMars);
        castAndCrewRepository.save(watersMarssRunner);
        CastAndCrew watersMarsproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, watersMars);
        castAndCrewRepository.save(watersMarsproducer);
        CastAndCrew watersMarsexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, watersMars);
        castAndCrewRepository.save(watersMarsexecProducer);

        Story endTime = new Story(
                "The End of Time",
                Format.TV,
                LocalDate.of(2009, 12, 25),
                LocalDate.of(2010, 1, 1),
                "DVD (2010), Blu-ray (2010);",
                "images/tennant_logo1.png",
                "The Ood warn the Doctor that the Master has returned, heralding the end of time.",
                "Christmas Special; Festive Special; Master; Gallifrey; rises; Rassilon; Doctor's mum; Cactus; Master Race; four knocks; he will knock four times; regeneration; Tenth Doctor; I don't want to go; walkdown; first appearance: Eleventh Doctor",
                Series.TENNANTSPECIALS,
                4,
                2,
                "4.17 - 4.18",
                "https://tardis.wiki/wiki/The_End_of_Time_(TV_story)"
        );
        endTime.addDoctor(tenthDoctor);
        endTime.addCompanion(wilf);
        endTime.addCompanion(donna);
        storyRepository.save(endTime);

        CastAndCrew endTimewriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, endTime);
        castAndCrewRepository.save(endTimewriter);
        CastAndCrew endTimedirector = new CastAndCrew(eurosLyn, "Director", CastOrCrew.CREW, endTime);
        castAndCrewRepository.save(endTimedirector);
        CastAndCrew endTimesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, endTime);
        castAndCrewRepository.save(endTimesRunner);
        CastAndCrew endTimeproducer = new CastAndCrew(tSimpson, "Producer", CastOrCrew.CREW, endTime);
        castAndCrewRepository.save(endTimeproducer);
        CastAndCrew endTimeexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, endTime);
        castAndCrewRepository.save(endTimeexecProducer);

        Story eleventhHour = new Story(
                "The Eleventh Hour",
                Format.TV,
                LocalDate.of(2010, 4, 3),
                LocalDate.of(2010, 4, 3),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "The new Doctor crash lands in the village of Ledworth, and finds a mysterious crack in a girl's wall.",
                "Fish fingers and custard; Cracks; in time; in the universe; Silence will fall; first appearance: Amy Pond; Rory Williams; Ledworth; Prisoner Zero; the Pandorica; hospital; duck pond",
                Series.SERIES5,
                1,
                1,
                "1.1",
                "https://tardis.wiki/wiki/The_Eleventh_Hour_(TV_story)"
        );
        eleventhHour.addDoctor(eleventhDoctor);
        eleventhHour.addCompanion(amy);
        eleventhHour.addCompanion(rory);
        storyRepository.save(eleventhHour);

        CastAndCrew eleventhHourwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, eleventhHour);
        castAndCrewRepository.save(eleventhHourwriter);
        CastAndCrew eleventhHourdirector = new CastAndCrew(adamSmith, "Director", CastOrCrew.CREW, eleventhHour);
        castAndCrewRepository.save(eleventhHourdirector);
        CastAndCrew eleventhHoursRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, eleventhHour);
        castAndCrewRepository.save(eleventhHoursRunner);
        CastAndCrew eleventhHourproducer = new CastAndCrew(tSimpson, "Producer", CastOrCrew.CREW, eleventhHour);
        castAndCrewRepository.save(eleventhHourproducer);
        CastAndCrew eleventhHourexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, eleventhHour);
        castAndCrewRepository.save(eleventhHourexecProducer);
        CastAndCrew eleventhHourexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, eleventhHour);
        castAndCrewRepository.save(eleventhHourexecProducer2);

        Story beastBelow = new Story(
                "The Beast Below",
                Format.TV,
                LocalDate.of(2010, 4, 10),
                LocalDate.of(2010, 4, 10),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "What secrets does Starship UK hold in its depths?",
                "Liz 10; Space Whale; Demon Headmaster; Scottish independence; Smilers",
                Series.SERIES5,
                2,
                1,
                "1.2",
                "https://tardis.wiki/wiki/The_Beast_Below_(TV_story)"
        );
        beastBelow.addDoctor(eleventhDoctor);
        beastBelow.addCompanion(amy);
        storyRepository.save(beastBelow);

        CastAndCrew beastBelowwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, beastBelow);
        castAndCrewRepository.save(beastBelowwriter);
        CastAndCrew beastBelowdirector = new CastAndCrew(aGunn, "Director", CastOrCrew.CREW, beastBelow);
        castAndCrewRepository.save(beastBelowdirector);
        CastAndCrew beastBelowsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, beastBelow);
        castAndCrewRepository.save(beastBelowsRunner);
        CastAndCrew beastBelowproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, beastBelow);
        castAndCrewRepository.save(beastBelowproducer);
        CastAndCrew beastBelowexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, beastBelow);
        castAndCrewRepository.save(beastBelowexecProducer);
        CastAndCrew beastBelowexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, beastBelow);
        castAndCrewRepository.save(beastBelowexecProducer2);

        Story victoryDaleks = new Story(
                "Victory of the Daleks",
                Format.TV,
                LocalDate.of(2010, 4, 17),
                LocalDate.of(2010, 4, 17),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "Why are the Daleks helping Winston Churchill?",
                "Churchill; polite Daleks; paradigm Daleks; teletubby Daleks; big ass Daleks; Spitfires in Space; Ironsides",
                Series.SERIES5,
                3,
                1,
                "1.3",
                "https://tardis.wiki/wiki/Victory_of_the_Daleks_(TV_story)"
        );
        victoryDaleks.addDoctor(eleventhDoctor);
        victoryDaleks.addCompanion(amy);
        storyRepository.save(victoryDaleks);

        CastAndCrew victoryDalekswriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, victoryDaleks);
        castAndCrewRepository.save(victoryDalekswriter);
        CastAndCrew victoryDaleksdirector = new CastAndCrew(aGunn, "Director", CastOrCrew.CREW, victoryDaleks);
        castAndCrewRepository.save(victoryDaleksdirector);
        CastAndCrew victoryDalekssRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, victoryDaleks);
        castAndCrewRepository.save(victoryDalekssRunner);
        CastAndCrew victoryDaleksproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, victoryDaleks);
        castAndCrewRepository.save(victoryDaleksproducer);
        CastAndCrew victoryDaleksexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, victoryDaleks);
        castAndCrewRepository.save(victoryDaleksexecProducer);
        CastAndCrew victoryDaleksexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, victoryDaleks);
        castAndCrewRepository.save(victoryDaleksexecProducer2);

        Story timeAngelsStones = new Story(   "The Time of Angels/Flesh and Stone",
                Format.TV,
                LocalDate.of(2010, 4, 24),
                LocalDate.of(2010, 5, 1),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "What happens when ideas have thoughts of their own? What happens when dreams no longer need dreamers? When these things have come to pass, the time will be upon us. The Time of Angels.",
                "Crash at the Byzantium; forest on a spaceship; River Song; Weeping Angels; Clerics; Whatever takes the image of an Angel becomes itself an Angel; gravity globe; comfy chairs; turning into an Angel; Mike Skinner; the Streets; cracks in time",
                Series.SERIES5,
                4,
                2,
                "1.4 - 1.5",
                "https://tardis.wiki/wiki/The_Time_of_Angels_(TV_story)"
        );
        timeAngelsStones.addDoctor(eleventhDoctor);
        timeAngelsStones.addCompanion(amy);
        timeAngelsStones.addCompanion(river);
        storyRepository.save(timeAngelsStones);

        CastAndCrew timeAngelsStoneswriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, timeAngelsStones);
        castAndCrewRepository.save(timeAngelsStoneswriter);
        CastAndCrew timeAngelsStonesdirector = new CastAndCrew(adamSmith, "Director", CastOrCrew.CREW, timeAngelsStones);
        castAndCrewRepository.save(timeAngelsStonesdirector);
        CastAndCrew timeAngelsStonessRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, timeAngelsStones);
        castAndCrewRepository.save(timeAngelsStonessRunner);
        CastAndCrew timeAngelsStonesproducer = new CastAndCrew(tSimpson, "Producer", CastOrCrew.CREW, timeAngelsStones);
        castAndCrewRepository.save(timeAngelsStonesproducer);
        CastAndCrew timeAngelsStonesexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, timeAngelsStones);
        castAndCrewRepository.save(timeAngelsStonesexecProducer);
        CastAndCrew timeAngelsStonesexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, timeAngelsStones);
        castAndCrewRepository.save(timeAngelsStonesexecProducer2);

        Story vampiresVenice = new Story(
                "The Vampires of Venice",
                Format.TV,
                LocalDate.of(2010, 5, 8),
                LocalDate.of(2010, 5, 8),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "The Doctor takes Amy and Rory on a romantic trip to Venice in 1580.",
                "Saturnyne; Silence; will fall; cracks in time; stag do",
                Series.SERIES5,
                5,
                1,
                "1.6",
                "https://tardis.wiki/wiki/The_Vampires_of_Venice_(TV_story)"
        );
        vampiresVenice.addDoctor(eleventhDoctor);
        vampiresVenice.addCompanion(amy);
        vampiresVenice.addCompanion(rory);
        storyRepository.save(vampiresVenice);

        CastAndCrew vampiresVenicewriter = new CastAndCrew(whithouse, "Writer", CastOrCrew.CREW, vampiresVenice);
        castAndCrewRepository.save(vampiresVenicewriter);
        CastAndCrew vampiresVenicedirector = new CastAndCrew(jcampbell, "Director", CastOrCrew.CREW, vampiresVenice);
        castAndCrewRepository.save(vampiresVenicedirector);
        CastAndCrew vampiresVenicesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, vampiresVenice);
        castAndCrewRepository.save(vampiresVenicesRunner);
        CastAndCrew vampiresVeniceproducer = new CastAndCrew(tSimpson, "Producer", CastOrCrew.CREW, vampiresVenice);
        castAndCrewRepository.save(vampiresVeniceproducer);
        CastAndCrew vampiresVeniceproducer2 = new CastAndCrew(schweitzer, "Producer", CastOrCrew.CREW, vampiresVenice);
        castAndCrewRepository.save(vampiresVeniceproducer2);
        CastAndCrew vampiresVeniceexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, vampiresVenice);
        castAndCrewRepository.save(vampiresVeniceexecProducer);
        CastAndCrew vampiresVeniceexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, vampiresVenice);
        castAndCrewRepository.save(vampiresVeniceexecProducer2);

        Story amyChoice = new Story(
                "Amy's Choice",
                Format.TV,
                LocalDate.of(2010, 5, 15),
                LocalDate.of(2010, 5, 15),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "The TARDIS crew travel between realities, one where Amy and Rory are married and being pursued by possessed pensioners, and another where they are trapped in the TARDIS and about to freeze to death.",
                "Dream Lord; pregnant; Rory dies; psychic pollen",
                Series.SERIES5,
                6,
                1,
                "1.7",
                "https://tardis.wiki/wiki/Amy%27s_Choice_(TV_story)"
        );
        amyChoice.addDoctor(eleventhDoctor);
        amyChoice.addCompanion(amy);
        amyChoice.addCompanion(rory);
        storyRepository.save(amyChoice);

        CastAndCrew amyChoicewriter = new CastAndCrew(nye, "Writer", CastOrCrew.CREW, amyChoice);
        castAndCrewRepository.save(amyChoicewriter);
        CastAndCrew amyChoicedirector = new CastAndCrew(cMorshead, "Director", CastOrCrew.CREW, amyChoice);
        castAndCrewRepository.save(amyChoicedirector);
        CastAndCrew amyChoicesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, amyChoice);
        castAndCrewRepository.save(amyChoicesRunner);
        CastAndCrew amyChoiceproducer = new CastAndCrew(tSimpson, "Producer", CastOrCrew.CREW, amyChoice);
        castAndCrewRepository.save(amyChoiceproducer);
        CastAndCrew amyChoiceexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, amyChoice);
        castAndCrewRepository.save(amyChoiceexecProducer);
        CastAndCrew amyChoiceexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, amyChoice);
        castAndCrewRepository.save(amyChoiceexecProducer2);

        Story hungryEarthBlood = new Story(
                "The Hungry Earth/Cold Blood",
                Format.TV,
                LocalDate.of(2010, 5, 22),
                LocalDate.of(2010, 5, 29),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "A drilling operation in future Walse",
                "Silurians; Homo Reptilia; drilling operation; venom; tongue; peace negotiation; Rory dies; cracks in time; exploding TARDIS",
                Series.SERIES5,
                7,
                2,
                "1.8 - 1.9",
                "https://tardis.wiki/wiki/The_Hungry_Earth_(TV_story)"
        );
        hungryEarthBlood.addDoctor(eleventhDoctor);
        hungryEarthBlood.addCompanion(amy);
        hungryEarthBlood.addCompanion(rory);
        storyRepository.save(hungryEarthBlood);

        CastAndCrew hungryEarthBloodwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, hungryEarthBlood);
        castAndCrewRepository.save(hungryEarthBloodwriter);
        CastAndCrew hungryEarthBlooddirector = new CastAndCrew(aWay, "Director", CastOrCrew.CREW, hungryEarthBlood);
        castAndCrewRepository.save(hungryEarthBlooddirector);
        CastAndCrew hungryEarthBloodsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, hungryEarthBlood);
        castAndCrewRepository.save(hungryEarthBloodsRunner);
        CastAndCrew hungryEarthBloodproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, hungryEarthBlood);
        castAndCrewRepository.save(hungryEarthBloodproducer);
        CastAndCrew hungryEarthBloodexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, hungryEarthBlood);
        castAndCrewRepository.save(hungryEarthBloodexecProducer);
        CastAndCrew hungryEarthBloodexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, hungryEarthBlood);
        castAndCrewRepository.save(hungryEarthBloodexecProducer2);

        Story vincentDoctor = new Story(
                "Vincent and the Doctor",
                Format.TV,
                LocalDate.of(2010, 6, 5),
                LocalDate.of(2010, 6, 5),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "The Doctor sees an alien in a Van Gogh painting and travels to 1890 to ask the artist about it.",
                "Vincent van Gogh; sunflowers; Krafayis; big alien turkey; mental health; suicide; sunflowers; Bill Nighy; Athlete",
                Series.SERIES5,
                8,
                1,
                "1.10",
                "whttps://tardis.wiki/wiki/Vincent_and_the_Doctor_(TV_story)"
        );
        vincentDoctor.addDoctor(eleventhDoctor);
        vincentDoctor.addCompanion(amy);
        storyRepository.save(vincentDoctor);

        CastAndCrew vincentDoctorwriter = new CastAndCrew(rCurtis, "Writer", CastOrCrew.CREW, vincentDoctor);
        castAndCrewRepository.save(vincentDoctorwriter);
        CastAndCrew vincentDoctordirector = new CastAndCrew(jcampbell, "Director", CastOrCrew.CREW, vincentDoctor);
        castAndCrewRepository.save(vincentDoctordirector);
        CastAndCrew vincentDoctorsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, vincentDoctor);
        castAndCrewRepository.save(vincentDoctorsRunner);
        CastAndCrew vincentDoctorproducer = new CastAndCrew(tSimpson, "Producer", CastOrCrew.CREW, vincentDoctor);
        castAndCrewRepository.save(vincentDoctorproducer);
        CastAndCrew vincentDoctorproducer2 = new CastAndCrew(schweitzer, "Producer", CastOrCrew.CREW, vincentDoctor);
        castAndCrewRepository.save(vincentDoctorproducer2);
        CastAndCrew vincentDoctorexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, vincentDoctor);
        castAndCrewRepository.save(vincentDoctorexecProducer);
        CastAndCrew vincentDoctorexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, vincentDoctor);
        castAndCrewRepository.save(vincentDoctorexecProducer2);

        Story lodger = new Story(
                "The Lodger",
                Format.TV,
                LocalDate.of(2010, 6, 12),
                LocalDate.of(2010, 6, 12),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "The Doctor is stranded in Colchester.",
                "Craig; Owens; Sophie; flatshare; time machine; pilot; ",
                Series.SERIES5,
                9,
                1,
                "1.11",
                "https://tardis.wiki/wiki/The_Lodger_(TV_story)"
        );
        lodger.addDoctor(eleventhDoctor);
        lodger.addCompanion(amy);
        storyRepository.save(lodger);

        CastAndCrew lodgerwriter = new CastAndCrew(gRoberts, "Writer", CastOrCrew.CREW, lodger);
        castAndCrewRepository.save(lodgerwriter);
        CastAndCrew lodgerdirector = new CastAndCrew(cMorshead, "Director", CastOrCrew.CREW, lodger);
        castAndCrewRepository.save(lodgerdirector);
        CastAndCrew lodgersRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, lodger);
        castAndCrewRepository.save(lodgersRunner);
        CastAndCrew lodgerproducer = new CastAndCrew(tSimpson, "Producer", CastOrCrew.CREW, lodger);
        castAndCrewRepository.save(lodgerproducer);
        CastAndCrew lodgerexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, lodger);
        castAndCrewRepository.save(lodgerexecProducer);
        CastAndCrew lodgerexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, lodger);
        castAndCrewRepository.save(lodgerexecProducer2);


        Story pandoricaBang = new Story(
                "The Pandorica Opens/The Big Bang",
                Format.TV,
                LocalDate.of(2010, 6, 19),
                LocalDate.of(2010, 6, 26),
                "DVD/Blu-ray (2010)",
                "images/smith_logo1.png",
                "The Doctor and some Romans fend off the rest of the universe at Stonehenge.",
                "Pandorica; cracks; in time; exploding TARDIS; Autons; Hoix, for some reason; Daleks; Cybermen; Chelonian; Dorium Maldovar; Stonehenge; Underhenge; wedding; drunk giraffe; something old, something new, something borrowed, something blue; River Song; Fez; Lone Centurion; universe destroyed",
                Series.SERIES5,
                10,
                2,
                "1.12 - 1.13",
                "https://tardis.wiki/wiki/The_Pandorica_Opens_(TV_story)"
        );
        pandoricaBang.addDoctor(eleventhDoctor);
        pandoricaBang.addCompanion(amy);
        pandoricaBang.addCompanion(rory);
        pandoricaBang.addCompanion(river);
        storyRepository.save(pandoricaBang);

        CastAndCrew pandoricaBangwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, pandoricaBang);
        castAndCrewRepository.save(pandoricaBangwriter);
        CastAndCrew pandoricaBangdirector = new CastAndCrew(tHaynes, "Director", CastOrCrew.CREW, pandoricaBang);
        castAndCrewRepository.save(pandoricaBangdirector);
        CastAndCrew pandoricaBangsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, pandoricaBang);
        castAndCrewRepository.save(pandoricaBangsRunner);
        CastAndCrew pandoricaBangproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, pandoricaBang);
        castAndCrewRepository.save(pandoricaBangproducer);
        CastAndCrew pandoricaBangexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, pandoricaBang);
        castAndCrewRepository.save(pandoricaBangexecProducer);
        CastAndCrew pandoricaBangexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, pandoricaBang);
        castAndCrewRepository.save(pandoricaBangexecProducer2);


        Story christmasCarol = new Story(

                "A Christmas Carol",
                Format.TV,
                LocalDate.of(2010, 12, 25),
                LocalDate.of(2010, 12, 25),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "The Doctor attempts to restore an old man's kindness to stop a spaceship from crashing.",
                "Christmas Special; Festive Special; flying Shark; Scrooge; singing; fish; Marilyn Monroe; get your coat;",
                Series.SERIES6A,
                0,
                1,
                "2.X",
                "https://tardis.wiki/wiki/A_Christmas_Carol_(TV_story)"
        );
        christmasCarol.addDoctor(eleventhDoctor);
        christmasCarol.addCompanion(amy);
        christmasCarol.addCompanion(rory);
        storyRepository.save(christmasCarol);

        CastAndCrew christmasCarolwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, christmasCarol);
        castAndCrewRepository.save(christmasCarolwriter);
        CastAndCrew christmasCaroldirector = new CastAndCrew(tHaynes, "Director", CastOrCrew.CREW, christmasCarol);
        castAndCrewRepository.save(christmasCaroldirector);
        CastAndCrew christmasCarolsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, christmasCarol);
        castAndCrewRepository.save(christmasCarolsRunner);
        CastAndCrew christmasCarolproducer = new CastAndCrew(wohlenberg, "Producer", CastOrCrew.CREW, christmasCarol);
        castAndCrewRepository.save(christmasCarolproducer);
        CastAndCrew christmasCarolexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, christmasCarol);
        castAndCrewRepository.save(christmasCarolexecProducer);
        CastAndCrew christmasCarolexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, christmasCarol);
        castAndCrewRepository.save(christmasCarolexecProducer2);

        Story impossAstronautdayMoon = new Story(
                "The Impossible Astronaut/Day of the Moon",
                Format.TV,
                LocalDate.of(2011, 4, 23),
                LocalDate.of(2011, 4, 30),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "The Doctor, Amy, Rory and River have a lovely picnic until the Doctor is unexpectedly shot dead by an astronaut rising from a lake.",
                "Utah; Lake Silencio; the Doctor dies; President Nixon; girl; spacesuit; Silence; memory; subliminal messaging; pregnant; lines; regeneration; eyepatch lady;",
                Series.SERIES6A,
                1,
                2,
                "2.1 - 2.2",
                "https://tardis.wiki/wiki/The_Impossible_Astronaut_(TV_story)"
        );
        impossAstronautdayMoon.addDoctor(eleventhDoctor);
        impossAstronautdayMoon.addCompanion(amy);
        impossAstronautdayMoon.addCompanion(rory);
        impossAstronautdayMoon.addCompanion(river);
        storyRepository.save(impossAstronautdayMoon);

        CastAndCrew impossAstronautdayMoonwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, impossAstronautdayMoon);
        castAndCrewRepository.save(impossAstronautdayMoonwriter);
        CastAndCrew impossAstronautdayMoondirector = new CastAndCrew(tHaynes, "Director", CastOrCrew.CREW, impossAstronautdayMoon);
        castAndCrewRepository.save(impossAstronautdayMoondirector);
        CastAndCrew impossAstronautdayMoonsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, impossAstronautdayMoon);
        castAndCrewRepository.save(impossAstronautdayMoonsRunner);
        CastAndCrew impossAstronautdayMoonproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, impossAstronautdayMoon);
        castAndCrewRepository.save(impossAstronautdayMoonproducer);
        CastAndCrew impossAstronautdayMoonexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, impossAstronautdayMoon);
        castAndCrewRepository.save(impossAstronautdayMoonexecProducer);
        CastAndCrew impossAstronautdayMoonexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, impossAstronautdayMoon);
        castAndCrewRepository.save(impossAstronautdayMoonexecProducer2);

        Story blackSpot = new Story(
                "The Curse of the Black Spot",
                Format.TV,
                LocalDate.of(2011, 5, 7),
                LocalDate.of(2011, 5, 7),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "A pirate ship is terrorised by an ethereal Siren.",
                "Henry Avery; The Smugglers; missing pirate; cut; Rory dies;",
                Series.SERIES6A,
                2,
                1,
                "2.9",
                "https://tardis.wiki/wiki/The_Curse_of_the_Black_Spot_(TV_story)"
        );
        blackSpot.addDoctor(eleventhDoctor);
        blackSpot.addCompanion(amy);
        blackSpot.addCompanion(rory);
        storyRepository.save(blackSpot);

        CastAndCrew blackSpotwriter = new CastAndCrew(sThompson, "Writer", CastOrCrew.CREW, blackSpot);
        castAndCrewRepository.save(blackSpotwriter);
        CastAndCrew blackSpotdirector = new CastAndCrew(jWebb, "Director", CastOrCrew.CREW, blackSpot);
        castAndCrewRepository.save(blackSpotdirector);
        CastAndCrew blackSpotsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, blackSpot);
        castAndCrewRepository.save(blackSpotsRunner);
        CastAndCrew blackSpotproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, blackSpot);
        castAndCrewRepository.save(blackSpotproducer);
        CastAndCrew blackSpotexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, blackSpot);
        castAndCrewRepository.save(blackSpotexecProducer);
        CastAndCrew blackSpotexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, blackSpot);
        castAndCrewRepository.save(blackSpotexecProducer2);

        Story drWife = new Story(
                "The Doctor's Wife",
                Format.TV,
                LocalDate.of(2011, 5, 14),
                LocalDate.of(2011, 5, 14),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "The TARDIS is trapped inside the body of a woman.",
                "Asteroid; outside the universe; Ood; Auntie; Uncle; House; Michael Sheen's big sexy voice; the Corsair; junkyard",
                Series.SERIES6A,
                3,
                1,
                "2.3",
                "https://tardis.wiki/wiki/The_Doctor%27s_Wife_(TV_story)"
        );
        drWife.addDoctor(eleventhDoctor);
        drWife.addCompanion(amy);
        drWife.addCompanion(rory);
        storyRepository.save(drWife);

        CastAndCrew drWifewriter = new CastAndCrew(gaiman, "Writer", CastOrCrew.CREW, drWife);
        castAndCrewRepository.save(drWifewriter);
        CastAndCrew drWifedirector = new CastAndCrew(rClark, "Director", CastOrCrew.CREW, drWife);
        castAndCrewRepository.save(drWifedirector);
        CastAndCrew drWifesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, drWife);
        castAndCrewRepository.save(drWifesRunner);
        CastAndCrew drWifeproducer = new CastAndCrew(wohlenberg, "Producer", CastOrCrew.CREW, drWife);
        castAndCrewRepository.save(drWifeproducer);
        CastAndCrew drWifeexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, drWife);
        castAndCrewRepository.save(drWifeexecProducer);
        CastAndCrew drWifeexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, drWife);
        castAndCrewRepository.save(drWifeexecProducer2);


        Story rebelFleshalmostPpl = new Story(
                "The Rebel Flesh/The Almost People",
                Format.TV,
                LocalDate.of(2011, 5, 21),
                LocalDate.of(2011, 5, 28),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "The crew of an acid-disposal factory use duplicates of themselves for the dangerous work, but the duplicates are gaining sentience.",
                "Gangers; doppergangers; Flesh; duplicate; body horror; eyepatch lady; pregnant;",
                Series.SERIES6A,
                4,
                2,
                "2.5 - 2.6",
                "https://tardis.wiki/wiki/The_Rebel_Flesh_(TV_story)"
        );
        rebelFleshalmostPpl.addDoctor(eleventhDoctor);
        rebelFleshalmostPpl.addCompanion(amy);
        rebelFleshalmostPpl.addCompanion(rory);
        storyRepository.save(rebelFleshalmostPpl);

        CastAndCrew rebelFleshalmostPplwriter = new CastAndCrew(mGraham, "Writer", CastOrCrew.CREW, rebelFleshalmostPpl);
        castAndCrewRepository.save(rebelFleshalmostPplwriter);
        CastAndCrew rebelFleshalmostPpldirector = new CastAndCrew(jSimpson, "Director", CastOrCrew.CREW, rebelFleshalmostPpl);
        castAndCrewRepository.save(rebelFleshalmostPpldirector);
        CastAndCrew rebelFleshalmostPplsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, rebelFleshalmostPpl);
        castAndCrewRepository.save(rebelFleshalmostPplsRunner);
        CastAndCrew rebelFleshalmostPplproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, rebelFleshalmostPpl);
        castAndCrewRepository.save(rebelFleshalmostPplproducer);
        CastAndCrew rebelFleshalmostPplexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, rebelFleshalmostPpl);
        castAndCrewRepository.save(rebelFleshalmostPplexecProducer);
        CastAndCrew rebelFleshalmostPplexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, rebelFleshalmostPpl);
        castAndCrewRepository.save(rebelFleshalmostPplexecProducer2);

        Story goodManWar = new Story(
                "A Good Man Goes to War",
                Format.TV,
                LocalDate.of(2011, 6, 4),
                LocalDate.of(2011, 6, 4),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "The Doctor assembles an army to rescue Amy.",
                "Strax; Vastra; Eyepatch Lady; Headless Monks; Colonel Runaway; Melody Pond; Ganger; duplicate; stolen child; Silence",
                Series.SERIES6A,
                5,
                1,
                "2.7",
                "https://tardis.wiki/wiki/A_Good_Man_Goes_to_War_(TV_story)"
        );
        goodManWar.addDoctor(eleventhDoctor);
        goodManWar.addCompanion(amy);
        goodManWar.addCompanion(rory);
        goodManWar.addCompanion(river);
        storyRepository.save(goodManWar);

        CastAndCrew goodManWarwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, goodManWar);
        castAndCrewRepository.save(goodManWarwriter);
        CastAndCrew goodManWardirector = new CastAndCrew(pHoar, "Director", CastOrCrew.CREW, goodManWar);
        castAndCrewRepository.save(goodManWardirector);
        CastAndCrew goodManWarsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, goodManWar);
        castAndCrewRepository.save(goodManWarsRunner);
        CastAndCrew goodManWarproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, goodManWar);
        castAndCrewRepository.save(goodManWarproducer);
        CastAndCrew goodManWarexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, goodManWar);
        castAndCrewRepository.save(goodManWarexecProducer);
        CastAndCrew goodManWarexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, goodManWar);
        castAndCrewRepository.save(goodManWarexecProducer2);


        Story killHitler = new Story(
                "Let's Kill Hitler",
                Format.TV,
                LocalDate.of(2011, 8, 27),
                LocalDate.of(2011, 8, 27),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "The Ponds' childhood friend decides to kill Hitler.",
                "Nazis; Mels; corn circles; childhood friend; poison lipstick; Teselecta; regeneration;",
                Series.SERIES6B,
                1,
                1,
                "2.8",
                "https://tardis.wiki/wiki/Let%27s_Kill_Hitler_(TV_story)"
        );
        killHitler.addDoctor(eleventhDoctor);
        killHitler.addCompanion(amy);
        killHitler.addCompanion(rory);
        killHitler.addCompanion(river);
        storyRepository.save(killHitler);

        CastAndCrew killHitlerwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, killHitler);
        castAndCrewRepository.save(killHitlerwriter);
        CastAndCrew killHitlerdirector = new CastAndCrew(rSenior, "Director", CastOrCrew.CREW, killHitler);
        castAndCrewRepository.save(killHitlerdirector);
        CastAndCrew killHitlersRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, killHitler);
        castAndCrewRepository.save(killHitlersRunner);
        CastAndCrew killHitlerproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, killHitler);
        castAndCrewRepository.save(killHitlerproducer);
        CastAndCrew killHitlerexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, killHitler);
        castAndCrewRepository.save(killHitlerexecProducer);
        CastAndCrew killHitlerexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, killHitler);
        castAndCrewRepository.save(killHitlerexecProducer2);

        Story nightTerrors = new Story(
                "Night Terrors",
                Format.TV,
                LocalDate.of(2011, 9, 3),
                LocalDate.of(2011, 9, 3),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "A young boy is terrified of his wardrobe.",
                "Peg Dolls; Housing Estate; bin bags; wardrobe; childhood fears; ",
                Series.SERIES6B,
                2,
                1,
                "2.4",
                "https://tardis.wiki/wiki/Night_Terrors_(TV_story)"
        );
        nightTerrors.addDoctor(eleventhDoctor);
        nightTerrors.addCompanion(amy);
        nightTerrors.addCompanion(rory);
        storyRepository.save(nightTerrors);

        CastAndCrew nightTerrorswriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, nightTerrors);
        castAndCrewRepository.save(nightTerrorswriter);
        CastAndCrew nightTerrorsdirector = new CastAndCrew(rClark, "Director", CastOrCrew.CREW, nightTerrors);
        castAndCrewRepository.save(nightTerrorsdirector);
        CastAndCrew nightTerrorssRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, nightTerrors);
        castAndCrewRepository.save(nightTerrorssRunner);
        CastAndCrew nightTerrorsproducer = new CastAndCrew(wohlenberg, "Producer", CastOrCrew.CREW, nightTerrors);
        castAndCrewRepository.save(nightTerrorsproducer);
        CastAndCrew nightTerrorsexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, nightTerrors);
        castAndCrewRepository.save(nightTerrorsexecProducer);
        CastAndCrew nightTerrorsexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, nightTerrors);
        castAndCrewRepository.save(nightTerrorsexecProducer2);

        Story girlWaited = new Story(
                "The Girl Who Waited",
                Format.TV,
                LocalDate.of(2011, 9, 10),
                LocalDate.of(2011, 9, 10),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "Amy is separated from the Doctor and Rory and waits thirty six years for them to return.",
                "Two hearts; plague; accelerated time stream; Two Amys; younger self; older self; old; paradox; 36 years;",
                Series.SERIES6B,
                3,
                1,
                "2.10",
                "https://tardis.wiki/wiki/The_Girl_Who_Waited_(TV_story)"
        );
        girlWaited.addDoctor(eleventhDoctor);
        girlWaited.addCompanion(amy);
        girlWaited.addCompanion(rory);
        storyRepository.save(girlWaited);

        CastAndCrew girlWaitedwriter = new CastAndCrew(tMacrae, "Writer", CastOrCrew.CREW, girlWaited);
        castAndCrewRepository.save(girlWaitedwriter);
        CastAndCrew girlWaiteddirector = new CastAndCrew(nHurran, "Director", CastOrCrew.CREW, girlWaited);
        castAndCrewRepository.save(girlWaiteddirector);
        CastAndCrew girlWaitedsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, girlWaited);
        castAndCrewRepository.save(girlWaitedsRunner);
        CastAndCrew girlWaitedproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, girlWaited);
        castAndCrewRepository.save(girlWaitedproducer);
        CastAndCrew girlWaitedexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, girlWaited);
        castAndCrewRepository.save(girlWaitedexecProducer);
        CastAndCrew girlWaitedexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, girlWaited);
        castAndCrewRepository.save(girlWaitedexecProducer2);

        Story godComplex = new Story(
                "The God Complex",
                Format.TV,
                LocalDate.of(2011, 9, 17),
                LocalDate.of(2011, 9, 17),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "The TARDIS lands in an Eighties hotel which is being stalked by a minotaur.",
                "Hotel; labyrinth; minotaur; faith; fear; companion; departure; Angel; cracks in time;",
                Series.SERIES6B,
                4,
                1,
                "2.11",
                "https://tardis.wiki/wiki/The_God_Complex_(TV_story)"
        );
        godComplex.addDoctor(eleventhDoctor);
        godComplex.addCompanion(amy);
        godComplex.addCompanion(rory);
        storyRepository.save(godComplex);

        CastAndCrew godComplexwriter = new CastAndCrew(whithouse, "Writer", CastOrCrew.CREW, godComplex);
        castAndCrewRepository.save(godComplexwriter);
        CastAndCrew godComplexdirector = new CastAndCrew(nHurran, "Director", CastOrCrew.CREW, godComplex);
        castAndCrewRepository.save(godComplexdirector);
        CastAndCrew godComplexsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, godComplex);
        castAndCrewRepository.save(godComplexsRunner);
        CastAndCrew godComplexproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, godComplex);
        castAndCrewRepository.save(godComplexproducer);
        CastAndCrew godComplexexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, godComplex);
        castAndCrewRepository.save(godComplexexecProducer);
        CastAndCrew godComplexexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, godComplex);
        castAndCrewRepository.save(godComplexexecProducer2);

        Story closingTime = new Story(
                "Closing Time",
                Format.TV,
                LocalDate.of(2011, 9, 24),
                LocalDate.of(2011, 9, 24),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "The Doctor, knowing his death is near, decides to visit his old flatmate.",
                "Craig; Sophie; Cybermen; Cybermat; Alfie; baby; Kovarian; Spacesuit; department store; blew them up with love; Stormageddon, Dark Lord of All; I speak baby",
                Series.SERIES6B,
                5,
                1,
                "2.12",
                "https://tardis.wiki/wiki/Closing_Time_(TV_story)"
        );
        closingTime.addDoctor(eleventhDoctor);
        storyRepository.save(closingTime);

        CastAndCrew closingTimewriter = new CastAndCrew(gRoberts, "Writer", CastOrCrew.CREW, closingTime);
        castAndCrewRepository.save(closingTimewriter);
        CastAndCrew closingTimedirector = new CastAndCrew(sHughes, "Director", CastOrCrew.CREW, closingTime);
        castAndCrewRepository.save(closingTimedirector);
        CastAndCrew closingTimesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, closingTime);
        castAndCrewRepository.save(closingTimesRunner);
        CastAndCrew closingTimeproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, closingTime);
        castAndCrewRepository.save(closingTimeproducer);
        CastAndCrew closingTimeproducer2 = new CastAndCrew(dPaul, "Producer", CastOrCrew.CREW, closingTime);
        castAndCrewRepository.save(closingTimeproducer2);
        CastAndCrew closingTimeexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, closingTime);
        castAndCrewRepository.save(closingTimeexecProducer);
        CastAndCrew closingTimeexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, closingTime);
        castAndCrewRepository.save(closingTimeexecProducer2);

        Story weddingRiver = new Story(
                "The Wedding of River Song",
                Format.TV,
                LocalDate.of(2011, 10, 1),
                LocalDate.of(2011, 10, 1),
                "DVD/Blu-ray (2011).",
                "images/smith_logo1.png",
                "River refuses to kill the Doctor, resulting in a timeline where all of history is happening at once.",
                "Silence; Kovarian; eyepatches; Brigadier; Dorium Moldovar; marriage; Teselecta; Doctor Who?; ",
                Series.SERIES6B,
                6,
                1,
                "2.13",
                "https://tardis.wiki/wiki/The_Wedding_of_River_Song_(TV_story)"
        );
        weddingRiver.addDoctor(eleventhDoctor);
        weddingRiver.addCompanion(amy);
        weddingRiver.addCompanion(rory);
        weddingRiver.addCompanion(river);
        storyRepository.save(weddingRiver);

        CastAndCrew weddingRiverwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, weddingRiver);
        castAndCrewRepository.save(weddingRiverwriter);
        CastAndCrew weddingRiverdirector = new CastAndCrew(jWebb, "Director", CastOrCrew.CREW, weddingRiver);
        castAndCrewRepository.save(weddingRiverdirector);
        CastAndCrew weddingRiversRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, weddingRiver);
        castAndCrewRepository.save(weddingRiversRunner);
        CastAndCrew weddingRiverproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, weddingRiver);
        castAndCrewRepository.save(weddingRiverproducer);
        CastAndCrew weddingRiverexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, weddingRiver);
        castAndCrewRepository.save(weddingRiverexecProducer);
        CastAndCrew weddingRiverexecProducer2 = new CastAndCrew(bWillis, "Executive Producer", CastOrCrew.CREW, weddingRiver);
        castAndCrewRepository.save(weddingRiverexecProducer2);


        Story drWidow = new Story(
                "The Doctor, the Widow and the Wardrobe",
                Format.TV,
                LocalDate.of(2011, 12, 25),
                LocalDate.of(2011, 12, 25),
                "DVD/Blu-ray (2012).",
                "images/smith_logo1.png",
                "The Doctor crashes into Madge Arwell's life on the eve of the Second World War.",
                "Christmas Special; Festive Special; Androzani; Narnia; gender essentialism;",
                Series.SERIES7A,
                0,
                1,
                "",
                "https://tardis.wiki/wiki/The_Doctor,_the_Widow_and_the_Wardrobe_(TV_story)"
        );
        drWidow.addDoctor(eleventhDoctor);
        storyRepository.save(drWidow);

        CastAndCrew drWidowwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, drWidow);
        castAndCrewRepository.save(drWidowwriter);
        CastAndCrew drWidowdirector = new CastAndCrew(fBlackburn, "Director", CastOrCrew.CREW, drWidow);
        castAndCrewRepository.save(drWidowdirector);
        CastAndCrew drWidowsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, drWidow);
        castAndCrewRepository.save(drWidowsRunner);
        CastAndCrew drWidowproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, drWidow);
        castAndCrewRepository.save(drWidowproducer);
        CastAndCrew drWidowexecProducer = new CastAndCrew(pWenger, "Executive Producer", CastOrCrew.CREW, drWidow);
        castAndCrewRepository.save(drWidowexecProducer);
        CastAndCrew drWidowexecProducer2 = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, drWidow);
        castAndCrewRepository.save(drWidowexecProducer2);

        Story asylumDaleks = new Story(
                "Asylum of the Daleks",
                Format.TV,
                LocalDate.of(2012, 9, 1),
                LocalDate.of(2012, 9, 1),
                "DVD/Blu-ray (2012).",
                "images/asylum_daleks_logo.png",
                "The Daleks kidnap the Doctor, Amy and Rory and ask them to help them destroy the planet that houses the Dalek asylum.",
                "divorce; force field; Oswin; conversion; Dalek; puppets; nanobots; parliament; eggs;",
                Series.SERIES7A,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/Asylum_of_the_Daleks_(TV_story)"
        );
        asylumDaleks.addDoctor(eleventhDoctor);
        asylumDaleks.addCompanion(amy);
        asylumDaleks.addCompanion(rory);
        storyRepository.save(asylumDaleks);

        CastAndCrew asylumDalekswriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, asylumDaleks);
        castAndCrewRepository.save(asylumDalekswriter);
        CastAndCrew asylumDaleksdirector = new CastAndCrew(nHurran, "Director", CastOrCrew.CREW, asylumDaleks);
        castAndCrewRepository.save(asylumDaleksdirector);
        CastAndCrew asylumDalekssRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, asylumDaleks);
        castAndCrewRepository.save(asylumDalekssRunner);
        CastAndCrew asylumDaleksproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, asylumDaleks);
        castAndCrewRepository.save(asylumDaleksproducer);
        CastAndCrew asylumDaleksexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, asylumDaleks);
        castAndCrewRepository.save(asylumDaleksexecProducer);

        Story dinoSpaceship = new Story(
                "Dinosaurs on a Spaceship",
                Format.TV,
                LocalDate.of(2012, 9, 8),
                LocalDate.of(2012, 9, 8),
                "DVD/Blu-ray (2012).",
                "images/dinosaurs_spaceship_logo.png",
                "The Doctor is delighted to find a spaceship full of dinosaurs.",
                "Brian; Rory's Dad; Silurian; Solomon; Queen; Nefertiti; big game hunter; John Riddell; Triceratops",
                Series.SERIES7A,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/Dinosaurs_on_a_Spaceship_(TV_story)"
        );
        dinoSpaceship.addDoctor(eleventhDoctor);
        dinoSpaceship.addCompanion(amy);
        dinoSpaceship.addCompanion(rory);
        storyRepository.save(dinoSpaceship);

        CastAndCrew dinoSpaceshipwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, dinoSpaceship);
        castAndCrewRepository.save(dinoSpaceshipwriter);
        CastAndCrew dinoSpaceshipdirector = new CastAndCrew(sMetzstein, "Director", CastOrCrew.CREW, dinoSpaceship);
        castAndCrewRepository.save(dinoSpaceshipdirector);
        CastAndCrew dinoSpaceshipsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, dinoSpaceship);
        castAndCrewRepository.save(dinoSpaceshipsRunner);
        CastAndCrew dinoSpaceshipproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, dinoSpaceship);
        castAndCrewRepository.save(dinoSpaceshipproducer);
        CastAndCrew dinoSpaceshipexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, dinoSpaceship);
        castAndCrewRepository.save(dinoSpaceshipexecProducer);

        Story townMercy = new Story(
                "A Town Called Mercy",
                Format.TV,
                LocalDate.of(2012, 9, 15),
                LocalDate.of(2012, 9, 15),
                "DVD/Blu-ray (2012).",
                "images/town_mercy_logo.png",
                "In the American West the town Doctor is being sought by a cyborg Gunslinger.",
                "Western; Cowboys; experiments; sacrifice;",
                Series.SERIES7A,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/A_Town_Called_Mercy_(TV_story)"
        );
        townMercy.addDoctor(eleventhDoctor);
        townMercy.addCompanion(amy);
        townMercy.addCompanion(rory);
        storyRepository.save(townMercy);

        CastAndCrew townMercywriter = new CastAndCrew(whithouse, "Writer", CastOrCrew.CREW, townMercy);
        castAndCrewRepository.save(townMercywriter);
        CastAndCrew townMercydirector = new CastAndCrew(sMetzstein, "Director", CastOrCrew.CREW, townMercy);
        castAndCrewRepository.save(townMercydirector);
        CastAndCrew townMercysRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, townMercy);
        castAndCrewRepository.save(townMercysRunner);
        CastAndCrew townMercyproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, townMercy);
        castAndCrewRepository.save(townMercyproducer);
        CastAndCrew townMercyexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, townMercy);
        castAndCrewRepository.save(townMercyexecProducer);

        Story powerThree = new Story(
                "The Power of Three",
                Format.TV,
                LocalDate.of(2012, 9, 22),
                LocalDate.of(2012, 9, 22),
                "DVD/Blu-ray (2012).",
                "images/power_three_logo.png",
                "Black cubes start appearing all over the world, but no one can work out why.",
                "Shakri; cubes; Brian; Rory's Dad; UNIT; first appearance of; Kate Lethbridge-Stewart;",
                Series.SERIES7A,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/The_Power_of_Three_(TV_story)"
        );
        powerThree.addDoctor(eleventhDoctor);
        powerThree.addCompanion(amy);
        powerThree.addCompanion(rory);
        storyRepository.save(powerThree);

        CastAndCrew powerThreewriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, powerThree);
        castAndCrewRepository.save(powerThreewriter);
        CastAndCrew powerThreedirector = new CastAndCrew(dMacKinnon, "Director", CastOrCrew.CREW, powerThree);
        castAndCrewRepository.save(powerThreedirector);
        CastAndCrew powerThreesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, powerThree);
        castAndCrewRepository.save(powerThreesRunner);
        CastAndCrew powerThreeproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, powerThree);
        castAndCrewRepository.save(powerThreeproducer);
        CastAndCrew powerThreeexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, powerThree);
        castAndCrewRepository.save(powerThreeexecProducer);

        Story angelsManhattan = new Story(
                "The Angels Take Manhattan",
                Format.TV,
                LocalDate.of(2012, 9, 29),
                LocalDate.of(2012, 9, 29),
                "DVD/Blu-ray (2012).",
                "images/angels_manhattan_logo.png",
                "Rory is attacked by a Weeping Angel while getting coffee in New York.",
                "Melody Malone; Statue of Liberty; suicide pact; paradox; afterword; last appearance of: Rory; companion departure leaves; Amy",
                Series.SERIES7A,
                5,
                1,
                "",
                "https://tardis.wiki/wiki/The_Angels_Take_Manhattan_(TV_story)"
        );
        angelsManhattan.addDoctor(eleventhDoctor);
        angelsManhattan.addCompanion(amy);
        angelsManhattan.addCompanion(rory);
        angelsManhattan.addCompanion(river);
        storyRepository.save(angelsManhattan);

        CastAndCrew angelsManhattanwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, angelsManhattan);
        castAndCrewRepository.save(angelsManhattanwriter);
        CastAndCrew angelsManhattandirector = new CastAndCrew(nHurran, "Director", CastOrCrew.CREW, angelsManhattan);
        castAndCrewRepository.save(angelsManhattandirector);
        CastAndCrew angelsManhattansRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, angelsManhattan);
        castAndCrewRepository.save(angelsManhattansRunner);
        CastAndCrew angelsManhattanproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, angelsManhattan);
        castAndCrewRepository.save(angelsManhattanproducer);
        CastAndCrew angelsManhattanexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, angelsManhattan);
        castAndCrewRepository.save(angelsManhattanexecProducer);


        Story snowmen = new Story(
                "The Snowmen",
                Format.TV,
                LocalDate.of(2012, 12, 25),
                LocalDate.of(2012, 12, 25),
                "DVD/Blu-ray (2013).",
                "images/smith_logo2.png",
                "The Doctor wants to be alone, and goes to live above the clouds of Victorian London.",
                "Christmas Special; Festive Special; Great Intelligence; Paternoster Gang; Clara dies; I'm a lizard from the dawn of time and this is my wife",
                Series.SERIES7B,
                0,
                1,
                "",
                "https://tardis.wiki/wiki/The_Snowmen_(TV_story)"
        );
        snowmen.addDoctor(eleventhDoctor);
        snowmen.addCompanion(clara);
        storyRepository.save(snowmen);

        CastAndCrew snowmenwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, snowmen);
        castAndCrewRepository.save(snowmenwriter);
        CastAndCrew snowmendirector = new CastAndCrew(sMetzstein, "Director", CastOrCrew.CREW, snowmen);
        castAndCrewRepository.save(snowmendirector);
        CastAndCrew snowmensRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, snowmen);
        castAndCrewRepository.save(snowmensRunner);
        CastAndCrew snowmenproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, snowmen);
        castAndCrewRepository.save(snowmenproducer);
        CastAndCrew snowmenexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, snowmen);
        castAndCrewRepository.save(snowmenexecProducer);

        Story bellsStJohn = new Story(
                "The Bells of St John",
                Format.TV,
                LocalDate.of(2013, 3, 30),
                LocalDate.of(2013, 3, 30),
                "DVD/Blu-ray (2013).",
                "images/smith_logo2.png",
                "The Doctor finds Clara in the present day, and discovers someone is uploading people's souls to a datacloud.",
                "Great Intelligence; Shard; Spoonheads; evil wi-fi",
                Series.SERIES7B,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/The_Bells_of_Saint_John_(TV_story)"
        );
        bellsStJohn.addDoctor(eleventhDoctor);
        bellsStJohn.addCompanion(clara);
        storyRepository.save(bellsStJohn);

        CastAndCrew bellsStJohnwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, bellsStJohn);
        castAndCrewRepository.save(bellsStJohnwriter);
        CastAndCrew bellsStJohndirector = new CastAndCrew(cMcCarthy, "Director", CastOrCrew.CREW, bellsStJohn);
        castAndCrewRepository.save(bellsStJohndirector);
        CastAndCrew bellsStJohnsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, bellsStJohn);
        castAndCrewRepository.save(bellsStJohnsRunner);
        CastAndCrew bellsStJohnproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, bellsStJohn);
        castAndCrewRepository.save(bellsStJohnproducer);
        CastAndCrew bellsStJohnproducer2 = new CastAndCrew(dPaul, "Producer", CastOrCrew.CREW, bellsStJohn);
        castAndCrewRepository.save(bellsStJohnproducer2);
        CastAndCrew bellsStJohnexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, bellsStJohn);
        castAndCrewRepository.save(bellsStJohnexecProducer);

        Story akhaten = new Story(
                "The Rings of Akhaten",
                Format.TV,
                LocalDate.of(2013, 4, 6),
                LocalDate.of(2013, 4, 6),
                "DVD/Blu-ray (2013).",
                "images/smith_logo2.png",
                "synopsis",
                "ring system; Old God; Merry Gejelh; big ol speech; parasite; leaf; granddaughter; Susan; Queen of Years; Long Song;",
                Series.SERIES7B,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/The_Rings_of_Akhaten_(TV_story)"
        );
        akhaten.addDoctor(eleventhDoctor);
        akhaten.addCompanion(clara);
        storyRepository.save(akhaten);

        CastAndCrew akhatenwriter = new CastAndCrew(nCross, "Writer", CastOrCrew.CREW, akhaten);
        castAndCrewRepository.save(akhatenwriter);
        CastAndCrew akhatendirector = new CastAndCrew(fBlackburn, "Director", CastOrCrew.CREW, akhaten);
        castAndCrewRepository.save(akhatendirector);
        CastAndCrew akhatensRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, akhaten);
        castAndCrewRepository.save(akhatensRunner);
        CastAndCrew akhatenproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, akhaten);
        castAndCrewRepository.save(akhatenproducer);
        CastAndCrew akhatenproducer2 = new CastAndCrew(dPaul, "Producer", CastOrCrew.CREW, akhaten);
        castAndCrewRepository.save(akhatenproducer2);
        CastAndCrew akhatenexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, akhaten);
        castAndCrewRepository.save(akhatenexecProducer);

        Story coldWar = new Story(
                "Cold War",
                Format.TV,
                LocalDate.of(2013, 4, 13),
                LocalDate.of(2013, 4, 13),
                "DVD/Blu-ray (2013).",
                "images/smith_logo2.png",
                "The Doctor and Clara are stranded on a Soviet submarine with a Martian.",
                "Ultravox; submarine; Ice Warriors; cyborg; Russia; Skaldak",
                Series.SERIES7B,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/Cold_War_(TV_story)"
        );
        coldWar.addDoctor(eleventhDoctor);
        coldWar.addCompanion(clara);
        storyRepository.save(coldWar);

        CastAndCrew coldWarwriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, coldWar);
        castAndCrewRepository.save(coldWarwriter);
        CastAndCrew coldWardirector = new CastAndCrew(dMacKinnon, "Director", CastOrCrew.CREW, coldWar);
        castAndCrewRepository.save(coldWardirector);
        CastAndCrew coldWarsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, coldWar);
        castAndCrewRepository.save(coldWarsRunner);
        CastAndCrew coldWarproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, coldWar);
        castAndCrewRepository.save(coldWarproducer);
        CastAndCrew coldWarexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, coldWar);
        castAndCrewRepository.save(coldWarexecProducer);

        Story hide = new Story(
                "Hide",
                Format.TV,
                LocalDate.of(2013, 4, 20),
                LocalDate.of(2013, 4, 20),
                "DVD/Blu-ray (2013).",
                "images/smith_logo2.png",
                "A psychic and a traumatised soldier investigate a ghost known as the Witch of the Well.",
                "Spiridon; Blue Crystal; Ghosts; pocket dimension; time traveller;",
                Series.SERIES7B,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/Hide_(TV_story)"
        );
        hide.addDoctor(eleventhDoctor);
        hide.addCompanion(clara);
        storyRepository.save(hide);

        CastAndCrew hidewriter = new CastAndCrew(nCross, "Writer", CastOrCrew.CREW, hide);
        castAndCrewRepository.save(hidewriter);
        CastAndCrew hidedirector = new CastAndCrew(jPayne, "Director", CastOrCrew.CREW, hide);
        castAndCrewRepository.save(hidedirector);
        CastAndCrew hidesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, hide);
        castAndCrewRepository.save(hidesRunner);
        CastAndCrew hideproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, hide);
        castAndCrewRepository.save(hideproducer);
        CastAndCrew hideexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, hide);
        castAndCrewRepository.save(hideexecProducer);

        Story centreTARDIS = new Story(
                "Journey to the Centre of the TARDIS",
                Format.TV,
                LocalDate.of(2013, 4, 27),
                LocalDate.of(2013, 4, 27),
                "DVD/Blu-ray (2013).",
                "images/smith_logo2.png",
                "Clara is lost in the depths of the TARDIS.",
                "van Baalen Brothers; lava; molten; zombies; Eye of Harmony; reset button; Impossible Girl",
                Series.SERIES7B,
                5,
                1,
                "",
                "https://tardis.wiki/wiki/Journey_to_the_Centre_of_the_TARDIS_(TV_story)"
        );
        centreTARDIS.addDoctor(eleventhDoctor);
        centreTARDIS.addCompanion(clara);
        storyRepository.save(centreTARDIS);

        CastAndCrew centreTARDISwriter = new CastAndCrew(sThompson, "Writer", CastOrCrew.CREW, centreTARDIS);
        castAndCrewRepository.save(centreTARDISwriter);
        CastAndCrew centreTARDISdirector = new CastAndCrew(mKing, "Director", CastOrCrew.CREW, centreTARDIS);
        castAndCrewRepository.save(centreTARDISdirector);
        CastAndCrew centreTARDISsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, centreTARDIS);
        castAndCrewRepository.save(centreTARDISsRunner);
        CastAndCrew centreTARDISproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, centreTARDIS);
        castAndCrewRepository.save(centreTARDISproducer);
        CastAndCrew centreTARDISexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, centreTARDIS);
        castAndCrewRepository.save(centreTARDISexecProducer);

        Story crimsonHorror = new Story(
                "The Crimson Horror",
                Format.TV,
                LocalDate.of(2013, 5, 4),
                LocalDate.of(2013, 5, 4),
                "DVD/Blu-ray (2013), Novelisation/Audiobook (2021).",
                "images/smith_logo2.png",
                "Vastra, Jenny and Strax investigate a spate of completely red dead bodies.",
                "Paternoster Gang; the North; Mr Sweet; red skin;",
                Series.SERIES7B,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/The_Crimson_Horror_(TV_story)"
        );
        crimsonHorror.addDoctor(eleventhDoctor);
        crimsonHorror.addCompanion(clara);
        storyRepository.save(crimsonHorror);

        CastAndCrew crimsonHorrorwriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, crimsonHorror);
        castAndCrewRepository.save(crimsonHorrorwriter);
        CastAndCrew crimsonHorrordirector = new CastAndCrew(sMetzstein, "Director", CastOrCrew.CREW, crimsonHorror);
        castAndCrewRepository.save(crimsonHorrordirector);
        CastAndCrew crimsonHorrorsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, crimsonHorror);
        castAndCrewRepository.save(crimsonHorrorsRunner);
        CastAndCrew crimsonHorrorproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, crimsonHorror);
        castAndCrewRepository.save(crimsonHorrorproducer);
        CastAndCrew crimsonHorrorexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, crimsonHorror);
        castAndCrewRepository.save(crimsonHorrorexecProducer);

        Story nightmareSilver = new Story(
                "Nightmare in Silver",
                Format.TV,
                LocalDate.of(2013, 5, 11),
                LocalDate.of(2013, 5, 11),
                "DVD/Blu-ray (2013).",
                "images/smith_logo2.png",
                "The Doctor takes Clara and the kids to a kooky space theme park shortly before it's overtaken by cyborgs.",
                "Deliberately annoying kids; Cybermen; redesign; whimsy; Cybermites; Emperor; amusement park",
                Series.SERIES7B,
                6,
                1,
                "",
                "https://tardis.wiki/wiki/Nightmare_in_Silver_(TV_story)"
        );
        nightmareSilver.addDoctor(eleventhDoctor);
        nightmareSilver.addCompanion(clara);
        storyRepository.save(nightmareSilver);

        CastAndCrew nightmareSilverwriter = new CastAndCrew(gaiman, "Writer", CastOrCrew.CREW, nightmareSilver);
        castAndCrewRepository.save(nightmareSilverwriter);
        CastAndCrew nightmareSilverdirector = new CastAndCrew(sWoolfenden, "Director", CastOrCrew.CREW, nightmareSilver);
        castAndCrewRepository.save(nightmareSilverdirector);
        CastAndCrew nightmareSilversRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, nightmareSilver);
        castAndCrewRepository.save(nightmareSilversRunner);
        CastAndCrew nightmareSilverproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, nightmareSilver);
        castAndCrewRepository.save(nightmareSilverproducer);
        CastAndCrew nightmareSilverproducer2 = new CastAndCrew(dPaul, "Producer", CastOrCrew.CREW, nightmareSilver);
        castAndCrewRepository.save(nightmareSilverproducer2);
        CastAndCrew nightmareSilverexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, nightmareSilver);
        castAndCrewRepository.save(nightmareSilverexecProducer);

        Story nameDoctor = new Story(
                "The Name of the Doctor",
                Format.TV,
                LocalDate.of(2013, 5, 18),
                LocalDate.of(2013, 5, 18),
                "DVD/Blu-ray (2013).",
                "images/smith_logo2.png",
                "The Great Intelligence brings the Doctor's friends to the planet Trenzalore.",
                "Whispermen; Trenzalore; Great Intelligence; first appearance: War Doctor; River Song; Paternoster Gang; Impossible Girl",
                Series.SERIES7B,
                7,
                1,
                "",
                "https://tardis.wiki/wiki/The_Name_of_the_Doctor_(TV_story)"
        );
        nameDoctor.addDoctor(eleventhDoctor);
        nameDoctor.addCompanion(clara);
        nameDoctor.addCompanion(river);
        storyRepository.save(nameDoctor);

        CastAndCrew nameDoctorwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, nameDoctor);
        castAndCrewRepository.save(nameDoctorwriter);
        CastAndCrew nameDoctordirector = new CastAndCrew(sMetzstein, "Director", CastOrCrew.CREW, nameDoctor);
        castAndCrewRepository.save(nameDoctordirector);
        CastAndCrew nameDoctorsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, nameDoctor);
        castAndCrewRepository.save(nameDoctorsRunner);
        CastAndCrew nameDoctorproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, nameDoctor);
        castAndCrewRepository.save(nameDoctorproducer);
        CastAndCrew nameDoctorproducer2 = new CastAndCrew(dPaul, "Producer", CastOrCrew.CREW, nameDoctor);
        castAndCrewRepository.save(nameDoctorproducer2);
        CastAndCrew nameDoctorexecProducer = new CastAndCrew(cSkinner, "Executive Producer", CastOrCrew.CREW, nameDoctor);
        castAndCrewRepository.save(nameDoctorexecProducer);

        Story nightDoctor = new Story(
                "The Night of the Doctor",
                Format.TV,
                LocalDate.of(2013, 11, 14),
                LocalDate.of(2013, 11, 14),
                "DVD/Blu-ray (2013), Novelisation/Audiobook (2018).",
                "images/smith_logo2.png",
                "The Doctor attempts to rescue someone trapped on a crashing spaceship.",
                "Regeneration; Time War; War Doctor; Sisterhood of Karn; crash; Cass; warrior; Physician, heal thyself",
                Series.FIFTYSPECIALS,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/The_Night_of_the_Doctor_(TV_story)"
        );
        nightDoctor.addDoctor(eighthDoctor);
        storyRepository.save(nightDoctor);

        CastAndCrew nightDoctorwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, nightDoctor);
        castAndCrewRepository.save(nightDoctorwriter);
        CastAndCrew nightDoctordirector = new CastAndCrew(jHayes, "Director", CastOrCrew.CREW, nightDoctor);
        castAndCrewRepository.save(nightDoctordirector);
        CastAndCrew nightDoctorsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, nightDoctor);
        castAndCrewRepository.save(nightDoctorsRunner);
        CastAndCrew nightDoctorproducer = new CastAndCrew(dPaul, "Producer", CastOrCrew.CREW, nightDoctor);
        castAndCrewRepository.save(nightDoctorproducer);

        Story dayDoctor = new Story(
                "The Day of the Doctor",
                Format.TV,
                LocalDate.of(2013, 11, 23),
                LocalDate.of(2013, 11, 23),
                "DVD/Blu-ray (2013), Novelisation/Audiobook (2018).",
                "images/day_dr_logo.png",
                "The Tenth and Eleventh Doctors are thrown back into the Time War on its final day, meeting the incarnation who destroyed Gallifrey.",
                "Multi-Doctor; first appearance: Twelfth Doctor; all Thirteen; Arcadia; Gallifrey Falls; No More; the Moment; Zygons; Elizabeth; wedding; UNIT; Coal Hill;",
                Series.FIFTYSPECIALS,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/The_Day_of_the_Doctor_(TV_story)"
        );
        dayDoctor.addDoctor(eleventhDoctor);
        dayDoctor.addDoctor(tenthDoctor);
        dayDoctor.addDoctor(warDoctor);
        dayDoctor.addDoctor(curator);
        dayDoctor.addCompanion(clara);
        storyRepository.save(dayDoctor);

        CastAndCrew dayDoctorwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, dayDoctor);
        castAndCrewRepository.save(dayDoctorwriter);
        CastAndCrew dayDoctordirector = new CastAndCrew(nHurran, "Director", CastOrCrew.CREW, dayDoctor);
        castAndCrewRepository.save(dayDoctordirector);
        CastAndCrew dayDoctorsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, dayDoctor);
        castAndCrewRepository.save(dayDoctorsRunner);
        CastAndCrew dayDoctorproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, dayDoctor);
        castAndCrewRepository.save(dayDoctorproducer);
        CastAndCrew dayDoctorexecProducer = new CastAndCrew(fPenhale, "Executive Producer", CastOrCrew.CREW, dayDoctor);
        castAndCrewRepository.save(dayDoctorexecProducer);

        Story timeDoctor = new Story(
                "The Time of the Doctor",
                Format.TV,
                LocalDate.of(2013, 12, 25),
                LocalDate.of(2013, 12, 25),
                "DVD/Blu-ray (2014).",
                "images/smith_logo2.png",
                "The Doctor makes his last stand on the planet Trenzalore.",
                "Christmas Special; Festive Special; regeneration; town called Christmas; regeneration cycle; Trenzalore; Silence; Daleks; Cybermen; Handles; I will always remember when the Doctor was me;",
                Series.FIFTYSPECIALS,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/The_Time_of_the_Doctor_(TV_story)"
        );
        timeDoctor.addDoctor(eleventhDoctor);
        timeDoctor.addCompanion(clara);
        storyRepository.save(timeDoctor);

        CastAndCrew timeDoctorwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, timeDoctor);
        castAndCrewRepository.save(timeDoctorwriter);
        CastAndCrew timeDoctordirector = new CastAndCrew(jPayne, "Director", CastOrCrew.CREW, timeDoctor);
        castAndCrewRepository.save(timeDoctordirector);
        CastAndCrew timeDoctorsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, timeDoctor);
        castAndCrewRepository.save(timeDoctorsRunner);
        CastAndCrew timeDoctorproducer = new CastAndCrew(mWilson, "Producer", CastOrCrew.CREW, timeDoctor);
        castAndCrewRepository.save(timeDoctorproducer);
        CastAndCrew timeDoctorexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, timeDoctor);
        castAndCrewRepository.save(timeDoctorexecProducer);

        Story deepBreath = new Story(
                "Deep Breath",
                Format.TV,
                LocalDate.of(2014, 8, 23),
                LocalDate.of(2014, 8, 23),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "The newly regenerated Doctor investigates a case of a dinosaur spontaneously combusting.",
                "Paternoster Gang; clockwork; Half-Face Man; Promised Land; Missy; dinosaur; Victorian London; phone call; Eleventh Doctor; last appearance of: Eleventh Doctor; Trenzalore;",
                Series.SERIES8,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/Deep_Breath_(TV_story)"
        );
        deepBreath.addDoctor(twelfthDoctor);
        deepBreath.addCompanion(clara);
        storyRepository.save(deepBreath);

        CastAndCrew deepBreathwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, deepBreath);
        castAndCrewRepository.save(deepBreathwriter);
        CastAndCrew deepBreathdirector = new CastAndCrew(bWheatley, "Director", CastOrCrew.CREW, deepBreath);
        castAndCrewRepository.save(deepBreathdirector);
        CastAndCrew deepBreathsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, deepBreath);
        castAndCrewRepository.save(deepBreathsRunner);
        CastAndCrew deepBreathproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, deepBreath);
        castAndCrewRepository.save(deepBreathproducer);
        CastAndCrew deepBreathexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, deepBreath);
        castAndCrewRepository.save(deepBreathexecProducer);

        Story intoDalek = new Story(
                "Into the Dalek",
                Format.TV,
                LocalDate.of(2014, 8, 30),
                LocalDate.of(2014, 8, 30),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "The Doctor and Clara are miniaturised and sent into Rusty, a 'good Dalek'.",
                "Soldier; Fantastic Voyage; slap; star being born; callous;",
                Series.SERIES8,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/Into_the_Dalek_(TV_story)"
        );
        intoDalek.addDoctor(twelfthDoctor);
        intoDalek.addCompanion(clara);
        storyRepository.save(intoDalek);

        CastAndCrew intoDalekwriter = new CastAndCrew(pFord, "Writer", CastOrCrew.CREW, intoDalek);
        castAndCrewRepository.save(intoDalekwriter);
        CastAndCrew intoDalekwriter2 = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, intoDalek);
        castAndCrewRepository.save(intoDalekwriter2);
        CastAndCrew intoDalekdirector = new CastAndCrew(bWheatley, "Director", CastOrCrew.CREW, intoDalek);
        castAndCrewRepository.save(intoDalekdirector);
        CastAndCrew intoDaleksRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, intoDalek);
        castAndCrewRepository.save(intoDaleksRunner);
        CastAndCrew intoDalekproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, intoDalek);
        castAndCrewRepository.save(intoDalekproducer);
        CastAndCrew intoDalekexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, intoDalek);
        castAndCrewRepository.save(intoDalekexecProducer);

        Story robotSherwood = new Story(
                "Robot of Sherwood",
                Format.TV,
                LocalDate.of(2014, 9, 6),
                LocalDate.of(2014, 9, 6),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "The Doctor is extremely irritated by a fictional character.",
                "Robin Hood; spoon; gold; circuitry; Merry Men; Sheriff of Nottingham; archery contest; ",
                Series.SERIES8,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/Robot_of_Sherwood_(TV_story)"
        );
        robotSherwood.addDoctor(twelfthDoctor);
        robotSherwood.addCompanion(clara);
        storyRepository.save(robotSherwood);

        CastAndCrew robotSherwoodwriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, robotSherwood);
        castAndCrewRepository.save(robotSherwoodwriter);
        CastAndCrew robotSherwooddirector = new CastAndCrew(pMurphy, "Director", CastOrCrew.CREW, robotSherwood);
        castAndCrewRepository.save(robotSherwooddirector);
        CastAndCrew robotSherwoodsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, robotSherwood);
        castAndCrewRepository.save(robotSherwoodsRunner);
        CastAndCrew robotSherwoodproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, robotSherwood);
        castAndCrewRepository.save(robotSherwoodproducer);
        CastAndCrew robotSherwoodexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, robotSherwood);
        castAndCrewRepository.save(robotSherwoodexecProducer);

        Story listen = new Story(
                "Listen",
                Format.TV,
                LocalDate.of(2014, 9, 13),
                LocalDate.of(2014, 9, 13),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "The Doctor is driven by an intense desire to investigate the monster behind everyone's childhood fears.",
                "Barn; Fear is a superpower; Crying child; monster beneath bed; covers; sheets; Orson Pink; end of the universe",
                Series.SERIES8,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/Listen_(TV_story)"
        );
        listen.addDoctor(twelfthDoctor);
        listen.addCompanion(clara);
        storyRepository.save(listen);

        CastAndCrew listenwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, listen);
        castAndCrewRepository.save(listenwriter);
        CastAndCrew listendirector = new CastAndCrew(dMacKinnon, "Director", CastOrCrew.CREW, listen);
        castAndCrewRepository.save(listendirector);
        CastAndCrew listensRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, listen);
        castAndCrewRepository.save(listensRunner);
        CastAndCrew listenproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, listen);
        castAndCrewRepository.save(listenproducer);
        CastAndCrew listenexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, listen);
        castAndCrewRepository.save(listenexecProducer);

        Story timeHeist = new Story(
                "Time Heist",
                Format.TV,
                LocalDate.of(2014, 9, 20),
                LocalDate.of(2014, 9, 20),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "The Doctor and Clara are hired to rob the most secure bank in the universe.",
                "Bank robbery; the Teller; Karabraxos; augmented human; mutant; Architect",
                Series.SERIES8,
                5,
                1,
                "",
                "https://tardis.wiki/wiki/Time_Heist_(TV_story)"
        );
        timeHeist.addDoctor(twelfthDoctor);
        timeHeist.addCompanion(clara);
        storyRepository.save(timeHeist);

        CastAndCrew timeHeistwriter = new CastAndCrew(sThompson, "Writer", CastOrCrew.CREW, timeHeist);
        castAndCrewRepository.save(timeHeistwriter);
        CastAndCrew timeHeistwriter2 = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, timeHeist);
        castAndCrewRepository.save(timeHeistwriter2);
        CastAndCrew timeHeistdirector = new CastAndCrew(dMacKinnon, "Director", CastOrCrew.CREW, timeHeist);
        castAndCrewRepository.save(timeHeistdirector);
        CastAndCrew timeHeistsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, timeHeist);
        castAndCrewRepository.save(timeHeistsRunner);
        CastAndCrew timeHeistproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, timeHeist);
        castAndCrewRepository.save(timeHeistproducer);
        CastAndCrew timeHeistexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, timeHeist);
        castAndCrewRepository.save(timeHeistexecProducer);

        Story caretaker = new Story(
                "The Caretaker",
                Format.TV,
                LocalDate.of(2014, 9, 27),
                LocalDate.of(2014, 9, 27),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "The Doctor finally takes up the job as school caretaker.",
                "Skovox Blitzer; racism; PE; P.E.; Coal Hill School; double life; soldier",
                Series.SERIES8,
                6,
                1,
                "",
                "https://tardis.wiki/wiki/The_Caretaker_(TV_story)"
        );
        caretaker.addDoctor(twelfthDoctor);
        caretaker.addCompanion(clara);
        storyRepository.save(caretaker);

        CastAndCrew caretakerwriter = new CastAndCrew(gRoberts, "Writer", CastOrCrew.CREW, caretaker);
        castAndCrewRepository.save(caretakerwriter);
        CastAndCrew caretakerwriter2 = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, caretaker);
        castAndCrewRepository.save(caretakerwriter2);
        CastAndCrew caretakerdirector = new CastAndCrew(pMurphy, "Director", CastOrCrew.CREW, caretaker);
        castAndCrewRepository.save(caretakerdirector);
        CastAndCrew caretakersRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, caretaker);
        castAndCrewRepository.save(caretakersRunner);
        CastAndCrew caretakerproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, caretaker);
        castAndCrewRepository.save(caretakerproducer);
        CastAndCrew caretakerexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, caretaker);
        castAndCrewRepository.save(caretakerexecProducer);

        Story killMoon = new Story(
                "Kill the Moon",
                Format.TV,
                LocalDate.of(2014, 10, 4),
                LocalDate.of(2014, 10, 4),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "The Doctor takes Clara and one of her pupils on a trip in the TARDIS, and arrives on a space shuttle carrying one hundred nuclear bombs.",
                "Miracle; Egg; Dragon; Space Travel; Abortion; spiders; Hinchcliffe the shit out of it",
                Series.SERIES8,
                7,
                1,
                "",
                "https://tardis.wiki/wiki/Kill_the_Moon_(TV_story)"
        );
        killMoon.addDoctor(twelfthDoctor);
        killMoon.addCompanion(clara);
        storyRepository.save(killMoon);

        CastAndCrew killMoonwriter = new CastAndCrew(harness, "Writer", CastOrCrew.CREW, killMoon);
        castAndCrewRepository.save(killMoonwriter);
        CastAndCrew killMoondirector = new CastAndCrew(pWilmshurst, "Director", CastOrCrew.CREW, killMoon);
        castAndCrewRepository.save(killMoondirector);
        CastAndCrew killMoonsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, killMoon);
        castAndCrewRepository.save(killMoonsRunner);
        CastAndCrew killMoonproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, killMoon);
        castAndCrewRepository.save(killMoonproducer);
        CastAndCrew killMoonexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, killMoon);
        castAndCrewRepository.save(killMoonexecProducer);

        Story mummy = new Story(
                "Mummy on the Orient Express",
                Format.TV,
                LocalDate.of(2014, 10, 11),
                LocalDate.of(2014, 10, 11),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "Clara rejoins the TARDIS for one last outing.",
                "Train; Foretold; sixty-six; 66; seconds; surrendering; Gus; Perkins; Quell; Mr Collins",
                Series.SERIES8,
                8,
                1,
                "",
                "https://tardis.wiki/wiki/Mummy_on_the_Orient_Express_(TV_story)"
        );
        mummy.addDoctor(twelfthDoctor);
        mummy.addCompanion(clara);
        storyRepository.save(mummy);

        CastAndCrew mummywriter = new CastAndCrew(mathieson, "Writer", CastOrCrew.CREW, mummy);
        castAndCrewRepository.save(mummywriter);
        CastAndCrew mummydirector = new CastAndCrew(pWilmshurst, "Director", CastOrCrew.CREW, mummy);
        castAndCrewRepository.save(mummydirector);
        CastAndCrew mummysRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, mummy);
        castAndCrewRepository.save(mummysRunner);
        CastAndCrew mummyproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, mummy);
        castAndCrewRepository.save(mummyproducer);
        CastAndCrew mummyexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, mummy);
        castAndCrewRepository.save(mummyexecProducer);

        Story flatline = new Story(
                "Flatline",
                Format.TV,
                LocalDate.of(2014, 10, 18),
                LocalDate.of(2014, 10, 18),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "The TARDIS has shrunk on the outside, with the Doctor stuck indoors.",
                "Bristol; Rigsy; graffiti; community service; 2Dis; Thing; Addams Family; Boneless; 2D; two dimensional;",
                Series.SERIES8,
                9,
                1,
                "",
                "https://tardis.wiki/wiki/Flatline_(TV_story)"
        );
        flatline.addDoctor(twelfthDoctor);
        flatline.addCompanion(clara);
        storyRepository.save(flatline);

        CastAndCrew flatlinewriter = new CastAndCrew(mathieson, "Writer", CastOrCrew.CREW, flatline);
        castAndCrewRepository.save(flatlinewriter);
        CastAndCrew flatlinedirector = new CastAndCrew(dMacKinnon, "Director", CastOrCrew.CREW, flatline);
        castAndCrewRepository.save(flatlinedirector);
        CastAndCrew flatlinesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, flatline);
        castAndCrewRepository.save(flatlinesRunner);
        CastAndCrew flatlineproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, flatline);
        castAndCrewRepository.save(flatlineproducer);
        CastAndCrew flatlineexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, flatline);
        castAndCrewRepository.save(flatlineexecProducer);

        Story forestNight = new Story(
                "In the Forest of the Night",
                Format.TV,
                LocalDate.of(2014, 10,25),
                LocalDate.of(2014, 10,25),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "One of Clara's pupils knocks on the TARDIS door.",
                "Fairy Tale; trees; solar flare; Tiger; Blake; missing Sister; schoolchildren",
                Series.SERIES8,
                10,
                1,
                "",
                "https://tardis.wiki/wiki/In_the_Forest_of_the_Night_(TV_story)"
        );
        forestNight.addDoctor(twelfthDoctor);
        forestNight.addCompanion(clara);
        storyRepository.save(forestNight);

        CastAndCrew forestNightwriter = new CastAndCrew(cottrellboyce, "Writer", CastOrCrew.CREW, forestNight);
        castAndCrewRepository.save(forestNightwriter);
        CastAndCrew forestNightdirector = new CastAndCrew(sFolkson, "Director", CastOrCrew.CREW, forestNight);
        castAndCrewRepository.save(forestNightdirector);
        CastAndCrew forestNightsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, forestNight);
        castAndCrewRepository.save(forestNightsRunner);
        CastAndCrew forestNightproducer = new CastAndCrew(pFrift, "Producer", CastOrCrew.CREW, forestNight);
        castAndCrewRepository.save(forestNightproducer);
        CastAndCrew forestNightexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, forestNight);
        castAndCrewRepository.save(forestNightexecProducer);

        Story darkwaterdeathHeaven = new Story(
                "Dark Water/Death in Heaven",
                Format.TV,
                LocalDate.of(2014, 11, 1),
                LocalDate.of(2014, 11, 8),
                "DVD/Blu-ray (2014).",
                "images/capaldi_logo.png",
                "Danny Pink is dead. What happens next will shock you.",
                "Missy; Cybermen; 3W Institute; Skeletons; Danny Pink; Osgood; death; dies; St Paul's Cathedral; Nethersphere; Cyber-Brig; Clara Who; rain;",
                Series.SERIES8,
                11,
                2,
                "",
                "https://tardis.wiki/wiki/Dark_Water_(TV_story)"
        );
        darkwaterdeathHeaven.addDoctor(twelfthDoctor);
        darkwaterdeathHeaven.addCompanion(clara);
        storyRepository.save(darkwaterdeathHeaven);

        CastAndCrew darkwaterdeathHeavenwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, darkwaterdeathHeaven);
        castAndCrewRepository.save(darkwaterdeathHeavenwriter);
        CastAndCrew darkwaterdeathHeavendirector = new CastAndCrew(rTalalay, "Director", CastOrCrew.CREW, darkwaterdeathHeaven);
        castAndCrewRepository.save(darkwaterdeathHeavendirector);
        CastAndCrew darkwaterdeathHeavensRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, darkwaterdeathHeaven);
        castAndCrewRepository.save(darkwaterdeathHeavensRunner);
        CastAndCrew darkwaterdeathHeavenproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, darkwaterdeathHeaven);
        castAndCrewRepository.save(darkwaterdeathHeavenproducer);
        CastAndCrew darkwaterdeathHeavenexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, darkwaterdeathHeaven);
        castAndCrewRepository.save(darkwaterdeathHeavenexecProducer);


        Story lastXmas = new Story(
                "Last Christmas",
                Format.TV,
                LocalDate.of(2014, 12, 25),
                LocalDate.of(2014, 12, 25),
                "",
                "images/capaldi_logo.png",
                "The Doctor and Clara joins forces with Santa Claus to rescue a group of scientists.",
                "Christmas Special; Festive Special; Santa; Dream Crabs; Face Huggers; Inception; Alien; The Thing; North Pole; satsuma; last appearance of: Danny Pink",
                Series.SERIES9,
                0,
                1,
                "",
                "https://tardis.wiki/wiki/Last_Christmas_(TV_story)"
        );
        lastXmas.addDoctor(twelfthDoctor);
        lastXmas.addCompanion(clara);
        storyRepository.save(lastXmas);

        CastAndCrew lastXmaswriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, lastXmas);
        castAndCrewRepository.save(lastXmaswriter);
        CastAndCrew lastXmasdirector = new CastAndCrew(pWilmshurst, "Director", CastOrCrew.CREW, lastXmas);
        castAndCrewRepository.save(lastXmasdirector);
        CastAndCrew lastXmassRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, lastXmas);
        castAndCrewRepository.save(lastXmassRunner);
        CastAndCrew lastXmasproducer = new CastAndCrew(pFrift, "Producer", CastOrCrew.CREW, lastXmas);
        castAndCrewRepository.save(lastXmasproducer);
        CastAndCrew lastXmasexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, lastXmas);
        castAndCrewRepository.save(lastXmasexecProducer);

        Story magicianWitch = new Story(
                "The Magician's Apprentice/The Witch's Familiar",
                Format.TV,
                LocalDate.of(2015, 9, 19),
                LocalDate.of(2015, 9, 26),
                "",
                "images/capaldi_logo.png",
                "The Doctor tries to rescue a boy from a battlefield, but abandons him upon learning his name.",
                "Missy; Confession Dial; Davros; opens eyes; child; boy; mercy; Colony Sarff; Skaro; sewers; hand mines; Kaled; tank",
                Series.SERIES9,
                1,
                2,
                "",
                "https://tardis.wiki/wiki/The_Magician%27s_Apprentice_(TV_story)"
        );
        magicianWitch.addDoctor(twelfthDoctor);
        magicianWitch.addCompanion(clara);
        storyRepository.save(magicianWitch);

        CastAndCrew magicianWitchwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, magicianWitch);
        castAndCrewRepository.save(magicianWitchwriter);
        CastAndCrew magicianWitchdirector = new CastAndCrew(hMacDonald, "Director", CastOrCrew.CREW, magicianWitch);
        castAndCrewRepository.save(magicianWitchdirector);
        CastAndCrew magicianWitchsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, magicianWitch);
        castAndCrewRepository.save(magicianWitchsRunner);
        CastAndCrew magicianWitchproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, magicianWitch);
        castAndCrewRepository.save(magicianWitchproducer);
        CastAndCrew magicianWitchexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, magicianWitch);
        castAndCrewRepository.save(magicianWitchexecProducer);

        Story underLakebeforeFlood = new Story(
                "Under the Lake/Before the Flood",
                Format.TV,
                LocalDate.of(2015, 10, 3),
                LocalDate.of(2015, 10, 10),
                "",
                "images/capaldi_logo.png",
                "An underwater base has discovered an alien craft in the flooded ruins of a Scottish village.",
                "Ghosts; Axe; deaf character; Fisher King; Bootstrap Paradox; Beethoven; rock theme",
                Series.SERIES9,
                2,
                2,
                "",
                "https://tardis.wiki/wiki/Under_the_Lake_(TV_story)"
        );
        underLakebeforeFlood.addDoctor(twelfthDoctor);
        underLakebeforeFlood.addCompanion(clara);
        storyRepository.save(underLakebeforeFlood);

        CastAndCrew underLakebeforeFloodwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, underLakebeforeFlood);
        castAndCrewRepository.save(underLakebeforeFloodwriter);
        CastAndCrew underLakebeforeFlooddirector = new CastAndCrew(dOHara, "Director", CastOrCrew.CREW, underLakebeforeFlood);
        castAndCrewRepository.save(underLakebeforeFlooddirector);
        CastAndCrew underLakebeforeFloodsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, underLakebeforeFlood);
        castAndCrewRepository.save(underLakebeforeFloodsRunner);
        CastAndCrew underLakebeforeFloodproducer = new CastAndCrew(dRitchie, "Producer", CastOrCrew.CREW, underLakebeforeFlood);
        castAndCrewRepository.save(underLakebeforeFloodproducer);
        CastAndCrew underLakebeforeFloodexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, underLakebeforeFlood);
        castAndCrewRepository.save(underLakebeforeFloodexecProducer);

        Story girlDied = new Story(
                "The Girl Who Died",
                Format.TV,
                LocalDate.of(2015, 10, 17),
                LocalDate.of(2015, 10, 17),
                "",
                "images/capaldi_logo.png",
                "A viking village is under attack from the fearsome Mire.",
                "Mire; Vikings; immortal; Yakety Sax; Benny Hill; Odin",
                Series.SERIES9,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/The_Girl_Who_Died_(TV_story)"
        );
        girlDied.addDoctor(twelfthDoctor);
        girlDied.addCompanion(clara);
        storyRepository.save(girlDied);

        CastAndCrew girlDiedwriter = new CastAndCrew(mathieson, "Writer", CastOrCrew.CREW, girlDied);
        castAndCrewRepository.save(girlDiedwriter);
        CastAndCrew girlDiedwriter2 = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, girlDied);
        castAndCrewRepository.save(girlDiedwriter2);
        CastAndCrew girlDieddirector = new CastAndCrew(eBazalgette, "Director", CastOrCrew.CREW, girlDied);
        castAndCrewRepository.save(girlDieddirector);
        CastAndCrew girlDiedsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, girlDied);
        castAndCrewRepository.save(girlDiedsRunner);
        CastAndCrew girlDiedproducer = new CastAndCrew(dRitchie, "Producer", CastOrCrew.CREW, girlDied);
        castAndCrewRepository.save(girlDiedproducer);
        CastAndCrew girlDiedexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, girlDied);
        castAndCrewRepository.save(girlDiedexecProducer);

        Story womanLived = new Story(
                "The Woman Who Lived",
                Format.TV,
                LocalDate.of(2015, 10, 24),
                LocalDate.of(2015, 10, 24),
                "",
                "images/capaldi_logo.png",
                "The Doctor meets Ashildr again in Seventeenth Century England.",
                "Highwayman; Immortal; Immortality; Ashildr; Me; lion; Portal;",
                Series.SERIES9,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/The_Woman_Who_Lived_(TV_story)"
        );
        womanLived.addDoctor(twelfthDoctor);
        storyRepository.save(womanLived);

        CastAndCrew womanLivedwriter = new CastAndCrew(treganna, "Writer", CastOrCrew.CREW, womanLived);
        castAndCrewRepository.save(womanLivedwriter);
        CastAndCrew womanLiveddirector = new CastAndCrew(eBazalgette, "Director", CastOrCrew.CREW, womanLived);
        castAndCrewRepository.save(womanLiveddirector);
        CastAndCrew womanLivedsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, womanLived);
        castAndCrewRepository.save(womanLivedsRunner);
        CastAndCrew womanLivedproducer = new CastAndCrew(dRitchie, "Producer", CastOrCrew.CREW, womanLived);
        castAndCrewRepository.save(womanLivedproducer);
        CastAndCrew womanLivedexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, womanLived);
        castAndCrewRepository.save(womanLivedexecProducer);

        Story zygonInvasionInversion = new Story(
                "The Zygon Invasion/The Zygon Inversion",
                Format.TV,
                LocalDate.of(2015, 10, 31),
                LocalDate.of(2015, 11, 7),
                "",
                "images/capaldi_logo.png",
                "A peace treaty has allowed twenty million Zygons to live on Earth disguised as humans.",
                "Duplicates; Bonnie; UNIT; big ol speech; war is bad; Osgood boxes",
                Series.SERIES9,
                5,
                2,
                "",
                "https://tardis.wiki/wiki/The_Zygon_Invasion_(TV_story)"
        );
        zygonInvasionInversion.addDoctor(twelfthDoctor);
        zygonInvasionInversion.addCompanion(clara);
        storyRepository.save(zygonInvasionInversion);

        CastAndCrew zygonInvasionInversionwriter = new CastAndCrew(harness, "Writer", CastOrCrew.CREW, zygonInvasionInversion);
        castAndCrewRepository.save(zygonInvasionInversionwriter);
        CastAndCrew zygonInvasionInversionwriter2 = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, zygonInvasionInversion);
        castAndCrewRepository.save(zygonInvasionInversionwriter2);
        CastAndCrew zygonInvasionInversiondirector = new CastAndCrew(dNettheim, "Director", CastOrCrew.CREW, zygonInvasionInversion);
        castAndCrewRepository.save(zygonInvasionInversiondirector);
        CastAndCrew zygonInvasionInversionsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, zygonInvasionInversion);
        castAndCrewRepository.save(zygonInvasionInversionsRunner);
        CastAndCrew zygonInvasionInversionproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, zygonInvasionInversion);
        castAndCrewRepository.save(zygonInvasionInversionproducer);
        CastAndCrew zygonInvasionInversionexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, zygonInvasionInversion);
        castAndCrewRepository.save(zygonInvasionInversionexecProducer);

        Story sleepnomore = new Story(
                "Sleep No More",
                Format.TV,
                LocalDate.of(2015, 11, 14),
                LocalDate.of(2015, 11, 14),
                "",
                "images/capaldi_logo.png",
                "Gagan Rasmussen has invented a device that reduces the time a person sleeps and also creates rampaging monsters. Relaxing.",
                "Sleep Dust; Sandman; rheum; mutation; Morpheus",
                Series.SERIES9,
                6,
                1,
                "",
                "https://tardis.wiki/wiki/Sleep_No_More_(TV_story)"
        );
        sleepnomore.addDoctor(twelfthDoctor);
        sleepnomore.addCompanion(clara);
        storyRepository.save(sleepnomore);

        CastAndCrew sleepnomorewriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, sleepnomore);
        castAndCrewRepository.save(sleepnomorewriter);
        CastAndCrew sleepnomoredirector = new CastAndCrew(jMolotnikov, "Director", CastOrCrew.CREW, sleepnomore);
        castAndCrewRepository.save(sleepnomoredirector);
        CastAndCrew sleepnomoresRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, sleepnomore);
        castAndCrewRepository.save(sleepnomoresRunner);
        CastAndCrew sleepnomoreproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, sleepnomore);
        castAndCrewRepository.save(sleepnomoreproducer);
        CastAndCrew sleepnomoreexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, sleepnomore);
        castAndCrewRepository.save(sleepnomoreexecProducer);

        Story faceraven = new Story(
                "Face the Raven",
                Format.TV,
                LocalDate.of(2015, 11, 21),
                LocalDate.of(2015, 11, 21),
                "",
                "images/capaldi_logo.png",
                "The Doctor and Clara get a phone call from an old friend when a countdown appears on the back of his neck.",
                "Trap Street; Chronolock; Me; refugees; mayor;",
                Series.SERIES9,
                7,
                1,
                "",
                "https://tardis.wiki/wiki/Face_the_Raven_(TV_story)"
        );
        faceraven.addDoctor(twelfthDoctor);
        faceraven.addCompanion(clara);
        storyRepository.save(faceraven);

        CastAndCrew faceravenwriter = new CastAndCrew(sDollard, "Writer", CastOrCrew.CREW, faceraven);
        castAndCrewRepository.save(faceravenwriter);
        CastAndCrew faceravendirector = new CastAndCrew(jMolotnikov, "Director", CastOrCrew.CREW, faceraven);
        castAndCrewRepository.save(faceravendirector);
        CastAndCrew faceravensRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, faceraven);
        castAndCrewRepository.save(faceravensRunner);
        CastAndCrew faceravenproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, faceraven);
        castAndCrewRepository.save(faceravenproducer);
        CastAndCrew faceravenexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, faceraven);
        castAndCrewRepository.save(faceravenexecProducer);

        Story heavenhell = new Story(
                "Heaven Sent/Hell Bent",
                Format.TV,
                LocalDate.of(2015, 11, 28),
                LocalDate.of(2015, 12, 5),
                "",
                "images/capaldi_logo.png",
                "The Doctor arrives in a constantly shifting castle, pursued by a Death-like figure.",
                "Grief; teleport; diamond wall; one hell of a bird; Castle; confession dial; Gallifrey; Rassilon; Ashildr; hybrid; Cloisters; song; neuro-block; consent; memory; duty of care",
                Series.SERIES9,
                8,
                2,
                "",
                "https://tardis.wiki/wiki/Heaven_Sent_(TV_story)"
        );
        heavenhell.addDoctor(twelfthDoctor);
        heavenhell.addCompanion(clara);
        storyRepository.save(heavenhell);

        CastAndCrew heavenhellwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, heavenhell);
        castAndCrewRepository.save(heavenhellwriter);
        CastAndCrew heavenhelldirector = new CastAndCrew(rTalalay, "Director", CastOrCrew.CREW, heavenhell);
        castAndCrewRepository.save(heavenhelldirector);
        CastAndCrew heavenhellsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, heavenhell);
        castAndCrewRepository.save(heavenhellsRunner);
        CastAndCrew heavenhellproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, heavenhell);
        castAndCrewRepository.save(heavenhellproducer);
        CastAndCrew heavenhellexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, heavenhell);
        castAndCrewRepository.save(heavenhellexecProducer);

        Story husbandsRiver = new Story(
                "The Husbands of River Song",
                Format.TV,
                LocalDate.of(2015, 12, 25),
                LocalDate.of(2015, 12, 25),
                "",
                "images/capaldi_logo.png",
                "The Doctor, due to a case of mistaken identity, gets roped into a diamond heist with his wife.",
                "Christmas Special; Festive Special; severed heads; robot; Hydroflax; first appearance of Nardole; last appearance of: River Song; Singing Towers; Darillium",
                Series.SERIES9,
                9,
                1,
                "",
                "https://tardis.wiki/wiki/The_Husbands_of_River_Song_(TV_story)"
        );
        husbandsRiver.addDoctor(twelfthDoctor);
        husbandsRiver.addCompanion(river);
        storyRepository.save(husbandsRiver);

        CastAndCrew husbandsRiverwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, husbandsRiver);
        castAndCrewRepository.save(husbandsRiverwriter);
        CastAndCrew husbandsRiverdirector = new CastAndCrew(dMacKinnon, "Director", CastOrCrew.CREW, husbandsRiver);
        castAndCrewRepository.save(husbandsRiverdirector);
        CastAndCrew husbandsRiversRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, husbandsRiver);
        castAndCrewRepository.save(husbandsRiversRunner);
        CastAndCrew husbandsRiverproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, husbandsRiver);
        castAndCrewRepository.save(husbandsRiverproducer);
        CastAndCrew husbandsRiverexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, husbandsRiver);
        castAndCrewRepository.save(husbandsRiverexecProducer);

        Story drMysterio = new Story(
                "The Return of Doctor Mysterio",
                Format.TV,
                LocalDate.of(2017, 12, 25),
                LocalDate.of(2017, 12, 25),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "The Doctor accidentally gives a small boy superpowers.",
                "River; died; Christmas Special; Festive Special; Superman; superhero; Harmony Shoal; alien brains; nanny;",
                Series.SERIES10,
                0,
                1,
                "",
                "https://tardis.wiki/wiki/The_Return_of_Doctor_Mysterio_(TV_story)"
        );
        drMysterio.addDoctor(twelfthDoctor);
        drMysterio.addCompanion(nardole);
        storyRepository.save(drMysterio);

        CastAndCrew drMysteriowriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, drMysterio);
        castAndCrewRepository.save(drMysteriowriter);
        CastAndCrew drMysteriodirector = new CastAndCrew(eBazalgette, "Director", CastOrCrew.CREW, drMysterio);
        castAndCrewRepository.save(drMysteriodirector);
        CastAndCrew drMysteriosRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, drMysterio);
        castAndCrewRepository.save(drMysteriosRunner);
        CastAndCrew drMysterioproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, drMysterio);
        castAndCrewRepository.save(drMysterioproducer);
        CastAndCrew drMysterioexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, drMysterio);
        castAndCrewRepository.save(drMysterioexecProducer);

        Story pilot = new Story(
                "The Pilot",
                Format.TV,
                LocalDate.of(2017, 4, 15),
                LocalDate.of(2017, 4, 15),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "The Doctor and Nardole have been undercover as university lecturers for decades, where he meets Bill Potts.",
                "Bristol University; puddle; Movellans; Daleks",
                Series.SERIES10,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/The_Pilot_(TV_story)"
        );
        pilot.addDoctor(twelfthDoctor);
        pilot.addCompanion(bill);
        storyRepository.save(pilot);

        CastAndCrew pilotwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, pilot);
        castAndCrewRepository.save(pilotwriter);
        CastAndCrew pilotdirector = new CastAndCrew(lGough, "Director", CastOrCrew.CREW, pilot);
        castAndCrewRepository.save(pilotdirector);
        CastAndCrew pilotsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, pilot);
        castAndCrewRepository.save(pilotsRunner);
        CastAndCrew pilotproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, pilot);
        castAndCrewRepository.save(pilotproducer);
        CastAndCrew pilotexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, pilot);
        castAndCrewRepository.save(pilotexecProducer);

        Story smile = new Story(
                "Smile",
                Format.TV,
                LocalDate.of(2017, 4, 22),
                LocalDate.of(2017, 4, 22),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "The Doctor and Bill arrive on one of Earth's earliest colonised planets, and discover no humans but two types of robot.",
                "Emoji Robots; shepherds; colonists; cryogenics; Gliese 581d;",
                Series.SERIES10,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/Smile_(TV_story)"
        );
        smile.addDoctor(twelfthDoctor);
        smile.addCompanion(bill);
        storyRepository.save(smile);

        CastAndCrew smilewriter = new CastAndCrew(cottrellboyce, "Writer", CastOrCrew.CREW, smile);
        castAndCrewRepository.save(smilewriter);
        CastAndCrew smiledirector = new CastAndCrew(lGough, "Director", CastOrCrew.CREW, smile);
        castAndCrewRepository.save(smiledirector);
        CastAndCrew smilesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, smile);
        castAndCrewRepository.save(smilesRunner);
        CastAndCrew smileproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, smile);
        castAndCrewRepository.save(smileproducer);
        CastAndCrew smileexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, smile);
        castAndCrewRepository.save(smileexecProducer);

        Story thinIce = new Story(
                "Thin Ice",
                Format.TV,
                LocalDate.of(2017, 4, 29),
                LocalDate.of(2017, 4, 29),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "The Doctor takes Bill to the 1814 Frost Fair on the River Thames.",
                "sea creature; infanticide; racism; punching; a; racist; Lord Sutcliffe; winter",
                Series.SERIES10,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/Thin_Ice_(TV_story)"
        );
        thinIce.addDoctor(twelfthDoctor);
        thinIce.addCompanion(bill);
        storyRepository.save(thinIce);

        CastAndCrew thinIcewriter = new CastAndCrew(sDollard, "Writer", CastOrCrew.CREW, thinIce);
        castAndCrewRepository.save(thinIcewriter);
        CastAndCrew thinIcedirector = new CastAndCrew(bAnderson, "Director", CastOrCrew.CREW, thinIce);
        castAndCrewRepository.save(thinIcedirector);
        CastAndCrew thinIcesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, thinIce);
        castAndCrewRepository.save(thinIcesRunner);
        CastAndCrew thinIceproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, thinIce);
        castAndCrewRepository.save(thinIceproducer);
        CastAndCrew thinIceexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, thinIce);
        castAndCrewRepository.save(thinIceexecProducer);

        Story knock = new Story(
                "Knock Knock",
                Format.TV,
                LocalDate.of(2017, 5, 6),
                LocalDate.of(2017, 5, 6),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "Bill rents a flat and everybody dies.",
                "Landlord; mother; renting; students; cockroach; wooden person; Poirot; Dryads; ",
                Series.SERIES10,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/Knock_Knock_(TV_story)"
        );
        knock.addDoctor(twelfthDoctor);
        knock.addCompanion(bill);
        storyRepository.save(knock);

        CastAndCrew knockwriter = new CastAndCrew(mbartlett, "Writer", CastOrCrew.CREW, knock);
        castAndCrewRepository.save(knockwriter);
        CastAndCrew knockdirector = new CastAndCrew(bAnderson, "Director", CastOrCrew.CREW, knock);
        castAndCrewRepository.save(knockdirector);
        CastAndCrew knocksRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, knock);
        castAndCrewRepository.save(knocksRunner);
        CastAndCrew knockproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, knock);
        castAndCrewRepository.save(knockproducer);
        CastAndCrew knockexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, knock);
        castAndCrewRepository.save(knockexecProducer);

        Story oxygen = new Story(
                "Oxygen",
                Format.TV,
                LocalDate.of(2017, 5, 13),
                LocalDate.of(2017, 5, 13),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "Nardole accompanies the Doctor and Bill to a space station where most of the crew have been killed by their own spacesuits.",
                "Capitalism; suits; zombies; blind; algorithm; organic components;",
                Series.SERIES10,
                5,
                1,
                "",
                "https://tardis.wiki/wiki/Oxygen_(TV_story)"
        );
        oxygen.addDoctor(twelfthDoctor);
        oxygen.addCompanion(nardole);
        oxygen.addCompanion(bill);
        storyRepository.save(oxygen);

        CastAndCrew oxygenwriter = new CastAndCrew(mathieson, "Writer", CastOrCrew.CREW, oxygen);
        castAndCrewRepository.save(oxygenwriter);
        CastAndCrew oxygendirector = new CastAndCrew(cPalmer, "Director", CastOrCrew.CREW, oxygen);
        castAndCrewRepository.save(oxygendirector);
        CastAndCrew oxygensRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, oxygen);
        castAndCrewRepository.save(oxygensRunner);
        CastAndCrew oxygenproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, oxygen);
        castAndCrewRepository.save(oxygenproducer);
        CastAndCrew oxygenexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, oxygen);
        castAndCrewRepository.save(oxygenexecProducer);

        Story extremis = new Story(
                "Extremis",
                Format.TV,
                LocalDate.of(2017, 5, 20),
                LocalDate.of(2017, 5, 20),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "The Doctor is sent to execute the Master.",
                "Missy; Monk Trilogy; simulation; computer games; practice; email; you don't have to be real to be the Doctor;",
                Series.SERIES10,
                6,
                1,
                "",
                "https://tardis.wiki/wiki/Extremis_(TV_story)"
        );
        extremis.addDoctor(twelfthDoctor);
        extremis.addCompanion(nardole);
        extremis.addCompanion(bill);
        storyRepository.save(extremis);

        CastAndCrew extremiswriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, extremis);
        castAndCrewRepository.save(extremiswriter);
        CastAndCrew extremisdirector = new CastAndCrew(dNettheim, "Director", CastOrCrew.CREW, extremis);
        castAndCrewRepository.save(extremisdirector);
        CastAndCrew extremissRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, extremis);
        castAndCrewRepository.save(extremissRunner);
        CastAndCrew extremisproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, extremis);
        castAndCrewRepository.save(extremisproducer);
        CastAndCrew extremisexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, extremis);
        castAndCrewRepository.save(extremisexecProducer);


        Story pyramidEndWorld = new Story(
                "The Pyramid at the End of the World",
                Format.TV,
                LocalDate.of(2017, 5, 27),
                LocalDate.of(2017, 5, 27),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "A pyramid appears on the strategic border of the Russian, Chinese and U.S. armies.",
                "Monk Trilogy; Blind; Consent; Biochemical Lab;",
                Series.SERIES10,
                7,
                1,
                "",
                "https://tardis.wiki/wiki/The_Pyramid_at_the_End_of_the_World_(TV_story)"
        );
        pyramidEndWorld.addDoctor(twelfthDoctor);
        pyramidEndWorld.addCompanion(nardole);
        pyramidEndWorld.addCompanion(bill);
        storyRepository.save(pyramidEndWorld);

        CastAndCrew pyramidEndWorldwriter = new CastAndCrew(harness, "Writer", CastOrCrew.CREW, pyramidEndWorld);
        castAndCrewRepository.save(pyramidEndWorldwriter);
        CastAndCrew pyramidEndWorldwriter2 = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, pyramidEndWorld);
        castAndCrewRepository.save(pyramidEndWorldwriter2);
        CastAndCrew pyramidEndWorlddirector = new CastAndCrew(dNettheim, "Director", CastOrCrew.CREW, pyramidEndWorld);
        castAndCrewRepository.save(pyramidEndWorlddirector);
        CastAndCrew pyramidEndWorldsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, pyramidEndWorld);
        castAndCrewRepository.save(pyramidEndWorldsRunner);
        CastAndCrew pyramidEndWorldproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, pyramidEndWorld);
        castAndCrewRepository.save(pyramidEndWorldproducer);
        CastAndCrew pyramidEndWorldexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, pyramidEndWorld);
        castAndCrewRepository.save(pyramidEndWorldexecProducer);

        Story lieLand = new Story(
                "The Lie of the Land",
                Format.TV,
                LocalDate.of(2017, 6, 3),
                LocalDate.of(2017, 6, 3),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "The Monks now rule the planet, convincing humanity they have been on Earth for millions of years.",
                "Monk Trilogy; fake news; fake regeneration;",
                Series.SERIES10,
                8,
                1,
                "",
                "https://tardis.wiki/wiki/The_Lie_of_the_Land_(TV_story)"
        );
        lieLand.addDoctor(twelfthDoctor);
        lieLand.addCompanion(nardole);
        lieLand.addCompanion(bill);
        storyRepository.save(lieLand);

        CastAndCrew lieLandwriter = new CastAndCrew(whithouse, "Writer", CastOrCrew.CREW, lieLand);
        castAndCrewRepository.save(lieLandwriter);
        CastAndCrew lieLanddirector = new CastAndCrew(wYip, "Director", CastOrCrew.CREW, lieLand);
        castAndCrewRepository.save(lieLanddirector);
        CastAndCrew lieLandsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, lieLand);
        castAndCrewRepository.save(lieLandsRunner);
        CastAndCrew lieLandproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, lieLand);
        castAndCrewRepository.save(lieLandproducer);
        CastAndCrew lieLandexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, lieLand);
        castAndCrewRepository.save(lieLandexecProducer);

        Story empressMars = new Story(
                "Empress of Mars",
                Format.TV,
                LocalDate.of(2017, 6, 10),
                LocalDate.of(2017, 6, 10),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "NASA find the words 'God save the Queen' buried under the ice cap of Mars.",
                "Friday; Ice; Warriors; Empress; Iraxxa; Redcoats; Alpha Centauri",
                Series.SERIES10,
                9,
                1,
                "",
                "https://tardis.wiki/wiki/Empress_of_Mars_(TV_story)"
        );
        empressMars.addDoctor(twelfthDoctor);
        empressMars.addCompanion(nardole);
        empressMars.addCompanion(bill);
        storyRepository.save(empressMars);

        CastAndCrew empressMarswriter = new CastAndCrew(gatiss, "Writer", CastOrCrew.CREW, empressMars);
        castAndCrewRepository.save(empressMarswriter);
        CastAndCrew empressMarsdirector = new CastAndCrew(wYip, "Director", CastOrCrew.CREW, empressMars);
        castAndCrewRepository.save(empressMarsdirector);
        CastAndCrew empressMarssRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, empressMars);
        castAndCrewRepository.save(empressMarssRunner);
        CastAndCrew empressMarsproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, empressMars);
        castAndCrewRepository.save(empressMarsproducer);
        CastAndCrew empressMarsexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, empressMars);
        castAndCrewRepository.save(empressMarsexecProducer);

        Story eatersLight = new Story(
                "The Eaters of Light",
                Format.TV,
                LocalDate.of(2017, 6, 17),
                LocalDate.of(2017, 6, 17),
                "DVD/Blu-ray (2017), Novelisation/Audiobook (2022).",
                "images/capaldi_logo.png",
                "The Doctor and Bill travel to Second Century Scotland to find out what happened to the Ninth Legion",
                "Ninth Legion; Imperial Roman Army; crows; Picts; Ka; cairn; Missy; Scotland;",
                Series.SERIES10,
                10,
                1,
                "",
                "https://tardis.wiki/wiki/The_Eaters_of_Light_(TV_story)"
        );
        eatersLight.addDoctor(twelfthDoctor);
        eatersLight.addCompanion(nardole);
        eatersLight.addCompanion(bill);
        storyRepository.save(eatersLight);

        CastAndCrew eatersLightwriter = new CastAndCrew(rMunro, "Writer", CastOrCrew.CREW, eatersLight);
        castAndCrewRepository.save(eatersLightwriter);
        CastAndCrew eatersLightdirector = new CastAndCrew(cPalmer, "Director", CastOrCrew.CREW, eatersLight);
        castAndCrewRepository.save(eatersLightdirector);
        CastAndCrew eatersLightsRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, eatersLight);
        castAndCrewRepository.save(eatersLightsRunner);
        CastAndCrew eatersLightproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, eatersLight);
        castAndCrewRepository.save(eatersLightproducer);
        CastAndCrew eatersLightexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, eatersLight);
        castAndCrewRepository.save(eatersLightexecProducer);

        Story worldenoughdrfalls = new Story(
                "World Enough and Time/The Doctor Falls",
                Format.TV,
                LocalDate.of(2017, 6, 24),
                LocalDate.of(2017, 7, 1),
                "DVD/Blu-ray (2017).",
                "images/capaldi_logo.png",
                "The Doctor, desperately wanting Missy to be redeemed, plunges everyone into extreme danger.",
                "Black Hole; time dilation; Bill; shot; Cyber-conversion; Pain; Master; Mr; Saxon; Razor; disguises; Missy; multi-Master; Cybermen; Mondasian; final stand; kind; Heather;",
                Series.SERIES10,
                11,
                2,
                "",
                "https://tardis.wiki/wiki/World_Enough_and_Time_(TV_story)"
        );
        worldenoughdrfalls.addDoctor(twelfthDoctor);
        worldenoughdrfalls.addCompanion(nardole);
        worldenoughdrfalls.addCompanion(bill);
        storyRepository.save(worldenoughdrfalls);

        CastAndCrew worldenoughdrfallswriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, worldenoughdrfalls);
        castAndCrewRepository.save(worldenoughdrfallswriter);
        CastAndCrew worldenoughdrfallsdirector = new CastAndCrew(rTalalay, "Director", CastOrCrew.CREW, worldenoughdrfalls);
        castAndCrewRepository.save(worldenoughdrfallsdirector);
        CastAndCrew worldenoughdrfallssRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, worldenoughdrfalls);
        castAndCrewRepository.save(worldenoughdrfallssRunner);
        CastAndCrew worldenoughdrfallsproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, worldenoughdrfalls);
        castAndCrewRepository.save(worldenoughdrfallsproducer);
        CastAndCrew worldenoughdrfallsexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, worldenoughdrfalls);
        castAndCrewRepository.save(worldenoughdrfallsexecProducer);

        Story twicetime = new Story(
                "Twice Upon a Time",
                Format.TV,
                LocalDate.of(2017, 12, 25),
                LocalDate.of(2017, 12,25),
                "DVD/Blu-ray (2017), Novelisation/Audiobook (2018).",
                "images/capaldi_logo.png",
                "The Doctor (refusing to regenerate) meets the Doctor (refusing to regenerate) at the South Pole.",
                "Christmas Special; Festive Special; multi-Doctor; Brigadier; World War One; First World War; Christmas Truce; regeneration; first appearance: Thirteenth Doctor; Rusty; Testimony; Clara; Nardole",
                Series.SERIES10,
                12,
                1,
                "",
                "https://tardis.wiki/wiki/Twice_Upon_a_Time_(TV_story)"
        );
        twicetime.addDoctor(twelfthDoctor);
        twicetime.addDoctor(firstDoctor);
        twicetime.addCompanion(bill);
        storyRepository.save(twicetime);

        CastAndCrew twicetimewriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, twicetime);
        castAndCrewRepository.save(twicetimewriter);
        CastAndCrew twicetimedirector = new CastAndCrew(rTalalay, "Director", CastOrCrew.CREW, twicetime);
        castAndCrewRepository.save(twicetimedirector);
        CastAndCrew twicetimesRunner = new CastAndCrew(moffat, "Showrunner", CastOrCrew.CREW, twicetime);
        castAndCrewRepository.save(twicetimesRunner);
        CastAndCrew twicetimeproducer = new CastAndCrew(pBennett, "Producer", CastOrCrew.CREW, twicetime);
        castAndCrewRepository.save(twicetimeproducer);
        CastAndCrew twicetimeexecProducer = new CastAndCrew(bMinchin, "Executive Producer", CastOrCrew.CREW, twicetime);
        castAndCrewRepository.save(twicetimeexecProducer);


        Story womanFell = new Story(
                "The Woman Who Fell to Earth",
                Format.TV,
                LocalDate.of(2018, 10, 7),
                LocalDate.of(2018, 10, 7),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "Ryan, Graham and Yaz have a strange night when an amnesiac woman falls through the roof of a train.",
                "Grace; death; Tzim-Sha; Tim Shaw; Stenza; Sheffield; Steel; makes her own sonic; screwdriver; Kebab Guy; teeth; first appearance of: Ryan, Graham, Grace, Yaz; crane",
                Series.SERIES11,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/The_Woman_Who_Fell_to_Earth_(TV_story)"
        );
        womanFell.addDoctor(thirteenthDoctor);
        womanFell.addCompanion(yaz);
        womanFell.addCompanion(graham);
        womanFell.addCompanion(ryan);
        storyRepository.save(womanFell);

        CastAndCrew womanFellwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, womanFell);
        castAndCrewRepository.save(womanFellwriter);
        CastAndCrew womanFelldirector = new CastAndCrew(jChilds, "Director", CastOrCrew.CREW, womanFell);
        castAndCrewRepository.save(womanFelldirector);
        CastAndCrew womanFellsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, womanFell);
        castAndCrewRepository.save(womanFellsRunner);
        CastAndCrew womanFellproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, womanFell);
        castAndCrewRepository.save(womanFellproducer);
        CastAndCrew womanFellexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, womanFell);
        castAndCrewRepository.save(womanFellexecProducer);

        Story ghostMonument = new Story(
                "The Ghost Monument",
                Format.TV,
                LocalDate.of(2018, 10, 14),
                LocalDate.of(2018, 10, 14),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "The TARDIS is missing, and everyone is stranded on a planet called Desolation.",
                "Race; crash; Art Malik; needlessly aggressive guy; carpet things; Remnants; robots;  first mention of: Timeless Child;",
                Series.SERIES11,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/The_Ghost_Monument_(TV_story)"
        );
        ghostMonument.addDoctor(thirteenthDoctor);
        ghostMonument.addCompanion(yaz);
        ghostMonument.addCompanion(graham);
        ghostMonument.addCompanion(ryan);
        storyRepository.save(ghostMonument);

        CastAndCrew ghostMonumentwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, ghostMonument);
        castAndCrewRepository.save(ghostMonumentwriter);
        CastAndCrew ghostMonumentdirector = new CastAndCrew(mTonderai, "Director", CastOrCrew.CREW, ghostMonument);
        castAndCrewRepository.save(ghostMonumentdirector);
        CastAndCrew ghostMonumentsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, ghostMonument);
        castAndCrewRepository.save(ghostMonumentsRunner);
        CastAndCrew ghostMonumentproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, ghostMonument);
        castAndCrewRepository.save(ghostMonumentproducer);
        CastAndCrew ghostMonumentexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, ghostMonument);
        castAndCrewRepository.save(ghostMonumentexecProducer);

        Story rosa = new Story(
                "Rosa",
                Format.TV,
                LocalDate.of(2018, 10, 21),
                LocalDate.of(2018, 10, 21),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "A racist from the future goes back in time to stop Rosa Parks from solving racism.",
                "Rosa Parks; Asteroid; 284996; Martin Luther King; racism; Krasko; Alabama; Montgomery; Bus Boycott; Emmett Till; Fred Gray;",
                Series.SERIES11,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/Rosa_(TV_story)"
        );
        rosa.addDoctor(thirteenthDoctor);
        rosa.addCompanion(yaz);
        rosa.addCompanion(graham);
        rosa.addCompanion(ryan);
        storyRepository.save(rosa);

        CastAndCrew rosawriter = new CastAndCrew(mBlackman, "Writer", CastOrCrew.CREW, rosa);
        castAndCrewRepository.save(rosawriter);
        CastAndCrew rosawriter2 = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, rosa);
        castAndCrewRepository.save(rosawriter2);
        CastAndCrew rosadirector = new CastAndCrew(mTonderai, "Director", CastOrCrew.CREW, rosa);
        castAndCrewRepository.save(rosadirector);
        CastAndCrew rosasRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, rosa);
        castAndCrewRepository.save(rosasRunner);
        CastAndCrew rosaproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, rosa);
        castAndCrewRepository.save(rosaproducer);
        CastAndCrew rosaexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, rosa);
        castAndCrewRepository.save(rosaexecProducer);

        Story arachnids = new Story(
                "Arachnids in the UK",
                Format.TV,
                LocalDate.of(2018, 10, 28),
                LocalDate.of(2018, 10, 28),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "Why are giant spiders converging on an unopened hotel?",
                "Jack Robertson; Yaz's Mum; Dinnerladies; Coronation Street; hotel; giant; big; spiders; Sheffield",
                Series.SERIES11,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/Arachnids_in_the_UK_(TV_story)"
        );
        arachnids.addDoctor(thirteenthDoctor);
        arachnids.addCompanion(yaz);
        arachnids.addCompanion(graham);
        arachnids.addCompanion(ryan);
        storyRepository.save(arachnids);

        CastAndCrew arachnidswriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, arachnids);
        castAndCrewRepository.save(arachnidswriter);
        CastAndCrew arachnidsdirector = new CastAndCrew(sAprahamian, "Director", CastOrCrew.CREW, arachnids);
        castAndCrewRepository.save(arachnidsdirector);
        CastAndCrew arachnidssRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, arachnids);
        castAndCrewRepository.save(arachnidssRunner);
        CastAndCrew arachnidsproducer = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, arachnids);
        castAndCrewRepository.save(arachnidsproducer);
        CastAndCrew arachnidsexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, arachnids);
        castAndCrewRepository.save(arachnidsexecProducer);

        Story tsuranga = new Story(
                "The Tsuranga Conundrum",
                Format.TV,
                LocalDate.of(2018, 11, 4),
                LocalDate.of(2018, 11, 4),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "The Doctor and friends are stranded on a hospital ship, without the TARDIS but with something eating the ship.",
                "Pting; man giving birth; Adoption; hospital ship; anti-matter",
                Series.SERIES11,
                5,
                1,
                "",
                "https://tardis.wiki/wiki/The_Tsuranga_Conundrum_(TV_story)"
        );
        tsuranga.addDoctor(thirteenthDoctor);
        tsuranga.addCompanion(yaz);
        tsuranga.addCompanion(graham);
        tsuranga.addCompanion(ryan);
        storyRepository.save(tsuranga);

        CastAndCrew tsurangawriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, tsuranga);
        castAndCrewRepository.save(tsurangawriter);
        CastAndCrew tsurangadirector = new CastAndCrew(jPerrott, "Director", CastOrCrew.CREW, tsuranga);
        castAndCrewRepository.save(tsurangadirector);
        CastAndCrew tsurangasRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, tsuranga);
        castAndCrewRepository.save(tsurangasRunner);
        CastAndCrew tsurangaproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, tsuranga);
        castAndCrewRepository.save(tsurangaproducer);
        CastAndCrew tsurangaexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, tsuranga);
        castAndCrewRepository.save(tsurangaexecProducer);

        Story demonsPunjab = new Story(
                "Demons of the Punjab",
                Format.TV,
                LocalDate.of(2018, 11, 11),
                LocalDate.of(2018, 11, 11),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "Yaz wants to learn more about the life of her grandmother, so the Doctor takes her to the Punjab in 1947.",
                "Yaz; Nani; family; non-intervention; bearing witness; Thijarians; Partition; India; Pakistan; wedding; watch;",
                Series.SERIES11,
                6,
                1,
                "",
                "https://tardis.wiki/wiki/Demons_of_the_Punjab_(TV_story)"
        );
        demonsPunjab.addDoctor(thirteenthDoctor);
        demonsPunjab.addCompanion(yaz);
        demonsPunjab.addCompanion(graham);
        demonsPunjab.addCompanion(ryan);
        storyRepository.save(demonsPunjab);

        CastAndCrew demonsPunjabwriter = new CastAndCrew(vPatel, "Writer", CastOrCrew.CREW, demonsPunjab);
        castAndCrewRepository.save(demonsPunjabwriter);
        CastAndCrew demonsPunjabdirector = new CastAndCrew(jChilds, "Director", CastOrCrew.CREW, demonsPunjab);
        castAndCrewRepository.save(demonsPunjabdirector);
        CastAndCrew demonsPunjabsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, demonsPunjab);
        castAndCrewRepository.save(demonsPunjabsRunner);
        CastAndCrew demonsPunjabproducer = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, demonsPunjab);
        castAndCrewRepository.save(demonsPunjabproducer);
        CastAndCrew demonsPunjabexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, demonsPunjab);
        castAndCrewRepository.save(demonsPunjabexecProducer);

        Story kerblam = new Story(
                "Kerblam!",
                Format.TV,
                LocalDate.of(2018, 11, 18),
                LocalDate.of(2018, 11, 18),
                "DVD/Blu-Ray (2019), Novelisation/Audiobook (2023).",
                "images/whittaker_logo.png",
                "It looks like a multi-planetary megacorporation might be a bit morally dubious.",
                "Space; Amazon; Kerblam man; workplace; fridging; bubble wrap; delivery man; the systems aren't the problem;",
                Series.SERIES11,
                7,
                1,
                "",
                "https://tardis.wiki/wiki/Kerblam!_(TV_story)"
        );
        kerblam.addDoctor(thirteenthDoctor);
        kerblam.addCompanion(yaz);
        kerblam.addCompanion(graham);
        kerblam.addCompanion(ryan);
        storyRepository.save(kerblam);

        CastAndCrew kerblamwriter = new CastAndCrew(mcTighe, "Writer", CastOrCrew.CREW, kerblam);
        castAndCrewRepository.save(kerblamwriter);
        CastAndCrew kerblamdirector = new CastAndCrew(jPerrott, "Director", CastOrCrew.CREW, kerblam);
        castAndCrewRepository.save(kerblamdirector);
        CastAndCrew kerblamsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, kerblam);
        castAndCrewRepository.save(kerblamsRunner);
        CastAndCrew kerblamproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, kerblam);
        castAndCrewRepository.save(kerblamproducer);
        CastAndCrew kerblamexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, kerblam);
        castAndCrewRepository.save(kerblamexecProducer);

        Story witchfinders = new Story(
                "The Witchfinders",
                Format.TV,
                LocalDate.of(2018, 11, 25),
                LocalDate.of(2018, 11, 25),
                "DVD/Blu-Ray (2019), Novelisation/Audiobook (2021).",
                "images/whittaker_logo.png",
                "Landing in the middle of a witch trial, the Doctor herself falls under suspicion.",
                "Morax; gender; mud; Dunking; Witchcraft; witch; trials; hysteria; King; James I; James VI; arch;",
                Series.SERIES11,
                8,
                1,
                "",
                "https://tardis.wiki/wiki/The_Witchfinders_(TV_story)"
        );
        witchfinders.addDoctor(thirteenthDoctor);
        witchfinders.addCompanion(yaz);
        witchfinders.addCompanion(graham);
        witchfinders.addCompanion(ryan);
        storyRepository.save(witchfinders);

        CastAndCrew witchfinderswriter = new CastAndCrew(jWilkinson, "Writer", CastOrCrew.CREW, witchfinders);
        castAndCrewRepository.save(witchfinderswriter);
        CastAndCrew witchfindersdirector = new CastAndCrew(sAprahamian, "Director", CastOrCrew.CREW, witchfinders);
        castAndCrewRepository.save(witchfindersdirector);
        CastAndCrew witchfinderssRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, witchfinders);
        castAndCrewRepository.save(witchfinderssRunner);
        CastAndCrew witchfindersproducer = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, witchfinders);
        castAndCrewRepository.save(witchfindersproducer);
        CastAndCrew witchfindersexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, witchfinders);
        castAndCrewRepository.save(witchfindersexecProducer);

        Story takesAway = new Story(
                "It Takes You Away",
                Format.TV,
                LocalDate.of(2018, 12, 2),
                LocalDate.of(2018, 12, 2),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "In an isolated house in the Norwegian fjords, a scared girl hides alone, waiting for her father to return. In the distance, a monster comes to take people away.",
                "Grandad; Solitract; the actor Kevin Eldon; Norway; Woolly Rebellion; big; green; frog; Ribbons; Anti-zone; moths; bad parenting; blind character",
                Series.SERIES11,
                9,
                1,
                "",
                "https://tardis.wiki/wiki/It_Takes_You_Away_(TV_story)"
        );
        takesAway.addDoctor(thirteenthDoctor);
        takesAway.addCompanion(yaz);
        takesAway.addCompanion(graham);
        takesAway.addCompanion(ryan);
        storyRepository.save(takesAway);

        CastAndCrew takesAwaywriter = new CastAndCrew(hime, "Writer", CastOrCrew.CREW, takesAway);
        castAndCrewRepository.save(takesAwaywriter);
        CastAndCrew takesAwaydirector = new CastAndCrew(jChilds, "Director", CastOrCrew.CREW, takesAway);
        castAndCrewRepository.save(takesAwaydirector);
        CastAndCrew takesAwaysRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, takesAway);
        castAndCrewRepository.save(takesAwaysRunner);
        CastAndCrew takesAwayproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, takesAway);
        castAndCrewRepository.save(takesAwayproducer);
        CastAndCrew takesAwayexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, takesAway);
        castAndCrewRepository.save(takesAwayexecProducer);

        Story ranksoor = new Story(
                "The Battle of Ranskoor Av Kolos",
                Format.TV,
                LocalDate.of(2018, 12, 9),
                LocalDate.of(2018, 12, 9),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "Nine different distress calls are all coming from the same planet.",
                "Ux; Stenza; first draft; Tzim-Sha; Tim Shaw; memory loss",
                Series.SERIES11,
                10,
                1,
                "",
                "https://tardis.wiki/wiki/The_Battle_of_Ranskoor_Av_Kolos_(TV_story)"
        );
        ranksoor.addDoctor(thirteenthDoctor);
        ranksoor.addCompanion(yaz);
        ranksoor.addCompanion(graham);
        ranksoor.addCompanion(ryan);
        storyRepository.save(ranksoor);

        CastAndCrew ranksoorwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, ranksoor);
        castAndCrewRepository.save(ranksoorwriter);
        CastAndCrew ranksoordirector = new CastAndCrew(jChilds, "Director", CastOrCrew.CREW, ranksoor);
        castAndCrewRepository.save(ranksoordirector);
        CastAndCrew ranksoorsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, ranksoor);
        castAndCrewRepository.save(ranksoorsRunner);
        CastAndCrew ranksoorproducer = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, ranksoor);
        castAndCrewRepository.save(ranksoorproducer);
        CastAndCrew ranksoorexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, ranksoor);
        castAndCrewRepository.save(ranksoorexecProducer);

        Story resolution = new Story(
                "Resolution",
                Format.TV,
                LocalDate.of(2019, 1, 1),
                LocalDate.of(2019, 1, 1),
                "DVD/Blu-Ray (2019).",
                "images/whittaker_logo.png",
                "Archaeologists discover buried alien fragments, and it goes about as well as you'd expect.",
                "Festive Special; New Year Special; Dalek; solo Dalek; possession; bury your gays; Reconnaissance scout; Ryan's Dad; microwave; ",
                Series.SERIES11,
                11,
                1,
                "",
                "https://tardis.wiki/wiki/Resolution_(TV_story)"
        );
        resolution.addDoctor(thirteenthDoctor);
        resolution.addCompanion(yaz);
        resolution.addCompanion(graham);
        resolution.addCompanion(graham);
        storyRepository.save(resolution);

        CastAndCrew resolutionwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, resolution);
        castAndCrewRepository.save(resolutionwriter);
        CastAndCrew resolutiondirector = new CastAndCrew(wYip, "Director", CastOrCrew.CREW, resolution);
        castAndCrewRepository.save(resolutiondirector);
        CastAndCrew resolutionsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, resolution);
        castAndCrewRepository.save(resolutionsRunner);
        CastAndCrew resolutionproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, resolution);
        castAndCrewRepository.save(resolutionproducer);
        CastAndCrew resolutionexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, resolution);
        castAndCrewRepository.save(resolutionexecProducer);

        Story spyfall = new Story(
                "Spyfall",
                Format.TV,
                LocalDate.of(2020, 1, 1),
                LocalDate.of(2020, 1, 5),
                "DVD/Blu-ray (2020).",
                "images/whittaker_logo.png",
                "MI6 enlists the Doctor to investigate former spy Daniel Barton, which escalates quickly.",
                "Festive Special; Gallifrey; destruction of; Tissue Compression Eliminator; Plane Thieves; MI6; Kasaavin; James Bond",
                Series.SERIES12,
                1,
                2,
                "",
                "https://tardis.wiki/wiki/Spyfall_(TV_story)"
        );
        spyfall.addDoctor(thirteenthDoctor);
        spyfall.addCompanion(yaz);
        spyfall.addCompanion(graham);
        spyfall.addCompanion(ryan);
        storyRepository.save(spyfall);

        CastAndCrew spyfallwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, spyfall);
        castAndCrewRepository.save(spyfallwriter);
        CastAndCrew spyfalldirector = new CastAndCrew(jMStone, "Director", CastOrCrew.CREW, spyfall);
        castAndCrewRepository.save(spyfalldirector);
        CastAndCrew spyfalldirector2 = new CastAndCrew(lHJones, "Director", CastOrCrew.CREW, spyfall);
        castAndCrewRepository.save(spyfalldirector2);
        CastAndCrew spyfallsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, spyfall);
        castAndCrewRepository.save(spyfallsRunner);
        CastAndCrew spyfallproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, spyfall);
        castAndCrewRepository.save(spyfallproducer);
        CastAndCrew spyfallproducer2 = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, spyfall);
        castAndCrewRepository.save(spyfallproducer2);
        CastAndCrew spyfallexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, spyfall);
        castAndCrewRepository.save(spyfallexecProducer);

        Story orphan = new Story(
                "Orphan 55",
                Format.TV,
                LocalDate.of(2020, 1, 12),
                LocalDate.of(2020, 1, 12),
                "DVD/Blu-ray (2020).",
                "images/whittaker_logo.png",
                "A free holiday turns into an absolute nightmare.",
                "My Benni; Dregs; Tranquility Spa; future Earth; Siberia; Environment; Jay from; Inbetweeners; hopper virus;",
                Series.SERIES12,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/Orphan_55_(TV_story)"
        );
        orphan.addDoctor(thirteenthDoctor);
        orphan.addCompanion(yaz);
        orphan.addCompanion(graham);
        orphan.addCompanion(ryan);
        storyRepository.save(orphan);

        CastAndCrew orphanwriter = new CastAndCrew(hime, "Writer", CastOrCrew.CREW, orphan);
        castAndCrewRepository.save(orphanwriter);
        CastAndCrew orphandirector = new CastAndCrew(lHJones, "Director", CastOrCrew.CREW, orphan);
        castAndCrewRepository.save(orphandirector);
        CastAndCrew orphansRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, orphan);
        castAndCrewRepository.save(orphansRunner);
        CastAndCrew orphanproducer = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, orphan);
        castAndCrewRepository.save(orphanproducer);
        CastAndCrew orphanexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, orphan);
        castAndCrewRepository.save(orphanexecProducer);

        Story tesla = new Story(
                "Nikola Tesla's Night of Terror",
                Format.TV,
                LocalDate.of(2020, 1, 19),
                LocalDate.of(2020, 1, 19),
                "DVD/Blu-ray (2020).",
                "images/whittaker_logo.png",
                "Little does Nikola Tesla suspect that parts of his equipment are being stolen by OTT scorpions.",
                "Skithra; Thomas Edison; Wardenclyffe",
                Series.SERIES12,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/Nikola_Tesla%27s_Night_of_Terror_(TV_story)"
        );
        tesla.addDoctor(thirteenthDoctor);
        tesla.addCompanion(yaz);
        tesla.addCompanion(graham);
        tesla.addCompanion(ryan);
        storyRepository.save(tesla);

        CastAndCrew teslawriter = new CastAndCrew(metivier, "Writer", CastOrCrew.CREW, tesla);
        castAndCrewRepository.save(teslawriter);
        CastAndCrew tesladirector = new CastAndCrew(nManzoor, "Director", CastOrCrew.CREW, tesla);
        castAndCrewRepository.save(tesladirector);
        CastAndCrew teslasRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, tesla);
        castAndCrewRepository.save(teslasRunner);
        CastAndCrew teslaproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, tesla);
        castAndCrewRepository.save(teslaproducer);
        CastAndCrew teslaexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, tesla);
        castAndCrewRepository.save(teslaexecProducer);

        Story fugitiveJudoon = new Story("Fugitive of the Judoon",
                Format.TV,
                LocalDate.of(2020, 1, 26),
                LocalDate.of(2020, 1, 26),
                "DVD/Blu-ray (2020).",
                "images/whittaker_logo.png",
                "The Judoon are hunting a dangerous fugitive in Gloucester, but is it really as simple as that?",
                "Ruth; Fugitive Doctor; Big Ears; Captain Jack; Lone Cyberman; Division; Lighthouse; Police Box; TARDIS; Chameleon Arch",
                Series.SERIES12,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/Fugitive_of_the_Judoon_(TV_story)"
        );
        fugitiveJudoon.addDoctor(thirteenthDoctor);
        fugitiveJudoon.addDoctor(fugitiveDoctor);
        fugitiveJudoon.addCompanion(yaz);
        fugitiveJudoon.addCompanion(graham);
        fugitiveJudoon.addCompanion(ryan);
        storyRepository.save(fugitiveJudoon);

        CastAndCrew fugitiveJudoonwriter = new CastAndCrew(vPatel, "Writer", CastOrCrew.CREW, fugitiveJudoon);
        castAndCrewRepository.save(fugitiveJudoonwriter);
        CastAndCrew fugitiveJudoonwriter2 = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, fugitiveJudoon);
        castAndCrewRepository.save(fugitiveJudoonwriter2);
        CastAndCrew fugitiveJudoondirector = new CastAndCrew(nManzoor, "Director", CastOrCrew.CREW, fugitiveJudoon);
        castAndCrewRepository.save(fugitiveJudoondirector);
        CastAndCrew fugitiveJudoonsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, fugitiveJudoon);
        castAndCrewRepository.save(fugitiveJudoonsRunner);
        CastAndCrew fugitiveJudoonproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, fugitiveJudoon);
        castAndCrewRepository.save(fugitiveJudoonproducer);
        CastAndCrew fugitiveJudoonexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, fugitiveJudoon);
        castAndCrewRepository.save(fugitiveJudoonexecProducer);

        Story praxeus = new Story(
                "Praxeus",
                Format.TV,
                LocalDate.of(2020, 2, 2),
                LocalDate.of(2020, 2, 2),
                "DVD/Blu-ray (2020).",
                "images/whittaker_logo.png",
                "What connects birds, an astronaut and a deadly virus that makes people explode?",
                "Virus; dead birds; astronaut; Madagascar; hazmat; unmentioned dead guy;",
                Series.SERIES12,
                5,
                1,
                "",
                "https://tardis.wiki/wiki/Praxeus_(TV_story)"
        );
        praxeus.addDoctor(thirteenthDoctor);
        praxeus.addCompanion(yaz);
        praxeus.addCompanion(graham);
        praxeus.addCompanion(ryan);
        storyRepository.save(praxeus);

        CastAndCrew praxeuswriter = new CastAndCrew(mcTighe, "Writer", CastOrCrew.CREW, praxeus);
        castAndCrewRepository.save(praxeuswriter);
        CastAndCrew praxeuswriter2 = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, praxeus);
        castAndCrewRepository.save(praxeuswriter2);
        CastAndCrew praxeusdirector = new CastAndCrew(jMStone, "Director", CastOrCrew.CREW, praxeus);
        castAndCrewRepository.save(praxeusdirector);
        CastAndCrew praxeussRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, praxeus);
        castAndCrewRepository.save(praxeussRunner);
        CastAndCrew praxeusproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, praxeus);
        castAndCrewRepository.save(praxeusproducer);
        CastAndCrew praxeusexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, praxeus);
        castAndCrewRepository.save(praxeusexecProducer);

        Story canUhearMe = new Story(
                "Can You Hear Me?",
                Format.TV,
                LocalDate.of(2020, 2, 9),
                LocalDate.of(2020, 2, 9),
                "DVD/Blu-ray (2020).",
                "images/whittaker_logo.png",
                "A really creepy guy has his fingers in many pies.",
                "Eternals; Mental Health; fear; detached; fingers; awkward; cancer; chat; 1380; Aleppo",
                Series.SERIES12,
                6,
                1,
                "",
                "https://tardis.wiki/wiki/Can_You_Hear_Me%3F_(TV_story)"
        );
        canUhearMe.addDoctor(thirteenthDoctor);
        canUhearMe.addCompanion(yaz);
        canUhearMe.addCompanion(graham);
        canUhearMe.addCompanion(ryan);
        storyRepository.save(canUhearMe);

        CastAndCrew canUhearMewriter = new CastAndCrew(cJames, "Writer", CastOrCrew.CREW, canUhearMe);
        castAndCrewRepository.save(canUhearMewriter);
        CastAndCrew canUhearMewriter2 = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, canUhearMe);
        castAndCrewRepository.save(canUhearMewriter2);
        CastAndCrew canUhearMedirector = new CastAndCrew(eSullivan, "Director", CastOrCrew.CREW, canUhearMe);
        castAndCrewRepository.save(canUhearMedirector);
        CastAndCrew canUhearMesRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, canUhearMe);
        castAndCrewRepository.save(canUhearMesRunner);
        CastAndCrew canUhearMeproducer = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, canUhearMe);
        castAndCrewRepository.save(canUhearMeproducer);
        CastAndCrew canUhearMeexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, canUhearMe);
        castAndCrewRepository.save(canUhearMeexecProducer);

        Story villaDiodati = new Story(
                "The Haunting of Villa Diodati",
                Format.TV,
                LocalDate.of(2020, 2, 16),
                LocalDate.of(2020, 2, 16),
                "DVD/Blu-ray (2020).",
                "images/whittaker_logo.png",
                "The Doctor visits Mary SHelley on the night she creates Frankenstein.",
                "Lone Cyberman; Byron; Frankenstein; Cyber-Poetry; Cyberium; ",
                Series.SERIES12,
                7,
                1,
                "",
                "https://tardis.wiki/wiki/The_Haunting_of_Villa_Diodati_(TV_story)"
        );
        villaDiodati.addDoctor(thirteenthDoctor);
        villaDiodati.addCompanion(yaz);
        villaDiodati.addCompanion(graham);
        villaDiodati.addCompanion(ryan);
        storyRepository.save(villaDiodati);

        CastAndCrew villaDiodatiwriter = new CastAndCrew(mAlderton, "Writer", CastOrCrew.CREW, villaDiodati);
        castAndCrewRepository.save(villaDiodatiwriter);
        CastAndCrew villaDiodatidirector = new CastAndCrew(eSullivan, "Director", CastOrCrew.CREW, villaDiodati);
        castAndCrewRepository.save(villaDiodatidirector);
        CastAndCrew villaDiodatisRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, villaDiodati);
        castAndCrewRepository.save(villaDiodatisRunner);
        CastAndCrew villaDiodatiproducer = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, villaDiodati);
        castAndCrewRepository.save(villaDiodatiproducer);
        CastAndCrew villaDiodatiexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, villaDiodati);
        castAndCrewRepository.save(villaDiodatiexecProducer);

        Story ascenscionCybsTimelessChild = new Story(
                "Ascension of the Cybermen/The Timeless Children",
                Format.TV,
                LocalDate.of(2020, 2, 23),
                LocalDate.of(2020, 3, 1),
                "DVD/Blu-ray (2020).",
                "images/whittaker_logo.png",
                "The Doctor is separated from her companions in the aftermath of the Cyber-Wars, but what lies in wait for her at the Boundary?",
                "Adoption; Lone Cyberman; Tecteun; Irish Policeman; Division; Morbius Doctors; Cyber Heads; Cyberium; Cyberdrone; Cyber Lords; Cyber-Wars; Boundary; gateway; wormhole; foundling; Gallifrey; 2.6 billion children; Master",
                Series.SERIES12,
                8,
                2,
                "",
                "https://tardis.wiki/wiki/Ascension_of_the_Cybermen_(TV_story)"
        );
        ascenscionCybsTimelessChild.addDoctor(thirteenthDoctor);
        ascenscionCybsTimelessChild.addCompanion(yaz);
        ascenscionCybsTimelessChild.addCompanion(graham);
        ascenscionCybsTimelessChild.addCompanion(ryan);
        storyRepository.save(ascenscionCybsTimelessChild);

        CastAndCrew ascenscionCybsTimelessChildwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, ascenscionCybsTimelessChild);
        castAndCrewRepository.save(ascenscionCybsTimelessChildwriter);
        CastAndCrew ascenscionCybsTimelessChilddirector = new CastAndCrew(jMStone, "Director", CastOrCrew.CREW, ascenscionCybsTimelessChild);
        castAndCrewRepository.save(ascenscionCybsTimelessChilddirector);
        CastAndCrew ascenscionCybsTimelessChildsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, ascenscionCybsTimelessChild);
        castAndCrewRepository.save(ascenscionCybsTimelessChildsRunner);
        CastAndCrew ascenscionCybsTimelessChildproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, ascenscionCybsTimelessChild);
        castAndCrewRepository.save(ascenscionCybsTimelessChildproducer);
        CastAndCrew ascenscionCybsTimelessChildexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, ascenscionCybsTimelessChild);
        castAndCrewRepository.save(ascenscionCybsTimelessChildexecProducer);

        Story revolutionDaleks = new Story(
                "Revolution of the Daleks",
                Format.TV,
                LocalDate.of(2021, 1, 1),
                LocalDate.of(2021, 1, 1),
                "DVD/Blu-ray (2021).",
                "images/whittaker_logo.png",
                "The Doctor is in prison while on Earth Daleks are on the production line.",
                "Jack Robertson; Captain Jack; prison; companion; departure; leave; Graham; final appearance: Ryan; Reconnaissance Dalek; drones",
                Series.SERIES12,
                9,
                1,
                "",
                "https://tardis.wiki/wiki/Revolution_of_the_Daleks_(TV_story)"
        );
        revolutionDaleks.addDoctor(thirteenthDoctor);
        revolutionDaleks.addCompanion(yaz);
        revolutionDaleks.addCompanion(graham);
        revolutionDaleks.addCompanion(ryan);
        revolutionDaleks.addCompanion(jack);
        storyRepository.save(revolutionDaleks);

        CastAndCrew revolutionDalekswriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, revolutionDaleks);
        castAndCrewRepository.save(revolutionDalekswriter);
        CastAndCrew revolutionDaleksdirector = new CastAndCrew(lHJones, "Director", CastOrCrew.CREW, revolutionDaleks);
        castAndCrewRepository.save(revolutionDaleksdirector);
        CastAndCrew revolutionDalekssRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, revolutionDaleks);
        castAndCrewRepository.save(revolutionDalekssRunner);
        CastAndCrew revolutionDaleksproducer = new CastAndCrew(mercer, "Producer", CastOrCrew.CREW, revolutionDaleks);
        castAndCrewRepository.save(revolutionDaleksproducer);
        CastAndCrew revolutionDaleksexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, revolutionDaleks);
        castAndCrewRepository.save(revolutionDaleksexecProducer);


        Story flux = new Story(
                "Flux",
                Format.TV,
                LocalDate.of(2021, 10, 31),
                LocalDate.of(2021, 12, 5),
                "DVD/Blu-ray (2022).",
                "images/whittaker_logo.png",
                "After most of the universe is devastated, the Doctor learns more about her origins as she attempts to save the survivors.",
                "Adoption; Azure; Swarm; Division; Tecteun; Williamson Tunnels; Sontarans; Angels; Daleks; Cybermen; Bel; Vinder; Grand Serpent; UNIT",
                Series.SERIES13,
                1,
                6,
                "",
                "https://tardis.wiki/wiki/Series_13_(Doctor_Who_2005)"
        );
        flux.addDoctor(thirteenthDoctor);
        flux.addDoctor(fugitiveDoctor);
        flux.addCompanion(yaz);
        flux.addCompanion(dan);
        storyRepository.save(flux);

        CastAndCrew fluxwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, flux);
        castAndCrewRepository.save(fluxwriter);

        CastAndCrew fluxwriter2 = new CastAndCrew(mAlderton, "Writer", CastOrCrew.CREW, flux);
        castAndCrewRepository.save(fluxwriter2);
        CastAndCrew fluxdirector = new CastAndCrew(jMStone, "Director", CastOrCrew.CREW, flux);
        castAndCrewRepository.save(fluxdirector);
        CastAndCrew fluxdirector2 = new CastAndCrew(aSaleem, "Director", CastOrCrew.CREW, flux);
        castAndCrewRepository.save(fluxdirector2);
        CastAndCrew fluxsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, flux);
        castAndCrewRepository.save(fluxsRunner);
        CastAndCrew fluxproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, flux);
        castAndCrewRepository.save(fluxproducer);
        CastAndCrew fluxproducer2 = new CastAndCrew(levy, "Producer", CastOrCrew.CREW, flux);
        castAndCrewRepository.save(fluxproducer2);
        CastAndCrew fluxexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, flux);
        castAndCrewRepository.save(fluxexecProducer);

        Story halloweenApocalypse = new Story(
                "The Halloween Apocalypse",
                Format.TV,
                LocalDate.of(2021, 10, 31),
                LocalDate.of(2021, 10, 31),
                "DVD/Blu-ray (2022).",
                "images/whittaker_logo.png",
                "Something is tearing through all of time and space, destroying everything in its path.",
                "Chapter One; Halloween; Trick or Treat!; first appearance of: Dan Lewis, Karvanista, Azure; Swarm; universe destroyed",
                Series.SERIES13,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/The_Halloween_Apocalypse_(TV_story)"
        );
        halloweenApocalypse.addDoctor(thirteenthDoctor);
        halloweenApocalypse.addCompanion(yaz);
        halloweenApocalypse.addCompanion(dan);
        storyRepository.save(halloweenApocalypse);

        CastAndCrew halloweenApocalypsewriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, halloweenApocalypse);
        castAndCrewRepository.save(halloweenApocalypsewriter);
        CastAndCrew halloweenApocalypsedirector = new CastAndCrew(jMStone, "Director", CastOrCrew.CREW, halloweenApocalypse);
        castAndCrewRepository.save(halloweenApocalypsedirector);
        CastAndCrew halloweenApocalypsesRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, halloweenApocalypse);
        castAndCrewRepository.save(halloweenApocalypsesRunner);
        CastAndCrew halloweenApocalypseproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, halloweenApocalypse);
        castAndCrewRepository.save(halloweenApocalypseproducer);
        CastAndCrew halloweenApocalypseexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, halloweenApocalypse);
        castAndCrewRepository.save(halloweenApocalypseexecProducer);

        Story warSontarans = new Story(
                "War of the Sontarans",
                Format.TV,
                LocalDate.of(2021, 11, 7),
                LocalDate.of(2021, 11, 7),
                "DVD/Blu-ray (2022).",
                "images/whittaker_logo.png",
                "The Sontarans have hijacked the Crimean War.",
                "Chapter Two; Mary Seacole; Crimea; Crimean War; Atropos; Priest Triangle; Sontaran; wanted to ride a horse; Liverpool Docks",
                Series.SERIES13,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/War_of_the_Sontarans_(TV_story)"
        );
        warSontarans.addDoctor(thirteenthDoctor);
        warSontarans.addCompanion(yaz);
        warSontarans.addCompanion(dan);
        storyRepository.save(warSontarans);

        CastAndCrew warSontaranswriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, warSontarans);
        castAndCrewRepository.save(warSontaranswriter);
        CastAndCrew warSontaransdirector = new CastAndCrew(jMStone, "Director", CastOrCrew.CREW, warSontarans);
        castAndCrewRepository.save(warSontaransdirector);
        CastAndCrew warSontaranssRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, warSontarans);
        castAndCrewRepository.save(warSontaranssRunner);
        CastAndCrew warSontaransproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, warSontarans);
        castAndCrewRepository.save(warSontaransproducer);
        CastAndCrew warSontaransexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, warSontarans);
        castAndCrewRepository.save(warSontaransexecProducer);

        Story onceTime = new Story(
                "Once, Upon Time",
                Format.TV,
                LocalDate.of(2021, 11, 14),
                LocalDate.of(2021, 11, 14),
                "DVD/Blu-ray (2022).",
                "images/whittaker_logo.png",
                "The Doctor stands on a plinth and everyone has flashbacks.",
                "Chapter Three; Atropos; Mouri; blue particles; time storm; Grand Serpent; Vinder; Bel; Me and your beautiful as yet unborn child; ",
                Series.SERIES13,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/Once,_Upon_Time_(TV_story)"
        );
        onceTime.addDoctor(thirteenthDoctor);
        onceTime.addDoctor(fugitiveDoctor);
        onceTime.addCompanion(yaz);
        onceTime.addCompanion(dan);
        storyRepository.save(onceTime);

        CastAndCrew onceTimewriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, onceTime);
        castAndCrewRepository.save(onceTimewriter);
        CastAndCrew onceTimedirector = new CastAndCrew(aSaleem, "Director", CastOrCrew.CREW, onceTime);
        castAndCrewRepository.save(onceTimedirector);
        CastAndCrew onceTimesRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, onceTime);
        castAndCrewRepository.save(onceTimesRunner);
        CastAndCrew onceTimeproducer = new CastAndCrew(levy, "Producer", CastOrCrew.CREW, onceTime);
        castAndCrewRepository.save(onceTimeproducer);
        CastAndCrew onceTimeexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, onceTime);
        castAndCrewRepository.save(onceTimeexecProducer);

        Story villageAngels = new Story(
                "Village of the Angels",
                Format.TV,
                LocalDate.of(2021, 11, 21),
                LocalDate.of(2021, 11, 21),
                "DVD/Blu-ray (2022).",
                "images/whittaker_logo.png",
                "The Doctor's past catches up with her while everyone else catches up with the past.",
                "Chapter Four; Eustacius Jericho; Claire; fire Angel; Division; Extraction Squad; turned into Angel",
                Series.SERIES13,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/Village_of_the_Angels_(TV_story)"
        );
        villageAngels.addDoctor(thirteenthDoctor);
        villageAngels.addCompanion(yaz);
        villageAngels.addCompanion(dan);
        storyRepository.save(villageAngels);

        CastAndCrew villageAngelswriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, villageAngels);
        castAndCrewRepository.save(villageAngelswriter);
        CastAndCrew villageAngelswriter2 = new CastAndCrew(mAlderton, "Writer", CastOrCrew.CREW, villageAngels);
        castAndCrewRepository.save(villageAngelswriter2);
        CastAndCrew villageAngelsdirector = new CastAndCrew(jMStone, "Director", CastOrCrew.CREW, villageAngels);
        castAndCrewRepository.save(villageAngelsdirector);
        CastAndCrew villageAngelssRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, villageAngels);
        castAndCrewRepository.save(villageAngelssRunner);
        CastAndCrew villageAngelsproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, villageAngels);
        castAndCrewRepository.save(villageAngelsproducer);
        CastAndCrew villageAngelsexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, villageAngels);
        castAndCrewRepository.save(villageAngelsexecProducer);

        Story survivorsFlux = new Story(
                "Survivors of the Flux",
                Format.TV,
                LocalDate.of(2021, 11, 28),
                LocalDate.of(2021, 11, 28),
                "DVD/Blu-ray (2022).",
                "images/whittaker_logo.png",
                "The Doctor's Mum is passive aggressive.",
                "Adoption; Chapter 5; UNIT; Grand Serpent; Multiverse; Awsok; Division; Universe; One; Two",
                Series.SERIES13,
                5,
                1,
                "",
                "https://tardis.wiki/wiki/Survivors_of_the_Flux_(TV_story)"
        );
        survivorsFlux.addDoctor(thirteenthDoctor);
        survivorsFlux.addCompanion(yaz);
        survivorsFlux.addCompanion(dan);
        storyRepository.save(survivorsFlux);

        CastAndCrew survivorsFluxwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, survivorsFlux);
        castAndCrewRepository.save(survivorsFluxwriter);
        CastAndCrew survivorsFluxdirector = new CastAndCrew(aSaleem, "Director", CastOrCrew.CREW, survivorsFlux);
        castAndCrewRepository.save(survivorsFluxdirector);
        CastAndCrew survivorsFluxsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, survivorsFlux);
        castAndCrewRepository.save(survivorsFluxsRunner);
        CastAndCrew survivorsFluxproducer = new CastAndCrew(levy, "Producer", CastOrCrew.CREW, survivorsFlux);
        castAndCrewRepository.save(survivorsFluxproducer);
        CastAndCrew survivorsFluxexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, survivorsFlux);
        castAndCrewRepository.save(survivorsFluxexecProducer);

        Story vanquishers = new Story(
                "The Vanquishers",
                Format.TV,
                LocalDate.of(2021, 12, 5),
                LocalDate.of(2021, 12, 5),
                "DVD/Blu-ray (2022).",
                "images/whittaker_logo.png",
                "The Doctor is split across three realities as the final Flux event approaches.",
                "Chapter 6; Seven billion dead dogs floating in space; UNIT; Time; Williamson Tunnels; illogical house; last appearance of: Karvanista; Jericho; Claire; Grand Serpent; Ravagers; Swarm; Azure; Bel;  Passenger; betrayal",
                Series.SERIES13,
                6,
                1,
                "",
                "https://tardis.wiki/wiki/The_Vanquishers_(TV_story)"
        );
        vanquishers.addDoctor(thirteenthDoctor);
        vanquishers.addCompanion(yaz);
        vanquishers.addCompanion(dan);
        storyRepository.save(vanquishers);

        CastAndCrew vanquisherswriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, vanquishers);
        castAndCrewRepository.save(vanquisherswriter);
        CastAndCrew vanquishersdirector = new CastAndCrew(aSaleem, "Director", CastOrCrew.CREW, vanquishers);
        castAndCrewRepository.save(vanquishersdirector);
        CastAndCrew vanquisherssRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, vanquishers);
        castAndCrewRepository.save(vanquisherssRunner);
        CastAndCrew vanquishersproducer = new CastAndCrew(levy, "Producer", CastOrCrew.CREW, vanquishers);
        castAndCrewRepository.save(vanquishersproducer);
        CastAndCrew vanquishersexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, vanquishers);
        castAndCrewRepository.save(vanquishersexecProducer);

        Story eveDaleks = new Story(

                "Eve of the Daleks",
                Format.TV,
                LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 1, 1),
                "DVD/Blu-ray (2022)",
                "images/whittaker_logo.png",
                "The Doctor and friends are trapped in a self storage facility in Manchester on New Year's Eve.",
                "Daleks; Dalek Executioners; Yaz; romantic; feelings; Doctor; Self Storage; New Year; Festive Special; time loop",
                Series.WHITTAKERSPECIALS,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/Eve_of_the_Daleks_(TV_story)"
        );
        eveDaleks.addDoctor(thirteenthDoctor);
        eveDaleks.addCompanion(yaz);
        eveDaleks.addCompanion(dan);
        storyRepository.save(eveDaleks);

        CastAndCrew eveDalekswriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, eveDaleks);
        castAndCrewRepository.save(eveDalekswriter);
        CastAndCrew eveDaleksdirector = new CastAndCrew(aLaufer, "Director", CastOrCrew.CREW, eveDaleks);
        castAndCrewRepository.save(eveDaleksdirector);
        CastAndCrew eveDalekssRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, eveDaleks);
        castAndCrewRepository.save(eveDalekssRunner);
        CastAndCrew eveDaleksproducer = new CastAndCrew(bucktowonsing, "Producer", CastOrCrew.CREW, eveDaleks);
        castAndCrewRepository.save(eveDaleksproducer);
        CastAndCrew eveDaleksexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, eveDaleks);
        castAndCrewRepository.save(eveDaleksexecProducer);

        Story legendSeaDevils = new Story(

                "Legend of the Sea Devils",
                Format.TV,
                LocalDate.of(2022, 4, 17),
                LocalDate.of(2022, 4, 17),
                "DVD/Blu-ray (2022)",
                "images/whittaker_logo.png",
                "A really angry Sea Devil wants to flood the Earth.",
                "Easter Special; Sea Devil; leap; Chinese Pirates; Sword fight; Zheng Yi Sao; Yaz; Doctor; romantic; feelings",
                Series.WHITTAKERSPECIALS,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/Legend_of_the_Sea_Devils_(TV_story)"
        );
        legendSeaDevils.addDoctor(thirteenthDoctor);
        legendSeaDevils.addCompanion(yaz);
        legendSeaDevils.addCompanion(dan);
        storyRepository.save(legendSeaDevils);

        CastAndCrew legendSeaDevilswriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, legendSeaDevils);
        castAndCrewRepository.save(legendSeaDevilswriter);
        CastAndCrew legendSeaDevilswriter2 = new CastAndCrew(eRoad, "Writer", CastOrCrew.CREW, legendSeaDevils);
        castAndCrewRepository.save(legendSeaDevilswriter2);
        CastAndCrew legendSeaDevilsdirector = new CastAndCrew(hWang, "Director", CastOrCrew.CREW, legendSeaDevils);
        castAndCrewRepository.save(legendSeaDevilsdirector);
        CastAndCrew legendSeaDevilssRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, legendSeaDevils);
        castAndCrewRepository.save(legendSeaDevilssRunner);
        CastAndCrew legendSeaDevilsproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, legendSeaDevils);
        castAndCrewRepository.save(legendSeaDevilsproducer);
        CastAndCrew legendSeaDevilsexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, legendSeaDevils);
        castAndCrewRepository.save(legendSeaDevilsexecProducer);

        Story powerDr = new Story(

                "The Power of the Doctor",
                Format.TV,
                LocalDate.of(2022, 10, 23),
                LocalDate.of(2022, 10, 23),
                "DVD/Blu-ray (2022)",
                "images/whittaker_logo.png",
                "Famous paintings have been mysteriously defaced and seismologists have gone missing! Oh no!",
                "Forced; Regeneration; first appearance of: Fourteenth Doctor; Guardians of the Edge; Rasputin; insane photoshop; UNIT; Ashad; Adric; Centenary Special last appearance of: Yaz; Dan; Graham; Ian; Vinder;",
                Series.WHITTAKERSPECIALS,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/The_Power_of_the_Doctor_(TV_story)"
        );
        powerDr.addDoctor(thirteenthDoctor);
        powerDr.addDoctor(fugitiveDoctor);
        powerDr.addDoctor(fifthDoctor);
        powerDr.addDoctor(sixthDoctor);
        powerDr.addDoctor(seventhDoctor);
        powerDr.addDoctor(eighthDoctor);
        powerDr.addCompanion(yaz);
        powerDr.addCompanion(dan);
        powerDr.addCompanion(tegan);
        powerDr.addCompanion(ace);
        powerDr.addCompanion(graham);
        storyRepository.save(powerDr);

        CastAndCrew powerDrwriter = new CastAndCrew(chibnall, "Writer", CastOrCrew.CREW, powerDr);
        castAndCrewRepository.save(powerDrwriter);
        CastAndCrew powerDrdirector = new CastAndCrew(jMStone, "Director", CastOrCrew.CREW, powerDr);
        castAndCrewRepository.save(powerDrdirector);
        CastAndCrew powerDrsRunner = new CastAndCrew(chibnall, "Showrunner", CastOrCrew.CREW, powerDr);
        castAndCrewRepository.save(powerDrsRunner);
        CastAndCrew powerDrproducer = new CastAndCrew(nWilson, "Producer", CastOrCrew.CREW, powerDr);
        castAndCrewRepository.save(powerDrproducer);
        CastAndCrew powerDrexecProducer = new CastAndCrew(mStrevens, "Executive Producer", CastOrCrew.CREW, powerDr);
        castAndCrewRepository.save(powerDrexecProducer);


        Story starbeast = new Story(
                "The Star Beast",
                Format.TV,
                LocalDate.of(2023, 11, 25),
                LocalDate.of(2023, 11, 25),
                "Novelisation (2023), DVD/Blu-ray (2023)",
                "images/tennant2_gatwa_logo.png",
                "Donna Noble doesn't notice the spaceship crashing in North London, but she does notice the adorable furry alien hiding in her shed.",
                "Pat Mills; Dave Gibbons; comic; adaptation; Beep the Meep; non-binary; Fourth Doctor; Sharon; MetaCrisis; DoctorDonna; first appearance: Rose Noble",
                Series.SIXTYSPECIALS,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/The_Star_Beast_(TV_story)"
        );
        starbeast.addDoctor(fourteenthDoctor);
        starbeast.addCompanion(donna);
        storyRepository.save(starbeast);

        CastAndCrew starbeastwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, starbeast);
        castAndCrewRepository.save(starbeastwriter);
        CastAndCrew starbeastdirector = new CastAndCrew(rTalalay, "Director", CastOrCrew.CREW, starbeast);
        castAndCrewRepository.save(starbeastdirector);
        CastAndCrew starbeastsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, starbeast);
        castAndCrewRepository.save(starbeastsRunner);
        CastAndCrew starbeastproducer = new CastAndCrew(delow, "Producer", CastOrCrew.CREW, starbeast);
        castAndCrewRepository.save(starbeastproducer);
        CastAndCrew starbeastexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, starbeast);
        castAndCrewRepository.save(starbeastexecProducer);
        CastAndCrew starbeastexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, starbeast);
        castAndCrewRepository.save(starbeastexecProducer2);


        Story wildblueyonder = new Story(
                "Wild Blue Yonder",
                Format.TV,
                LocalDate.of(2023, 12, 2),
                LocalDate.of(2023, 12, 2),
                "Novelisation (2023), DVD/Blu-ray (2023)",
                "images/tennant2_gatwa_logo.png",
                "The Fourteenth Doctor discovers he might be gay.",
                "Mavity; Isaac Newton; same-sex attraction; not-things; salt; superstition; edge of the universe; doppelgangers; arms are too long; Wilf",
                Series.SIXTYSPECIALS,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/Wild_Blue_Yonder_(TV_story)"
        );
        wildblueyonder.addDoctor(fourteenthDoctor);
        wildblueyonder.addCompanion(donna);
        storyRepository.save(wildblueyonder);

        CastAndCrew wildblueyonderwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, wildblueyonder);
        castAndCrewRepository.save(wildblueyonderwriter);
        CastAndCrew wildblueyonderdirector = new CastAndCrew(tKingsley, "Director", CastOrCrew.CREW, wildblueyonder);
        castAndCrewRepository.save(wildblueyonderdirector);
        CastAndCrew wildblueyondersRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, wildblueyonder);
        castAndCrewRepository.save(wildblueyondersRunner);
        CastAndCrew wildblueyonderproducer = new CastAndCrew(delow, "Producer", CastOrCrew.CREW, wildblueyonder);
        castAndCrewRepository.save(wildblueyonderproducer);
        CastAndCrew wildblueyonderexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, wildblueyonder);
        castAndCrewRepository.save(wildblueyonderexecProducer);
        CastAndCrew wildblueyonderexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, wildblueyonder);
        castAndCrewRepository.save(wildblueyonderexecProducer2);


        Story giggle = new Story(
                "The Giggle",
                Format.TV,
                LocalDate.of(2023, 12,9),
                LocalDate.of(2023, 12, 9),
                "Novelisation (2023), DVD/Blu-ray (2023)",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "The Toymaker; Bi-generation; trauma; Stooky Bill; John Logie Baird; UNIT; Flux; the One Who Waits; Spice Up Your Life; catch",
                Series.SIXTYSPECIALS,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/The_Giggle_(TV_story)"
        );
        giggle.addDoctor(fourteenthDoctor);
        giggle.addCompanion(donna);
        giggle.addCompanion(mel);
        storyRepository.save(giggle);

        CastAndCrew gigglewriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, giggle);
        castAndCrewRepository.save(gigglewriter);
        CastAndCrew giggledirector = new CastAndCrew(cButton, "Director", CastOrCrew.CREW, giggle);
        castAndCrewRepository.save(giggledirector);
        CastAndCrew gigglesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, giggle);
        castAndCrewRepository.save(gigglesRunner);
        CastAndCrew giggleproducer = new CastAndCrew(delow, "Producer", CastOrCrew.CREW, giggle);
        castAndCrewRepository.save(giggleproducer);
        CastAndCrew giggleexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, giggle);
        castAndCrewRepository.save(giggleexecProducer);
        CastAndCrew giggleexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, giggle);
        castAndCrewRepository.save(giggleexecProducer2);


        Story rubyRoad = new Story(
                "The Church on Ruby Road",
                Format.TV,
                LocalDate.of(2023, 12, 25),
                LocalDate.of(2023, 12, 25),
                "Novelisation (2024), DVD/Blu-Ray (2024).",
                "images/tennant2_gatwa_logo.png",
                "Ruby Sunday is having a lot of bad luck, and now some goblins want to eat the baby she's looking after.",
                "Goblins; Goblin Song; Goblin King; flying boat; first appearance: Ruby Sunday; new companion; Christmas Special; Festive Special; never seen a TARDIS before? Mrs Flood",
                Series.SEASON12024,
                0,
                1,
                "",
                "https://tardis.wiki/wiki/The_Church_on_Ruby_Road_(TV_story)"
        );
        rubyRoad.addDoctor(fifteenthDoctor);
        rubyRoad.addCompanion(ruby);
        storyRepository.save(rubyRoad);

        CastAndCrew rubyRoadwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, rubyRoad);
        castAndCrewRepository.save(rubyRoadwriter);
        CastAndCrew rubyRoaddirector = new CastAndCrew(mTonderai, "Director", CastOrCrew.CREW, rubyRoad);
        castAndCrewRepository.save(rubyRoaddirector);
        CastAndCrew rubyRoadsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, rubyRoad);
        castAndCrewRepository.save(rubyRoadsRunner);
        CastAndCrew rubyRoadproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, rubyRoad);
        castAndCrewRepository.save(rubyRoadproducer);
        CastAndCrew rubyRoadexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, rubyRoad);
        castAndCrewRepository.save(rubyRoadexecProducer);
        CastAndCrew rubyRoadexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, rubyRoad);
        castAndCrewRepository.save(rubyRoadexecProducer2);

        Story spaceBabies = new Story(
                "Space Babies",
                Format.TV,
                LocalDate.of(2024, 5, 11),
                LocalDate.of(2024, 5, 11),
                "DVD/Blu-Ray (2024).",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "keywords",
                Series.SEASON12024,
                1,
                1,
                "",
                "https://tardis.wiki/wiki/Space_Babies_(TV_story)"
        );
        spaceBabies.addDoctor(fifteenthDoctor);
        spaceBabies.addCompanion(ruby);
        storyRepository.save(spaceBabies);

        CastAndCrew spaceBabieswriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, spaceBabies);
        castAndCrewRepository.save(spaceBabieswriter);
        CastAndCrew spaceBabiesdirector = new CastAndCrew(jARobinson, "Director", CastOrCrew.CREW, spaceBabies);
        castAndCrewRepository.save(spaceBabiesdirector);
        CastAndCrew spaceBabiessRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, spaceBabies);
        castAndCrewRepository.save(spaceBabiessRunner);
        CastAndCrew spaceBabiesproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, spaceBabies);
        castAndCrewRepository.save(spaceBabiesproducer);
        CastAndCrew spaceBabiesexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, spaceBabies);
        castAndCrewRepository.save(spaceBabiesexecProducer);
        CastAndCrew spaceBabiesexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, spaceBabies);
        castAndCrewRepository.save(spaceBabiesexecProducer2);

        Story devilChord = new Story(
                "The Devil's Chord",
                Format.TV,
                LocalDate.of(2024, 5, 11),
                LocalDate.of(2024, 5, 11),
                "DVD/Blu-Ray (2024).",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "keywords",
                Series.SEASON12024,
                2,
                1,
                "",
                "https://tardis.wiki/wiki/The_Devil%27s_Chord_(TV_story)"
        );
        devilChord.addDoctor(fifteenthDoctor);
        devilChord.addCompanion(ruby);
        storyRepository.save(devilChord);

        CastAndCrew devilChordwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, devilChord);
        castAndCrewRepository.save(devilChordwriter);
        CastAndCrew devilChorddirector = new CastAndCrew(bChessell, "Director", CastOrCrew.CREW, devilChord);
        castAndCrewRepository.save(devilChorddirector);
        CastAndCrew devilChordsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, devilChord);
        castAndCrewRepository.save(devilChordsRunner);
        CastAndCrew devilChordproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, devilChord);
        castAndCrewRepository.save(devilChordproducer);
        CastAndCrew devilChordexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, devilChord);
        castAndCrewRepository.save(devilChordexecProducer);
        CastAndCrew devilChordexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, devilChord);
        castAndCrewRepository.save(devilChordexecProducer2);

        Story boom = new Story(
                "Boom",
                Format.TV,
                LocalDate.of(2024, 5, 18),
                LocalDate.of(2024, 5, 18),
                "DVD/Blu-Ray (2024).",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "keywords",
                Series.SEASON12024,
                3,
                1,
                "",
                "https://tardis.wiki/wiki/Boom_(TV_story)"
        );
        boom.addDoctor(fifteenthDoctor);
        boom.addCompanion(ruby);
        storyRepository.save(boom);

        CastAndCrew boomwriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, boom);
        castAndCrewRepository.save(boomwriter);
        CastAndCrew boomdirector = new CastAndCrew(jARobinson, "Director", CastOrCrew.CREW, boom);
        castAndCrewRepository.save(boomdirector);
        CastAndCrew boomsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, boom);
        castAndCrewRepository.save(boomsRunner);
        CastAndCrew boomproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, boom);
        castAndCrewRepository.save(boomproducer);
        CastAndCrew boomexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, boom);
        castAndCrewRepository.save(boomexecProducer);
        CastAndCrew boomexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, boom);
        castAndCrewRepository.save(boomexecProducer2);

        Story yards = new Story(
                "73 Yards",
                Format.TV,
                LocalDate.of(2024, 5, 25),
                LocalDate.of(2024, 5, 25),
                "DVD/Blu-Ray (2024).",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "keywords",
                Series.SEASON12024,
                4,
                1,
                "",
                "https://tardis.wiki/wiki/73_Yards_(TV_story)"
        );
        yards.addDoctor(fifteenthDoctor);
        yards.addCompanion(ruby);
        storyRepository.save(yards);

        CastAndCrew yardswriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, yards);
        castAndCrewRepository.save(yardswriter);
        CastAndCrew yardsdirector = new CastAndCrew(dHWilliams, "Director", CastOrCrew.CREW, yards);
        castAndCrewRepository.save(yardsdirector);
        CastAndCrew yardssRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, yards);
        castAndCrewRepository.save(yardssRunner);
        CastAndCrew yardsproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, yards);
        castAndCrewRepository.save(yardsproducer);
        CastAndCrew yardsexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, yards);
        castAndCrewRepository.save(yardsexecProducer);
        CastAndCrew yardsexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, yards);
        castAndCrewRepository.save(yardsexecProducer2);

        Story dotBubble = new Story(
                "Dot and Bubble",
                Format.TV,
                LocalDate.of(2024, 6, 1),
                LocalDate.of(2024, 6, 1),
                "DVD/Blu-Ray (2024).",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "keywords",
                Series.SEASON12024,
                5,
                1,
                "",
                "https://tardis.wiki/wiki/Dot_and_Bubble_(TV_story)"
        );
        dotBubble.addDoctor(fifteenthDoctor);
        dotBubble.addCompanion(ruby);
        storyRepository.save(dotBubble);

        CastAndCrew dotBubblewriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, dotBubble);
        castAndCrewRepository.save(dotBubblewriter);
        CastAndCrew dotBubbledirector = new CastAndCrew(dHWilliams, "Director", CastOrCrew.CREW, dotBubble);
        castAndCrewRepository.save(dotBubbledirector);
        CastAndCrew dotBubblesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, dotBubble);
        castAndCrewRepository.save(dotBubblesRunner);
        CastAndCrew dotBubbleproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, dotBubble);
        castAndCrewRepository.save(dotBubbleproducer);
        CastAndCrew dotBubbleexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, dotBubble);
        castAndCrewRepository.save(dotBubbleexecProducer);
        CastAndCrew dotBubbleexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, dotBubble);
        castAndCrewRepository.save(dotBubbleexecProducer2);

        Story rogue = new Story(
                "Rogue",
                Format.TV,
                LocalDate.of(2024, 6, 8),
                LocalDate.of(2024, 6, 8),
                "DVD/Blu-Ray (2024).",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "keywords",
                Series.SEASON12024,
                6,
                1,
                "",
                "https://tardis.wiki/wiki/Rogue_(TV_story)"
        );
        rogue.addDoctor(fifteenthDoctor);
        rogue.addCompanion(ruby);
        rogue.addCompanion(mel);
        storyRepository.save(rogue);

        CastAndCrew roguewriter = new CastAndCrew(kHerron, "Writer", CastOrCrew.CREW, rogue);
        castAndCrewRepository.save(roguewriter);
        CastAndCrew roguewriter2 = new CastAndCrew(bRedman, "Writer", CastOrCrew.CREW, rogue);
        castAndCrewRepository.save(roguewriter2);
        CastAndCrew roguedirector = new CastAndCrew(bChessell, "Director", CastOrCrew.CREW, rogue);
        castAndCrewRepository.save(roguedirector);
        CastAndCrew roguesRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, rogue);
        castAndCrewRepository.save(roguesRunner);
        CastAndCrew rogueproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, rogue);
        castAndCrewRepository.save(rogueproducer);
        CastAndCrew rogueexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, rogue);
        castAndCrewRepository.save(rogueexecProducer);
        CastAndCrew rogueexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, rogue);
        castAndCrewRepository.save(rogueexecProducer2);

        Story legendRubyEmpireDeath = new Story(
                "The Legend of Ruby Sunday/Empire of Death",
                Format.TV,
                LocalDate.of(2024, 6, 15),
                LocalDate.of(2024, 6, 22),
                "DVD/Blu-Ray (2024).",
                "images/tennant2_gatwa_logo.png",
                "synopsis",
                "keywords",
                Series.SEASON12024,
                7,
                2,
                "",
                "https://tardis.wiki/wiki/The_Legend_of_Ruby_Sunday_(TV_story)"
        );
        legendRubyEmpireDeath.addDoctor(fifteenthDoctor);
        legendRubyEmpireDeath.addCompanion(ruby);
        storyRepository.save(legendRubyEmpireDeath);

        CastAndCrew legendRubyEmpireDeathwriter = new CastAndCrew(rtd, "Writer", CastOrCrew.CREW, legendRubyEmpireDeath);
        castAndCrewRepository.save(legendRubyEmpireDeathwriter);
        CastAndCrew legendRubyEmpireDeathdirector = new CastAndCrew(jDonoughue, "Director", CastOrCrew.CREW, legendRubyEmpireDeath);
        castAndCrewRepository.save(legendRubyEmpireDeathdirector);
        CastAndCrew legendRubyEmpireDeathsRunner = new CastAndCrew(rtd, "Showrunner", CastOrCrew.CREW, legendRubyEmpireDeath);
        castAndCrewRepository.save(legendRubyEmpireDeathsRunner);
        CastAndCrew legendRubyEmpireDeathproducer = new CastAndCrew(cMay, "Producer", CastOrCrew.CREW, legendRubyEmpireDeath);
        castAndCrewRepository.save(legendRubyEmpireDeathproducer);
        CastAndCrew legendRubyEmpireDeathexecProducer = new CastAndCrew(jGardner, "Executive Producer", CastOrCrew.CREW, legendRubyEmpireDeath);
        castAndCrewRepository.save(legendRubyEmpireDeathexecProducer);
        CastAndCrew legendRubyEmpireDeathexecProducer2 = new CastAndCrew(jTranter, "Executive Producer", CastOrCrew.CREW, legendRubyEmpireDeath);
        castAndCrewRepository.save(legendRubyEmpireDeathexecProducer2);

    }
}
