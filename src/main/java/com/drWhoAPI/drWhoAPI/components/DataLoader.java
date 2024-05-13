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

import java.time.LocalDate;

@Profile("!test")
//    @Component //Comment this out if you do not to run the data loader.
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

        Doctor firstDoctor = new Doctor ("First Doctor", "1963 - 1966", "William Hartnell",
                "A cheeky wizard and cantankerous snob who learns how to become a hero.");
        doctorRepository.save(firstDoctor);

        Doctor secondDoctor = new Doctor ("Second Doctor", "1966 - 1969", "Patrick Troughton",
                "A rumpled radical, a Chaplin-esque schemer whose appearance belies a deadly streak.");
        doctorRepository.save(secondDoctor);

        Doctor thirdDoctor = new Doctor ("Third Doctor", "1970 - 1974", "Jon Pertwee",
                "A patriarchal dandy with a compassionate streak light-years wide, bulldozing his way through the officious and banal.");
        doctorRepository.save(thirdDoctor);

        Doctor fourthDoctor = new Doctor ("Fourth Doctor", "1974 - 1980", "Tom Baker",
                "An eccentric and largely benevolent alien, emitting restrained passion and childlike moods.");
        doctorRepository.save(fourthDoctor);

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
                "Salt and sass.");
        doctorRepository.save(fifteenthDoctor);

        Doctor filmDoctor = new Doctor ("Dr. Who", "1965 - 1966", "Peter Cushing",
                "An avuncular human inventor.");
        doctorRepository.save(filmDoctor);

        Doctor warDoctor = new Doctor ("War Doctor", "2013", "John Hurt",
                "The Doctor who fought in the Time War. An increasingly tired warrior.");
        doctorRepository.save(warDoctor);

        Doctor fugitiveDoctor = new Doctor ("Fugitive Doctor", "2020 - 2022", "Jo Martin",
                "A mystery incarnation who worked for Division. Knows how to take care of herself.");
        doctorRepository.save(fugitiveDoctor);

        Doctor metacrisisDoctor = new Doctor("Metacrisis Doctor", "2008", "David Tennant",
                "A half human version of the Doctor who went a teensy bit genocidal.");
        doctorRepository.save(metacrisisDoctor);

        Doctor unboundDoctor = new Doctor ("Unbound Doctor", "2003 - ", "Various Actors",
                "A Doctor from a story free from constraints of continuity.");
        doctorRepository.save(unboundDoctor);

        Doctor doctorMoon = new Doctor("Doctor Moon", "2008", "Colin Salmon",
                "The Doctor's consciousness uploaded to the Library's moon.");
        doctorRepository.save(doctorMoon);

        Doctor curator = new Doctor("The Curator", "2013", "Tom Baker",
                "A future, retired incarnation of the Doctor revisiting the appearance of his fourth incarnation.");
        doctorRepository.save(curator);


        Companion susan = new Companion ("Susan", "Foreman", "", "1963 - 1964", "Carole Ann Ford",
                "The Doctor's granddaughter, a precocious but frail teenager who dotes on her grandfather but has a burgeoning desire to settle down rather than constantly travelling.");
        companionRepository.save(susan);

        Companion babs = new Companion ("Barbara", "Wright", "", "1963 – 1965",
                "Jacqueline Hill", "");
        companionRepository.save(babs);

        Companion ian = new Companion ("Ian", "Chesterton", "", "1963 – 1965", "William Russell", "");
        companionRepository.save(ian);

        Companion vicki = new Companion ("Vicki", "", "", "1965", "Maureen O’Brien", "");
        companionRepository.save(vicki);

        Companion steven = new Companion ("Steven", "Taylor", "", "1965 – 1966", "Peter Purves", "");
        companionRepository.save(steven);

        Companion katarina = new Companion ("Katarina", "", "", "1965", "Adrienne Hill", "");
        companionRepository.save(katarina);

        Companion saraK = new Companion ("Sara", "Kingdom", "", "1965 – 1966", "Jean Marsh", "");
        companionRepository.save(saraK);

        Companion dodo = new Companion ("Dorothea", "Chaplet", "Dodo", "1966", "Jackie Lane", "");
        companionRepository.save(dodo);

        Companion ben = new Companion ("Ben", "Jackson", "", "Michael Craze", "1966 – 1967", "");
        companionRepository.save(ben);

        Companion polly = new Companion ("Polly", "", "", "Anneke Wills", "1966 – 1967", "");
        companionRepository.save(polly);

        Companion jamie = new Companion ("Jamie", "McCrimmon", "", "1966 – 1969",
                "Frazer Hines", "");
        companionRepository.save(jamie);

        Companion victoria = new Companion ("Victoria", "Waterfield", "", "1967 – 1968",
                "Deborah Watling", "");
        companionRepository.save(victoria);

        Companion zoe = new Companion ("Zoe", "Heriot", "", "1968 – 1969", "Wendy Padbury", "");
        companionRepository.save(zoe);

        Companion brigadier = new Companion ("Alastair Gordon", "Lethbridge-Stewart",
                "The Brigadier", "1970 – 1975", "Nicholas Courtney", "");
        companionRepository.save(brigadier);

        Companion liz = new Companion ("Liz", "Shaw", "", "1970", "Caroline John", "");
        companionRepository.save(liz);

        Companion benton = new Companion ("John", "Benton", "Sergeant Benton", "1970 – 1975", "John Levene", "");
        companionRepository.save(benton);

        Companion jo = new Companion ("Jo", "Grant", "", "1971 – 1973", "Katy Manning",
                "");
        companionRepository.save(jo);

        Companion yates = new Companion ("Mike", "Yates", "Captain Yates", "1971 – 1974", "Richard Franklin", "");
        companionRepository.save(yates);

        Companion sarahJane = new Companion ("Sarah Jane", "Smith", "", "1973 – 1976",
                "Elisabeth Sladen", "");
        companionRepository.save(sarahJane);

        Companion harry = new Companion ("Harry", "Sullivan", "", "1974 – 1975", "Ian Marter", "");
        companionRepository.save(harry);

        Companion leela = new Companion ("Leela", "", "", "1977 – 1978", "Louise Jameson", "");
        companionRepository.save(leela);

        Companion k9 = new Companion ("K9", "", "", "1977 – 1981", "John Leeson/David Brierly", "");
        companionRepository.save(k9);

        Companion romanaOne = new Companion ("Romana", "", "Romana I", "1978 – 1979", "Mary Tamm", "");
        companionRepository.save(romanaOne);

        Companion romanaTwo = new Companion ("Romana", "", "Romana II", "1979 – 1981", "Lalla Ward", "");
        companionRepository.save(romanaTwo);

        Companion adric = new Companion ("Adric", "", "", "1980 – 1982", "Matthew Waterhouse", "");
        companionRepository.save(adric);

        Companion tegan = new Companion ("Tegan", "Jovanka", "", "1981 – 1984", "Janet Fielding", "");
        companionRepository.save(tegan);

        Companion nyssa = new Companion ("Nyssa", "", "", "1981 – 1983", "Sarah Sutton",
                "");
        companionRepository.save(nyssa);

        Companion turlough = new Companion ("Vislor", "Turlough", "Turlough", "1983 – 1984", "Mark Strickson", "");
        companionRepository.save(turlough);

        Companion kamelion = new Companion("Kamelion", "", "", "1983 – 1984", "Gerald Flood (voice)", "");
        companionRepository.save(kamelion);

        Companion peri = new Companion ("Peri", "Brown", "", "1984 – 1986", "Nicola Bryant", "");
        companionRepository.save(peri);

        Companion mel = new Companion ("Mel", "Bush", "", "1986 – 1987", "Bonnie Langford", "");
        companionRepository.save(mel);

        Companion ace = new Companion ("Dorothy", "", "Ace", "1987 – 1989", "Sophie Aldred", "");
        companionRepository.save(ace);

        Companion grace = new Companion ("Grace", "Holloway", "", "1996", "Daphne Ashbrook", "");
        companionRepository.save(grace);

        Companion rose = new Companion ("Rose", "Tyler", "", "2005 – 2006", "Billie Piper", "");
        companionRepository.save(rose);

        Companion adam = new Companion("Adam", "Mitchell", "", "2005", "Bruno Langley",
                "");
        companionRepository.save(adam);

        Companion jack = new Companion("Jack", "Harkness", "Captain Jack", "2005", "John Barrowman", "");
        companionRepository.save(jack);

        Companion mickey = new Companion ("Mickey", "Smith", "", "2005 – 2006", "Noel Clarke", "");
        companionRepository.save(mickey);

        Companion martha = new Companion ("Martha", "Jones", "", "2007 – 2008", "Freema Agyeman", "");
        companionRepository.save(martha);

        Companion astrid = new Companion("Astrid", "Peth", "", "2007", "Kyle Minogue", "");
        companionRepository.save(astrid);

        Companion donna = new Companion ("Donna", "Noble", "", "2008, 2023", "Catherine Tate", "");
        companionRepository.save(donna);

        Companion jTyler = new Companion("Jackie", "Tyler", "", "2005 - 2006, 2008", "Camille Coduri", "");
        companionRepository.save(jTyler);

        Companion jacksonLake = new Companion ("Jackson", "Lake", "", "2008", "David Morrissey", "");
        companionRepository.save(jacksonLake);

        Companion ladyChristina = new Companion ("Christina", "de Souza", "Lady Christina", "2009", "Michelle Ryan", "");
        companionRepository.save(ladyChristina);

        Companion adelaide = new Companion ("Adelaide", "Brooke", "", "2009", "Lindsay Duncan", "");
        companionRepository.save(adelaide);

        Companion wilf = new Companion ("Wilfred", "Mott", "Wilf", "2009 – 2010", "Bernard Cribbins", "");
        companionRepository.save(wilf);

        Companion amy = new Companion ("Amy", "Pond", "", "2010 – 2012", "Karen Gillan",
                "");
        companionRepository.save(amy);

        Companion rory = new Companion ("Rory", "Williams", "", "2010 – 2012", "Arthur Darvill", "");
        companionRepository.save(rory);

        Companion clara = new Companion ("Clara", "Oswald", "", "2012 – 2015", "Jenna Coleman", "");
        companionRepository.save(clara);

        Companion bill = new Companion ("Bill", "Potts", "", "2017", "Pearl Mackie", "");
        companionRepository.save(bill);

        Companion nardole = new Companion ("Nardole", "", "", "2017", "Matt Lucas", "");
        companionRepository.save(nardole);

        Companion graham = new Companion ("Graham", "O’Brien", "", "2018 – 2021",
                "Bradley Walsh", "");
        companionRepository.save(graham);

        Companion yaz = new Companion ("Yasmin", "Khan", "Yaz", "2018 – 2022", "Mandip Gill", "");
        companionRepository.save(yaz);

        Companion ryan = new Companion ("Ryan", "Sinclair", "", "2018 – 2021", "Tosin Cole", "");
        companionRepository.save(ryan);

        Companion dan = new Companion ("Dan", "Lewis", "", "2021 – 2022", "John Bishop",
                "");
        companionRepository.save(dan);

        Companion ruby = new Companion ("Ruby", "Sunday", "", "2023 - ", "Millie Gibson",
                "");
        companionRepository.save(ruby);

        Person coburn = new Person("Anthony Coburn", "Writer");
        personRepository.save(coburn);
        Person aaronovitch = new Person("Ben Aaronovitch", "Writer");
        personRepository.save(aaronovitch);
        Person dAdams = new Person("Douglas Adams", "Writer and Script Editor (1979 - 1980)");
        personRepository.save(dAdams);
        Person mAlderton = new Person("Maxine Alderton", "Writer");
        personRepository.save(mAlderton);
        Person cBailey = new Person("Christopher Bailey", "Writer");
        personRepository.save(cBailey);
        Person bBaker = new Person("Bob Baker", "Writer");
        personRepository.save(bBaker);
        Person pipNjane = new Person("Pip and Jane Baker", "Writing duo");
        personRepository.save(pipNjane);
        Person mbartlett = new Person("Mike Bartlett", "Writer");
        personRepository.save(mbartlett);
        Person bidmead = new Person("Christopher H. Bidmead", "Writer and Doctor Who Script Editor (1980 - 1981)");
        personRepository.save(bidmead);
        Person iSBlack = new Person("Ian Stuart Black", "Writer");
        personRepository.save(iSBlack);
        Person mBlackman = new Person("Malorie Blackman", "Writer");
        personRepository.save(mBlackman);
        Person cBoucher = new Person("Chris Boucher", "Writer");
        personRepository.save(cBoucher);
        Person iBriggs = new Person("Ian Briggs", "Writer");
        personRepository.save(iBriggs);
        Person jByrne = new Person("Johnny Byrne", "Writer");
        personRepository.save(jByrne);
        Person chibnall = new Person("Chris Chibnall", "Writer and Doctor Who Showrunner (2018 - 2022)");
        personRepository.save(chibnall);
        Person kClarke = new Person("Kevin Clarke", "Writer");
        personRepository.save(kClarke);
        Person bClegg = new Person("Barbara Clegg", "Writer");
        personRepository.save(bClegg);
        Person pCornell = new Person("Paul Cornell", "Writer");
        personRepository.save(pCornell);
        Person dCotton = new Person("Donald Cotton", "Writer");
        personRepository.save(dCotton);
        Person cottrellboyce = new Person("Frank Cottrell-Boyce", "Writer");
        personRepository.save(cottrellboyce);
        Person nCross = new Person("Neil Cross", "Writer");
        personRepository.save(nCross);
        Person gCurry = new Person("Graeme Curry", "Writer");
        personRepository.save(gCurry);
        Person rCurtis = new Person("Richard Curtis", "Writer");
        personRepository.save(rCurtis);
        Person rtd = new Person("Russell T. Davies", "Writer and Doctor Who Showrunner (2005 - 2010, 2023 - )");
        personRepository.save(rtd);
        Person gDavis = new Person("Gerry Davies", "Writer and Doctor Who Script Editor (1966 - 1967)");
        personRepository.save(gDavis);
        Person terranceD = new Person("Terrance Dicks", "Writer and Doctor Who Script Editor (1968 - 1974)");
        personRepository.save(terranceD);
        Person sDollard = new Person("Sarah Dollard", "Writer");
        personRepository.save(sDollard);
        Person tDudley = new Person("Terence Dudley", "Writer and Director");
        personRepository.save(tDudley);
        Person dEllis = new Person("David Ellis", "Writer");
        personRepository.save(dEllis);
        Person wEmms = new Person("William Emms", "Writer");
        personRepository.save(wEmms);
        Person pErickson = new Person("Paul Erickson", "Writer");
        personRepository.save(pErickson);
        Person dFisher = new Person("David Fisher", "Writer");
        personRepository.save(dFisher);
        Person jFlanagan = new Person("John Flanagan", "Writer");
        personRepository.save(jFlanagan);
        Person pFord = new Person("Phil Ford", "Writer");
        personRepository.save(pFord);
        Person gaiman = new Person("Neil Gaiman", "Writer");
        personRepository.save(gaiman);
        Person sGallagher = new Person("Stephen Gallagher", "Writer");
        personRepository.save(sGallagher);
        Person gatiss = new Person("Mark Gattiss", "Writer and Actor");
        personRepository.save(gatiss);
        Person mGraham = new Person("Matthew Graham", "Writer");
        personRepository.save(mGraham);
        Person greenhorn = new Person("Stephen Greenhorn", "Writer");
        personRepository.save(greenhorn);
        Person grimwade = new Person("Peter Grimwade", "Writer and Director");
        personRepository.save(grimwade);
        Person mHaisman = new Person("Mervyn Haisman", "Writer");
        personRepository.save(mHaisman);
        Person harness = new Person("Peter Harness", "Writer");
        personRepository.save(harness);
        Person greifer = new Person("Lewis Greifer", "Writer");
        personRepository.save(greifer);
        Person hayles = new Person("Brian Hayles", "Writer");
        personRepository.save(hayles);
        Person hime = new Person("Ed Hime", "Writer");
        personRepository.save(hime);
        Person holmes = new Person("Robert Holmes", "Writer and Doctor Who Script Editor (1974 - 1977)");
        personRepository.save(holmes);
        Person houghton = new Person("Don Houghton", "Writer");
        personRepository.save(houghton);
        Person hulke = new Person("Malcolm Hulke", "Writer");
        personRepository.save(hulke);
        Person mJacobs = new Person("Matthew Jacobs", "Writer");
        personRepository.save(mJacobs);
        Person cJames = new Person("Charlene James", "Writer");
        personRepository.save(cJames);
        Person eJones = new Person("Elwyn Jones", "Writer");
        personRepository.save(eJones);
        Person gJones = new Person("Glyn Jones", "Writer and Actor");
        personRepository.save(gJones);
        Person mJones = new Person("Matt Jones", "Writer");
        personRepository.save(mJones);
        Person kohll = new Person("Malcolm Kohll", "Writer");
        personRepository.save(kohll);
        Person bLetts = new Person("Barry Letts", "Writer, Director; Doctor Who Producer (1970 - 1975), Executive Producer (1980 - 1981)");
        personRepository.save(bLetts);
        Person hLincoln = new Person("Henry Lincoln", "Writer");
        personRepository.save(hLincoln);
        Person ling = new Person("Peter Ling", "Writer");
        personRepository.save(ling);
        Person lucarotti = new Person("John Lucarotti", "Writer");
        personRepository.save(lucarotti);
        Person tMacrae = new Person("Tom MacRae", "Writer");
        personRepository.save(tMacrae);
        Person lMarks = new Person("Louis Marks", "Writer");
        personRepository.save(lMarks);
        Person dMartin = new Person("Dave Martin", "Writer");
        personRepository.save(dMartin);
        Person pMartin = new Person("Philip Martin", "Writer");
        personRepository.save(pMartin);
        Person mathieson = new Person("Jamie Mathieson", "Writer");
        personRepository.save(mathieson);
        Person gMcCoy = new Person("Glen McCoy", "Writer");
        personRepository.save(gMcCoy);
        Person aMcculloch = new Person("Andrew McCulloch", "Writer");
        personRepository.save(aMcculloch);
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
        Person tNation = new Person("Terry Nation", "Writer");
        personRepository.save(tNation);
        Person prNewman = new Person("Peter R. Newman", "Writer");
        personRepository.save(prNewman);
        Person nye = new Person("Simon Nye", "Writer");
        personRepository.save(nye);
        Person orme = new Person("Geoffrey Orme", "Writer");
        personRepository.save(orme);
        Person vPatel = new Person("Vinay Patel", "Writer");
        personRepository.save(vPatel);
        Person pedler = new Person("Kit Pedler", "Writer and Scientific Advisor");
        personRepository.save(pedler);
        Person pemberton = new Person("Victor Pemberton", "Writer and Doctor Who Script Editor (1967)");
        personRepository.save(pemberton);
        Person platt = new Person("Marc Platt", "Writer");
        personRepository.save(platt);
        Person pringle = new Person("Eric Pringle", "Writer");
        personRepository.save(pringle);
        Person tRay = new Person("Trevor Ray", "Writer");
        personRepository.save(tRay);
        Person raynor = new Person("Helen Raynor", "Writer and Doctor Who Script Editor (2005 - 2008)");
        personRepository.save(raynor);
        Person aRead = new Person("Anthony Read", "Writer and Doctor Who Script Editor (1977 - 1979)");
        personRepository.save(aRead);
        Person eRoad = new Person("Ella Road", "Writer");
        personRepository.save(eRoad);
        Person gRoberts = new Person("Gareth Roberts", "Writer");
        personRepository.save(gRoberts);
        Person saward = new Person("Eric Saward", "Writer and Doctor Who Script Editor (1982 - 1986)");
        personRepository.save(saward);
        Person lScott = new Person("Lesley Scott", "Writer");
        personRepository.save(lScott);
        Person shearman = new Person("Rob Shearman", "Writer");
        personRepository.save(shearman);
        Person sherwin = new Person("Derrick Sherwin", "Writer, Script Editor (1968), Producer 1969 - 1970");
        personRepository.save(sherwin);
        Person sloman = new Person("Robert Sloman", "Writer");
        personRepository.save(sloman);
        Person aSmith = new Person("Andrew Smith", "Writer");
        personRepository.save(aSmith);
        Person spooner = new Person("Dennis Spooner", "Writer and Doctor Who Script Editor (1964 - 1965)");
        personRepository.save(spooner);
        Person aSteven = new Person("Anthony Steven", "Writer");
        personRepository.save(aSteven);
        Person rBanksStewart = new Person("Robert Banks Stewart", "Writer");
        personRepository.save(rBanksStewart);
        Person strutton = new Person("Bill Strutton", "Writer");
        personRepository.save(strutton);
        Person kTemple = new Person("Keith Temple", "Writer");
        personRepository.save(kTemple);
        Person sThompson = new Person("Stephen Thompson", "Writer");
        personRepository.save(sThompson);
        Person tosh = new Person("Donald Tosh", "Writer and Script Editor (1965 - 1966)");
        personRepository.save(tosh);
        Person treganna = new Person("Catherine Treganna", "Writer");
        personRepository.save(treganna);
        Person dWhitaker = new Person("David Whitaker", "Writer and Doctor Who Script Editor (1963 b- 1964)");
        personRepository.save(dWhitaker);
        Person whithouse = new Person("Toby Whithouse", "Writer");
        personRepository.save(whithouse);
        Person jWilkinson = new Person("Joy Wilkinson", "Writer");
        personRepository.save(jWilkinson);
        Person wyatt = new Person("Stephen Wyatt", "Writer");
        personRepository.save(wyatt);
        Person pBryant = new Person("Peter Bryant", "Doctor Who: Script Editor (1967 - 1968) and Producer (1967 - 1969)");
        personRepository.save(pBryant);
        Person root = new Person("Anthony Root", "Doctor Who Script Editor (1981 - 1982)");
        personRepository.save(root);
        Person cartmel = new Person("Andrew Cartmel", "Doctor Who Script Editor (1987 - 1989) and writer");
        personRepository.save(cartmel);
        Person verity = new Person("Verity Lambert", "Doctor Who Producer 1963 - 1965)");
        personRepository.save(verity);
        Person wiles = new Person("John Wiles", "Doctor Who Producer 1965 - 1966)");
        personRepository.save(wiles);
        Person iLloyd = new Person("Innes Lloyd", "Doctor Who Producer 1966 - 1968)");
        personRepository.save(iLloyd);
        Person hinchcliffe = new Person("Philip Hinchcliffe", "Doctor Who Producer (1975 - 1977) and writer");
        personRepository.save(hinchcliffe);
        Person gWilliams = new Person("Graham Williams", "Doctor Who Producer (1977 - 1980)");
        personRepository.save(gWilliams);
        Person jnt = new Person("John Nathan-Turner", "Doctor Who Producer (1980 - 1989)");
        personRepository.save(jnt);
        Person peterWare = new Person("Peter V. Ware", "Doctor Who Producer (1996)");
        personRepository.save(peterWare);
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
        Person cAllen = new Person("Christopher Allen", "Director");
        personRepository.save(cAllen);
        Person bAnderson = new Person("Bill Anderson", "Director");
        personRepository.save(bAnderson);
        Person sAprahamian = new Person("Sallie Aprahamian", "Director");
        personRepository.save(sAprahamian);
        Person aLaufer = new Person("Annetta Laufer", "Director");
        personRepository.save(aLaufer);
        Person mLeggo = new Person("Michael Leggo", "Director");
        personRepository.save(mLeggo);
        Person eurosLyn = new Person("Euros Lyn", "Director");
        personRepository.save(eurosLyn);
        Person cBarry = new Person("Christopher Barry", "Director");
        personRepository.save(cBarry);
        Person mBarry = new Person("Morris Barry", "Director");
        personRepository.save(mBarry);
        Person eBazalgette = new Person("Ed Bazalgette", "Director");
        personRepository.save(eBazalgette);
        Person rBennett = new Person("Rodney Bennett", "Director");
        personRepository.save(rBennett);
        Person pBernard = new Person("Paul Bernard", "Director");
        personRepository.save(pBernard);
        Person lBickford = new Person("Lovett Bickford", "Director");
        personRepository.save(lBickford);
        Person jBlack = new Person("John Black", "Director");
        personRepository.save(jBlack);
        Person fBlackburn = new Person("Farren Blackburn", "Director");
        personRepository.save(fBlackburn);
        Person dBlake = new Person("Darrol Blake", "Director");
        personRepository.save(dBlake);
        Person gBlake = new Person("Gerald Blake", "Director");
        personRepository.save(gBlake);
        Person kBoak = new Person("Keith Boak", "Director");
        personRepository.save(kBoak);
        Person mEBriant = new Person("Michael E. Briant", "Director");
        personRepository.save(mEBriant);
        Person aBromly = new Person("Alan Bromly", "Director");
        personRepository.save(aBromly);
        Person dCamfield = new Person("Douglas Camfield", "Director");
        personRepository.save(dCamfield);
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
        Person cClough = new Person("Chris Clough", "Director");
        personRepository.save(cClough);
        Person tCombe = new Person("Timothy Combe", "Director");
        personRepository.save(tCombe);
        Person jCrockett = new Person("John Crockett", "Director");
        personRepository.save(jCrockett);
        Person fCox = new Person("Frank Cox", "Director");
        personRepository.save(fCox);
        Person fCumming = new Person("Fiona Cumming", "Director");
        personRepository.save(fCumming);
        Person jDavies = new Person("John Davies", "Director");
        personRepository.save(jDavies);
        Person hDavid = new Person("Hugh David", "Director");
        personRepository.save(hDavid);
        Person jDonoughue = new Person("Jamie Donoughue", "Director");
        personRepository.save(jDonoughue);
        Person mFerguson = new Person("Michael Ferguson", "Director");
        personRepository.save(mFerguson);
        Person sFolkson = new Person("Sheree Folkson", "Director");
        personRepository.save(sFolkson);
        Person aGoddard = new Person("Andy Goddard", "Director");
        personRepository.save(aGoddard);
        Person dGoodwin = new Person("Derrick Goodwin", "Director");
        personRepository.save(dGoodwin);
        Person jGorrie = new Person("John Gorrie", "Director");
        personRepository.save(jGorrie);
        Person lGough = new Person("Lawrence Gough", "Director");
        personRepository.save(lGough);
        Person bGrant = new Person("Brian Grant", "Director");
        personRepository.save(bGrant);
        Person kGrieve = new Person("Ken Grieve", "Director");
        personRepository.save(kGrieve);
        Person aGunn = new Person("Andrew Gunn", "Director");
        personRepository.save(aGunn);
        Person mHart = new Person("Michael Hart", "Director");
        personRepository.save(mHart);
        Person jHayes = new Person("John Hayes", "Director");
        personRepository.save(jHayes);
        Person jHawes = new Person("James Hawes", "Director");
        personRepository.save(jHawes);
        Person gHarper = new Person("Graeme Harper", "Director, Production Assistant, Assistant Floor Manager.");
        personRepository.save(gHarper);
        Person mHayes = new Person("Michael Hayes", "Director");
        personRepository.save(mHayes);
        Person sHellings = new Person("Sarah Hellings", "Director");
        personRepository.save(sHellings);
        Person tHaynes = new Person("Toby Haynes", "Director");
        personRepository.save(tHaynes);
        Person pHoar = new Person("Peter Hoar", "Director");
        personRepository.save(pHoar);
        Person nHurran = new Person("Nick Hurran", "Director");
        personRepository.save(nHurran);
        Person wHussein = new Person("Waris Hussein", "Director");
        personRepository.save(wHussein);
        Person hHirsch = new Person("Henric Hirsch", "Director");
        personRepository.save(hHirsch);
        Person mImison = new Person("Michael Imison", "Director");
        personRepository.save(mImison);
        Person sHughes = new Person("Steve Hughes", "Director");
        personRepository.save(sHughes);
        Person lHJones = new Person("Lee Haven Jones", "Director");
        personRepository.save(lHJones);
        Person rJones = new Person("Ron Jones", "Director");
        personRepository.save(rJones);
        Person pJoyce = new Person("Paul Joyce", "Director");
        personRepository.save(pJoyce);
        Person mKerrigan = new Person("Michael Kerrigan", "Director");
        personRepository.save(mKerrigan);
        Person mKing = new Person("Mat King", "Director");
        personRepository.save(mKing);
        Person hMacDonald = new Person("Hettie MacDonald", "Director");
        personRepository.save(hMacDonald);
        Person dMacKinnon = new Person("Douglas MacKinnon", "Director");
        personRepository.save(dMacKinnon);
        Person jMStone = new Person("Jamie Magnus Stone", "Director");
        personRepository.save(jMStone);
        Person nMallett = new Person("Nicholas Mallett", "Director");
        personRepository.save(nMallett);
        Person dMaloney = new Person("David Maloney", "Director");
        personRepository.save(dMaloney);
        Person nManzoor = new Person("Nida Manzoor", "Director");
        personRepository.save(nManzoor);
        Person dMartinus = new Person("Derek Martinus", "Director");
        personRepository.save(dMartinus);
        Person rMartin = new Person("Richard Martin", "Director");
        personRepository.save(rMartin);
        Person lMayne = new Person("Lennie Mayne", "Director");
        personRepository.save(lMayne);
        Person kMcBain = new Person("Kenny McBain", "Director");
        personRepository.save(kMcBain);
        Person cMcCarthy = new Person("Colm McCarthy", "Director");
        personRepository.save(cMcCarthy);
        Person sMetzstein = new Person("Saul Metzstein", "Director");
        personRepository.save(sMetzstein);
        Person pMoffatt = new Person("Peter Moffatt", "Director");
        personRepository.save(pMoffatt);
        Person mLeestonSmith = new Person("Michael Leeston-Smith", "Director");
        personRepository.save(mLeestonSmith);
        Person gMill = new Person("Gerry Mill", "Director");
        personRepository.save(gMill);
        Person jMolotnikov = new Person("Justin Molotnikov", "Director");
        personRepository.save(jMolotnikov);
        Person aMorgan = new Person("Andrew Morgan", "Director");
        personRepository.save(aMorgan);
        Person mOMorris = new Person("Michael Owen Morris", "Director");
        personRepository.save(mOMorris);
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
        Person mPinfield = new Person("Mervyn Pinfield", "Director and Associate Producer.");
        personRepository.save(mPinfield);
        Person mRidge = new Person("Mary Ridge", "Director");
        personRepository.save(mRidge);
        Person pRoberts = new Person("Pennant Roberts", "Director");
        personRepository.save(pRoberts);
        Person mRobinson = new Person("Matthew Robinson", "Director");
        personRepository.save(mRobinson);
        Person jARobinson = new Person("Julie Anne Robinson", "Director");
        personRepository.save(jARobinson);
        Person pRussell = new Person("Paddy Russell", "Director");
        personRepository.save(pRussell);
        Person gSax = new Person("Geoffrey Sax", "Director");
        personRepository.save(gSax);
        Person aSaleem = new Person("Azhur Saleem", "Director");
        personRepository.save(aSaleem);
        Person bSellars = new Person("Bill Sellars", "Director");
        personRepository.save(bSellars);
        Person rSenior = new Person("Richard Senior", "Director");
        personRepository.save(rSenior);
        Person jSimpson = new Person("Julian Simpson", "Director");
        personRepository.save(jSimpson);
        Person adamSmith = new Person("Adam Smith", "Director");
        personRepository.save(adamSmith);
        Person jSmith = new Person("Julia Smith", "Director");
        personRepository.save(jSmith);
        Person gSpentonFoster = new Person("George Spenton-Foster", "Director");
        personRepository.save(gSpentonFoster);
        Person nStewart = new Person("Norman Stewart", "Director, Production Assistant");
        personRepository.save(nStewart);
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
        Person rTucker = new Person("Rex Tucker", "Director, Producer");
        personRepository.save(rTucker);
        Person tdVCole = new Person("Tristan de Vere Cole", "Director");
        personRepository.save(tdVCole);
        Person tVirgo = new Person("Tony Virgo", "Director");
        personRepository.save(tVirgo);
        Person hWang = new Person("Haolu Wang", "Director");
        personRepository.save(hWang);
        Person aWareing = new Person("Alan Wareing", "Director");
        personRepository.save(aWareing);
        Person aWay = new Person("Ashley Way", "Director");
        personRepository.save(aWay);
        Person jWebb = new Person("Jeremy Webb", "Director");
        personRepository.save(jWebb);
        Person bWheatley = new Person("Ben Wheatley", "Director");
        personRepository.save(bWheatley);
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


        User andrewB = new
                User("andrew.blair.work@gmail.com",
                "aagb1884", "Scotland",
                "userImgURL", "Andrew Blair is a software developer, writer and performer. He writes regularly about Doctor Who for Den of Geek.",
                "www.andrewblair.co.uk");
        userRepository.save(andrewB);

        Story unearthly = new Story
                ("An Unearthly Child",
                        Format.TV,
                        LocalDate.of(1963, 11, 23),
                        LocalDate.of(1963, 12, 14),
                        "Novelisation (1981), Script Book (1988), VHS (1990, 2000), DVD (2006).",
                        "img_url",
                        "The first ever story, where schoolteachers Ian Chesterton and Barbara Wright find their pupil Susan Foreman is even stranger than they first thought.",
                        "Totters Lane; junkyard; cavemen; cave people; cave men; skull; rock; Foreman; The Cave of Skulls; The Forest of Fear; The Firemaker; Tribe of Gum; 100,000 BC",
                        Series.SEASON1,
                        1,
                        4,
                        "A",
                        "https://tardis.wiki/wiki/An_Unearthly_Child_(TV_story)");
        unearthly.addDoctor(firstDoctor);
        unearthly.addCompanion(susan);
        unearthly.addCompanion(ian);
        unearthly.addCompanion(babs);
        storyRepository.save(unearthly);
        CastAndCrew writerAUC = new CastAndCrew(coburn, "Writer", CastOrCrew.CREW, unearthly);
        castAndCrewRepository.save(writerAUC);
        CastAndCrew directorAUC = new CastAndCrew(wHussein, "Director", CastOrCrew.CREW, unearthly);
        castAndCrewRepository.save(directorAUC);
        CastAndCrew sEditorAUC = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, unearthly);
        castAndCrewRepository.save(sEditorAUC);
        CastAndCrew producerAUC = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, unearthly);
        castAndCrewRepository.save(producerAUC);

        CastAndCrew unearthlydirector = new CastAndCrew(wHussein, "Director", CastOrCrew.CREW, unearthly);
        castAndCrewRepository.save(unearthlydirector);
        CastAndCrew unearthlysEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, unearthly);
        castAndCrewRepository.save(unearthlysEditor);
        CastAndCrew unearthlyproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, unearthly);
        castAndCrewRepository.save(unearthlyproducer);

        Story theDaleks = new Story(
                "The Daleks",
                Format.TV,
                LocalDate.of(1963, 12, 21),
                LocalDate.of(1964, 2, 1),
                "Novelisation (1964, 1973), Film Adaptation (1965), VHS (1989, 2001), DVD (2006), TV Colourisation (2023), Blu-Ray (2024).",
                "img_url",
                "The debut of the Daleks, who would ensure the success and survival of the show.",
                "The Mutants; The Dead Planet; The Survivors; The Escape; The Ambush; The Expedition; The Ordeal; The Rescue; Skaro; Thals; first appearance; introduction",
                Series.SEASON1,
                2,
                7,
                "B",
                "https://tardis.wiki/wiki/The_Daleks_(TV_story)");
        theDaleks.addDoctor(firstDoctor);
        theDaleks.addCompanion(susan);
        theDaleks.addCompanion(ian);
        theDaleks.addCompanion(babs);
        storyRepository.save(theDaleks);
        CastAndCrew writerTD = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, theDaleks);
        castAndCrewRepository.save(writerTD);
        CastAndCrew theDaleksdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, theDaleks);
        castAndCrewRepository.save(theDaleksdirector);
        CastAndCrew theDaleksdirector2 = new CastAndCrew(rMartin, "Director", CastOrCrew.CREW, theDaleks);
        castAndCrewRepository.save(theDaleksdirector2);
        CastAndCrew theDalekssEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, theDaleks);
        castAndCrewRepository.save(theDalekssEditor);
        CastAndCrew theDaleksproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, theDaleks);
        castAndCrewRepository.save(theDaleksproducer);


        Story edgeDestruction = new Story(
                "The Edge of Destruction",
                Format.TV,
                LocalDate.of(1964, 2, 8),
                LocalDate.of(1964, 2, 15),
                "Novelisation (1988), VHS (2000), DVD (2006), Audiobook (2010).",
                "img_url",
                "The Doctor and his travelling companions grow fractious and paranoid when they are trapped on board and increasingly strange TARDIS.",
                "The Brink of Disaster; TARDIS; scissors; clock; melt; Inside the Spaceship",
                Series.SEASON1,
                3,
                4, "C",
                "https://tardis.wiki/wiki/The_Edge_of_Destruction_(TV_story)");
        edgeDestruction.addDoctor(firstDoctor);
        edgeDestruction.addCompanion(susan);
        edgeDestruction.addCompanion(ian);
        edgeDestruction.addCompanion(babs);
        storyRepository.save(edgeDestruction);
        CastAndCrew writerEoD = new CastAndCrew(dWhitaker, "Writer", CastOrCrew.CREW, edgeDestruction);
        castAndCrewRepository.save(writerEoD);
        CastAndCrew edgeDestructiondirector = new CastAndCrew(rMartin, "Director", CastOrCrew.CREW, edgeDestruction);
        castAndCrewRepository.save(edgeDestructiondirector);
        CastAndCrew edgeDestructiondirector2 = new CastAndCrew(fCox, "Director", CastOrCrew.CREW, edgeDestruction);
        castAndCrewRepository.save(edgeDestructiondirector2);
        CastAndCrew edgeDestructionsEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, edgeDestruction);
        castAndCrewRepository.save(edgeDestructionsEditor);
        CastAndCrew edgeDestructionproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, edgeDestruction);
        castAndCrewRepository.save(edgeDestructionproducer);

        Story marcoPolo = new Story(
                "Marco Polo",
                Format.TV,
                LocalDate.of(1964, 2, 22),
                LocalDate.of(1964, 4, 4),
                "Novelisation (1984), Audio (2003), Reconstruction/DVD (2006), Audiobook (2018).",
                "img_url",
                "Arriving in Central Asia in 1269, the Doctor and his friends join the caravan of the Venetian explorer Marco Polo.",
                "Historical; Missing Episode; The Roof of the World; The Singing Sands; Five Hundred Eyes; The Wall of Lies; Rider from Shang-Tu; Mighty Kublai Khan; Assassin at Peking",
                Series.SEASON1,
                4,
                7,
                "D",
                "https://tardis.wiki/wiki/Marco_Polo_(TV_story)");
        marcoPolo.addDoctor(firstDoctor);
        marcoPolo.addCompanion(susan);
        marcoPolo.addCompanion(ian);
        marcoPolo.addCompanion(babs);
        storyRepository.save(marcoPolo);
        CastAndCrew marcoPolowriter = new CastAndCrew(lucarotti, "Writer", CastOrCrew.CREW, marcoPolo);
        castAndCrewRepository.save(marcoPolowriter);
        CastAndCrew marcoPolodirector = new CastAndCrew(wHussein, "Director", CastOrCrew.CREW, marcoPolo);
        castAndCrewRepository.save(marcoPolodirector);
        CastAndCrew marcoPolodirectorw = new CastAndCrew(jCrockett, "Director", CastOrCrew.CREW, marcoPolo);
        castAndCrewRepository.save(marcoPolodirectorw);
        CastAndCrew marcoPolosEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, marcoPolo);
        castAndCrewRepository.save(marcoPolosEditor);
        CastAndCrew marcoPoloproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, marcoPolo);
        castAndCrewRepository.save(marcoPoloproducer);

        Story keysMarinus = new Story(
                "The Keys of Marinus",
                Format.TV,
                LocalDate.of(1964, 4, 11),
                LocalDate.of(1964, 5, 16),
                "Novelisation (1980), VHS (1999), DVD (2009).",
                "img_url",
                "The TARDIS crew quest across different parts of the planet to find the four keys of Marinus.",
                "The Sea of Death; The Velvet Web; The Screaming Jungle; The Snows of Terror; Sentence of Death; Voord; Arbitan",
                Series.SEASON1,
                5,
                6,
                "E",
                "https://tardis.wiki/wiki/The_Keys_of_Marinus_(TV_story)");
        keysMarinus.addDoctor(firstDoctor);
        keysMarinus.addCompanion(susan);
        keysMarinus.addCompanion(ian);
        keysMarinus.addCompanion(babs);
        storyRepository.save(keysMarinus);
        CastAndCrew writerKM = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, keysMarinus);
        castAndCrewRepository.save(writerKM);
        CastAndCrew keysMarinusdirector = new CastAndCrew(jGorrie, "Director", CastOrCrew.CREW, keysMarinus);
        castAndCrewRepository.save(keysMarinusdirector);
        CastAndCrew keysMarinussEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, keysMarinus);
        castAndCrewRepository.save(keysMarinussEditor);
        CastAndCrew keysMarinusproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, keysMarinus);
        castAndCrewRepository.save(keysMarinusproducer);

        Story aztecs = new Story(
                "The Aztecs",
                Format.TV,
                LocalDate.of(1964, 5, 23),
                LocalDate.of(1964, 6, 13),
                "Novelisation (1984), VHS (1992), DVD (2002, 2013), Audiobook (2012).",
                "img_url",
                "When Barbara is mistaken for the reincarnation of an Aztec goddess, she attempts to use her position to alter history, clashing with the Doctor in the process.",
                "The Temple of Evil; The Warriors of Death; The Bride of Sacrifice; The Day of Darkness; Yetaxa; change history; Historical",
                Series.SEASON1,
                6,
                4,
                "F",
                "https://tardis.wiki/wiki/The_Aztecs_(TV_story)");
        aztecs.addDoctor(firstDoctor);
        aztecs.addCompanion(susan);
        aztecs.addCompanion(ian);
        aztecs.addCompanion(babs);
        storyRepository.save(aztecs);
        CastAndCrew writerAztecs = new CastAndCrew(lucarotti, "Writer", CastOrCrew.CREW, aztecs);
        castAndCrewRepository.save(writerAztecs);
        CastAndCrew aztecsdirector = new CastAndCrew(jCrockett, "Director", CastOrCrew.CREW, aztecs);
        castAndCrewRepository.save(aztecsdirector);
        CastAndCrew aztecssEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, aztecs);
        castAndCrewRepository.save(aztecssEditor);
        CastAndCrew aztecsproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, aztecs);
        castAndCrewRepository.save(aztecsproducer);

        Story sensorites = new Story(
                "The Sensorites",
                Format.TV,
                LocalDate.of(1964, 6, 20),
                LocalDate.of(1964, 8, 1),
                "Novelisation (1987), VHS (2002), Audio (2008), Audiobook (2012), DVD (2012).",
                "img_url",
                "The TARDIS crew land on a spaceship orbiting the Sense-Sphere, home of the mysterious Sensorites.",
                "Strangers in Space; The Unwilling Warriors; Hidden Danger; A Race Against Death; Kidnap; A Desperate Venture; great spirit adventure; telepathy",
                Series.SEASON1,
                7,
                6,
                "G",
                "https://tardis.wiki/wiki/The_Sensorites_(TV_story)");
        sensorites.addDoctor(firstDoctor);
        sensorites.addCompanion(ian);
        sensorites.addCompanion(babs);
        sensorites.addCompanion(susan);
        storyRepository.save(sensorites);
        CastAndCrew writerSensorites = new CastAndCrew(prNewman, "Writer", CastOrCrew.CREW, sensorites);
        castAndCrewRepository.save(writerSensorites);
        CastAndCrew sensoritesdirector = new CastAndCrew(mPinfield, "Director", CastOrCrew.CREW, sensorites);
        castAndCrewRepository.save(sensoritesdirector);
        CastAndCrew sensoritesdirectorw = new CastAndCrew(fCox, "Director", CastOrCrew.CREW, sensorites);
        castAndCrewRepository.save(sensoritesdirectorw);
        CastAndCrew sensoritessEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, sensorites);
        castAndCrewRepository.save(sensoritessEditor);
        CastAndCrew sensoritesproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, sensorites);
        castAndCrewRepository.save(sensoritesproducer);

        Story reignTerror = new Story(
                "The Reign of Terror",
                Format.TV,
                LocalDate.of(1964, 8, 8),
                LocalDate.of(1964, 9, 12),
                "Novelisation (1987), VHS (2003), Audio (2006), DVD (2013 – missing episodes reanimated).",
                "img_url",
                "The Doctor and his friends land in Eighteenth Century France and try to avoid being executed during the titular slaughter.",
                "Historical; A Land of Fear; Guests of Madame Guillotine; A Change of Identity; The Tyrant of France; A Bargain of Necessity; Prisoners of Conciergerie; Napoleon; Robespierre; missing episodes",
                Series.SEASON1,
                8,
                6,
                "H",
                "https://tardis.wiki/wiki/The_Reign_of_Terror_(TV_story)");
        reignTerror.addDoctor(firstDoctor);
        reignTerror.addCompanion(susan);
        reignTerror.addCompanion(ian);
        reignTerror.addCompanion(babs);
        storyRepository.save(reignTerror);
        CastAndCrew writerReign = new CastAndCrew(spooner, "Writer", CastOrCrew.CREW, reignTerror);
        castAndCrewRepository.save(writerReign);
        CastAndCrew reignTerrordirector = new CastAndCrew(hHirsch, "Director", CastOrCrew.CREW, reignTerror);
        castAndCrewRepository.save(reignTerrordirector);
        CastAndCrew reignTerrorsEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, reignTerror);
        castAndCrewRepository.save(reignTerrorsEditor);
        CastAndCrew reignTerrorproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, reignTerror);
        castAndCrewRepository.save(reignTerrorproducer);


        Story planetGiants = new Story(
                "Planet of Giants",
                Format.TV,
                LocalDate.of(1964, 10, 31),
                LocalDate.of(1964, 11, 14),
                "Novelisation (1980), VHS (2002), DVD (2012), Blu-Ray (2022).",
                "img_url",
                "The TARDIS crew are shrunk to the height of an inch.",
                "Dangerous Journey; Crisis",
                Series.SEASON2,
                1,
                3,
                "J",
                "https://tardis.wiki/wiki/Planet_of_Giants_(TV_story)");
        planetGiants.addDoctor(firstDoctor);
        planetGiants.addCompanion(susan);
        planetGiants.addCompanion(ian);
        planetGiants.addCompanion(babs);
        storyRepository.save(planetGiants);
        CastAndCrew writerGiants = new CastAndCrew(lMarks, "Writer", CastOrCrew.CREW, planetGiants);
        castAndCrewRepository.save(writerGiants);
        CastAndCrew planetGiantsdirector = new CastAndCrew(mPinfield, "Director", CastOrCrew.CREW, planetGiants);
        castAndCrewRepository.save(planetGiantsdirector);
        CastAndCrew planetGiantsdirector2 = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, planetGiants);
        castAndCrewRepository.save(planetGiantsdirector2);
        CastAndCrew planetGiantssEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, planetGiants);
        castAndCrewRepository.save(planetGiantssEditor);
        CastAndCrew planetGiantsproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, planetGiants);
        castAndCrewRepository.save(planetGiantsproducer);

        Story dalekInvasion = new Story(
                "The Dalek Invasion of Earth",
                Format.TV,
                LocalDate.of(1964, 11, 21),
                LocalDate.of(1964, 12, 26),
                "Film Adaptation (1966), Novelisation (1977), VHS (1990), DVD (2003), Audiobook (2009), Blu-Ray (2022)",
                "img_url",
                "The TARDIS crew arrive on a future Earth to discover it has been conquered by the Daleks.",
                "World’s End; The Daleks; Day of Reckoning; The End of Tomorrow; The Waking Ally; Flashpoint; Susan; leaves; departure; companion",
                Series.SEASON2,
                2,
                6,
                "K",
                "https://tardis.wiki/wiki/The_Dalek_Invasion_of_Earth_(TV_story)");
        dalekInvasion.addDoctor(firstDoctor);
        dalekInvasion.addCompanion(susan);
        dalekInvasion.addCompanion(ian);
        dalekInvasion.addCompanion(babs);
        storyRepository.save(dalekInvasion);
        CastAndCrew writerDalInv = new CastAndCrew(tNation, "writer", CastOrCrew.CREW, dalekInvasion);
        castAndCrewRepository.save(writerDalInv);
        CastAndCrew dalekInvasiondirector = new CastAndCrew(rMartin, "Director", CastOrCrew.CREW, dalekInvasion);
        castAndCrewRepository.save(dalekInvasiondirector);
        CastAndCrew dalekInvasionsEditor = new CastAndCrew(dWhitaker, "Script Editor", CastOrCrew.CREW, dalekInvasion);
        castAndCrewRepository.save(dalekInvasionsEditor);
        CastAndCrew dalekInvasionproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, dalekInvasion);
        castAndCrewRepository.save(dalekInvasionproducer);

        Story rescue = new Story(
                "The Rescue",
                Format.TV,
                LocalDate.of(1965, 1, 2),
                LocalDate.of(1965, 1, 9),
                "Novelisation (1987), VHS (1994), DVD (2009), Audiobook (2013), Blu-Ray (2022).",
                "img_url",
                "The Doctor, Ian and Barbara land on the planet Dido. They find a crashed spaceship, the survivors menaced by a fearsome creature.",
                "The Powerful Enemy; Desperate Measures; Sandy; Vicki; first appearance; introduction; companion",
                Series.SEASON2,
                3,
                2,
                "L",
                "https://tardis.wiki/wiki/The_Rescue_(TV_story)");
        rescue.addDoctor(firstDoctor);
        rescue.addCompanion(ian);
        rescue.addCompanion(babs);
        rescue.addCompanion(vicki);
        storyRepository.save(rescue);
        CastAndCrew writerRescue = new CastAndCrew(dWhitaker, "Writer", CastOrCrew.CREW, rescue);
        castAndCrewRepository.save(writerRescue);
        CastAndCrew rescuedirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, rescue);
        castAndCrewRepository.save(rescuedirector);
        CastAndCrew rescuesEditor = new CastAndCrew(spooner, "Script Editor", CastOrCrew.CREW, rescue);
        castAndCrewRepository.save(rescuesEditor);
        CastAndCrew rescueproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, rescue);
        castAndCrewRepository.save(rescueproducer);

        Story romans = new Story(
                "The Romans",
                Format.TV,
                LocalDate.of(1965, 01, 16),
                LocalDate.of(1965, 02, 06),
                "Novelisation (1987), VHS (1994), DVD (2009), Blu-Ray (2022), Audiobook (2023).",
                "img_url",
                "Everyone is relaxing in a Roman villa before accidentally getting brought to the Emperor’s court or being kidnapped and sold into slavery.",
                "The Slave Traders; All Roads Lead to Rome; Conspiracy; Inferno; shipping; Historical",
                Series.SEASON2,
                4,
                4,
                "M",
                "https://tardis.wiki/wiki/The_Romans_(TV_story)");
        romans.addDoctor(firstDoctor);
        romans.addCompanion(ian);
        romans.addCompanion(babs);
        romans.addCompanion(vicki);
        storyRepository.save(romans);
        CastAndCrew writerRomans = new CastAndCrew(spooner, "Writer", CastOrCrew.CREW, romans);
        castAndCrewRepository.save(writerRomans);
        CastAndCrew romansdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, romans);
        castAndCrewRepository.save(romansdirector);
        CastAndCrew romanssEditor = new CastAndCrew(spooner, "Script Editor", CastOrCrew.CREW, romans);
        castAndCrewRepository.save(romanssEditor);
        CastAndCrew romansproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, romans);
        castAndCrewRepository.save(romansproducer);

        Story webPlanet = new Story(
                "The Web Planet",
                Format.TV,
                LocalDate.of(1965, 02, 13),
                LocalDate.of(1965, 03, 20),
                "Novelisation (1965), VHS (1990), DVD (2005), Audiobook (2005), Blu-Ray (2022)",
                "img_url",
                "The TARDIS crew land on the planet Vortis and get involved in the struggle between the butterfly-like Menoptera and ant-like Zarbi.",
                "The Zarbi; Escape to Danger; Crater of Needles; Invasion; The Centre; Zarbi; Animus; hit; camera;",
                Series.SEASON2,
                5,
                6,
                "N",
                "https://tardis.wiki/wiki/The_Web_Planet_(TV_story)");
        webPlanet.addDoctor(firstDoctor);
        webPlanet.addCompanion(ian);
        webPlanet.addCompanion(babs);
        webPlanet.addCompanion(vicki);
        storyRepository.save(webPlanet);
        CastAndCrew writerWebPlanet = new CastAndCrew(strutton, "Writer", CastOrCrew.CREW, webPlanet);
        castAndCrewRepository.save(writerWebPlanet);
        CastAndCrew webPlanetdirector = new CastAndCrew(rMartin, "Director", CastOrCrew.CREW, webPlanet);
        castAndCrewRepository.save(webPlanetdirector);
        CastAndCrew webPlanetsEditor = new CastAndCrew(spooner, "Script Editor", CastOrCrew.CREW, webPlanet);
        castAndCrewRepository.save(webPlanetsEditor);
        CastAndCrew webPlanetproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, webPlanet);
        castAndCrewRepository.save(webPlanetproducer);

        Story crusade = new Story(
                "The Crusade",
                Format.TV,
                LocalDate.of(1965, 03, 27),
                LocalDate.of(1965, 04, 17),
                "Novelisation (1966), Script Book (1994), VHS (1999),DVD (2004 – Lost in Time Boxset), Audio (2005), Audiobook (2005), Blu-Ray (2022).",
                "img_url",
                "The TARDIS materialises in Twelfth Century Palestine during the time of the Third Crusade.",
                "Historical; The Lion; The Knight of Jaffa; The Wheel of Fortune; The Warlords; Richard; Lionheart",
                Series.SEASON2,
                6,
                4,
                "P",
                "https://tardis.wiki/wiki/The_Crusade_(TV_story)");
        crusade.addDoctor(firstDoctor);
        crusade.addCompanion(ian);
        crusade.addCompanion(vicki);
        crusade.addCompanion(babs);
        storyRepository.save(crusade);
        CastAndCrew writerCrusade = new CastAndCrew(dWhitaker, "Writer", CastOrCrew.CREW, crusade);
        castAndCrewRepository.save(writerCrusade);
        CastAndCrew crusadedirector = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, crusade);
        castAndCrewRepository.save(crusadedirector);
        CastAndCrew crusadesEditor = new CastAndCrew(spooner, "Script Editor", CastOrCrew.CREW, crusade);
        castAndCrewRepository.save(crusadesEditor);
        CastAndCrew crusadeproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, crusade);
        castAndCrewRepository.save(crusadeproducer);

        Story spaceMuseum = new Story(
                "The Space Museum",
                Format.TV,
                LocalDate.of(1965, 04, 24),
                LocalDate.of(1965, 05, 15),
                "Novelisation (1987), VHS (1999), Audio (2009), DVD (2010), Blu-Ray (2022).",
                "img_url",
                "The time travellers arrive in a museum where they see themselves as exhibits.",
                "The Dimensions of Time; The Search; The Final Phase; Rob Shearman says it’s good",
                Series.SEASON2,
                7,
                4,
                "Q",
                "https://tardis.wiki/wiki/The_Space_Museum_(TV_story)");
        spaceMuseum.addDoctor(firstDoctor);
        spaceMuseum.addCompanion(babs);
        spaceMuseum.addCompanion(vicki);
        spaceMuseum.addCompanion(ian);
        storyRepository.save(spaceMuseum);
        CastAndCrew writerSM = new CastAndCrew(gJones, "Writer", CastOrCrew.CREW, spaceMuseum);
        castAndCrewRepository.save(writerSM);
        CastAndCrew spaceMuseumdirector = new CastAndCrew(mPinfield, "Director", CastOrCrew.CREW, spaceMuseum);
        castAndCrewRepository.save(spaceMuseumdirector);
        CastAndCrew spaceMuseumsEditor = new CastAndCrew(spooner, "Script Editor", CastOrCrew.CREW, spaceMuseum);
        castAndCrewRepository.save(spaceMuseumsEditor);
        CastAndCrew spaceMuseumproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, spaceMuseum);
        castAndCrewRepository.save(spaceMuseumproducer);

        Story chase = new Story(
                "The Chase",
                Format.TV,
                LocalDate.of(1965, 05, 22),
                LocalDate.of(1965, 06, 26),
                "Novelisation (1989), VHS (1993), DVD (2010), Audiobook (2011), Blu-Ray (2022).",
                "img_url",
                "The Daleks pursue the TARDIS through time and space.",
                "The Executioners; The Death of Time; Flight Through Eternity; Journey Into Terror; The Death of Doctor Who; The Planet of Decision; Marie Celeste; Mechanoids; stupid Dalek; first appearance; introduction: companion; Steven; departure; leave; Ian; Barbara",
                Series.SEASON2,
                8,
                6,
                "R",
                "https://tardis.wiki/wiki/The_Chase_(TV_story)");
        chase.addDoctor(firstDoctor);
        chase.addCompanion(ian);
        chase.addCompanion(babs);
        chase.addCompanion(vicki);
        storyRepository.save(chase);
        CastAndCrew writerChase = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, chase);
        castAndCrewRepository.save(writerChase);
        CastAndCrew chasedirector = new CastAndCrew(rMartin, "Director", CastOrCrew.CREW, chase);
        castAndCrewRepository.save(chasedirector);
        CastAndCrew chasesEditor = new CastAndCrew(spooner, "Script Editor", CastOrCrew.CREW, chase);
        castAndCrewRepository.save(chasesEditor);
        CastAndCrew chaseproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, chase);
        castAndCrewRepository.save(chaseproducer);

        Story timeMeddler = new Story(
                "The Time Meddler",
                Format.TV,
                LocalDate.of(1965, 07, 03),
                LocalDate.of(1965, 07, 24),
                "Novelisation (1987), VHS (2002), DVD (2008), Audiobook (2016), Blu-Ray (2022), Tales of the TARDIS (2023).",
                "img_url",
                "The Doctor and Vicki try to persuade new arrival Steven that they have travelled in time, complicated by the fact that Steven sees a Saxon wearing a watch.",
                "The Watcher; The Meddling Monk; A Battle of Wits; Checkmate; Time Lord; another; TARDIS; pseudohistorical",
                Series.SEASON2,
                9,
                4,
                "S",
                "https://tardis.wiki/wiki/The_Time_Meddler_(TV_story)");
        timeMeddler.addDoctor(firstDoctor);
        timeMeddler.addCompanion(vicki);
        timeMeddler.addCompanion(steven);
        storyRepository.save(timeMeddler);
        CastAndCrew writerMeddler = new CastAndCrew(spooner, "Writer", CastOrCrew.CREW, timeMeddler);
        castAndCrewRepository.save(writerMeddler);
        CastAndCrew timeMeddlerdirector = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, timeMeddler);
        castAndCrewRepository.save(timeMeddlerdirector);
        CastAndCrew timeMeddlersEditor = new CastAndCrew(tosh, "Script Editor", CastOrCrew.CREW, timeMeddler);
        castAndCrewRepository.save(timeMeddlersEditor);
        CastAndCrew timeMeddlerproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, timeMeddler);
        castAndCrewRepository.save(timeMeddlerproducer);


        Story galaxy4 = new Story(
                "Galaxy 4",
                Format.TV,
                LocalDate.of(1965, 9, 11),
                LocalDate.of(1965, 10, 2),
                "Novelisation (1985), Script Book (1994), VHS (1998 – Surviving Clip), Audio (2000), DVD (2004 – Surviving Clip), DVD (2013 – Surviving Episode/Reconstruction), DVD/Blu-Ray (2021 – Animation).",
                "img_url",
                "The Doctor, Steven and Vicki are caught in the conflict between the Drahvins and the Rills.",
                "Four Hundred Dawns; Trap of Steel; Air Lock; The Exploding Planet; Drahvin; Rill; missing stories;",
                Series.SEASON3,
                1,
                4,
                "T",
                "https://tardis.wiki/wiki/Galaxy_4_(TV_story)");
        galaxy4.addDoctor(firstDoctor);
        galaxy4.addCompanion(vicki);
        galaxy4.addCompanion(steven);
        storyRepository.save(galaxy4);
        CastAndCrew writerG4 = new CastAndCrew(wEmms, "Writer", CastOrCrew.CREW, galaxy4);
        castAndCrewRepository.save(writerG4);
        CastAndCrew galaxy4director = new CastAndCrew(dMartinus, "Director", CastOrCrew.CREW, galaxy4);
        castAndCrewRepository.save(galaxy4director);
        CastAndCrew galaxy4sEditor = new CastAndCrew(tosh, "Script Editor", CastOrCrew.CREW, galaxy4);
        castAndCrewRepository.save(galaxy4sEditor);
        CastAndCrew galaxy4producer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, galaxy4);
        castAndCrewRepository.save(galaxy4producer);

        Story missionUnknown = new Story(
                "Mission to the Unknown",
                Format.TV,
                LocalDate.of(1965, 10, 9),
                LocalDate.of(1965, 10, 9),
                "Novelisation (1989 – Part 1 of The Daleks Master Plan), Audio (2001), Audiobook (2010), Recreation (2019).",
                "img_url",
                "On the planet Kembel, UN astronauts are attacked by Varga plants – native to the planet Skaro, home of the Daleks.",
                "Doctor; light; lite; Prologue; Dalek; Daleks; Master Plan; Masterplan; Missing Episodes",
                Series.SEASON3,
                2,
                1,
                "DC",
                "https://tardis.wiki/wiki/Mission_to_the_Unknown_(TV_story)");
        missionUnknown.addDoctor(firstDoctor);
        storyRepository.save(missionUnknown);
        CastAndCrew writerMUnknown = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, missionUnknown);
        castAndCrewRepository.save(writerMUnknown);
        CastAndCrew missionUnknowndirector = new CastAndCrew(dMartinus, "Director", CastOrCrew.CREW, missionUnknown);
        castAndCrewRepository.save(missionUnknowndirector);
        CastAndCrew missionUnknownsEditor = new CastAndCrew(tosh, "Script Editor", CastOrCrew.CREW, missionUnknown);
        castAndCrewRepository.save(missionUnknownsEditor);
        CastAndCrew missionUnknownproducer = new CastAndCrew(verity, "Producer", CastOrCrew.CREW, missionUnknown);
        castAndCrewRepository.save(missionUnknownproducer);

        Story mythMakers = new Story(
                "The Myth Makers",
                Format.TV,
                LocalDate.of(1965, 10, 16),
                LocalDate.of(1965, 11, 06),
                "releases",
                "img_url",
                "The Doctor, Steven and Vicki find themselves at the legendary siege of Troy, but troy as they might it’s going to be hard to get away safely.",
                "Historical; Temple of Secrets; Small Prophet, Quick Return; Death of a Spy; Horse of Destruction; Companion; leave; Vicki; departure; Troy; Katarina; first appearance;",
                Series.SEASON3,
                3,
                4,
                "U",
                "https://tardis.wiki/wiki/The_Myth_Makers_(TV_story)");
        mythMakers.addDoctor(firstDoctor);
        mythMakers.addCompanion(vicki);
        mythMakers.addCompanion(steven);
        storyRepository.save(mythMakers);
        CastAndCrew writerMM = new CastAndCrew(dCotton, "Writer", CastOrCrew.CREW, mythMakers);
        castAndCrewRepository.save(writerMM);
        CastAndCrew mythMakersdirector = new CastAndCrew(mLeestonSmith, "Director", CastOrCrew.CREW, mythMakers);
        castAndCrewRepository.save(mythMakersdirector);
        CastAndCrew mythMakerssEditor = new CastAndCrew(tosh, "Script Editor", CastOrCrew.CREW, mythMakers);
        castAndCrewRepository.save(mythMakerssEditor);
        CastAndCrew mythMakersproducer = new CastAndCrew(wiles, "Producer", CastOrCrew.CREW, mythMakers);
        castAndCrewRepository.save(mythMakersproducer);

        Story dalekMasterplan = new Story(
                "The Daleks’ Master Plan",
                Format.TV,
                LocalDate.of(1965, 11, 13),
                LocalDate.of(1966, 01, 29),
                "Novelisation (1989 – in two parts), VHS (1992 – Surviving Episodes), Audio (2001), DVD (2004 – Surviving Episodes), Audiobook (2010).",
                "img_url",
                "Six months after ‘Mission to the Unknown’ the Doctor and his friends land on Kembel and uncover a Dalek plot to unleash a superweapon.",
                "first appearance; Sara; companion; death; dies; The Nightmare Begins; Day of Armageddon; Devil’s Planet; The Traitors; Counter Plot; Coronas of the Sun; The Feast of Steven; Volcano; Golden Death; Escape Switch; The Abandoned Planet; Destruction of Time; Dalek; masterplan;",
                Series.SEASON3,
                4,
                12,
                "V",
                "https://tardis.wiki/wiki/The_Daleks%27_Master_Plan_(TV_story)");
        dalekMasterplan.addDoctor(firstDoctor);
        dalekMasterplan.addCompanion(steven);
        dalekMasterplan.addCompanion(katarina);
        dalekMasterplan.addCompanion(saraK);
        storyRepository.save(dalekMasterplan);
        CastAndCrew writerDM1 = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, dalekMasterplan);
        castAndCrewRepository.save(writerDM1);
        CastAndCrew writerDM2 = new CastAndCrew(spooner, "Writer", CastOrCrew.CREW, dalekMasterplan);
        castAndCrewRepository.save(writerDM2);
        CastAndCrew directorDM = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, dalekMasterplan);
        castAndCrewRepository.save(directorDM);
        CastAndCrew sEditorDM = new CastAndCrew(tosh, "Script Editor", CastOrCrew.CREW, dalekMasterplan);
        castAndCrewRepository.save(sEditorDM);
        CastAndCrew producerDM = new CastAndCrew(wiles, "Producer", CastOrCrew.CREW, dalekMasterplan);
        castAndCrewRepository.save(producerDM);

        Story massacre = new Story(
                "The Massacre",
                Format.TV,
                LocalDate.of(1966, 2, 5),
                LocalDate.of(1966, 2, 26),
                "Novelisation (1987), Audio (1999)",
                "img_url",
                "The Doctor goes missing, leaving Steven stranded in Sixteenth Century Paris as religious tensions rise.",
                "Historical; War of God; The Sea Beggar; Priest of Death; Bell of Doom; double; The Massacre of St Bartholomew’s Eve; missing episodes; first appearance; Dodo",
                Series.SEASON3,
                5,
                4,
                "W",
                "https://tardis.wiki/wiki/The_Massacre_(TV_story)");
        massacre.addDoctor(firstDoctor);
        massacre.addCompanion(steven);
        storyRepository.save(massacre);
        CastAndCrew writerMassacre = new CastAndCrew(lucarotti, "Writer", CastOrCrew.CREW, massacre);
        castAndCrewRepository.save(writerMassacre);
        CastAndCrew writerMassacre2 = new CastAndCrew(tosh, "Writer", CastOrCrew.CREW, massacre);
        castAndCrewRepository.save(writerMassacre2);
        CastAndCrew massacredirector = new CastAndCrew(pRussell, "Director", CastOrCrew.CREW, massacre);
        castAndCrewRepository.save(massacredirector);
        CastAndCrew massacresEditor = new CastAndCrew(tosh, "Script Editor", CastOrCrew.CREW, massacre);
        castAndCrewRepository.save(massacresEditor);
        CastAndCrew massacresEditor2 = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, massacre);
        castAndCrewRepository.save(massacresEditor2);
        CastAndCrew massacreproducer = new CastAndCrew(wiles, "Producer", CastOrCrew.CREW, massacre);
        castAndCrewRepository.save(massacreproducer);

        Story ark = new Story(
                "The Ark",
                Format.TV,
                LocalDate.of(1966, 3, 5),
                LocalDate.of(1996, 3, 26),
                "Novelisation (1986), VHS (1998), Audio (2006), DVD (2011).",
                "img_url",
                "Ten million years into the future, a generation starship – designed to ferry the last of humanity away from the dying Earth – meets its greatest challenge yet: Dodo’s cold.",
                "The Steel Sky; The Plague; The Return; The Bomb; invisible; monoids; security kitchen",
                Series.SEASON3,
                6,
                4,
                "X",
                "https://tardis.wiki/wiki/The_Ark_(TV_story)");
        ark.addDoctor(firstDoctor);
        ark.addCompanion(steven);
        ark.addCompanion(dodo);
        storyRepository.save(ark);
        CastAndCrew writerArk1 = new CastAndCrew(pErickson, "Writer", CastOrCrew.CREW, ark);
        castAndCrewRepository.save(writerArk1);
        CastAndCrew writerArk2 = new CastAndCrew(lScott, "Writer", CastOrCrew.CREW, ark);
        castAndCrewRepository.save(writerArk2);
        CastAndCrew arkdirector = new CastAndCrew(mImison, "Director", CastOrCrew.CREW, ark);
        castAndCrewRepository.save(arkdirector);
        CastAndCrew arksEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, ark);
        castAndCrewRepository.save(arksEditor);
        CastAndCrew arkproducer = new CastAndCrew(wiles, "Producer", CastOrCrew.CREW, ark);
        castAndCrewRepository.save(arkproducer);

        Story celestialToymaker = new Story(
                "The Celestial Toymaker",
                Format.TV,
                LocalDate.of(1966, 04, 02),
                LocalDate.of(1966, 04, 23),
                "Novelisation (1986), VHS (1991 – Surviving Episode), Audio (2001), DVD (2004 – Surviving Episode), DVD/Blu-Ray (2024 – Animation).",
                "img_url",
                "The TARDIS crew find themselves in the Toymaker’s domain – an immortal entity who forces them to play a series of games they must not lose.",
                "The Celestial Toyroom; The Hall of Dolls; The Dancing Floor; The Final Test; toymaker; billy bunter; missing episodes",
                Series.SEASON3,
                7,
                4,
                "Y",
                "https://tardis.wiki/wiki/The_Celestial_Toymaker_(TV_story)");
        celestialToymaker.addDoctor(firstDoctor);
        celestialToymaker.addCompanion(dodo);
        celestialToymaker.addCompanion(steven);
        storyRepository.save(celestialToymaker);
        CastAndCrew writerToymaker = new CastAndCrew(hayles, "role", CastOrCrew.CREW, celestialToymaker);
        castAndCrewRepository.save(writerToymaker);
        CastAndCrew celestialToymakerdirector = new CastAndCrew(bSellars, "Director", CastOrCrew.CREW, celestialToymaker);
        castAndCrewRepository.save(celestialToymakerdirector);
        CastAndCrew celestialToymakersEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, celestialToymaker);
        castAndCrewRepository.save(celestialToymakersEditor);
        CastAndCrew celestialToymakerproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, celestialToymaker);
        castAndCrewRepository.save(celestialToymakerproducer);


        Story gunfighters = new Story(
                "The Gunfighters",
                Format.TV,
                LocalDate.of(1966, 04, 30),
                LocalDate.of(1966, 05, 21),
                "Novelisation (1985), VHS (2002), DVD (2011), Audiobook (2013).",
                "img_url",
                "The Doctor has toothache, and his search for a dentist lands him at the O.K. Corral.",
                "Historical; A Holiday for the Doctor; Don’t Shoot the Pianist; Johnny Ringo; The OK Corral; gunfight; western; musical; ballad; last chance saloon",
                Series.SEASON3,
                8,
                4,
                "Z",
                "https://tardis.wiki/wiki/The_Gunfighters_(TV_story)");
        gunfighters.addDoctor(firstDoctor);
        gunfighters.addCompanion(steven);
        gunfighters.addCompanion(dodo);
        storyRepository.save(gunfighters);
        CastAndCrew writerGunfighter = new CastAndCrew(dCotton, "role", CastOrCrew.CREW, gunfighters);
        castAndCrewRepository.save(writerGunfighter);
        CastAndCrew gunfightersdirector = new CastAndCrew(rTucker, "Director", CastOrCrew.CREW, gunfighters);
        castAndCrewRepository.save(gunfightersdirector);
        CastAndCrew gunfighterssEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, gunfighters);
        castAndCrewRepository.save(gunfighterssEditor);
        CastAndCrew gunfightersproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, gunfighters);
        castAndCrewRepository.save(gunfightersproducer);

        Story savages = new Story(
                "The Savages",
                Format.TV,
                LocalDate.of(1966, 05, 28),
                LocalDate.of(1966, 06, 18),
                "Novelisation (1986), Audio (2001).",
                "img_url",
                "The TARDIS lands in a far future where an advanced group of Elders show them their idyllic society.",
                "Companion; leaving; departure; Steven; missing episodes",
                Series.SEASON3,
                9,
                4,
                "AA",
                "https://tardis.wiki/wiki/The_Savages_(TV_story)");
        savages.addDoctor(firstDoctor);
        savages.addCompanion(steven);
        savages.addCompanion(dodo);
        storyRepository.save(savages);
        CastAndCrew writerSavages = new CastAndCrew(iSBlack, "Writer", CastOrCrew.CREW, savages);
        castAndCrewRepository.save(writerSavages);
        CastAndCrew savagesdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, savages);
        castAndCrewRepository.save(savagesdirector);
        CastAndCrew savagessEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, savages);
        castAndCrewRepository.save(savagessEditor);
        CastAndCrew savagesproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, savages);
        castAndCrewRepository.save(savagesproducer);

        Story warMachines = new Story(
                "The War Machines",
                Format.TV,
                LocalDate.of(1966, 06, 25),
                LocalDate.of(1966, 07, 16),
                "Novelisation (1989), VHS (1997), Audio (2007), DVD (2008)",
                "img_url",
                "The Doctor, along with new friends Ben and Polly, attempt to stop a self-thinking computer in the Post Office Tower from taking over London.",
                "Companion; departure; leave; Dodo; post office tower; BT tower: first appearance; Polly; Ben",
                Series.SEASON3,
                10,
                4,
                "BB",
                "https://tardis.wiki/wiki/The_War_Machines_(TV_story)");
        warMachines.addDoctor(firstDoctor);
        warMachines.addCompanion(dodo);
        warMachines.addCompanion(ben);
        warMachines.addCompanion(polly);
        storyRepository.save(warMachines);
        CastAndCrew writerWMachines = new CastAndCrew(iSBlack, "Writer", CastOrCrew.CREW, warMachines);
        castAndCrewRepository.save(writerWMachines);
        CastAndCrew warMachinesdirector = new CastAndCrew(mFerguson, "Director", CastOrCrew.CREW, warMachines);
        castAndCrewRepository.save(warMachinesdirector);
        CastAndCrew warMachinessEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, warMachines);
        castAndCrewRepository.save(warMachinessEditor);
        CastAndCrew warMachinesproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, warMachines);
        castAndCrewRepository.save(warMachinesproducer);

        Story smugglers = new Story(
                "The Smugglers",
                Format.TV,
                LocalDate.of(1966, 9, 10),
                LocalDate.of(1966, 10, 1),
                "Novelisation (1988), Audio (2002).",
                "img_url",
                "The Doctor brings his new companions to a Seventeenth Century Cornwall beset by smuggling and piracy.",
                "Missing episodes; pirates; Henry Avery; Historical;",
                Series.SEASON4,
                1,
                4,
                "CC",
                "https://tardis.wiki/wiki/The_Smugglers_(TV_story)");
        smugglers.addDoctor(firstDoctor);
        smugglers.addCompanion(polly);
        smugglers.addCompanion(ben);
        storyRepository.save(smugglers);
        CastAndCrew writerSmugglers = new CastAndCrew(hayles, "Writer", CastOrCrew.CREW, smugglers);
        castAndCrewRepository.save(writerSmugglers);
        CastAndCrew smugglersdirector = new CastAndCrew(jSmith, "Director", CastOrCrew.CREW, smugglers);
        castAndCrewRepository.save(smugglersdirector);
        CastAndCrew smugglerssEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, smugglers);
        castAndCrewRepository.save(smugglerssEditor);
        CastAndCrew smugglersproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, smugglers);
        castAndCrewRepository.save(smugglersproducer);

        Story tenthPlanet = new Story(
                "The Tenth Planet",
                Format.TV,
                LocalDate.of(1966, 10, 8),
                LocalDate.of(1966, 10, 29),
                "Novelisation (1976), VHS (2000), DVD (2013 – Animated Episode).",
                "img_url",
                "The Doctor, Polly and Ben arrive in Antarctica just as a new planet appears in the sky. It’s arrival heralds the coming of the Cybermen",
                "Regeneration; missing episodes; Cybermen; Mondas; first appearance;",
                Series.SEASON4,
                2,
                4,
                "DD",
                "https://tardis.wiki/wiki/The_Tenth_Planet_(TV_story)");
        tenthPlanet.addDoctor(firstDoctor);
        tenthPlanet.addCompanion(ben);
        tenthPlanet.addCompanion(polly);
        storyRepository.save(tenthPlanet);
        CastAndCrew writer10p1 = new CastAndCrew(pedler, "Writer", CastOrCrew.CREW, tenthPlanet);
        castAndCrewRepository.save(writer10p1);
        CastAndCrew writer10p2 = new CastAndCrew(gDavis, "Writer", CastOrCrew.CREW, tenthPlanet);
        castAndCrewRepository.save(writer10p2);
        CastAndCrew tenthPlanetdirector = new CastAndCrew(dMartinus, "Director", CastOrCrew.CREW, tenthPlanet);
        castAndCrewRepository.save(tenthPlanetdirector);
        CastAndCrew tenthPlanetsEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, tenthPlanet);
        castAndCrewRepository.save(tenthPlanetsEditor);
        CastAndCrew tenthPlanetproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, tenthPlanet);
        castAndCrewRepository.save(tenthPlanetproducer);

        Story powerDaleks = new Story(
                "The Power of the Daleks",
                Format.TV,
                LocalDate.of(1966, 11, 5),
                LocalDate.of(1966, 12, 10),
                "Novelisation (1993), Script Book (1993), Audio (1993, 2003), DVD/Blu-Ray (2016, 2020 – Animation)",
                "img_url",
                "Polly and Ben watch as a new man gets up from where the Doctor lay, and lands the TARDIS on the human colony on Vulcan…just as one of their scientists makes a deadly discovery.",
                "Missing episodes; regeneration; Dalek; Second Doctor; debut",
                Series.SEASON4,
                3,
                6,
                "EE",
                "https://tardis.wiki/wiki/The_Power_of_the_Daleks_(TV_story)");
        powerDaleks.addDoctor(secondDoctor);
        powerDaleks.addCompanion(polly);
        powerDaleks.addCompanion(ben);
        storyRepository.save(powerDaleks);
        CastAndCrew writerPowerDal1 = new CastAndCrew(dWhitaker, "Writer", CastOrCrew.CREW, powerDaleks);
        castAndCrewRepository.save(writerPowerDal1);
        CastAndCrew writerPowerDal2 = new CastAndCrew(spooner, "Writer", CastOrCrew.CREW, powerDaleks);
        castAndCrewRepository.save(writerPowerDal2);
        CastAndCrew powerDaleksdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, powerDaleks);
        castAndCrewRepository.save(powerDaleksdirector);
        CastAndCrew powerDalekssEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, powerDaleks);
        castAndCrewRepository.save(powerDalekssEditor);
        CastAndCrew powerDaleksproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, powerDaleks);
        castAndCrewRepository.save(powerDaleksproducer);

        Story highlanders = new Story(
                "The Highlanders",
                Format.TV,
                LocalDate.of(1966, 12, 17),
                LocalDate.of(1967, 01, 07),
                "Novelisation (1984), Audio (2000), Audiobook (2012).",
                "img_url",
                "The Doctor and his companions get into trouble after befriending some Jacobites in the wake of the Battle of Culloden.",
                "Historical; Missing Episodes; companion; introduction; first appearance; Jamie",
                Series.SEASON4,
                4,
                4,
                "FF",
                "https://tardis.wiki/wiki/The_Highlanders_(TV_story)");
        highlanders.addDoctor(secondDoctor);
        highlanders.addCompanion(ben);
        highlanders.addCompanion(polly);
        highlanders.addCompanion(jamie);
        storyRepository.save(highlanders);
        CastAndCrew writerHighlanders1 = new CastAndCrew(eJones, "Writer", CastOrCrew.CREW, highlanders);
        castAndCrewRepository.save(writerHighlanders1);
        CastAndCrew writerHighlanders2 = new CastAndCrew(gDavis, "Writer", CastOrCrew.CREW, highlanders);
        castAndCrewRepository.save(writerHighlanders2);
        CastAndCrew highlandersdirector = new CastAndCrew(hDavid, "Director", CastOrCrew.CREW, highlanders);
        castAndCrewRepository.save(highlandersdirector);
        CastAndCrew highlanderssEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, highlanders);
        castAndCrewRepository.save(highlanderssEditor);
        CastAndCrew highlandersproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, highlanders);
        castAndCrewRepository.save(highlandersproducer);

        Story underwaterMenace = new Story(
                "The Underwater Menace",
                Format.TV,
                LocalDate.of(1967, 1, 14),
                LocalDate.of(1967, 2, 4),
                "Novelisation (1988), VHS (1998 - Surviving Episode), Audio (2005), DVD (2015 – Surviving Episodes), DVD/Blu-Ray (2023 – Animation)",
                "img_url",
                "Atlantis. Fish people going on strike. A mad scientist who wants to destroy the world. Joe Orton making notes. It’s ‘The Underwater Menace’.",
                "Zaroff; Nothing in the world can stop me now; Atlantis; fish people",
                Series.SEASON4,
                5,
                4,
                "GG",
                "https://tardis.wiki/wiki/The_Underwater_Menace_(TV_story)");
        underwaterMenace.addDoctor(secondDoctor);
        underwaterMenace.addCompanion(ben);
        underwaterMenace.addCompanion(polly);
        underwaterMenace.addCompanion(jamie);
        storyRepository.save(underwaterMenace);
        CastAndCrew writerMenace = new CastAndCrew(orme, "Writer", CastOrCrew.CREW, underwaterMenace);
        castAndCrewRepository.save(writerMenace);
        CastAndCrew underwaterMenacedirector = new CastAndCrew(jSmith, "Director", CastOrCrew.CREW, underwaterMenace);
        castAndCrewRepository.save(underwaterMenacedirector);
        CastAndCrew underwaterMenacesEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, underwaterMenace);
        castAndCrewRepository.save(underwaterMenacesEditor);
        CastAndCrew underwaterMenaceproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, underwaterMenace);
        castAndCrewRepository.save(underwaterMenaceproducer);

        Story moonbase = new Story(
                "The Moonbase",
                Format.TV,
                LocalDate.of(1967, 2, 11),
                LocalDate.of(1967, 3, 4),
                "Novelisation (1975), VHS (1992 – Surviving Episodes), Audio (2001), DVD (2004 – Surviving Episodes), DVD (2014 – Animation).",
                "img_url",
                "The Doctor and friends arrive on the moon in the Twenty-First Century, and discover an incredible plot by the Cybermen to control the Earth’s weather.",
                "Missing Episodes; Cybermen; phantom piper; sugar",
                Series.SEASON4,
                6,
                4,
                "HH",
                "https://tardis.wiki/wiki/The_Moonbase_(TV_story)");
        moonbase.addDoctor(secondDoctor);
        moonbase.addCompanion(ben);
        moonbase.addCompanion(polly);
        moonbase.addCompanion(jamie);
        storyRepository.save(moonbase);
        CastAndCrew writerMoonbase1 = new CastAndCrew(pedler, "Writer", CastOrCrew.CREW, moonbase);
        castAndCrewRepository.save(writerMoonbase1);
        CastAndCrew writerMoonbase2 = new CastAndCrew(gDavis, "Writer", CastOrCrew.CREW, moonbase);
        castAndCrewRepository.save(writerMoonbase2);
        CastAndCrew moonbasedirector = new CastAndCrew(mBarry, "Director", CastOrCrew.CREW, moonbase);
        castAndCrewRepository.save(moonbasedirector);
        CastAndCrew moonbasesEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, moonbase);
        castAndCrewRepository.save(moonbasesEditor);
        CastAndCrew moonbaseproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, moonbase);
        castAndCrewRepository.save(moonbaseproducer);

        Story macra = new Story(
                "The Macra Terror",
                Format.TV,
                LocalDate.of(1967, 3, 11),
                LocalDate.of(1967, 4, 1),
                "Novelisation (1987), Audio (1992, 2000, 2012), DVD/Blu-Ray (2019 – Animation).",
                "img_url",
                "On a human colony in the future, the TARDIS crew discover an ostensibly jaunty and wholesome colony is in fact in the thrall of an outside influence.",
                "No such thing as Macra; crabs; giant; gridlock; missing episodes",
                Series.SEASON4,
                7,
                4,
                "JJ",
                "https://tardis.wiki/wiki/The_Macra_Terror_(TV_story)");
        macra.addDoctor(secondDoctor);
        macra.addCompanion(ben);
        macra.addCompanion(polly);
        macra.addCompanion(jamie);
        storyRepository.save(macra);
        CastAndCrew macraWriter = new CastAndCrew(iSBlack, "Writer", CastOrCrew.CREW, macra);
        castAndCrewRepository.save(macraWriter);
        CastAndCrew macradirector = new CastAndCrew(jDavies, "Director", CastOrCrew.CREW, macra);
        castAndCrewRepository.save(macradirector);
        CastAndCrew macrasEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, macra);
        castAndCrewRepository.save(macrasEditor);
        CastAndCrew macraproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, macra);
        castAndCrewRepository.save(macraproducer);

        Story facelessOnes = new Story(
                "The Faceless Ones",
                Format.TV,
                LocalDate.of(1967, 4, 8),
                LocalDate.of(1967, 5, 13),
                "Novelisation (1986), Audio (2002), VHS (2003 – Surviving Episodes), DVD (2004 – Surviving Episodes), DVD/Blu-Ray (2020 – Animation).",
                "img_url",
                "The Doctor, Polly, Jamie and Ben arrive at Gatwick Airport where it turns out there’s an ulterior motive behind the holiday packages for students.",
                "Companion; departure; leave; polly; ben; flying beastie; planes; airport",
                Series.SEASON4,
                8,
                6,
                "KK",
                "https://tardis.wiki/wiki/The_Faceless_Ones_(TV_story)");
        facelessOnes.addDoctor(secondDoctor);
        facelessOnes.addCompanion(ben);
        facelessOnes.addCompanion(polly);
        facelessOnes.addCompanion(jamie);
        storyRepository.save(facelessOnes);
        CastAndCrew facelessWriter1 = new CastAndCrew(dEllis, "Writer", CastOrCrew.CREW, facelessOnes);
        castAndCrewRepository.save(facelessWriter1);
        CastAndCrew facelessWriter2 = new CastAndCrew(hulke, "Writer", CastOrCrew.CREW, facelessOnes);
        castAndCrewRepository.save(facelessWriter2);
        CastAndCrew facelessOnesdirector = new CastAndCrew(gMill, "Director", CastOrCrew.CREW, facelessOnes);
        castAndCrewRepository.save(facelessOnesdirector);
        CastAndCrew facelessOnessEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, facelessOnes);
        castAndCrewRepository.save(facelessOnessEditor);
        CastAndCrew facelessOnesproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, facelessOnes);
        castAndCrewRepository.save(facelessOnesproducer);

        Story evilDaleks = new Story(
                "The Evil of the Daleks",
                Format.TV,
                LocalDate.of(1967, 5, 20),
                LocalDate.of(1967, 7, 1),
                "Audio (1992, 2003), VHS (1992 – Surviving Episode), Novelisation (1993, 2023), DVD (2004 – Surviving Episode), DVD/Blu-Ray (2021 – Animation).",
                "img_url",
                "The Daleks trick the Doctor into working for them.",
                "Missing episodes; Daleks; Victorian; alchemy; Skaro; pseudohistorical; first appearance; Victoria; great big bushy beard",
                Series.SEASON4,
                9,
                7,
                "LL",
                "https://tardis.wiki/wiki/The_Evil_of_the_Daleks_(TV_story)");
        evilDaleks.addDoctor(secondDoctor);
        evilDaleks.addCompanion(jamie);
        evilDaleks.addCompanion(victoria);
        storyRepository.save(evilDaleks);
        CastAndCrew writerEvilD = new CastAndCrew(dWhitaker, "Writer", CastOrCrew.CREW, evilDaleks);
        castAndCrewRepository.save(writerEvilD);
        CastAndCrew evilDaleksdirector = new CastAndCrew(dMartinus, "Director", CastOrCrew.CREW, evilDaleks);
        castAndCrewRepository.save(evilDaleksdirector);
        CastAndCrew evilDalekssEditor = new CastAndCrew(gDavis, "Script Editor", CastOrCrew.CREW, evilDaleks);
        castAndCrewRepository.save(evilDalekssEditor);
        CastAndCrew evilDalekssEditor2 = new CastAndCrew(pBryant, "Script Editor", CastOrCrew.CREW, evilDaleks);
        castAndCrewRepository.save(evilDalekssEditor2);
        CastAndCrew evilDaleksproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, evilDaleks);
        castAndCrewRepository.save(evilDaleksproducer);


        Story tomb = new Story(
                "The Tomb of the Cybermen",
                Format.TV,
                LocalDate.of(1967, 9, 2),
                LocalDate.of(1967, 9, 23),
                "Novelisation (1978), Script Book (1989), VHS (1992), Audio (1993, 2006), DVD (2002, 2012)",
                "img_url",
                "The TARDIS crew are caught up in an expedition to the planet Telos, looking for the remains of the long dead Cybermen…",
                "Base Under Siege; Cybermen; Telos",
                Series.SEASON5,
                1,
                4,
                "MM",
                "https://tardis.wiki/wiki/The_Tomb_of_the_Cybermen_(TV_story)");
        tomb.addDoctor(secondDoctor);
        tomb.addCompanion(victoria);
        tomb.addCompanion(jamie);
        storyRepository.save(tomb);
        CastAndCrew tombWriter1 = new CastAndCrew(pedler, "Writer", CastOrCrew.CREW, tomb);
        castAndCrewRepository.save(tombWriter1);
        CastAndCrew tombWriter2 = new CastAndCrew(gDavis, "Writer", CastOrCrew.CREW, tomb);
        castAndCrewRepository.save(tombWriter2);
        CastAndCrew tombdirector = new CastAndCrew(mBarry, "Director", CastOrCrew.CREW, tomb);
        castAndCrewRepository.save(tombdirector);
        CastAndCrew tombsEditor = new CastAndCrew(pemberton, "Script Editor", CastOrCrew.CREW, tomb);
        castAndCrewRepository.save(tombsEditor);
        CastAndCrew tombproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, tomb);
        castAndCrewRepository.save(tombproducer);

        Story abominable = new Story(
                "The Abominable Snowmen",
                Format.TV,
                LocalDate.of(1967, 9, 30),
                LocalDate.of(1967, 11, 4),
                "Novelisation (1974), Audio (2001), VHS (1991 – Surviving Episode), DVD (2004 – Surviving Episode), DVD/Blu-Ray (2022 – Animation).",
                "img_url",
                "Yeti are besieging a Buddhist monastery in Thirties Tibet, but there’s more to these creatures than meets the eye.",
                "Missing episodes; Yeti; Great Intelligence; pseudohistorical",
                Series.SEASON5,
                2,
                6,
                "NN",
                "https://tardis.wiki/wiki/The_Abominable_Snowmen_(TV_story)");
        abominable.addDoctor(secondDoctor);
        abominable.addCompanion(jamie);
        abominable.addCompanion(victoria);
        storyRepository.save(abominable);
        CastAndCrew abominableWriter1 = new CastAndCrew(mHaisman, "Writer", CastOrCrew.CREW, abominable);
        castAndCrewRepository.save(abominableWriter1);
        CastAndCrew abominableWriter2 = new CastAndCrew(hLincoln, "Writer", CastOrCrew.CREW, abominable);
        castAndCrewRepository.save(abominableWriter2);
        CastAndCrew abominabledirector = new CastAndCrew(gBlake, "Director", CastOrCrew.CREW, abominable);
        castAndCrewRepository.save(abominabledirector);
        CastAndCrew abominablesEditor = new CastAndCrew(pBryant, "Script Editor", CastOrCrew.CREW, abominable);
        castAndCrewRepository.save(abominablesEditor);
        CastAndCrew abominableproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, abominable);
        castAndCrewRepository.save(abominableproducer);

        Story iceWarriors = new Story(
                "The Ice Warriors",
                Format.TV,
                LocalDate.of(1967, 11, 11),
                LocalDate.of(1967, 12, 16),
                "Novelisation (1976), VHS (1998 – Surviving Episodes), Audio (2005), DVD (2013 – Animation), Audiobook (2021).",
                "img_url",
                "The TARDIS arrives on Earth in a new ice age, where a giant humanoid creature has been found buried in a glacier.",
                "Missing episodes; Ice Warriors",
                Series.SEASON5,
                3,
                6,
                "OO",
                "https://tardis.wiki/wiki/The_Ice_Warriors_(TV_story)");
        iceWarriors.addDoctor(secondDoctor);
        iceWarriors.addCompanion(jamie);
        iceWarriors.addCompanion(victoria);
        storyRepository.save(iceWarriors);
        CastAndCrew iceWriter = new CastAndCrew(hayles, "Writer", CastOrCrew.CREW, iceWarriors);
        castAndCrewRepository.save(iceWriter);
        CastAndCrew iceWarriorsdirector = new CastAndCrew(dMartinus, "Director", CastOrCrew.CREW, iceWarriors);
        castAndCrewRepository.save(iceWarriorsdirector);
        CastAndCrew iceWarriorssEditor = new CastAndCrew(pBryant, "Script Editor", CastOrCrew.CREW, iceWarriors);
        castAndCrewRepository.save(iceWarriorssEditor);
        CastAndCrew iceWarriorsproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, iceWarriors);
        castAndCrewRepository.save(iceWarriorsproducer);


        Story enemyWorld = new Story(
                "The Enemy of the World",
                Format.TV,
                LocalDate.of(1967, 12, 23),
                LocalDate.of(1968, 1, 27),
                "Novelisation (1981), VHS (1991 – Surviving Episode), Audio (2002), DVD (2004 – Surviving Episode), DVD (2013, 2018 – Rediscovered Episodes)",
                "img_url",
                "The Doctor arrives on Earth in 2018 and discovers he bears an uncanny resemblance to a major political leader.",
                "Doppelganger; Salamander",
                Series.SEASON5,
                4,
                6,
                "PP",
                "https://tardis.wiki/wiki/The_Enemy_of_the_World_(TV_story)");
        enemyWorld.addDoctor(firstDoctor);
        enemyWorld.addCompanion(victoria);
        enemyWorld.addCompanion(jamie);
        storyRepository.save(enemyWorld);
        CastAndCrew enemyWorldWriter = new CastAndCrew(dWhitaker, "Writer", CastOrCrew.CREW, enemyWorld);
        castAndCrewRepository.save(enemyWorldWriter);
        CastAndCrew enemyWorlddirector = new CastAndCrew(bLetts, "Director", CastOrCrew.CREW, enemyWorld);
        castAndCrewRepository.save(enemyWorlddirector);
        CastAndCrew enemyWorldsEditor = new CastAndCrew(pBryant, "Script Editor", CastOrCrew.CREW, enemyWorld);
        castAndCrewRepository.save(enemyWorldsEditor);
        CastAndCrew enemyWorldproducer = new CastAndCrew(iLloyd, "Producer", CastOrCrew.CREW, enemyWorld);
        castAndCrewRepository.save(enemyWorldproducer);

        Story webFear = new Story(
                "The Web of Fear",
                Format.TV,
                LocalDate.of(1968, 2, 3),
                LocalDate.of(1968, 3, 9),
                "Novelisation (1976), Audio (2000), VHS (2003 – Surviving Episode), DVD (2004 – Surviving Episode), DVD (2014 – Rediscovered Episodes), DVD/Blu-Ray (2021 – Animation).",
                "img_url",
                "The TARDIS crew arrive in a dead London, and fight the Yetis are back, closing in on the surviving soldiers in an underground base.",
                "Yeti; Great Intelligence; Brigadier; Missing episodes;",
                Series.SEASON5,
                5,
                6,
                "QQ",
                "https://tardis.wiki/wiki/The_Web_of_Fear_(TV_story)");
        webFear.addDoctor(secondDoctor);
        webFear.addCompanion(jamie);
        webFear.addCompanion(victoria);
        webFear.addCompanion(brigadier);
        storyRepository.save(webFear);
        CastAndCrew webFearWriter1 = new CastAndCrew(mHaisman, "Writer", CastOrCrew.CREW, webFear);
        castAndCrewRepository.save(webFearWriter1);
        CastAndCrew webFearWriter2 = new CastAndCrew(hLincoln, "Writer", CastOrCrew.CREW, webFear);
        castAndCrewRepository.save(webFearWriter2);
        CastAndCrew webFeardirector = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, webFear);
        castAndCrewRepository.save(webFeardirector);
        CastAndCrew webFearsEditor = new CastAndCrew(sherwin, "Script Editor", CastOrCrew.CREW, webFear);
        castAndCrewRepository.save(webFearsEditor);
        CastAndCrew webFearproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, webFear);
        castAndCrewRepository.save(webFearproducer);

        Story furyDeep = new Story(
                "Fury from the Deep",
                Format.TV,
                LocalDate.of(1968, 3, 16),
                LocalDate.of(1968, 4, 20),
                "Novelisation (1986), Audio (1993, 2004), Audiobook (2011), DVD/Blu-Ray (2020 Animation).",
                "img_url",
                "The TARDIS lands on the east coast of England by a gas refinery, but a strange sound is echoing through the pipeline. Something is alive down there.",
                "Missing Episodes; Companion; departure; leaving; Victoria; sonic screwdriver; The Slide",
                Series.SEASON5,
                6,
                6,
                "RR",
                "https://tardis.wiki/wiki/Fury_from_the_Deep_(TV_story)");
        furyDeep.addDoctor(secondDoctor);
        furyDeep.addCompanion(jamie);
        furyDeep.addCompanion(victoria);
        storyRepository.save(furyDeep);
        CastAndCrew furyWriter = new CastAndCrew(pemberton, "role", CastOrCrew.CREW, furyDeep);
        castAndCrewRepository.save(furyWriter);
        CastAndCrew furyDeepdirector = new CastAndCrew(hDavid, "Director", CastOrCrew.CREW, furyDeep);
        castAndCrewRepository.save(furyDeepdirector);
        CastAndCrew furyDeepsEditor = new CastAndCrew(sherwin, "Script Editor", CastOrCrew.CREW, furyDeep);
        castAndCrewRepository.save(furyDeepsEditor);
        CastAndCrew furyDeepproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, furyDeep);
        castAndCrewRepository.save(furyDeepproducer);

        Story wheelSpace = new Story(
                "The Wheel in Space",
                Format.TV,
                LocalDate.of(1968, 4, 27),
                LocalDate.of(1968, 6, 1),
                "Novelisation (1988), VHS (1992 – Surviving Episodes), DVD (2004 – Surviving Episodes), Audio (2004).",
                "img_url",
                "The Doctor and Jamie arrive on a space station just as it is invaded.",
                "Missing episodes; John Smith; Cybermen; first appearance; Zoe;",
                Series.SEASON5,
                7,
                6,
                "SS",
                "https://tardis.wiki/wiki/The_Wheel_in_Space_(TV_story)");
        wheelSpace.addDoctor(secondDoctor);
        wheelSpace.addCompanion(jamie);
        wheelSpace.addCompanion(zoe);
        storyRepository.save(wheelSpace);
        CastAndCrew wheelWriter = new CastAndCrew(dWhitaker, "Writer", CastOrCrew.CREW, wheelSpace);
        castAndCrewRepository.save(wheelWriter);
        CastAndCrew wheelSpacedirector = new CastAndCrew(tdVCole, "Director", CastOrCrew.CREW, wheelSpace);
        castAndCrewRepository.save(wheelSpacedirector);
        CastAndCrew wheelSpacesEditor = new CastAndCrew(sherwin, "Script Editor", CastOrCrew.CREW, wheelSpace);
        castAndCrewRepository.save(wheelSpacesEditor);
        CastAndCrew wheelSpaceproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, wheelSpace);
        castAndCrewRepository.save(wheelSpaceproducer);

        Story dominators = new Story(
                "The Dominators",
                Format.TV,
                LocalDate.of(1968, 8, 10),
                LocalDate.of(1968, 9, 7),
                "Novelisation (1984), VHS (1990), Audio (2007), DVD (2010).",
                "img_url",
                "The Dominators arrive on the planet Dulkis planning to destroy the planet to fuel their spacecraft.",
                "Norman Ashby; Quark; Quarks;",
                Series.SEASON6,
                1,
                5,
                "TT",
                "https://tardis.wiki/wiki/The_Dominators_(TV_story)");
        dominators.addDoctor(secondDoctor);
        dominators.addCompanion(jamie);
        dominators.addCompanion(zoe);
        storyRepository.save(dominators);
        CastAndCrew writerDom1 = new CastAndCrew(mHaisman, "Writer", CastOrCrew.CREW, dominators);
        castAndCrewRepository.save(writerDom1);
        CastAndCrew writerDom2 = new CastAndCrew(hLincoln, "Writer", CastOrCrew.CREW, dominators);
        castAndCrewRepository.save(writerDom2);
        CastAndCrew dominatorsdirector = new CastAndCrew(mBarry, "Director", CastOrCrew.CREW, dominators);
        castAndCrewRepository.save(dominatorsdirector);
        CastAndCrew dominatorssEditor = new CastAndCrew(sherwin, "Script Editor", CastOrCrew.CREW, dominators);
        castAndCrewRepository.save(dominatorssEditor);
        CastAndCrew dominatorsproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, dominators);
        castAndCrewRepository.save(dominatorsproducer);

        Story mindRobber = new Story(
                "The Mind Robber",
                Format.TV,
                LocalDate.of(1968, 9, 14),
                LocalDate.of(1968, 10, 12),
                "Novelisation (1986), VHS (1990), DVD (2005), Tales of the TARDIS (2023).",
                "img_url",
                "The TARDIS lands in a white void, and the crew find themselves in a strange world that seems to follow the rules of fiction.",
                "TARDIS; explodes; white robots; land; fiction; of",
                Series.SEASON6,
                2,
                5,
                "UU",
                "https://tardis.wiki/wiki/The_Mind_Robber_(TV_story)");
        mindRobber.addDoctor(secondDoctor);
        mindRobber.addCompanion(jamie);
        mindRobber.addCompanion(zoe);
        storyRepository.save(mindRobber);
        CastAndCrew mindWriter1 = new CastAndCrew(ling, "Writer", CastOrCrew.CREW, mindRobber);
        castAndCrewRepository.save(mindWriter1);
        CastAndCrew mindWriter2 = new CastAndCrew(sherwin, "Writer", CastOrCrew.CREW, mindRobber);
        castAndCrewRepository.save(mindWriter2);
        CastAndCrew mindRobberdirector = new CastAndCrew(dMaloney, "Director", CastOrCrew.CREW, mindRobber);
        castAndCrewRepository.save(mindRobberdirector);
        CastAndCrew mindRobbersEditor = new CastAndCrew(sherwin, "Script Editor", CastOrCrew.CREW, mindRobber);
        castAndCrewRepository.save(mindRobbersEditor);
        CastAndCrew mindRobberproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, mindRobber);
        castAndCrewRepository.save(mindRobberproducer);

        Story invasion = new Story(
                "The Invasion",
                Format.TV,
                LocalDate.of(1968, 11, 2),
                LocalDate.of(1968, 12, 21),
                "Novelisation (1985), VHS (1993 - Surviving Episodes), Audio (2004), DVD (2006 - Animation)",
                "img_url",
                "The head of an international electronics company forms an alliance with invading aliens.",
                "Missing episodes; Cybermen; Tobias Vaughn; International Electromatics; Packer; Cyber planner; Cyber-planner",
                Series.SEASON6,
                3,
                8,
                "VV",
                "https://tardis.wiki/wiki/The_Invasion_(TV_story)");
        invasion.addDoctor(secondDoctor);
        invasion.addCompanion(zoe);
        invasion.addCompanion(jamie);
        storyRepository.save(invasion);
        CastAndCrew InvasionWriter = new CastAndCrew(sherwin, "Writer", CastOrCrew.CREW, invasion);
        castAndCrewRepository.save(InvasionWriter);
        CastAndCrew invasiondirector = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, invasion);
        castAndCrewRepository.save(invasiondirector);
        CastAndCrew invasionsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, invasion);
        castAndCrewRepository.save(invasionsEditor);
        CastAndCrew invasionproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, invasion);
        castAndCrewRepository.save(invasionproducer);

        Story krotons = new Story(
                "The Krotons",
                Format.TV,
                LocalDate.of(1968, 12, 28),
                LocalDate.of(1969, 1, 18),
                "Novelisation (1985), VHS (1991), Audio (2008), DVD (2012)",
                "img_url",
                "The Gonds are raised in perpetual slavery - disguised as education - by the Krotons.",
                "Bob Holmes; Gonds; crystalline",
                Series.SEASON6,
                4,
                4,
                "WW",
                "https://tardis.wiki/wiki/The_Krotons_(TV_story)");
        krotons.addDoctor(secondDoctor);
        krotons.addCompanion(zoe);
        krotons.addCompanion(jamie);
        storyRepository.save(krotons);
        CastAndCrew writerKrotons = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, krotons);
        castAndCrewRepository.save(writerKrotons);
        CastAndCrew krotonsdirector = new CastAndCrew(dMaloney, "Director", CastOrCrew.CREW, krotons);
        castAndCrewRepository.save(krotonsdirector);
        CastAndCrew krotonssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, krotons);
        castAndCrewRepository.save(krotonssEditor);
        CastAndCrew krotonsproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, krotons);
        castAndCrewRepository.save(krotonsproducer);

        Story seedsDeath = new Story(
                "The Seeds of Death",
                Format.TV,
                LocalDate.of(1969, 1, 25),
                LocalDate.of(1969, 3, 1),
                "VHS/Betamax (1985 - Omnibus), Novelisation (1986), DVD (2003, 2011)",
                "img_url",
                "The Earth now uses matter transmission for travel, controlled from a base on the moon. Sure would be a shame if something were to happen to it.",
                "Ice Warriors; Tmat; T-mat; moon; moonbase; I'm a genius",
                Series.SEASON6,
                5,
                6,
                "XX",
                "https://tardis.wiki/wiki/The_Seeds_of_Death_(TV_story)");
        seedsDeath.addDoctor(secondDoctor);
        seedsDeath.addCompanion(zoe);
        seedsDeath.addCompanion(jamie);
        storyRepository.save(seedsDeath);
        CastAndCrew writerSeedeath1 = new CastAndCrew(hayles, "Writer", CastOrCrew.CREW, seedsDeath);
        castAndCrewRepository.save(writerSeedeath1);
        CastAndCrew writerSeedeath2 = new CastAndCrew(terranceD, "Writer", CastOrCrew.CREW, seedsDeath);
        castAndCrewRepository.save(writerSeedeath2);
        CastAndCrew seedsDeathdirector = new CastAndCrew(mFerguson, "Director", CastOrCrew.CREW, seedsDeath);
        castAndCrewRepository.save(seedsDeathdirector);
        CastAndCrew seedsDeathsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, seedsDeath);
        castAndCrewRepository.save(seedsDeathsEditor);
        CastAndCrew seedsDeathproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, seedsDeath);
        castAndCrewRepository.save(seedsDeathproducer);

        Story spacePirates = new Story(
                "The Space Pirates",
                Format.TV,
                LocalDate.of(1969, 3, 8),
                LocalDate.of(1969, 4, 12),
                "Novelisation (1990), VHS (1992 - Surviving Episode), Audio (2003), DVD (2004 - Surviving Episode), Audiobook (2016)",
                "img_url",
                "The TARDIS arrives on a space beacon just as it is attacked by pirates.",
                "Missing episodes; pirates; spaceships",
                Series.SEASON6,
                6,
                6,
                "YY",
                "https://tardis.wiki/wiki/The_Space_Pirates_(TV_story)");
        spacePirates.addDoctor(secondDoctor);
        spacePirates.addCompanion(zoe);
        spacePirates.addCompanion(jamie);
        storyRepository.save(spacePirates);
        CastAndCrew writerSpirates = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, spacePirates);
        castAndCrewRepository.save(writerSpirates);
        CastAndCrew spacePiratesdirector = new CastAndCrew(mHart, "Director", CastOrCrew.CREW, spacePirates);
        castAndCrewRepository.save(spacePiratesdirector);
        CastAndCrew spacePiratessEditor = new CastAndCrew(sherwin, "Script Editor", CastOrCrew.CREW, spacePirates);
        castAndCrewRepository.save(spacePiratessEditor);
        CastAndCrew spacePiratesproducer = new CastAndCrew(pBryant, "Producer", CastOrCrew.CREW, spacePirates);
        castAndCrewRepository.save(spacePiratesproducer);

        Story warGames = new Story(
                "The War Games",
                Format.TV,
                LocalDate.of(1969, 4, 19),
                LocalDate.of(1969, 6, 21),
                "Novelisation (1979), VHs (1990, 2002), DVD (2009), Audiobook (2011).",
                "img_url",
                "It's World War One. And there are Redcoats. And Romans. Something strange is afoot, and it will change the Doctor's life forever.",
                "Regeneration; Time Lords; Troughton; Jamie; Zoe; companion; leave; departure",
                Series.SEASON6,
                7,
                10,
                "ZZ",
                "https://tardis.wiki/wiki/The_War_Games_(TV_story)");
        warGames.addDoctor(secondDoctor);
        warGames.addCompanion(zoe);
        warGames.addCompanion(jamie);
        storyRepository.save(warGames);
        CastAndCrew warGameWrite1 = new CastAndCrew(terranceD, "Writer", CastOrCrew.CREW, warGames);
        castAndCrewRepository.save(warGameWrite1);
        CastAndCrew warGameWrite2 = new CastAndCrew(hulke, "Writer", CastOrCrew.CREW, warGames);
        castAndCrewRepository.save(warGameWrite2);
        CastAndCrew warGamesdirector = new CastAndCrew(dMaloney, "Director", CastOrCrew.CREW, warGames);
        castAndCrewRepository.save(warGamesdirector);
        CastAndCrew warGamessEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, warGames);
        castAndCrewRepository.save(warGamessEditor);
        CastAndCrew warGamesproducer = new CastAndCrew(sherwin, "Producer", CastOrCrew.CREW, warGames);
        castAndCrewRepository.save(warGamesproducer);

        Story spearhead = new Story(
                "Spearhead from Space",
                Format.TV,
                LocalDate.of(1970, 1, 3),
                LocalDate.of(1970, 1, 24),
                "Novelisation (1974), VHS (1988 - Omnibus), VHS (1995), DVD (2001, 2007, 2011, 2013), Audiobook (2008), Blu-Ray (2013).",
                "img_url",
                "The recently regenerated Doctor starts his exile to Earth by having a shower, stealing some stuff, and visiting Madame Tussauds.",
                "Autons; shop window; UNIT; first appearance: Third Doctor",
                Series.SEASON7,
                1,
                4,
                "AAA",
                "https://tardis.wiki/wiki/Spearhead_from_Space_(TV_story)"
        );
        spearhead.addDoctor(thirdDoctor);
        spearhead.addCompanion(liz);
        spearhead.addCompanion(brigadier);
        storyRepository.save(spearhead);

        CastAndCrew spearheadWriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, spearhead);
        castAndCrewRepository.save(spearheadWriter);
        CastAndCrew spearheaddirector = new CastAndCrew(dMartinus, "Director", CastOrCrew.CREW, spearhead);
        castAndCrewRepository.save(spearheaddirector);
        CastAndCrew spearheadsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, spearhead);
        castAndCrewRepository.save(spearheadsEditor);
        CastAndCrew spearheadproducer = new CastAndCrew(sherwin, "Producer", CastOrCrew.CREW, spearhead);
        castAndCrewRepository.save(spearheadproducer);

        Story silurians = new Story(
                "Doctor Who and the Silurians",
                Format.TV,
                LocalDate.of(1970, 1, 31),
                LocalDate.of(1970, 3, 14),
                "Novelisation (1974), VHS (1993), Audio (2006), Audiobook (2007), DVD (2008).",
                "img_url",
                "A nuclear-powered facility in a cave system awakens creatures who have been on Earth for longer than humanity.",
                "Geoffrey Palmer dies; Silurians; cave monster; colourised",
                Series.SEASON7,
                2,
                7,
                "BBB",       "https://tardis.wiki/wiki/Doctor_Who_and_the_Silurians_(TV_story)"
        );
        silurians.addDoctor(thirdDoctor);
        silurians.addCompanion(liz);
        silurians.addCompanion(brigadier);
        storyRepository.save(silurians);

        CastAndCrew writerSilurians = new CastAndCrew(hulke, "Writer", CastOrCrew.CREW, silurians);
        castAndCrewRepository.save(writerSilurians);
        CastAndCrew siluriansdirector = new CastAndCrew(tCombe, "Director", CastOrCrew.CREW, silurians);
        castAndCrewRepository.save(siluriansdirector);
        CastAndCrew silurianssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, silurians);
        castAndCrewRepository.save(silurianssEditor);
        CastAndCrew siluriansproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, silurians);
        castAndCrewRepository.save(siluriansproducer);

        Story ambassadors = new Story(
                "The Ambassadors of Death",
                Format.TV,
                LocalDate.of(1970, 3, 21),
                LocalDate.of(1970, 5, 2),
                "Novelisation (1987), VHS (2002), Audio (2009), DVD (2012).",
                "img_url",
                "A probe to Mars set off on its return journey, but the astronauts on board cannot be reached.",
                "Colourised; martians; sting",
                Series.SEASON7,
                3,
                7,
                "CCC",
                "https://tardis.wiki/wiki/The_Ambassadors_of_Death_(TV_story)"
        );
        ambassadors.addDoctor(thirdDoctor);
        ambassadors.addCompanion(liz);
        ambassadors.addCompanion(brigadier);
        ambassadors.addCompanion(benton);
        storyRepository.save(ambassadors);

        CastAndCrew ambassadorWriter1 = new CastAndCrew(dWhitaker, "Writer", CastOrCrew.CREW, ambassadors);
        castAndCrewRepository.save(ambassadorWriter1);
        CastAndCrew ambassadorWriter2 = new CastAndCrew(tRay, "Writer", CastOrCrew.CREW, ambassadors);
        castAndCrewRepository.save(ambassadorWriter2);
        CastAndCrew ambassadorWriter3 = new CastAndCrew(hulke, "Writer", CastOrCrew.CREW, ambassadors);
        castAndCrewRepository.save(ambassadorWriter3);
        CastAndCrew ambassadorsdirector = new CastAndCrew(mFerguson, "Director", CastOrCrew.CREW, ambassadors);
        castAndCrewRepository.save(ambassadorsdirector);
        CastAndCrew ambassadorssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, ambassadors);
        castAndCrewRepository.save(ambassadorssEditor);
        CastAndCrew ambassadorsproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, ambassadors);
        castAndCrewRepository.save(ambassadorsproducer);


        Story inferno = new Story(
                "Inferno",
                Format.TV,
                LocalDate.of(1970, 5, 9),
                LocalDate.of(1970, 6, 20),
                "Novelisation (1984), VHS (1994), DVD (2006, 2013), Audiobook (2011).",
                "img_url",
                "An experimental drilling project unleashes primeval forces upon the Earth.",
                "Parallel universe; alternate; dimension; eyepatch; colourisation; Krakatoa; Primords",
                Series.SEASON7,
                4,
                7,
                "DDD",
                "https://tardis.wiki/wiki/Inferno_(TV_story) "
        );
        inferno.addDoctor(thirdDoctor);
        inferno.addCompanion(liz);
        inferno.addCompanion(brigadier);
        inferno.addCompanion(benton);
        storyRepository.save(inferno);

        CastAndCrew writerInferno = new CastAndCrew(houghton, "Writer", CastOrCrew.CREW, inferno);
        castAndCrewRepository.save(writerInferno);
        CastAndCrew infernodirector = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, inferno);
        castAndCrewRepository.save(infernodirector);
        CastAndCrew infernodirector2 = new CastAndCrew(bLetts, "Director", CastOrCrew.CREW, inferno);
        castAndCrewRepository.save(infernodirector2);
        CastAndCrew infernosEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, inferno);
        castAndCrewRepository.save(infernosEditor);
        CastAndCrew infernoproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, inferno);
        castAndCrewRepository.save(infernoproducer);


        Story terrorAutons = new Story(
                "Terror of the Autons",
                Format.TV,
                LocalDate.of(1971, 1, 2),
                LocalDate.of(1971, 1, 23),
                "Novelisation (1975), VHS (1993), Audiobook (2010), DVD (2011), Blu-Ray (2021).",
                "img_url",
                "The Autons return as another renegade Time Lord arrives on Earth.",
                "Master; Delgado; new; companion; Mary Whitehouse; Roger; Recolourised;",
                Series.SEASON8,
                1,
                4,
                "EEE",
                "https://tardis.wiki/wiki/Terror_of_the_Autons_(TV_story)"
        );
        terrorAutons.addDoctor(thirdDoctor);
        terrorAutons.addCompanion(jo);
        terrorAutons.addCompanion(brigadier);
        terrorAutons.addCompanion(benton);
        terrorAutons.addCompanion(yates);
        storyRepository.save(terrorAutons);

        CastAndCrew writerAutons = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, terrorAutons);
        castAndCrewRepository.save(writerAutons);
        CastAndCrew terrorAutonsdirector = new CastAndCrew(bLetts, "Director", CastOrCrew.CREW, terrorAutons);
        castAndCrewRepository.save(terrorAutonsdirector);
        CastAndCrew terrorAutonssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, terrorAutons);
        castAndCrewRepository.save(terrorAutonssEditor);
        CastAndCrew terrorAutonsproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, terrorAutons);
        castAndCrewRepository.save(terrorAutonsproducer);

        Story mindEvil = new Story(
                "The Mind of Evil",
                Format.TV,
                LocalDate.of(1971, 1, 30),
                LocalDate.of(1971, 3, 6),
                "Novelisation (1985), VHS (1998), Audio (2009), DVD (2013), Blu-Ray (2021).",
                "img_url",
                "The Keller Machine can pacify even the most dangerous of criminals, but at what cost?",
                "Prison; Keller; espionage; missile; Master; recolourised",
                Series.SEASON8,
                2,
                6,
                "FFF",
                "https://tardis.wiki/wiki/The_Mind_of_Evil_(TV_story) "
        );
        mindEvil.addDoctor(thirdDoctor);
        mindEvil.addCompanion(jo);
        mindEvil.addCompanion(brigadier);
        mindEvil.addCompanion(benton);
        mindEvil.addCompanion(yates);
        storyRepository.save(mindEvil);

        CastAndCrew writerMind = new CastAndCrew(houghton, "role", CastOrCrew.CREW, mindEvil);
        castAndCrewRepository.save(writerMind);
        CastAndCrew mindEvildirector = new CastAndCrew(tCombe, "Director", CastOrCrew.CREW, mindEvil);
        castAndCrewRepository.save(mindEvildirector);
        CastAndCrew mindEvilsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, mindEvil);
        castAndCrewRepository.save(mindEvilsEditor);
        CastAndCrew mindEvilproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, mindEvil);
        castAndCrewRepository.save(mindEvilproducer);

        Story clawsAxos = new Story(
                "The Claws of Axos",
                Format.TV,
                LocalDate.of(1971, 3, 13),
                LocalDate.of(1971, 4, 3),
                "Novelisation (1977), VHS (1992), DVD (2005, 2012), Blu-Ray (2021)",
                "img_url",
                "A group of gold-skinned aliens arrive on Earth and are absolutely lovely.",
                "Axonite; Pigbin Josh; Civil Servant; recolourised; Nuclear Power Station;",
                Series.SEASON8,
                3,
                4,
                "GGG",
                "https://tardis.wiki/wiki/The_Claws_of_Axos_(TV_story) "
        );
        clawsAxos.addDoctor(thirdDoctor);
        clawsAxos.addCompanion(jo);
        clawsAxos.addCompanion(brigadier);
        clawsAxos.addCompanion(benton);
        clawsAxos.addCompanion(yates);
        storyRepository.save(clawsAxos);

        CastAndCrew writerAxos1 = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, clawsAxos);
        castAndCrewRepository.save(writerAxos1);
        CastAndCrew writerAxos2 = new CastAndCrew(dMartin, "Writer", CastOrCrew.CREW, clawsAxos);
        castAndCrewRepository.save(writerAxos2);
        CastAndCrew clawsAxosdirector = new CastAndCrew(mFerguson, "Director", CastOrCrew.CREW, clawsAxos);
        castAndCrewRepository.save(clawsAxosdirector);
        CastAndCrew clawsAxossEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, clawsAxos);
        castAndCrewRepository.save(clawsAxossEditor);
        CastAndCrew clawsAxosproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, clawsAxos);
        castAndCrewRepository.save(clawsAxosproducer);


        Story colonySpace = new Story(
                "Colony in Space",
                Format.TV,
                LocalDate.of(1971, 4, 10),
                LocalDate.of(1971, 5, 15),
                "Novelisation (1974), VHS (2001), Audiobook (2007), DVD (2011), Blu-Ray (2021).",
                "img_url",
                "The Doctor and Jo arrive at a struggling human colony under threat from an interplanetary mining corporation.",
                "IMC; little guy; big seat; doomsday weapon; robot claw gloves",
                Series.SEASON8,
                4,
                6,
                "HHH",
                "https://tardis.wiki/wiki/Colony_in_Space_(TV_story)"
        );
        colonySpace.addDoctor(thirdDoctor);
        colonySpace.addCompanion(jo);
        storyRepository.save(colonySpace);

        CastAndCrew colonyWriter = new CastAndCrew(hulke, "Writer", CastOrCrew.CREW, colonySpace);
        castAndCrewRepository.save(colonyWriter);
        CastAndCrew colonySpacedirector = new CastAndCrew(mEBriant, "Director", CastOrCrew.CREW, colonySpace);
        castAndCrewRepository.save(colonySpacedirector);
        CastAndCrew colonySpacesEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, colonySpace);
        castAndCrewRepository.save(colonySpacesEditor);
        CastAndCrew colonySpaceproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, colonySpace);
        castAndCrewRepository.save(colonySpaceproducer);

        Story daemons = new Story(
                "The Dæmons",
                Format.TV,
                LocalDate.of(1971, 5, 22),
                LocalDate.of(1971, 6, 19),
                "Novelisation (1974), Script Book (1992), VHS (1993) Audiobook (2008), DVD (2012), Blu-Ray (2021).",
                "img_url",
                "An archaeological dig in a small English village accidentally awakens a horned beast.",
                "Devil’s End; gargoyle; shouty man; BBC 3; witchcraft; exploding church; stone guy; recolourised",
                Series.SEASON8,
                5,
                5,
                "JJJ",
                "https://tardis.wiki/wiki/The_D%C3%A6mons_(TV_story)"
        );
        daemons.addDoctor(thirdDoctor);
        daemons.addCompanion(jo);
        daemons.addCompanion(brigadier);
        daemons.addCompanion(benton);
        daemons.addCompanion(yates);
        storyRepository.save(daemons);

        CastAndCrew daemonWrite1 = new CastAndCrew(bLetts, "Writer", CastOrCrew.CREW, daemons);
        castAndCrewRepository.save(daemonWrite1);
        CastAndCrew daemonWrite2 = new CastAndCrew(sloman, "Writer", CastOrCrew.CREW, daemons);
        castAndCrewRepository.save(daemonWrite2);
        CastAndCrew daemonsdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, daemons);
        castAndCrewRepository.save(daemonsdirector);
        CastAndCrew daemonssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, daemons);
        castAndCrewRepository.save(daemonssEditor);
        CastAndCrew daemonsproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, daemons);
        castAndCrewRepository.save(daemonsproducer);

        Story dayDaleks = new Story(
                "Day of the Daleks",
                Format.TV,
                LocalDate.of(1972, 1, 1),
                LocalDate.of(1972, 1, 22),
                "Novelisation (1974), VHS/Betamax (1986 – Omnibus), VHS (1994), Laserdisc (1996), DVD (2011), Blu-Ray (2023).",
                "Freedom fighters from the future travel to the Twentieth Century to change their history.",
                "synopsis",
                "Ogrons; Dalek; alternate history; paradox;",
                Series.SEASON9,
                1,
                4,
                "KKK",
                "https://tardis.wiki/wiki/Day_of_the_Daleks_(TV_story)"
        );
        dayDaleks.addDoctor(thirdDoctor);
        dayDaleks.addCompanion(jo);
        dayDaleks.addCompanion(brigadier);
        dayDaleks.addCompanion(benton);
        dayDaleks.addCompanion(yates);
        storyRepository.save(dayDaleks);

        CastAndCrew dayDwriter = new CastAndCrew(lMarks, "Writer", CastOrCrew.CREW, dayDaleks);
        castAndCrewRepository.save(dayDwriter);
        CastAndCrew dayDaleksdirector = new CastAndCrew(pBernard, "Director", CastOrCrew.CREW, dayDaleks);
        castAndCrewRepository.save(dayDaleksdirector);
        CastAndCrew dayDalekssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, dayDaleks);
        castAndCrewRepository.save(dayDalekssEditor);
        CastAndCrew dayDaleksproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, dayDaleks);
        castAndCrewRepository.save(dayDaleksproducer);

        Story cursePeladon = new Story(
                "The Curse of Peladon",
                Format.TV,
                LocalDate.of(1972, 1, 29),
                LocalDate.of(1972, 2, 19),
                "Novelisation (1975), VHS (1993), Audiobook (1995 – Abridged), Audio (2007), DVD (2010), Audiobook (2013 – Unabridged), Blu-Ray (2023).",
                "img_url",
                "The Doctor and Jo arrive on Peladon to find a King wearing shorts and a smattering of political intrigue.",
                "Aggedor; Alpha Centauri; Galactic Federation; Ice Warriors; Grun",
                Series.SEASON9,
                2,
                4,
                "MMM",
                "https://tardis.wiki/wiki/The_Curse_of_Peladon_(TV_story)"
        );
        cursePeladon.addDoctor(thirdDoctor);
        cursePeladon.addCompanion(jo);
        storyRepository.save(cursePeladon);

        CastAndCrew cPeladonWriter = new CastAndCrew(hayles, "Writer", CastOrCrew.CREW, cursePeladon);
        castAndCrewRepository.save(cPeladonWriter);
        CastAndCrew cursePeladondirector = new CastAndCrew(lMayne, "Director", CastOrCrew.CREW, cursePeladon);
        castAndCrewRepository.save(cursePeladondirector);
        CastAndCrew cursePeladonsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, cursePeladon);
        castAndCrewRepository.save(cursePeladonsEditor);
        CastAndCrew cursePeladonproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, cursePeladon);
        castAndCrewRepository.save(cursePeladonproducer);

        Story seaDevils = new Story(
                "The Sea Devils",
                Format.TV,
                LocalDate.of(1972, 2, 26),
                LocalDate.of(1972, 4, 1),
                "Novelisation (1974), VHS (1995), Audio (2006), DVD (2008), Audiobook (2012), Blu-Ray (2023).",
                "img_url",
                "The Doctor and Jo visit the Master in a high security prison, and hear about a series of mysterious sinkings in the area.",
                "Master; Silurian; Navy; Civil Servant; Prison; experimental score; electronic music; Malcolm Clarke",
                Series.SEASON9,
                3,
                6,
                "LLL",
                "https://tardis.wiki/wiki/The_Sea_Devils_(TV_story)"
        );
        seaDevils.addDoctor(thirdDoctor);
        seaDevils.addCompanion(jo);
        storyRepository.save(seaDevils);

        CastAndCrew writerSeaDevil = new CastAndCrew(hulke, "Writer", CastOrCrew.CREW, seaDevils);
        castAndCrewRepository.save(writerSeaDevil);
        CastAndCrew seaDevilsdirector = new CastAndCrew(mEBriant, "Director", CastOrCrew.CREW, seaDevils);
        castAndCrewRepository.save(seaDevilsdirector);
        CastAndCrew seaDevilssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, seaDevils);
        castAndCrewRepository.save(seaDevilssEditor);
        CastAndCrew seaDevilsproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, seaDevils);
        castAndCrewRepository.save(seaDevilsproducer);

        Story mutants = new Story(
                "The Mutants",
                Format.TV,
                LocalDate.of(1972, 4, 8),
                LocalDate.of(1972, 5, 13),
                "Novelisation (1977), VHS (2003), DVD (2011), Blu-Ray (2023).",
                "img_url",
                "Human colonists are looking to change Solos’ atmosphere to make it breathable for humans, but not for the native Solonians.",
                "Solos; Marshal; Solonian; Mutts; Geoffrey Palmer dies",
                Series.SEASON9,
                4,
                6,
                "NNN",
                "https://tardis.wiki/wiki/The_Mutants_(TV_story)"
        );
        mutants.addDoctor(thirdDoctor);
        mutants.addCompanion(jo);
        storyRepository.save(mutants);

        CastAndCrew mutantWriter1 = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, mutants);
        castAndCrewRepository.save(mutantWriter1);
        CastAndCrew mutantWriter2 = new CastAndCrew(dMartin, "Writer", CastOrCrew.CREW, mutants);
        castAndCrewRepository.save(mutantWriter2);
        CastAndCrew mutantsdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, mutants);
        castAndCrewRepository.save(mutantsdirector);
        CastAndCrew mutantssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, mutants);
        castAndCrewRepository.save(mutantssEditor);
        CastAndCrew mutantsproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, mutants);
        castAndCrewRepository.save(mutantsproducer);

        Story timeMonster = new Story(
                "The Time Monster",
                Format.TV,
                LocalDate.of(1972, 5, 20),
                LocalDate.of(1972, 6, 24),
                "Novelisation (1985), VHS (2001), DVD (2010), Blu-Ray (2023).",
                "img_url",
                "The Master tries to summon a time eating bird monster.",
                "Master; Atlantis; UNIT; baby Benton; TOMTIT; console room; Chronovore; Kronos",
                Series.SEASON9,
                5,
                6,
                "OOO",
                "https://tardis.wiki/wiki/The_Time_Monster_(TV_story)"
        );
        timeMonster.addDoctor(thirdDoctor);
        timeMonster.addCompanion(jo);
        timeMonster.addCompanion(brigadier);
        timeMonster.addCompanion(benton);
        timeMonster.addCompanion(yates);
        storyRepository.save(timeMonster);

        CastAndCrew writerTimeMonster = new CastAndCrew(sloman, "Writer", CastOrCrew.CREW, timeMonster);
        castAndCrewRepository.save(writerTimeMonster);
        CastAndCrew writerTimeMonster2 = new CastAndCrew(bLetts, "Writer", CastOrCrew.CREW, timeMonster);
        castAndCrewRepository.save(writerTimeMonster2);
        CastAndCrew timeMonsterdirector = new CastAndCrew(pBernard, "Director", CastOrCrew.CREW, timeMonster);
        castAndCrewRepository.save(timeMonsterdirector);
        CastAndCrew timeMonstersEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, timeMonster);
        castAndCrewRepository.save(timeMonstersEditor);
        CastAndCrew timeMonsterproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, timeMonster);
        castAndCrewRepository.save(timeMonsterproducer);

        Story threeDoctors = new Story("The Three Doctors",
                Format.TV,
                LocalDate.of(1972, 12, 30),
                LocalDate.of(1973, 1, 20),
                "Novelisation (1975), VHS (1991, 2002), DVD (2003, 2012), Blu-Ray (2019), Tales of the TARDIS (2023).",
                "img_url",
                "The Time Lords are facing an insurmountable power drain, and call on the Doctor to help – all of him.",
                "keywords",
                Series.SEASON10,
                1,
                4,
                "RRR",
                "https://tardis.wiki/wiki/The_Three_Doctors_(TV_story)"
        );
        threeDoctors.addDoctor(thirdDoctor);
        threeDoctors.addDoctor(secondDoctor);
        threeDoctors.addDoctor(firstDoctor);
        threeDoctors.addCompanion(jo);
        threeDoctors.addCompanion(brigadier);
        threeDoctors.addCompanion(benton);
        storyRepository.save(threeDoctors);

        CastAndCrew threedrWr1 = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, threeDoctors);
        castAndCrewRepository.save(threedrWr1);
        CastAndCrew threedrWr2 = new CastAndCrew(dMartin, "Writer", CastOrCrew.CREW, threeDoctors);
        castAndCrewRepository.save(threedrWr2);
        CastAndCrew threeDoctorsdirector = new CastAndCrew(lMayne, "Director", CastOrCrew.CREW, threeDoctors);
        castAndCrewRepository.save(threeDoctorsdirector);
        CastAndCrew threeDoctorssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, threeDoctors);
        castAndCrewRepository.save(threeDoctorssEditor);
        CastAndCrew threeDoctorsproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, threeDoctors);
        castAndCrewRepository.save(threeDoctorsproducer);


        Story carnival = new Story("Carnival of Monsters",
                Format.TV,
                LocalDate.of(1973, 1, 27),
                LocalDate.of(1973, 2, 17),
                "Novelisation (1977), VHS (1995), DVD (2002, 2011), Blu-Ray (2019).",
                "img_url",
                "The TARDIS lands on the SS Bernice, a ship that disappeared in the Indian Ocean, and find themselves in a time loop.",
                "Delaware; Miniscope; Polari; Drashig; Inter Minor; Cyberman; SS Bernice",
                Series.SEASON10,
                2,
                4,
                "PPP",
                "https://tardis.wiki/wiki/Carnival_of_Monsters_(TV_story"
        );
        carnival.addDoctor(thirdDoctor);
        carnival.addCompanion(jo);
        storyRepository.save(carnival);

        CastAndCrew carnivalWriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, carnival);
        castAndCrewRepository.save(carnivalWriter);
        CastAndCrew carnivaldirector = new CastAndCrew(bLetts, "Director", CastOrCrew.CREW, carnival);
        castAndCrewRepository.save(carnivaldirector);
        CastAndCrew carnivalsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, carnival);
        castAndCrewRepository.save(carnivalsEditor);
        CastAndCrew carnivalproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, carnival);
        castAndCrewRepository.save(carnivalproducer);

        Story frontier = new Story(
                "Frontier in Space",
                Format.TV,
                LocalDate.of(1973, 2, 24),
                LocalDate.of(1973, 3, 31),
                "Novelisation (1976), VHS (1995), Audiobook (2008), DVD (2009), Blu-Ray (2019).",
                "img_url",
                "In the future, the Doctor and Jo discover Earth and Draconia are on the verge of interstellar war.",
                "Ogrons; Master; Daleks; Delgado; Moon; Lunar; Eater; Space War; Delaware",
                Series.SEASON10,
                3,
                6,
                "QQQ",
                "https://tardis.wiki/wiki/Frontier_in_Space_(TV_story)"
        );
        frontier.addDoctor(thirdDoctor);
        frontier.addCompanion(jo);
        storyRepository.save(frontier);

        CastAndCrew frontierWriter = new CastAndCrew(hulke, "Writer", CastOrCrew.CREW, frontier);
        castAndCrewRepository.save(frontierWriter);
        CastAndCrew frontierdirector = new CastAndCrew(pBernard, "Director", CastOrCrew.CREW, frontier);
        castAndCrewRepository.save(frontierdirector);
        CastAndCrew frontiersEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, frontier);
        castAndCrewRepository.save(frontiersEditor);
        CastAndCrew frontierproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, frontier);
        castAndCrewRepository.save(frontierproducer);

        Story planetDaleks = new Story(
                "Planet of the Daleks",
                Format.TV,
                LocalDate.of(1973, 4, 7),
                LocalDate.of(1973, 5, 12),
                "Novelisation (1976), Audiobook (1995 – Abridged), VHS (1999), DVD (2009), Audiobook (2013 – Unabridged), Blu-Ray (2019).",
                "img_url",
                "Following the events of ‘Frontier in Space’, a recovering Doctor helps a group of Thals on a planet full of Daleks.",
                "Dalek; Thal; invisible; Spiridon; recolourised",
                Series.SEASON10,
                4,
                6,
                "SSS",
                "https://tardis.wiki/wiki/Planet_of_the_Daleks_(TV_story)"
        );
        planetDaleks.addDoctor(thirdDoctor);
        planetDaleks.addCompanion(jo);
        storyRepository.save(planetDaleks);

        CastAndCrew planetDalekWriter = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, planetDaleks);
        castAndCrewRepository.save(planetDalekWriter);
        CastAndCrew planetDaleksdirector = new CastAndCrew(dMaloney, "Director", CastOrCrew.CREW, planetDaleks);
        castAndCrewRepository.save(planetDaleksdirector);
        CastAndCrew planetDalekssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, planetDaleks);
        castAndCrewRepository.save(planetDalekssEditor);
        CastAndCrew planetDaleksproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, planetDaleks);
        castAndCrewRepository.save(planetDaleksproducer);

        Story greenDeath = new Story(
                "The Green Death",
                Format.TV,
                LocalDate.of(1973, 5, 19),
                LocalDate.of(1973, 6, 23),
                "Novelisation (1975), VHS (1996), DVD (2004, 2013), Audiobook (2008), Blu-Ray (2019).",
                "img_url",
                "The Doctor and Jo investigate bright green corpses in a sensitive depiction of Wales.",
                "one with maggots; Wales; Global Chemicals; serendipity; nut hutch; fungus; companion; departure; leaves; Jo",
                Series.SEASON10,
                5,
                6,
                "TTT",
                "https://tardis.wiki/wiki/The_Green_Death_(TV_story)"
        );
        greenDeath.addDoctor(thirdDoctor);
        greenDeath.addCompanion(jo);
        greenDeath.addCompanion(brigadier);
        greenDeath.addCompanion(benton);
        greenDeath.addCompanion(yates);
        storyRepository.save(greenDeath);

        CastAndCrew greenDeathWriter = new CastAndCrew(sloman, "Writer", CastOrCrew.CREW, greenDeath);
        castAndCrewRepository.save(greenDeathWriter);
        CastAndCrew greenDeathWriter2 = new CastAndCrew(bLetts, "Writer", CastOrCrew.CREW, greenDeath);
        castAndCrewRepository.save(greenDeathWriter2);
        CastAndCrew greenDeathdirector = new CastAndCrew(mEBriant, "Director", CastOrCrew.CREW, greenDeath);
        castAndCrewRepository.save(greenDeathdirector);
        CastAndCrew greenDeathsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, greenDeath);
        castAndCrewRepository.save(greenDeathsEditor);
        CastAndCrew greenDeathproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, greenDeath);
        castAndCrewRepository.save(greenDeathproducer);

        Story timeWarrior = new Story(
                "The Time Warrior",
                Format.TV,
                LocalDate.of(1973, 12, 15),
                LocalDate.of(1974, 1, 5),
                "Novelisation (1978), VHS (1989 – Omnibus), DVD (2007), Audiobook (2009),",
                "img_url",
                "Twentieth Century scientists are being kidnapped…but not by someone from the Twentieth Century.",
                "Sontarans; Sontaran; Medieval; Dot Cotton; Companion; introduction; first appearance; pseudo-historical; Boba Fett",
                Series.SEASON11,
                1,
                4,
                "UUU",
                "https://tardis.wiki/wiki/The_Time_Warrior_(TV_story)"
        );
        timeWarrior.addDoctor(thirdDoctor);
        timeWarrior.addCompanion(sarahJane);
        storyRepository.save(timeWarrior);

        CastAndCrew timeWarriorWriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, timeWarrior);
        castAndCrewRepository.save(timeWarriorWriter);
        CastAndCrew timeWarriordirector = new CastAndCrew(aBromly, "Director", CastOrCrew.CREW, timeWarrior);
        castAndCrewRepository.save(timeWarriordirector);
        CastAndCrew timeWarriorsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, timeWarrior);
        castAndCrewRepository.save(timeWarriorsEditor);
        CastAndCrew timeWarriorproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, timeWarrior);
        castAndCrewRepository.save(timeWarriorproducer);

        Story invasionDinosaurs = new Story(
                "Invasion of the Dinosaurs",
                Format.TV,
                LocalDate.of(1974, 1, 12),
                LocalDate.of(1974, 2, 16),
                "Novelisation (1976), VHS (2003), Audiobook (2007), DVD (2012), ",
                "img_url",
                "London has been evacuated. Why? It’s only bloomin’ DINOSAURS. That’s why.",
                "KKLAK; Dinosaur Invasion; recolourised; Whomobile; puppets; Invasion;",
                Series.SEASON11,
                2,
                6,
                "WWW",
                "https://tardis.wiki/wiki/Invasion_of_the_Dinosaurs_(TV_story)"
        );
        invasionDinosaurs.addDoctor(thirdDoctor);
        invasionDinosaurs.addCompanion(sarahJane);
        invasionDinosaurs.addCompanion(brigadier);
        invasionDinosaurs.addCompanion(benton);
        invasionDinosaurs.addCompanion(yates);
        storyRepository.save(invasionDinosaurs);

        CastAndCrew invDinoWriter = new CastAndCrew(hulke, "Writer", CastOrCrew.CREW, invasionDinosaurs);
        castAndCrewRepository.save(invDinoWriter);
        CastAndCrew invasionDinosaursdirector = new CastAndCrew(pRussell, "Director", CastOrCrew.CREW, invasionDinosaurs);
        castAndCrewRepository.save(invasionDinosaursdirector);
        CastAndCrew invasionDinosaurssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, invasionDinosaurs);
        castAndCrewRepository.save(invasionDinosaurssEditor);
        CastAndCrew invasionDinosaursproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, invasionDinosaurs);
        castAndCrewRepository.save(invasionDinosaursproducer);

        Story deathDaleks = new Story(
                "Death to the Daleks",
                Format.TV,
                LocalDate.of(1974, 2, 23),
                LocalDate.of(1974, 3, 16),
                "Novelisation (1978), VHS (1987 – Omnibus), VHS (1995) DVD (2012).",
                "img_url",
                "The TARDIS lands on Exxilon and is immediately drained of all power.",
                "Tarrant; root; Marine Space Corps; City; tiled floor; parrinium; space plague",
                Series.SEASON11,
                3,
                4,
                "XXX",
                "https://tardis.wiki/wiki/Death_to_the_Daleks_(TV_story)"
        );
        deathDaleks.addDoctor(thirdDoctor);
        deathDaleks.addCompanion(sarahJane);

        storyRepository.save(deathDaleks);

        CastAndCrew deathDaleksWriter = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, deathDaleks);
        castAndCrewRepository.save(deathDaleksWriter);
        CastAndCrew deathDaleksdirector = new CastAndCrew(mEBriant, "Director", CastOrCrew.CREW, deathDaleks);
        castAndCrewRepository.save(deathDaleksdirector);
        CastAndCrew deathDalekssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, deathDaleks);
        castAndCrewRepository.save(deathDalekssEditor);
        CastAndCrew deathDalekssEditor2 = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, deathDaleks);
        castAndCrewRepository.save(deathDalekssEditor2);
        CastAndCrew deathDaleksproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, deathDaleks);
        castAndCrewRepository.save(deathDaleksproducer);

        Story monsterPeladon = new Story(
                "The Monster of Peladon",
                Format.TV,
                LocalDate.of(1974, 3, 23),
                LocalDate.of(1974, 4, 27),
                "Novelisation (1980), VHS (1995), Audio (2008), DVD (2010).",
                "img_url",
                "The Doctor returns to Peladon where he experiences some miner difficulties.",
                "Galactic Federation; Miners; Mining; Ice Warrior; badger; hair",
                Series.SEASON11,
                4,
                6,
                "YYY",
                "https://tardis.wiki/wiki/The_Monster_of_Peladon_(TV_story)"
        );
        monsterPeladon.addDoctor(thirdDoctor);
        monsterPeladon.addCompanion(sarahJane);
        storyRepository.save(monsterPeladon);

        CastAndCrew monsterPeladonWriter = new CastAndCrew(hayles, "Writer", CastOrCrew.CREW, monsterPeladon);
        castAndCrewRepository.save(monsterPeladonWriter);
        CastAndCrew monsterPeladondirector = new CastAndCrew(lMayne, "Director", CastOrCrew.CREW, monsterPeladon);
        castAndCrewRepository.save(monsterPeladondirector);
        CastAndCrew monsterPeladonsEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, monsterPeladon);
        castAndCrewRepository.save(monsterPeladonsEditor);
        CastAndCrew monsterPeladonproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, monsterPeladon);
        castAndCrewRepository.save(monsterPeladonproducer);

        Story planetSpiders = new Story(
                "Planet of the Spiders",
                Format.TV,
                LocalDate.of(1974, 5, 4),
                LocalDate.of(1974, 6, 8),
                "Novelisation (1975), VHS (1991), DVD (2011).",
                "img_url",
                "The Doctor accidentally kills a clairvoyant and his day only gets worse from there.",
                "Whomobile; regeneration; blue crystal; Metebelis Three; Buddhism",
                Series.SEASON11,
                5,
                6,
                "ZZZ",
                "https://tardis.wiki/wiki/Planet_of_the_Spiders_(TV_story)"
        );
        planetSpiders.addDoctor(thirdDoctor);
        planetSpiders.addCompanion(sarahJane);
        planetSpiders.addCompanion(brigadier);
        planetSpiders.addCompanion(benton);
        planetSpiders.addCompanion(yates);
        storyRepository.save(planetSpiders);

        CastAndCrew planetSpidersWriter1 = new CastAndCrew(sloman, "Writer", CastOrCrew.CREW, planetSpiders);
        castAndCrewRepository.save(planetSpidersWriter1);
        CastAndCrew planetSpidersWriter2 = new CastAndCrew(bLetts, "Writer", CastOrCrew.CREW, planetSpiders);
        castAndCrewRepository.save(planetSpidersWriter2);
        CastAndCrew planetSpidersdirector = new CastAndCrew(bLetts, "Director", CastOrCrew.CREW, planetSpiders);
        castAndCrewRepository.save(planetSpidersdirector);
        CastAndCrew planetSpiderssEditor = new CastAndCrew(terranceD, "Script Editor", CastOrCrew.CREW, planetSpiders);
        castAndCrewRepository.save(planetSpiderssEditor);
        CastAndCrew planetSpidersproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, planetSpiders);
        castAndCrewRepository.save(planetSpidersproducer);

        Story robot = new Story(
                "Robot",
                Format.TV,
                LocalDate.of(1974, 12, 28),
                LocalDate.of(1975, 1, 18),
                "Novelisation (1975), Junior Novelisation (1979), VHS (1992), Script Book (2001), Audiobook (2007), DVD (2007), Blu-Ray (2018).",
                "img_url",
                "A group of fascist scientists are using a big sad robot to steal weapons.",
                "CSO; tank; King Kong; Giant Robot; first appearance: Harry Sullivan",
                Series.SEASON12,
                1,
                4,
                "4A",
                "https://tardis.wiki/wiki/Robot_(TV_story)"
        );
        robot.addDoctor(fourthDoctor);
        robot.addCompanion(sarahJane);
        robot.addCompanion(brigadier);
        robot.addCompanion(benton);
        robot.addCompanion(harry);
        storyRepository.save(robot);

        CastAndCrew robotWriter = new CastAndCrew(terranceD, "Writer", CastOrCrew.CREW, robot);
        castAndCrewRepository.save(robotWriter);
        CastAndCrew robotdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, robot);
        castAndCrewRepository.save(robotdirector);
        CastAndCrew robotsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, robot);
        castAndCrewRepository.save(robotsEditor);
        CastAndCrew robotproducer = new CastAndCrew(bLetts, "Producer", CastOrCrew.CREW, robot);
        castAndCrewRepository.save(robotproducer);

        Story arkSpace = new Story(
                "The Ark in Space",
                Format.TV,
                LocalDate.of(1975, 1, 25),
                LocalDate.of(1975, 2, 15),
                "Novelisation (1977), Betamax (1985 - Omnibus), VHS (1989 - Omnibus), VHS (1994), Laserdisc (1996), Script Book (2001), DVD (2002, 2013), Blu-Ray (2018).",
                "img_url",
                "The TARDIS lands on a space station where the remnants of humanity are waiting to outsit eternity...but something else has got in with them.",
                "Wirrn; Alien; wasp; larvae; grub; mutation; Lucarotti; Langley;",
                Series.SEASON12,
                2,
                4,
                "4C",
                "https://tardis.wiki/wiki/The_Ark_in_Space_(TV_story)"
        );
        arkSpace.addDoctor(fourthDoctor);
        arkSpace.addCompanion(sarahJane);
        arkSpace.addCompanion(harry);
        storyRepository.save(arkSpace);

        CastAndCrew arkSpaceWriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, arkSpace);
        castAndCrewRepository.save(arkSpaceWriter);
        CastAndCrew arkSpacedirector = new CastAndCrew(rBennett, "Director", CastOrCrew.CREW, arkSpace);
        castAndCrewRepository.save(arkSpacedirector);
        CastAndCrew arkSpacesEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, arkSpace);
        castAndCrewRepository.save(arkSpacesEditor);
        CastAndCrew arkSpaceproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, arkSpace);
        castAndCrewRepository.save(arkSpaceproducer);

        Story sontaranExperiment = new Story(
                "The Sontaran Experiment",
                Format.TV,
                LocalDate.of(1975, 2, 22),
                LocalDate.of(1975, 3, 1),
                "Novelisation (1978), VHS (1991), Script Book (2001), DVD (2006), Blu-Ray (2018).",
                "img_url",
                "The TARDIS crew arrive on the devastated Earth to find horrific experiments are taking place.",
                "Sontaran; Dartmoor; broken collar; torture",
                Series.SEASON12,
                3,
                2,
                "4C",
                "https://tardis.wiki/wiki/The_Sontaran_Experiment_(TV_story)"
        );
        sontaranExperiment.addDoctor(fourthDoctor);
        sontaranExperiment.addCompanion(sarahJane);
        sontaranExperiment.addCompanion(harry);
        storyRepository.save(sontaranExperiment);

        CastAndCrew sontaranExperimentW1 = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, sontaranExperiment);
        castAndCrewRepository.save(sontaranExperimentW1);
        CastAndCrew sontaranExperimentW2 = new CastAndCrew(dMartin, "Writer", CastOrCrew.CREW, sontaranExperiment);
        castAndCrewRepository.save(sontaranExperimentW2);
        CastAndCrew sontaranExperimentdirector = new CastAndCrew(rBennett, "Director", CastOrCrew.CREW, sontaranExperiment);
        castAndCrewRepository.save(sontaranExperimentdirector);
        CastAndCrew sontaranExperimentsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, sontaranExperiment);
        castAndCrewRepository.save(sontaranExperimentsEditor);
        CastAndCrew sontaranExperimentproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, sontaranExperiment);
        castAndCrewRepository.save(sontaranExperimentproducer);

        Story genesisDaleks = new Story(
                "Genesis of the Daleks",
                Format.TV,
                LocalDate.of(1975, 3, 8),
                LocalDate.of(1975, 4, 12),
                "Novelisation (1976), Audio (1979 - Abridged), VHS (1991), Audio (2001), Script Book (2001), DVD (2006), Blu-Ray (2018).",
                "img_url",
                "The Time Lords ask the Doctor to avert the Daleks creation, which goes about as well as you'd expect.",
                "Davros; first appearance; Skaro; Thals; Kaleds;",
                Series.SEASON12,
                4,
                6,
                "4E",
                "https://tardis.wiki/wiki/Genesis_of_the_Daleks_(TV_story)"
        );
        genesisDaleks.addDoctor(fourthDoctor);
        genesisDaleks.addCompanion(sarahJane);
        genesisDaleks.addCompanion(harry);
        storyRepository.save(genesisDaleks);

        CastAndCrew genesisDaleksWriter = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, genesisDaleks);
        castAndCrewRepository.save(genesisDaleksWriter);
        CastAndCrew genesisDaleksdirector = new CastAndCrew(dMaloney, "Director", CastOrCrew.CREW, genesisDaleks);
        castAndCrewRepository.save(genesisDaleksdirector);
        CastAndCrew genesisDalekssEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, genesisDaleks);
        castAndCrewRepository.save(genesisDalekssEditor);
        CastAndCrew genesisDaleksproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, genesisDaleks);
        castAndCrewRepository.save(genesisDaleksproducer);

        Story revengeCybermen = new Story(
                "Revenge of the Cybermen",
                Format.TV,
                LocalDate.of(1975, 4, 19),
                LocalDate.of(1975, 5, 10),
                "Novelisation (1976), VHS/Betamax/Laserdisc (1983 - Omnibus), VHS (1999), Script Book (2001), DVD (2010), Blu-Ray (2018), Audiobook (2022).",
                "img_url",
                "Arriving back on Nova Beacon in its past, the TARDIS crew find a mysterious plague is taking out the crew.",
                "Cybermen; Voga; my skystriker, my glory; Harry Sullivan is an imbecile; Cyber-Leader; Robert Holmes;",
                Series.SEASON12,
                5,
                4,
                "4D",
                "https://tardis.wiki/wiki/Revenge_of_the_Cybermen_(TV_story)"
        );
        revengeCybermen.addDoctor(fourthDoctor);
        revengeCybermen.addCompanion(sarahJane);
        revengeCybermen.addCompanion(harry);
        storyRepository.save(revengeCybermen);

        CastAndCrew revengeCybermenWriter1 = new CastAndCrew(gDavis, "Writer", CastOrCrew.CREW, revengeCybermen);
        castAndCrewRepository.save(revengeCybermenWriter1);
        CastAndCrew revengeCybermenWriter2 = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, revengeCybermen);
        castAndCrewRepository.save(revengeCybermenWriter2);
        CastAndCrew revengeCybermendirector = new CastAndCrew(mEBriant, "Director", CastOrCrew.CREW, revengeCybermen);
        castAndCrewRepository.save(revengeCybermendirector);
        CastAndCrew revengeCybermensEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, revengeCybermen);
        castAndCrewRepository.save(revengeCybermensEditor);
        CastAndCrew revengeCybermenproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, revengeCybermen);
        castAndCrewRepository.save(revengeCybermenproducer);


        Story terrorZygons = new Story(
                "Terror of the Zygons",
                Format.TV,
                LocalDate.of(1975, 8, 30),
                LocalDate.of(1975, 9, 20),
                "Novelisation (1976), VHS (1988), Laserdisc (1997), DVD (2013)",
                "img_url",
                "Lots of oil rigs are disappearing in the North Sea, and as oil rigs aren't the sort of thing that normally disappear UNIT are called in to investigate.",
                "first appearance: Zygons; Loch Ness Monster; the Scotch; Scotland;",
                Series.SEASON13,
                1,
                4,
                "4F",
                "https://tardis.wiki/wiki/Terror_of_the_Zygons_(TV_story)"
        );
        terrorZygons.addDoctor(fourthDoctor);
        terrorZygons.addCompanion(sarahJane);
        terrorZygons.addCompanion(brigadier);
        terrorZygons.addCompanion(benton);
        terrorZygons.addCompanion(harry);
        storyRepository.save(terrorZygons);

        CastAndCrew terrorZygonsWriter = new CastAndCrew(rBanksStewart, "Writer", CastOrCrew.CREW, terrorZygons);
        castAndCrewRepository.save(terrorZygonsWriter);
        CastAndCrew terrorZygonsdirector = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, terrorZygons);
        castAndCrewRepository.save(terrorZygonsdirector);
        CastAndCrew terrorZygonssEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, terrorZygons);
        castAndCrewRepository.save(terrorZygonssEditor);
        CastAndCrew terrorZygonsproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, terrorZygons);
        castAndCrewRepository.save(terrorZygonsproducer);

        Story planetEvil = new Story(
                "Planet of Evil",
                Format.TV,
                LocalDate.of(1975, 9, 27),
                LocalDate.of(1975, 10, 18),
                "Novelisation (1977), VHS (1994), DVD (2007).",
                "img_url",
                "The TARDIS picks up a distress call from the edge of the known universe.",
                "Jekyll; Hyde; Zeta Minor; Forbidden Planet; anti-matter",
                Series.SEASON13,
                2,
                4,
                "4H",
                "https://tardis.wiki/wiki/Planet_of_Evil_(TV_story)"
        );
        planetEvil.addDoctor(fourthDoctor);
        planetEvil.addCompanion(sarahJane);
        storyRepository.save(planetEvil);

        CastAndCrew planetEvilWrite = new CastAndCrew(lMarks, "Writer", CastOrCrew.CREW, planetEvil);
        castAndCrewRepository.save(planetEvilWrite);
        CastAndCrew planetEvildirector = new CastAndCrew(dMaloney, "Director", CastOrCrew.CREW, planetEvil);
        castAndCrewRepository.save(planetEvildirector);
        CastAndCrew planetEvilsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, planetEvil);
        castAndCrewRepository.save(planetEvilsEditor);
        CastAndCrew planetEvilproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, planetEvil);
        castAndCrewRepository.save(planetEvilproducer);

        Story pyramids = new Story(
                "Pyramids of Mars",
                Format.TV,
                LocalDate.of(1975, 10, 25),
                LocalDate.of(1975, 11, 15),
                "Novelisation (1976), VHS/Betamax (1985 - omnibus), VHS (1994), DVD (2004), Audiobook (2008), Blu-Ray (2011 - part of 'The Sarah Jane Adventures' Series 4 boxset)",
                "img_url",
                "One of the powerful evil beings in the universe is trapped on Mars, and the Doctor has to stop him being released.",
                "Egypt; Mummy; mummies; robots; gothic; hammer horror; Osirans; pseudohistorical; Stephen Harris",
                Series.SEASON13,
                3,
                4,
                "4G",
                "https://tardis.wiki/wiki/Pyramids_of_Mars_(TV_story)"
        );
        pyramids.addDoctor(fourthDoctor);
        pyramids.addCompanion(sarahJane);
        storyRepository.save(pyramids);

        CastAndCrew pyramidswriter1 = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, pyramids);
        castAndCrewRepository.save(pyramidswriter1);
        CastAndCrew pyramidswriter2 = new CastAndCrew(greifer, "Writer", CastOrCrew.CREW, pyramids);
        castAndCrewRepository.save(pyramidswriter2);
        CastAndCrew pyramidsdirector = new CastAndCrew(pRussell, "Director", CastOrCrew.CREW, pyramids);
        castAndCrewRepository.save(pyramidsdirector);
        CastAndCrew pyramidssEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, pyramids);
        castAndCrewRepository.save(pyramidssEditor);
        CastAndCrew pyramidsproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, pyramids);
        castAndCrewRepository.save(pyramidsproducer);

        Story androidInvasion = new Story(
                "The Android Invasion",
                Format.TV,
                LocalDate.of(1975, 11, 22),
                LocalDate.of(1975, 12, 13),
                "Novelisation (1978), VHS (1995), DVD (2012).",
                "img_url",
                "The Doctor and Sarah find themselves in the sleepy English village of Devesham, which is guilty of clinical Kraal practice.",
                "duplicates; eyepatch; kraals; last story; Benton; Harry; companion; departure; leaving",
                Series.SEASON13,
                4,
                4,
                "4J",
                "https://tardis.wiki/wiki/The_Android_Invasion_(TV_story)"
        );
        androidInvasion.addDoctor(fourthDoctor);
        androidInvasion.addCompanion(sarahJane);
        androidInvasion.addCompanion(benton);
        androidInvasion.addCompanion(harry);
        storyRepository.save(androidInvasion);

        CastAndCrew androidWriter = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, androidInvasion);
        castAndCrewRepository.save(androidWriter);
        CastAndCrew androidInvasiondirector = new CastAndCrew(bLetts, "Director", CastOrCrew.CREW, androidInvasion);
        castAndCrewRepository.save(androidInvasiondirector);
        CastAndCrew androidInvasionsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, androidInvasion);
        castAndCrewRepository.save(androidInvasionsEditor);
        CastAndCrew androidInvasionproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, androidInvasion);
        castAndCrewRepository.save(androidInvasionproducer);

        Story brainMorbius = new Story(
                "The Brain of Morbius",
                Format.TV,
                LocalDate.of(1976, 1, 3),
                LocalDate.of(1976, 1, 24),
                "Novelisation (1977), Junior Novelisation (1980), VHS/Laserdisc (1984 - Omnibus), VHS (1990), DVD (2008).",
                "img_url",
                "A mad scientist has preserved the brain of a war criminal. Grand guignol ensues.",
                "Solon; magnificent head; Sisterhood of Karn; Mutt; Frankenstein; Robin Bland; Morbius Doctors",
                Series.SEASON13,
                5,
                4,
                "4K",
                "https://tardis.wiki/wiki/The_Brain_of_Morbius_(TV_story)"
        );
        brainMorbius.addDoctor(fourthDoctor);
        brainMorbius.addCompanion(sarahJane);
        storyRepository.save(brainMorbius);

        CastAndCrew brainMorbiusWriter1 = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, brainMorbius);
        castAndCrewRepository.save(brainMorbiusWriter1);
        CastAndCrew brainMorbiusWriter2 = new CastAndCrew(terranceD, "Writer", CastOrCrew.CREW, brainMorbius);
        castAndCrewRepository.save(brainMorbiusWriter2);
        CastAndCrew brainMorbiusdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, brainMorbius);
        castAndCrewRepository.save(brainMorbiusdirector);
        CastAndCrew brainMorbiussEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, brainMorbius);
        castAndCrewRepository.save(brainMorbiussEditor);
        CastAndCrew brainMorbiusproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, brainMorbius);
        castAndCrewRepository.save(brainMorbiusproducer);

        Story seedsDoom = new Story(  "The Seeds of Doom",
                Format.TV,
                LocalDate.of(1976, 1, 31),
                LocalDate.of(1976, 3, 6),
                "Novelisation (1977), VHS (1994), DVD (2010), Audiobook (2019).",
                "img_url",
                "A strange, egg-shaped object is discovered in Antarctica. It is not an egg.",
                "UNIT; Krynoid; the Thing from Another World; Green Cathedral; no touch pod",
                Series.SEASON13,
                6,
                6,
                "4L",
                "https://tardis.wiki/wiki/The_Seeds_of_Doom_(TV_story)"
        );
        seedsDoom.addDoctor(fourthDoctor);
        seedsDoom.addCompanion(sarahJane);
        storyRepository.save(seedsDoom);

        CastAndCrew seedsDoomWriter = new CastAndCrew(rBanksStewart, "Writer", CastOrCrew.CREW, seedsDoom);
        castAndCrewRepository.save(seedsDoomWriter);
        CastAndCrew seedsDoomdirector = new CastAndCrew(dCamfield, "Director", CastOrCrew.CREW, seedsDoom);
        castAndCrewRepository.save(seedsDoomdirector);
        CastAndCrew seedsDoomsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, seedsDoom);
        castAndCrewRepository.save(seedsDoomsEditor);
        CastAndCrew seedsDoomproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, seedsDoom);
        castAndCrewRepository.save(seedsDoomproducer);


        Story masque = new Story(
                "The Masque of Mandragora",
                Format.TV,
                LocalDate.of(1976, 9, 4),
                LocalDate.of(1976, 9, 25),
                "Novelisation (1977), VHS (1991), Audiobook (2009), DVD (2010), Blu-Ray (2020).",
                "img_url",
                "A living energy structure leads the TARDIS to Fifteenth Century Italy, a sinister cult, and a smattering of intrigue.",
                "Helix; pseudohistorical; energy; Portmeirion",
                Series.SEASON14,
                1,
                4,
                "4M",
                "https://tardis.wiki/wiki/The_Masque_of_Mandragora_(TV_story)"
        );
        masque.addDoctor(fourthDoctor);
        masque.addCompanion(sarahJane);
        storyRepository.save(masque);

        CastAndCrew masqueWriter = new CastAndCrew(lMarks, "Writer", CastOrCrew.CREW, masque);
        castAndCrewRepository.save(masqueWriter);
        CastAndCrew masquedirector = new CastAndCrew(rBennett, "Director", CastOrCrew.CREW, masque);
        castAndCrewRepository.save(masquedirector);
        CastAndCrew masquesEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, masque);
        castAndCrewRepository.save(masquesEditor);
        CastAndCrew masqueproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, masque);
        castAndCrewRepository.save(masqueproducer);

        Story handFear = new Story(
                "The Hand of Fear",
                Format.TV,
                LocalDate.of(1976, 10, 2),
                LocalDate.of(1976, 10, 23),
                "Novelisation (1979), VHS (1996), DVD (2006), Blu-Ray (2020).",
                "img_url",
                "Sarah is possessed by a fossilised hand.",
                "Companion; departure; leave; Sarah Jane Smith; Eldrad must live; Power Station",
                Series.SEASON14,
                2,
                4,
                "4N",
                "https://tardis.wiki/wiki/The_Hand_of_Fear_(TV_story)"
        );
        handFear.addDoctor(fourthDoctor);
        handFear.addCompanion(sarahJane);
        storyRepository.save(handFear);

        CastAndCrew handFearWriter1 = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, handFear);
        castAndCrewRepository.save(handFearWriter1);
        CastAndCrew handFearWriter2 = new CastAndCrew(dMartin, "Writer", CastOrCrew.CREW, handFear);
        castAndCrewRepository.save(handFearWriter2);
        CastAndCrew handFeardirector = new CastAndCrew(lMayne, "Director", CastOrCrew.CREW, handFear);
        castAndCrewRepository.save(handFeardirector);
        CastAndCrew handFearsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, handFear);
        castAndCrewRepository.save(handFearsEditor);
        CastAndCrew handFearproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, handFear);
        castAndCrewRepository.save(handFearproducer);

        Story deadlyAssassin = new Story(
                "The Deadly Assassin",
                Format.TV,
                LocalDate.of(1976, 10, 30),
                LocalDate.of(1976, 11, 20),
                "Novelisation (1977), VHS (1991), DVD (2009), Blu-Ray (2020).",
                "img_url",
                "The Doctor is accused of murdering the President of the Time Lords.",
                "Manchurian Candidate; Gallifrey; Time Lords; Matrix; Eye of Harmony; Mary Whitehouse",
                Series.SEASON14,
                3,
                4,
                "4P",
                "https://tardis.wiki/wiki/The_Deadly_Assassin_(TV_story)"
        );
        deadlyAssassin.addDoctor(fourthDoctor);
        storyRepository.save(deadlyAssassin);

        CastAndCrew deadlyWriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, deadlyAssassin);
        castAndCrewRepository.save(deadlyWriter);
        CastAndCrew deadlyAssassindirector = new CastAndCrew(dMaloney, "Director", CastOrCrew.CREW, deadlyAssassin);
        castAndCrewRepository.save(deadlyAssassindirector);
        CastAndCrew deadlyAssassinsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, deadlyAssassin);
        castAndCrewRepository.save(deadlyAssassinsEditor);
        CastAndCrew deadlyAssassinproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, deadlyAssassin);
        castAndCrewRepository.save(deadlyAssassinproducer);

        Story faceEvil = new Story(
                "The Face of Evil",
                Format.TV,
                LocalDate.of(1977, 1, 1),
                LocalDate.of(1977, 1, 22),
                "Novelisation (1978), VHs (1999), DVD (2012), Blu-Ray (2020).",
                "img_url",
                "The Doctor arrives on a planet populated by two tribes, and discovers he is their god of evil.",
                "day god went mad; computer; tribes; first appearance; debut; Leela; companion",
                Series.SEASON14,
                4,
                4,
                "4Q",
                "https://tardis.wiki/wiki/The_Face_of_Evil_(TV_story)"
        );
        faceEvil.addDoctor(fourthDoctor);
        faceEvil.addCompanion(leela);
        storyRepository.save(faceEvil);

        CastAndCrew faceEvilWriter = new CastAndCrew(cBoucher, "Writer", CastOrCrew.CREW, faceEvil);
        castAndCrewRepository.save(faceEvilWriter);
        CastAndCrew faceEvildirector = new CastAndCrew(pRoberts, "Director", CastOrCrew.CREW, faceEvil);
        castAndCrewRepository.save(faceEvildirector);
        CastAndCrew faceEvilsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, faceEvil);
        castAndCrewRepository.save(faceEvilsEditor);
        CastAndCrew faceEvilproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, faceEvil);
        castAndCrewRepository.save(faceEvilproducer);

        Story robotsDeath = new Story(
                "The Robots of Death",
                Format.TV,
                LocalDate.of(1977, 1, 29),
                LocalDate.of(1977, 2, 19),
                "Novelisation (1979), VHS (1986 - Omnibus), VHS (1995), DVD (2000, 2012), Blu-Ray (2020).",
                "img_url",
                "The Doctor and Leela arrive on a Sandminer where the money-driven crew are being picked off one-by-one.",
                "Kaldor City; Robophobia; murder; robot",
                Series.SEASON14,
                5,
                4,
                "4R",
                "https://tardis.wiki/wiki/The_Robots_of_Death_(TV_story)"
        );
        robotsDeath.addDoctor(fourthDoctor);
        robotsDeath.addCompanion(leela);
        storyRepository.save(robotsDeath);

        CastAndCrew robotsDeathWriter = new CastAndCrew(cBoucher, "Writer", CastOrCrew.CREW, robotsDeath);
        castAndCrewRepository.save(robotsDeathWriter);
        CastAndCrew robotsDeathdirector = new CastAndCrew(mEBriant, "Director", CastOrCrew.CREW, robotsDeath);
        castAndCrewRepository.save(robotsDeathdirector);
        CastAndCrew robotsDeathsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, robotsDeath);
        castAndCrewRepository.save(robotsDeathsEditor);
        CastAndCrew robotsDeathproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, robotsDeath);
        castAndCrewRepository.save(robotsDeathproducer);

        Story talons = new Story(
                "The Talons of Weng-Chiang",
                Format.TV,
                LocalDate.of(1977, 2, 26),
                LocalDate.of(1977, 4, 2),
                "Novelisation (1977), VHS (1989 - Omnibus), Script Book (1989), DVD (2003, 2010), Blu-Ray (2020).",
                "img_url",
                "The Doctor and Leela investigate disappearances and strange deaths around a theatre in Victorian London.",
                "No, it is racist; Phantom of the Opera; Yellow Peril; giant rat; Jack the Ripper; Magnus Greel; Mr Sin; Butcher of Brisbane; final story: Philip Hinchcliffe",
                Series.SEASON14,
                6,
                6,
                "4S",
                "https://tardis.wiki/wiki/The_Talons_of_Weng-Chiang_(TV_story)"
        );
        talons.addDoctor(fourthDoctor);
        talons.addCompanion(leela);
        storyRepository.save(talons);

        CastAndCrew talonsWriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, talons);
        castAndCrewRepository.save(talonsWriter);
        CastAndCrew talonsdirector = new CastAndCrew(dMaloney, "Director", CastOrCrew.CREW, talons);
        castAndCrewRepository.save(talonsdirector);
        CastAndCrew talonssEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, talons);
        castAndCrewRepository.save(talonssEditor);
        CastAndCrew talonsproducer = new CastAndCrew(hinchcliffe, "Producer", CastOrCrew.CREW, talons);
        castAndCrewRepository.save(talonsproducer);


        Story fangRock = new Story(
                "Horror of Fang Rock",
                Format.TV,
                LocalDate.of(1977, 9, 3),
                LocalDate.of(1977, 9, 24),
                "Novelisation (1978), VHS (1998), DVD (2005), Audio (2021), Blu-ray (2024).",
                "img_url",
                "’Gentlemen, I've got news for you. This lighthouse is under attack, and by morning we might all be dead. Anyone interested?’",
                "pseudohistorical; Rutan; lighthouse; everyone dies; you will do as the Doctor says or I will cut out your heart; electricity; awful posh people; Beast of Fang Rock; brown; blue; eyes; change",
                Series.SEASON15,
                1,
                4,
                "4V",
                "https://tardis.wiki/wiki/Horror_of_Fang_Rock_(TV_story)"
        );
        fangRock.addDoctor(fourthDoctor);
        fangRock.addCompanion(leela);
        storyRepository.save(fangRock);

        CastAndCrew fangRockname = new CastAndCrew(terranceD, "Writer", CastOrCrew.CREW, fangRock);
        castAndCrewRepository.save(fangRockname);
        CastAndCrew fangRockdirector = new CastAndCrew(pRussell, "Director", CastOrCrew.CREW, fangRock);
        castAndCrewRepository.save(fangRockdirector);
        CastAndCrew fangRocksEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, fangRock);
        castAndCrewRepository.save(fangRocksEditor);
        CastAndCrew fangRockproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, fangRock);
        castAndCrewRepository.save(fangRockproducer);

        Story invisibleEnemy = new Story(
                "The Invisible Enemy",
                Format.TV,
                LocalDate.of(1977, 10, 1),
                LocalDate.of(1977, 10, 22),
                "Novelisation (1979), VHS (2002), DVD (2008), Blu-ray (2024).",
                "img_url",
                "A sentient virus, a robot dog, and a trip inside the Doctor's mind.",
                "K9; first appearance; giant; prawn; Nucleus of the Swarm; Doctor’s brain;",
                Series.SEASON15,
                2,
                4,
                "4T",
                "https://tardis.wiki/wiki/The_Invisible_Enemy_(TV_story)"
        );
        invisibleEnemy.addDoctor(fourthDoctor);
        invisibleEnemy.addCompanion(leela);
        storyRepository.save(invisibleEnemy);

        CastAndCrew invisibleEnemywriter = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, invisibleEnemy);
        castAndCrewRepository.save(invisibleEnemywriter);
        CastAndCrew invisibleEnemywriter2 = new CastAndCrew(dMartin, "Writer", CastOrCrew.CREW, invisibleEnemy);
        castAndCrewRepository.save(invisibleEnemywriter2);
        CastAndCrew invisibleEnemydirector = new CastAndCrew(dGoodwin, "Director", CastOrCrew.CREW, invisibleEnemy);
        castAndCrewRepository.save(invisibleEnemydirector);
        CastAndCrew invisibleEnemysEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, invisibleEnemy);
        castAndCrewRepository.save(invisibleEnemysEditor);
        CastAndCrew invisibleEnemyproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, invisibleEnemy);
        castAndCrewRepository.save(invisibleEnemyproducer);

        Story fendahl = new Story(
                "Image of the Fendahl",
                Format.TV,
                LocalDate.of(1977, 10, 29),
                LocalDate.of(1977, 11, 19),
                "Novelisation (1979), VHS (1993), DVD (2009), Blu-ray (2024).",
                "img_url",
                "Four scientists test a twelve million year old skull, unleashing a god-like gestalt.",
                "Possession; von Daniken; mist or fog; Fetch Priory; skull; cult; salt",
                Series.SEASON15,
                3,
                4,
                "4X",
                "https://tardis.wiki/wiki/Image_of_the_Fendahl_(TV_story)"
        );
        fendahl.addDoctor(fourthDoctor);
        fendahl.addCompanion(leela);
        storyRepository.save(fendahl);

        CastAndCrew fendahlwriter = new CastAndCrew(cBoucher, "Writer", CastOrCrew.CREW, fendahl);
        castAndCrewRepository.save(fendahlwriter);
        CastAndCrew fendahldirector = new CastAndCrew(gSpentonFoster, "Director", CastOrCrew.CREW, fendahl);
        castAndCrewRepository.save(fendahldirector);
        CastAndCrew fendahlsEditor = new CastAndCrew(holmes, "Script Editor", CastOrCrew.CREW, fendahl);
        castAndCrewRepository.save(fendahlsEditor);
        CastAndCrew fendahlproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, fendahl);
        castAndCrewRepository.save(fendahlproducer);

        Story sunmakers = new Story(
                "The Sunmakers",
                Format.TV,
                LocalDate.of(1977, 11, 26),
                LocalDate.of(1977, 12, 17),
                "Novelisation (1982), VHS (2001), DVD (2011), Blu-ray (2024).",
                "img_url",
                "The population of Pluto, warmed by artificial suns, are being taxed to death.",
                "Taxes; BBC; Inland Revenue; P45; Denis Healey; Pluto; thrown off roof; Hade;",
                Series.SEASON15,
                4,
                4,
                "4W",
                "https://tardis.wiki/wiki/The_Sun_Makers_(TV_story)"
        );
        sunmakers.addDoctor(fourthDoctor);
        sunmakers.addCompanion(leela);
        sunmakers.addCompanion(k9);
        storyRepository.save(sunmakers);

        CastAndCrew sunmakersname = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, sunmakers);
        castAndCrewRepository.save(sunmakersname);
        CastAndCrew sunmakersdirector = new CastAndCrew(pRoberts, "Director", CastOrCrew.CREW, sunmakers);
        castAndCrewRepository.save(sunmakersdirector);
        CastAndCrew sunmakerssEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, sunmakers);
        castAndCrewRepository.save(sunmakerssEditor);
        CastAndCrew sunmakersproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, sunmakers);
        castAndCrewRepository.save(sunmakersproducer);

        Story underworld = new Story(
                "Underworld",
                Format.TV,
                LocalDate.of(1978, 1, 7),
                LocalDate.of(1978, 1, 28),
                "Novelisation (1980), VHS (2002), DVD (2010), Blu-ray (2024).",
                "img_url",
                "A Minyan ship goes on an epic quest to restore their species.",
                "CSO; inflation; argonauts; Jason and the; Quest; for the Golden Fleece;the quest is the quest;",
                Series.SEASON15,
                5,
                4,
                "4Y",
                "https://tardis.wiki/wiki/Underworld_(TV_story)"
        );
        underworld.addDoctor(fourthDoctor);
        underworld.addCompanion(leela);
        underworld.addCompanion(k9);
        storyRepository.save(underworld);

        CastAndCrew underworldwriter = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, underworld );
        castAndCrewRepository.save(underworldwriter );

        CastAndCrew underworldwriter2 = new CastAndCrew(dMartin, "Writer", CastOrCrew.CREW, underworld );
        castAndCrewRepository.save(underworldwriter2);
        CastAndCrew underworlddirector = new CastAndCrew(nStewart, "Director", CastOrCrew.CREW, underworld);
        castAndCrewRepository.save(underworlddirector);
        CastAndCrew underworldsEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, underworld);
        castAndCrewRepository.save(underworldsEditor);
        CastAndCrew underworldproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, underworld);
        castAndCrewRepository.save(underworldproducer);

        Story invasionTime = new Story(
                "The Invasion of Time",
                Format.TV,
                LocalDate.of(1978, 2, 4),
                LocalDate.of(1978, 3, 11),
                "Novelisation (1980), VHS (2000), DVD (2008), Blu-ray (2024).",
                "img_url",
                "The Doctor returns to Gallifrey and claims the Presidency, but can he be trusted?",
                "David Agnew; Vardans; tinfoil; Sontarans; Gallifrey; Shobogans; Cockney; Rassilon; Demat Gun; Turned Evil; TARDIS; last appearance; Leela; companion; leave; departure; married off",
                Series.SEASON15,
                6,
                6,
                "4Z",
                "https://tardis.wiki/wiki/The_Invasion_of_Time_(TV_story)"
        );
        invasionTime.addDoctor(fourthDoctor);
        invasionTime.addCompanion(leela);
        invasionTime.addCompanion(k9);
        storyRepository.save(invasionTime);

        CastAndCrew invasionTimewriter = new CastAndCrew(aRead, "Writer", CastOrCrew.CREW, invasionTime);
        castAndCrewRepository.save(invasionTimewriter);

        CastAndCrew invasionTimewriter2 = new CastAndCrew(gWilliams, "Writer", CastOrCrew.CREW, invasionTime);
        castAndCrewRepository.save(invasionTimewriter2);

        CastAndCrew invasionTimedirector = new CastAndCrew(gBlake, "Director", CastOrCrew.CREW, invasionTime);
        castAndCrewRepository.save(invasionTimedirector);
        CastAndCrew invasionTimesEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, invasionTime);
        castAndCrewRepository.save(invasionTimesEditor);
        CastAndCrew invasionTimeproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, invasionTime);
        castAndCrewRepository.save(invasionTimeproducer);



        Story ribos = new Story(  "The Ribos Operation",
                Format.TV,
                LocalDate.of(1978, 9, 2),
                LocalDate.of(1978, 9, 23),
                "Novelisation (1979), VHS (1995), DVD (2007), Audio (2011),",
                "img_url",
                "The Doctor is sent on a quest for the Key to Time in order to save the universe.",
                "The Key to Time; White Guardian; Binro the Heretic; con man; jethrik;",
                Series.SEASON16,
                1,
                4,
                "5A",
                "https://tardis.wiki/wiki/The_Ribos_Operation_(TV_story)"
        );
        ribos.addDoctor(fourthDoctor);
        ribos.addCompanion(romanaOne);
        ribos.addCompanion(k9);
        storyRepository.save(ribos);

        CastAndCrew riboswriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, ribos);
        castAndCrewRepository.save(riboswriter);
        CastAndCrew ribosdirector = new CastAndCrew(gSpentonFoster, "Director", CastOrCrew.CREW, ribos);
        castAndCrewRepository.save(ribosdirector);
        CastAndCrew ribossEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, ribos);
        castAndCrewRepository.save(ribossEditor);
        CastAndCrew ribosproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, ribos);
        castAndCrewRepository.save(ribosproducer);

        Story piratePlanet = new Story(

                "The Pirate Planet",
                Format.TV,
                LocalDate.of(1978, 9, 30),
                LocalDate.of(1978, 10, 21),
                "VHS (1995), DVD (2007), Novelisation (2017, 2021), Audiobook (2017).",
                "img_url",
                "The TARDIS tries to land on Calufrax, but arrives on Zanak - a pirate planet that has been hollowed out and fitted with hyperspace engines.",
                "The Key to Time; nurse; Polyphase Avatron: empire: Mr Fibuli; Mentiads; Queen; Xanxia; Britain; but what’s it for;",
                Series.SEASON16,
                2,
                4,
                "5B",
                "https://tardis.wiki/wiki/The_Pirate_Planet_(TV_story)"
        );
        piratePlanet.addDoctor(fourthDoctor);
        piratePlanet.addCompanion(romanaOne);
        piratePlanet.addCompanion(k9);
        storyRepository.save(piratePlanet);

        CastAndCrew piratePlanetwriter = new CastAndCrew(dAdams, "Writer", CastOrCrew.CREW, piratePlanet);
        castAndCrewRepository.save(piratePlanetwriter);
        CastAndCrew piratePlanetdirector = new CastAndCrew(pRoberts, "Director", CastOrCrew.CREW, piratePlanet);
        castAndCrewRepository.save(piratePlanetdirector);
        CastAndCrew piratePlanetsEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, piratePlanet);
        castAndCrewRepository.save(piratePlanetsEditor);
        CastAndCrew piratePlanetproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, piratePlanet);
        castAndCrewRepository.save(piratePlanetproducer);

        Story stonesBlood = new Story(

                "The Stones of Blood",
                Format.TV,
                LocalDate.of(1978, 10, 28),
                LocalDate.of(1978, 11, 18),
                "Novelisation (1980), VHS (1995), DVD (2007), Audio Adaptation (2011).",
                "img_url",
                "The third segment of the Key to Time brings the Doctor and Romana to a stone circle in Cornwall.",
                "The Key to Time; Ogri; Cailleach; Megara; just good friends;",
                Series.SEASON16,
                3,
                4,
                "5C",
                "https://tardis.wiki/wiki/The_Stones_of_Blood_(TV_story)"
        );
        stonesBlood.addDoctor(fourthDoctor);
        stonesBlood.addCompanion(romanaOne);
        stonesBlood.addCompanion(k9);
        storyRepository.save(stonesBlood);

        CastAndCrew stonesBloodwriter = new CastAndCrew(dFisher, "Writer", CastOrCrew.CREW, stonesBlood);
        castAndCrewRepository.save(stonesBloodwriter);
        CastAndCrew stonesBlooddirector = new CastAndCrew(dBlake, "Director", CastOrCrew.CREW, stonesBlood);
        castAndCrewRepository.save(stonesBlooddirector);
        CastAndCrew stonesBloodsEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, stonesBlood);
        castAndCrewRepository.save(stonesBloodsEditor);
        CastAndCrew stonesBloodproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, stonesBlood);
        castAndCrewRepository.save(stonesBloodproducer);

        Story tara = new Story(

                "The Androids of Tara",
                Format.TV,
                LocalDate.of(1978, 11, 25),
                LocalDate.of(1978, 12, 16),
                "Novelisation (1980), , VHS (1995), DVD (2007), Audio Adaptation (2012).",
                "img_url",
                "The Doctor and Romana get caught up in the schemes of Count Grendel of Gracht, in a world of android doubles and double crossing.",
                "The Key to Time; Prisoner of Zenda;",
                Series.SEASON16,
                4,
                4,
                "5D",
                "https://tardis.wiki/wiki/The_Androids_of_Tara_(TV_story)"
        );
        tara.addDoctor(fourthDoctor);
        tara.addCompanion(romanaOne);
        tara.addCompanion(k9);
        storyRepository.save(tara);

        CastAndCrew tarawriter = new CastAndCrew(dFisher, "Writer", CastOrCrew.CREW, tara);
        castAndCrewRepository.save(tarawriter);
        CastAndCrew taradirector = new CastAndCrew(mHayes, "Director", CastOrCrew.CREW, tara);
        castAndCrewRepository.save(taradirector);
        CastAndCrew tarasEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, tara);
        castAndCrewRepository.save(tarasEditor);
        CastAndCrew taraproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, tara);
        castAndCrewRepository.save(taraproducer);

        Story kroll = new Story(

                "The Power of Kroll",
                Format.TV,
                LocalDate.of(1978, 12, 23),
                LocalDate.of(1979, 1, 13),
                "Novelisation (1980), VHS (1995), DVD (2007).",
                "img_url",
                "The marsh moon of Delta Magna is home to the fifth segment of the Key to Time, and also a colossal squid worshipped as a god.",
                "The Key to Time; giant squid; refinery; swampies; green; paint; gun runner",
                Series.SEASON16,
                5,
                4,
                "5E",
                "https://tardis.wiki/wiki/The_Power_of_Kroll_(TV_story)"
        );
        kroll.addDoctor(fourthDoctor);
        kroll.addCompanion(romanaOne);
        storyRepository.save(kroll);

        CastAndCrew krollwriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, kroll);
        castAndCrewRepository.save(krollwriter);
        CastAndCrew krolldirector = new CastAndCrew(nStewart, "Director", CastOrCrew.CREW, kroll);
        castAndCrewRepository.save(krolldirector);
        CastAndCrew krollsEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, kroll);
        castAndCrewRepository.save(krollsEditor);
        CastAndCrew krollproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, kroll);
        castAndCrewRepository.save(krollproducer);

        Story armageddon = new Story(

                "The Armageddon Factor",
                Format.TV,
                LocalDate.of(1979, 1, 20),
                LocalDate.of(1979, 2, 24),
                "Novelisation (1980), VHS (1995), DVD (2007).",
                "img_url",
                "The final segment of the Key to Time is somewhere in a war zone, and the Doctor and Romana are not the only parties looking for it.",
                "The Key to Time; Black Guardian; last appearance; Mary Tamm; Romana I; first appearance; Princess Astra; Atrios; Zeos; Shadow; Drax",
                Series.SEASON16,
                6,
                6,
                "5F",
                "https://tardis.wiki/wiki/The_Armageddon_Factor_(TV_story)"
        );
        armageddon.addDoctor(fourthDoctor);
        armageddon.addCompanion(romanaOne);
        armageddon.addCompanion(k9);
        storyRepository.save(armageddon);

        CastAndCrew armageddonWriter = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, armageddon);
        castAndCrewRepository.save(armageddonWriter);

        CastAndCrew armageddonWriter2 = new CastAndCrew(dMartin, "Writer", CastOrCrew.CREW, armageddon);
        castAndCrewRepository.save(armageddonWriter2);
        CastAndCrew armageddondirector = new CastAndCrew(mHayes, "Director", CastOrCrew.CREW, armageddon);
        castAndCrewRepository.save(armageddondirector);
        CastAndCrew armageddonsEditor = new CastAndCrew(aRead, "Script Editor", CastOrCrew.CREW, armageddon);
        castAndCrewRepository.save(armageddonsEditor);
        CastAndCrew armageddonproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, armageddon);
        castAndCrewRepository.save(armageddonproducer);


        Story destinyDaleks = new Story(
                "Destiny of the Daleks",
                Format.TV,
                LocalDate.of(1979, 9, 1),
                LocalDate.of(1979, 9, 22),
                "Novelisation (1979), VHS (1994), DVD (2007), Blu-ray (2021).",
                "img_url",
                "The Daleks return to Skaro to find their creator, hoping it will give them the edge in their ongoing war.",
                "Davros; first appearance; Romana II; Skaro; radiation; Movellans; rock paper scissors",
                Series.SEASON17,
                1,
                4,
                "5J",
                "https://tardis.wiki/wiki/Destiny_of_the_Daleks_(TV_story)"
        );
        destinyDaleks.addDoctor(fourthDoctor);
        destinyDaleks.addCompanion(romanaTwo);
        storyRepository.save(destinyDaleks);

        CastAndCrew destinyDaleksWriter = new CastAndCrew(tNation, "Writer", CastOrCrew.CREW, destinyDaleks);
        castAndCrewRepository.save(destinyDaleksWriter);
        CastAndCrew destinyDaleksdirector = new CastAndCrew(kGrieve, "Director", CastOrCrew.CREW, destinyDaleks);
        castAndCrewRepository.save(destinyDaleksdirector);
        CastAndCrew destinyDalekssEditor = new CastAndCrew(dAdams, "Script Editor", CastOrCrew.CREW, destinyDaleks);
        castAndCrewRepository.save(destinyDalekssEditor);
        CastAndCrew destinyDaleksproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, destinyDaleks);
        castAndCrewRepository.save(destinyDaleksproducer);

        Story cityDeath = new Story(
                "City of Death",
                Format.TV,
                LocalDate.of(1979, 9, 29),
                LocalDate.of(1979, 10, 20),
                "VHS (1991), DVD (2005), Audio (2013), Novelisation (2015), Audiobook (2015), Blu-ray (2021).",
                "img_url",
                "The Doctor and Romana's trip to Paris is interrupted by time disturbances. Meanwhile, the mysterious Count Scarlioni has a surprisingly large number of Mona Lisas in his cellar.",
                "David Agnew; Scaroth; last of the Jagaroth; John Cleese; Eleanor Bron; cameos; what a wonderful butler; he's so violent; punch; bye bye Duggan",
                Series.SEASON17,
                2,
                4,
                "5H",
                "https://tardis.wiki/wiki/City_of_Death_(TV_story)"
        );
        cityDeath.addDoctor(fourthDoctor);
        cityDeath.addCompanion(romanaTwo);
        storyRepository.save(cityDeath);

        CastAndCrew cityDeathwriter = new CastAndCrew(dAdams, "Writer", CastOrCrew.CREW, cityDeath);
        castAndCrewRepository.save(cityDeathwriter);
        CastAndCrew cityDeathwriter2 = new CastAndCrew(gWilliams, "Writer", CastOrCrew.CREW, cityDeath);
        castAndCrewRepository.save(cityDeathwriter2);
        CastAndCrew cityDeathwriter3 = new CastAndCrew(dFisher, "Writer", CastOrCrew.CREW, cityDeath);
        castAndCrewRepository.save(cityDeathwriter3);
        CastAndCrew cityDeathdirector = new CastAndCrew(mHayes, "Director", CastOrCrew.CREW, cityDeath);
        castAndCrewRepository.save(cityDeathdirector);
        CastAndCrew cityDeathsEditor = new CastAndCrew(dAdams, "Script Editor", CastOrCrew.CREW, cityDeath);
        castAndCrewRepository.save(cityDeathsEditor);
        CastAndCrew cityDeathproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, cityDeath);
        castAndCrewRepository.save(cityDeathproducer);

        Story creaturePit = new Story(
                "The Creature from the Pit",
                Format.TV,
                LocalDate.of(1979, 10, 27),
                LocalDate.of(1979, 11, 17),
                "Novelisation (1981), VHS (2002), Audiobook (2008), DVD (2010), Blu-ray (2021).",
                "img_url",
                "The Lady Adrasta rules Chloris with an iron fist. Just ask the big green monster living in the mines.",
                "Chloris; the one where it looks like the Doctor is giving a big green dick a blow job; Erato; wolfweeds",
                Series.SEASON17,
                3,
                4,
                "5G",
                "https://tardis.wiki/wiki/The_Creature_from_the_Pit_(TV_story)"
        );
        creaturePit.addDoctor(fourthDoctor);
        creaturePit.addCompanion(romanaTwo);
        creaturePit.addCompanion(k9);
        storyRepository.save(creaturePit);

        CastAndCrew creaturePitWriter = new CastAndCrew(dFisher, "Writer", CastOrCrew.CREW, creaturePit);
        castAndCrewRepository.save(creaturePitWriter);
        CastAndCrew creaturePitdirector = new CastAndCrew(cBarry, "Director", CastOrCrew.CREW, creaturePit);
        castAndCrewRepository.save(creaturePitdirector);
        CastAndCrew creaturePitsEditor = new CastAndCrew(dAdams, "Script Editor", CastOrCrew.CREW, creaturePit);
        castAndCrewRepository.save(creaturePitsEditor);
        CastAndCrew creaturePitproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, creaturePit);
        castAndCrewRepository.save(creaturePitproducer);

        Story nightmareEden = new Story(
                "Nightmare of Eden",
                Format.TV,
                LocalDate.of(1979, 11, 24),
                LocalDate.of(1979, 12, 15),
                "Novelisation (1980), VHS (1999), DVD (2012), Blu-ray (2021).",
                "img_url",
                "Two ships emerge from hyperspace at the same time, and get fused together.",
                "Mandrels; drugs are bad; smuggling; Vraxoin; CET Machine; hyperspace; two ships locked together; jump into picture;",
                Series.SEASON17,
                4,
                4,
                "5K",
                "https://tardis.wiki/wiki/Nightmare_of_Eden_(TV_story)"
        );
        nightmareEden.addDoctor(fourthDoctor);
        nightmareEden.addCompanion(romanaTwo);
        nightmareEden.addCompanion(k9);
        storyRepository.save(nightmareEden);

        CastAndCrew edenWriter = new CastAndCrew(bBaker, "Writer", CastOrCrew.CREW, nightmareEden);
        castAndCrewRepository.save(edenWriter);
        CastAndCrew nightmareEdendirector = new CastAndCrew(aBromly, "Director", CastOrCrew.CREW, nightmareEden);
        castAndCrewRepository.save(nightmareEdendirector);
        CastAndCrew nightmareEdendirector2 = new CastAndCrew(gWilliams, "Director", CastOrCrew.CREW, nightmareEden);
        castAndCrewRepository.save(nightmareEdendirector2);
        CastAndCrew nightmareEdensEditor = new CastAndCrew(dAdams, "Script Editor", CastOrCrew.CREW, nightmareEden);
        castAndCrewRepository.save(nightmareEdensEditor);
        CastAndCrew nightmareEdenproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, nightmareEden);
        castAndCrewRepository.save(nightmareEdenproducer);

        Story nimon = new Story(
                "The Horns of Nimon",
                Format.TV,
                LocalDate.of(1979, 12, 22),
                LocalDate.of(1980, 1, 12),
                "Novelisation (1980), VHS (2003), DVD (2010), Blu-ray (2021), Audiobook (2024).",
                "img_url",
                "The youth of Aneth are chosen as sacrifices for the blessed Nimon. Nimon be praised!",
                "Soldeed; labyrinth; weakling scum; overacting; scenery chewing; my dreams of conquest; meddling hussy; Skonnos",
                Series.SEASON17,
                5,
                4,
                "5L",
                "https://tardis.wiki/wiki/The_Horns_of_Nimon_(TV_story)"
        );
        nimon.addDoctor(fourthDoctor);
        nimon.addCompanion(romanaTwo);
        nimon.addCompanion(k9);
        storyRepository.save(nimon);

        CastAndCrew nimonWriter = new CastAndCrew(aRead, "Writer", CastOrCrew.CREW, nimon);
        castAndCrewRepository.save(nimonWriter);

        CastAndCrew nimondirector = new CastAndCrew(kMcBain, "Director", CastOrCrew.CREW, nimon);
        castAndCrewRepository.save(nimondirector);
        CastAndCrew nimonsEditor = new CastAndCrew(dAdams, "Script Editor", CastOrCrew.CREW, nimon);
        castAndCrewRepository.save(nimonsEditor);
        CastAndCrew nimonproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, nimon);
        castAndCrewRepository.save(nimonproducer);

        Story shada = new Story(
                "Shada",
                Format.TV,
                LocalDate.of(0,0,0),
                LocalDate.of(0,0,0),
                "VHS (1992 - Reconstruction), Webcast/Audio (2003 - Adaptation), Novelisation (2012), DVD/Blu-ray (2017,2021 - Animation).",
                "img_url",
                "An insane scientist needs the help of an inmate of Shada - a prison built by the Time Lords",
                "Missing Story; Industrial Action; Time Lord Prison; St Cedd's; Skagra; cape; hat; The Worshipful and Ancient Law of Gallifrey",
                Series.SEASON17,
                6,
                6,
                "5M",
                "https://tardis.wiki/wiki/Shada_(TV_story)"
        );
        shada.addDoctor(fourthDoctor);
        shada.addCompanion(romanaTwo);
        storyRepository.save(shada);

        CastAndCrew shadawriter = new CastAndCrew(dAdams, "Writer", CastOrCrew.CREW, shada);
        castAndCrewRepository.save(shadawriter);

        CastAndCrew shadadirector = new CastAndCrew(pRoberts, "Director", CastOrCrew.CREW, shada);
        castAndCrewRepository.save(shadadirector);
        CastAndCrew shadasEditor = new CastAndCrew(dAdams, "Script Editor", CastOrCrew.CREW, shada);
        castAndCrewRepository.save(shadasEditor);
        CastAndCrew shadaproducer = new CastAndCrew(gWilliams, "Producer", CastOrCrew.CREW, shada);
        castAndCrewRepository.save(shadaproducer);


        Story leisureHive = new Story(
                "The Leisure Hive",
                Format.TV,
                LocalDate.of(1980, 8, 30),
                LocalDate.of(1980, 9, 20),
                "Novelisation (1982), VHS (1997), DVD (2007), Blu-ray (2019).",
                "img_url",
                "The Doctor and Romana arrive in search of a holiday, but end up rather cut up about things.",
                "tachyons; Foamasi; Argolin; rejuvenated; Brighton; question mark collar; starfield; Howell theme; first appearance; K9; explodes;",
                Series.SEASON18,
                1,
                4,
                "5N",
                "https://tardis.wiki/wiki/The_Leisure_Hive_(TV_story)"
        );
        leisureHive.addDoctor(fourthDoctor);
        leisureHive.addCompanion(romanaTwo);
        storyRepository.save(leisureHive);

        CastAndCrew leisureHiveWriter = new CastAndCrew(dFisher, "Writer", CastOrCrew.CREW, leisureHive);
        castAndCrewRepository.save(leisureHiveWriter);
        CastAndCrew leisureHivedirector = new CastAndCrew(lBickford, "Director", CastOrCrew.CREW, leisureHive);
        castAndCrewRepository.save(leisureHivedirector);
        CastAndCrew leisureHivesEditor = new CastAndCrew(bidmead, "Script Editor", CastOrCrew.CREW, leisureHive);
        castAndCrewRepository.save(leisureHivesEditor);
        CastAndCrew leisureHiveproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, leisureHive);
        castAndCrewRepository.save(leisureHiveproducer);
        CastAndCrew leisureHiveexecProducer = new CastAndCrew(bLetts, "Executive Producer", CastOrCrew.CREW, leisureHive);
        castAndCrewRepository.save(leisureHiveexecProducer);

        Story meglos = new Story(
                "Meglos",
                Format.TV,
                LocalDate.of(1980, 9, 27),
                LocalDate.of(1980, 10, 18),
                "Novelisation (1983), VHS (2003), DVD (2011), Blu-ray (2019), Audiobook (2021).",
                "img_url",
                "Tigellan society is on the brink of collapse, but the TARDIS is sealed in a time loop.",
                "Jacqueline Hill; doppelganger; evil Cactus; Zolfa-Thurans; Dodecahedron",
                Series.SEASON18,
                2,
                4,
                "5Q",
                "https://tardis.wiki/wiki/Meglos_(TV_story)"
        );
        meglos.addDoctor(fourthDoctor);
        meglos.addCompanion(romanaTwo);
        storyRepository.save(meglos);

        CastAndCrew meglos1 = new CastAndCrew(jFlanagan, "Writer", CastOrCrew.CREW, meglos);
        castAndCrewRepository.save(meglos1);
        CastAndCrew meglos2 = new CastAndCrew(aMcculloch, "Writer", CastOrCrew.CREW, meglos);
        castAndCrewRepository.save(meglos2);
        CastAndCrew meglosdirector = new CastAndCrew(tDudley, "Director", CastOrCrew.CREW, meglos);
        castAndCrewRepository.save(meglosdirector);
        CastAndCrew meglossEditor = new CastAndCrew(bidmead, "Script Editor", CastOrCrew.CREW, meglos);
        castAndCrewRepository.save(meglossEditor);
        CastAndCrew meglosproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, meglos);
        castAndCrewRepository.save(meglosproducer);
        CastAndCrew meglosexecProducer = new CastAndCrew(bLetts, "Executive Producer", CastOrCrew.CREW, meglos);
        castAndCrewRepository.save(meglosexecProducer);

        Story fullCircle = new Story( "Full Circle",
                Format.TV,
                LocalDate.of(1980, 10, 25),
                LocalDate.of(1980, 11, 15),
                "Novelisation (1982), VHS (1997), DVD (2009), Audiobook (2015), Blu-ray (2019).",
                "img_url",
                "The TARDIS falls into another dimension, and lands on a planet where the inhabitants of a crashed starliner are menaced by marsh creatures.",
                "E-Space Trilogy; spiders; marshmen; first appearance; Adric; companion; Deciders",
                Series.SEASON18,
                3,
                4,
                "5R",
                "https://tardis.wiki/wiki/Full_Circle_(TV_story)"
        );
        fullCircle.addDoctor(fourthDoctor);
        fullCircle.addCompanion(romanaTwo);
        fullCircle.addCompanion(k9);
        storyRepository.save(fullCircle);

        CastAndCrew fullCircleWriter = new CastAndCrew(aSmith, "Writer", CastOrCrew.CREW, fullCircle);
        castAndCrewRepository.save(fullCircleWriter);
        CastAndCrew fullCircledirector = new CastAndCrew(grimwade, "Director", CastOrCrew.CREW, fullCircle);
        castAndCrewRepository.save(fullCircledirector);
        CastAndCrew fullCirclesEditor = new CastAndCrew(bidmead, "Script Editor", CastOrCrew.CREW, fullCircle);
        castAndCrewRepository.save(fullCirclesEditor);
        CastAndCrew fullCircleproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, fullCircle);
        castAndCrewRepository.save(fullCircleproducer);
        CastAndCrew fullCircleexecProducer = new CastAndCrew(bLetts, "Executive Producer", CastOrCrew.CREW, fullCircle);
        castAndCrewRepository.save(fullCircleexecProducer);

        Story stateDecay = new Story(
                "State of Decay",
                Format.TV,
                LocalDate.of(1980, 11, 22),
                LocalDate.of(1980, 12, 13),
                "Audio Adaptation (1981), Novelisation (1982), VHS (1997), DVD (2009), Audiobook (2016), Blu-ray (2019).",
                "img_url",
                "The townsfolk fear the Three Who Rule, but an even greater danger is present: one of the Time Lord's ancient enemies. ",
                "Vampire; Great Vampire; King Vampire; bats; E-Space Trilogy",
                Series.SEASON18,
                4,
                4,
                "5P",
                "https://tardis.wiki/wiki/State_of_Decay_(TV_story)"
        );
        stateDecay.addDoctor(fourthDoctor);
        stateDecay.addCompanion(romanaTwo);
        stateDecay.addCompanion(adric);
        stateDecay.addCompanion(k9);
        storyRepository.save(stateDecay);

        CastAndCrew stateDecayWriter = new CastAndCrew(terranceD, "Writer", CastOrCrew.CREW, stateDecay);
        castAndCrewRepository.save(stateDecayWriter);
        CastAndCrew stateDecaydirector = new CastAndCrew(pMoffatt, "Director", CastOrCrew.CREW, stateDecay);
        castAndCrewRepository.save(stateDecaydirector);
        CastAndCrew stateDecaysEditor = new CastAndCrew(bidmead, "Script Editor", CastOrCrew.CREW, stateDecay);
        castAndCrewRepository.save(stateDecaysEditor);
        CastAndCrew stateDecayproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, stateDecay);
        castAndCrewRepository.save(stateDecayproducer);
        CastAndCrew stateDecayexecProducer = new CastAndCrew(bLetts, "Executive Producer", CastOrCrew.CREW, stateDecay);
        castAndCrewRepository.save(stateDecayexecProducer);

        Story warriorsgate = new Story(
                "Warriors' Gate",
                Format.TV,
                LocalDate.of(1981, 1, 3),
                LocalDate.of(1981, 1, 24),
                "Novelisation (1982), VHS (1997), DVD (2009), Blu-ray (2019).",
                "img_url",
                "A strange creature forces its way into the TARDIS, and steers it to a white void containing ruined buildings and a spaceship.",
                "E-Space Trilogy; companion; departure; leave; K9; Romana; last appearance; time winds; slave traders; void; Tharils",
                Series.SEASON18,
                5,
                4,
                "5S",
                "https://tardis.wiki/wiki/Warriors%27_Gate_(TV_story)"
        );
        warriorsgate.addDoctor(fourthDoctor);
        warriorsgate.addCompanion(romanaTwo);
        warriorsgate.addCompanion(k9);
        warriorsgate.addCompanion(adric);
        storyRepository.save(warriorsgate);

        CastAndCrew wGateWriter = new CastAndCrew(sGallagher, "Writer", CastOrCrew.CREW, warriorsgate);
        castAndCrewRepository.save(wGateWriter);
        CastAndCrew warriorsgatedirector = new CastAndCrew(pJoyce, "Director", CastOrCrew.CREW, warriorsgate);
        castAndCrewRepository.save(warriorsgatedirector);
        CastAndCrew warriorsgatedirector2 = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, warriorsgate);
        castAndCrewRepository.save(warriorsgatedirector2);
        CastAndCrew warriorsgatesEditor = new CastAndCrew(bidmead, "Script Editor", CastOrCrew.CREW, warriorsgate);
        castAndCrewRepository.save(warriorsgatesEditor);
        CastAndCrew warriorsgateproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, warriorsgate);
        castAndCrewRepository.save(warriorsgateproducer);
        CastAndCrew warriorsgateexecProducer = new CastAndCrew(bLetts, "Executive Producer", CastOrCrew.CREW, warriorsgate);
        castAndCrewRepository.save(warriorsgateexecProducer);

        Story traken = new Story(
                "The Keeper of Traken",
                Format.TV,
                LocalDate.of(1981, 1, 31),
                LocalDate.of(1981, 2, 21),
                "Novelisation (1982), VHS (1993), DVD (2007), Blu-ray (2019).",
                "img_url",
                "synopsis",
                "first appearance; Nyssa; last appearance; Decayed; Tremas; Master; Trilogy; Melkur; a new body at last; fairy tale; transfer of power; millenialism; death; Source; ",
                Series.SEASON18,
                6,
                4,
                "5T",
                "https://tardis.wiki/wiki/The_Keeper_of_Traken_(TV_story)"
        );
        traken.addDoctor(fourthDoctor);
        traken.addCompanion(adric);
        storyRepository.save(traken);
        CastAndCrew trakenWriter = new CastAndCrew(jByrne, "Writer", CastOrCrew.CREW, traken);
        castAndCrewRepository.save(trakenWriter);
        CastAndCrew trakendirector = new CastAndCrew(jBlack, "Director", CastOrCrew.CREW, traken);
        castAndCrewRepository.save(trakendirector);
        CastAndCrew trakensEditor = new CastAndCrew(bidmead, "Script Editor", CastOrCrew.CREW, traken);
        castAndCrewRepository.save(trakensEditor);
        CastAndCrew trakenproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, traken);
        castAndCrewRepository.save(trakenproducer);
        CastAndCrew trakenexecProducer = new CastAndCrew(bLetts, "Executive Producer", CastOrCrew.CREW, traken);
        castAndCrewRepository.save(trakenexecProducer);

        Story logopolis = new Story(
                "Logopolis",
                Format.TV,
                LocalDate.of(1981, 2, 28),
                LocalDate.of(1981, 3, 21),
                "Novelisation (1982), VHS (1992), DVD (2007), Audiobook (2010), Blu-ray (2019).",
                "img_url",
                "The Doctor attempts to repair the TARDIS by the Barnet bypass.",
                "Master Trilogy; Block Transfer Computations; telescope; fall; entropy; Watcher; chameleon circuit; first appearance; Cloister Bell; Tegan; new; companion; regeneration; last appearance; Fourth Doctor;",
                Series.SEASON18,
                7,
                4,
                "5V",
                "https://tardis.wiki/wiki/Logopolis_(TV_story)"
        );
        logopolis.addDoctor(fourthDoctor);
        logopolis.addCompanion(adric);
        logopolis.addCompanion(nyssa);
        logopolis.addCompanion(tegan);
        storyRepository.save(logopolis);

        CastAndCrew logopolisWriter = new CastAndCrew(bidmead, "Writer", CastOrCrew.CREW, logopolis);
        castAndCrewRepository.save(logopolisWriter);
        CastAndCrew logopolisdirector = new CastAndCrew(grimwade, "Director", CastOrCrew.CREW, logopolis);
        castAndCrewRepository.save(logopolisdirector);
        CastAndCrew logopolissEditor = new CastAndCrew(bidmead, "Script Editor", CastOrCrew.CREW, logopolis);
        castAndCrewRepository.save(logopolissEditor);
        CastAndCrew logopolisproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, logopolis);
        castAndCrewRepository.save(logopolisproducer);
        CastAndCrew logopolisexecProducer = new CastAndCrew(bLetts, "Executive Producer", CastOrCrew.CREW, logopolis);
        castAndCrewRepository.save(logopolisexecProducer);

        Story castrovalva = new Story(
                "Castrovalva",
                Format.TV,
                LocalDate.of(1982, 1, 4),
                LocalDate.of(1982, 1, 12),
                "Novelisation (1983), VHS (1992), DVD (2007), Audiobook (2010), Blu-Ray (2018).",
                "img_url",
                "synopsis",
                "M.C. Escher; Master; trilogy; regeneration; alternate reality; Big Bang; Event One; Master’s little pneumatic lift; hungover;",
                Series.SEASON19,
                1,
                4,
                "5Z",
                "https://tardis.wiki/wiki/Castrovalva_(TV_story)"
        );
        castrovalva.addDoctor(fifthDoctor);
        castrovalva.addCompanion(tegan);
        castrovalva.addCompanion(adric);
        castrovalva.addCompanion(nyssa);
        storyRepository.save(castrovalva);

        CastAndCrew castrovalvawriter = new CastAndCrew(bidmead, "Writer", CastOrCrew.CREW, castrovalva);
        castAndCrewRepository.save(castrovalvawriter);
        CastAndCrew castrovalvadirector = new CastAndCrew(fCumming, "Director", CastOrCrew.CREW, castrovalva);
        castAndCrewRepository.save(castrovalvadirector);
        CastAndCrew castrovalvasEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, castrovalva);
        castAndCrewRepository.save(castrovalvasEditor);
        CastAndCrew castrovalvaproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, castrovalva);
        castAndCrewRepository.save(castrovalvaproducer);

        Story fourDoomsday = new Story(
                "Four to Doomsday",
                Format.TV,
                LocalDate.of(1982, 1, 18),
                LocalDate.of(1982, 1, 26),
                "Novelisation (1983), VHS (2001), DVD (2008), Blu-Ray (2018).",
                "img_url",
                "The TARDIS arrives on a spaceship with three aliens and humans from different periods of history. Which begs the question: why?",
                "Cricket Ball in Space; anthropology lesson; robots; Adric betrayal; frog silly hairdo;",
                Series.SEASON19,
                2,
                4,
                "5W",
                "https://tardis.wiki/wiki/Four_to_Doomsday_(TV_story)"
        );
        fourDoomsday.addDoctor(fifthDoctor);
        fourDoomsday.addCompanion(tegan);
        fourDoomsday.addCompanion(adric);
        fourDoomsday.addCompanion(nyssa);
        storyRepository.save(fourDoomsday);

        CastAndCrew fourDoomsdaywriter = new CastAndCrew(tDudley, "Writer", CastOrCrew.CREW, fourDoomsday);
        castAndCrewRepository.save(fourDoomsdaywriter);
        CastAndCrew fourDoomsdaydirector = new CastAndCrew(jBlack, "Director", CastOrCrew.CREW, fourDoomsday);
        castAndCrewRepository.save(fourDoomsdaydirector);
        CastAndCrew fourDoomsdaysEditor = new CastAndCrew(root, "Script Editor", CastOrCrew.CREW, fourDoomsday);
        castAndCrewRepository.save(fourDoomsdaysEditor);
        CastAndCrew fourDoomsdayproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, fourDoomsday);
        castAndCrewRepository.save(fourDoomsdayproducer);

        Story kinda = new Story(
                "Kinda",
                Format.TV,
                LocalDate.of(1982, 2, 1),
                LocalDate.of(1982, 2, 9),
                "Novelisation (1983), VHS (1994), Audiobook (1997 - Abridged), DVD (2011), Blu-ray (2018).",
                "img_url",
                "The TARDIS lands on the paradisiacal world of Deva Loka, though it’s not immediately clear which side of madness everyone is on.",
                "Mara; Buddhism; Eden; Wheel turns; Empire; descent into madness; Adric betrayal; power of life or death over all of you; not-we; not; we; box of jhana; this side of madness or the other",
                Series.SEASON19,
                3,
                4,
                "5Y",
                "https://tardis.wiki/wiki/Kinda_(TV_story)"
        );
        kinda.addDoctor(fifthDoctor);
        kinda.addCompanion(tegan);
        kinda.addCompanion(adric);
        kinda.addCompanion(nyssa);
        storyRepository.save(kinda);

        CastAndCrew kindawriter = new CastAndCrew(cBailey, "Writer", CastOrCrew.CREW, kinda);
        castAndCrewRepository.save(kindawriter);
        CastAndCrew kindadirector = new CastAndCrew(grimwade, "Director", CastOrCrew.CREW, kinda);
        castAndCrewRepository.save(kindadirector);
        CastAndCrew kindasEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, kinda);
        castAndCrewRepository.save(kindasEditor);
        CastAndCrew kindaproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, kinda);
        castAndCrewRepository.save(kindaproducer);

        Story visitation = new Story(
                "The Visitation",
                Format.TV,
                LocalDate.of(1982, 2, 15),
                LocalDate.of(1982, 2, 23),
                "Novelisation (1982), VHS (1994), DVD (2004), Audiobook (2012), Blu-Ray (2018).",
                "img_url",
                "The Doctor and a disgruntled actor uncover a plan to unleash plague upon the Earth.",
                "Great Fire of London; Sonic Screwdriver; pseudohistorical; destroyed; Death; Robot; Terileptil",
                Series.SEASON19,
                4,
                4,
                "5X",
                "https://tardis.wiki/wiki/The_Visitation_(TV_story)"
        );
        visitation.addDoctor(fifthDoctor);
        visitation.addCompanion(tegan);
        visitation.addCompanion(adric);
        visitation.addCompanion(nyssa);
        storyRepository.save(visitation);

        CastAndCrew visitationwriter = new CastAndCrew(saward, "Writer", CastOrCrew.CREW, visitation);
        castAndCrewRepository.save(visitationwriter);
        CastAndCrew visitationdirector = new CastAndCrew(pMoffatt, "Director", CastOrCrew.CREW, visitation);
        castAndCrewRepository.save(visitationdirector);
        CastAndCrew visitationsEditor = new CastAndCrew(root, "Script Editor", CastOrCrew.CREW, visitation);
        castAndCrewRepository.save(visitationsEditor);
        CastAndCrew visitationproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, visitation);
        castAndCrewRepository.save(visitationproducer);

        Story blorchid = new Story(
                "Black Orchid",
                Format.TV,
                LocalDate.of(1982, 3, 1),
                LocalDate.of(1982, 3, 2),
                "Novelisation (1986), VHS (1994), DVD (2008), Audiobook (2008), Blu-ray (2018).",
                "img_url",
                "The TARDIS crew enjoy an Edwardian party, and then the murders start.",
                "Pure Historical; Cricket; doppelganger; murders; Adric eats",
                Series.SEASON19,
                5,
                2,
                "6A",
                "https://tardis.wiki/wiki/Black_Orchid_(TV_story)"
        );
        blorchid.addDoctor(fifthDoctor);
        blorchid.addCompanion(tegan);
        blorchid.addCompanion(adric);
        blorchid.addCompanion(nyssa);
        storyRepository.save(blorchid);

        CastAndCrew blorchidwriter = new CastAndCrew(tDudley, "Writer", CastOrCrew.CREW, blorchid);
        castAndCrewRepository.save(blorchidwriter);
        CastAndCrew blorchiddirector = new CastAndCrew(rJones, "Director", CastOrCrew.CREW, blorchid);
        castAndCrewRepository.save(blorchiddirector);
        CastAndCrew blorchidsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, blorchid);
        castAndCrewRepository.save(blorchidsEditor);
        CastAndCrew blorchidproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, blorchid);
        castAndCrewRepository.save(blorchidproducer);

        Story earthshock = new Story(
                "Earthshock",
                Format.TV,
                LocalDate.of(1982, 3, 8),
                LocalDate.of(1982, 3, 16),
                "Novelisation (1983), VHS (1992), DVD (2003), Audiobook (2012), Blu-ray (2018), Tales of the TARDIS (2023).",
                "img_url",
                "Adric decides that he wants to leave the TARDIS.",
                "Cybermen; Cyber Leader; androids; melting; freighter; dinosaurs; comet; last appearance; Adric; companion; departure; death; dies; silent credits; badge for mathematical excellence",
                Series.SEASON19,
                6,
                4,
                "6B",
                "https://tardis.wiki/wiki/Earthshock_(TV_story)"
        );
        earthshock.addDoctor(fifthDoctor);
        earthshock.addCompanion(tegan);
        earthshock.addCompanion(adric);
        earthshock.addCompanion(nyssa);
        storyRepository.save(earthshock);

        CastAndCrew earthshockwriter = new CastAndCrew(saward, "Writer", CastOrCrew.CREW, earthshock);
        castAndCrewRepository.save(earthshockwriter);
        CastAndCrew earthshockdirector = new CastAndCrew(grimwade, "Director", CastOrCrew.CREW, earthshock);
        castAndCrewRepository.save(earthshockdirector);
        CastAndCrew earthshocksEditor = new CastAndCrew(root, "Script Editor", CastOrCrew.CREW, earthshock);
        castAndCrewRepository.save(earthshocksEditor);
        CastAndCrew earthshockproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, earthshock);
        castAndCrewRepository.save(earthshockproducer);

        Story timeflight = new Story(
                "Time-Flight",
                Format.TV,
                LocalDate.of(1982, 3, 22),
                LocalDate.of(1982, 3, 30),
                "Novelisation (1983), VHS (2000), DVD (2007), Blu-ray (2018), Audiobook (2021).",
                "img_url",
                "While investigating a missing Concorde, the Doctor finds it millions of years in Earth’s past alongside an extremely strange mystic.",
                "Master; disguise; Khalid; Concorde; bubble monster; Plasmatons; Xeraphin; camp; flight crew; Heathrow; Tegan leaves",
                Series.SEASON19,
                7,
                4,
                "6C",
                "https://tardis.wiki/wiki/Time-Flight_(TV_story)"
        );
        timeflight.addDoctor(fifthDoctor);
        timeflight.addCompanion(tegan);
        timeflight.addCompanion(nyssa);
        storyRepository.save(timeflight);

        CastAndCrew timeflightwriter = new CastAndCrew(grimwade, "Writer", CastOrCrew.CREW, timeflight);
        castAndCrewRepository.save(timeflightwriter);
        CastAndCrew timeflightdirector = new CastAndCrew(rJones, "Director", CastOrCrew.CREW, timeflight);
        castAndCrewRepository.save(timeflightdirector);
        CastAndCrew timeflightsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, timeflight);
        castAndCrewRepository.save(timeflightsEditor);
        CastAndCrew timeflightproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, timeflight);
        castAndCrewRepository.save(timeflightproducer);


        Story arcofinfinity = new Story(
                "Arc of Infinity",
                Format.TV,
                LocalDate.of(1983, 1, 3),
                LocalDate.of(1983, 1, 12),
                "Novelisation (1983), VHS (1994), DVD (2007), Blu-ray (2023).",
                "img_url",
                "Tegan’s cousin disappears in Amsterdam as the Doctor is recalled to Gallifrey.",
                "Omega; Gallifrey; Castellan; Matrix; anti-matter; Ergon; just good friends; doppelganger",
                Series.SEASON20,
                1,
                4,
                "6E",
                "https://tardis.wiki/wiki/Arc_of_Infinity_(TV_story)"
        );
        arcofinfinity.addDoctor(fifthDoctor);
        arcofinfinity.addCompanion(tegan);
        arcofinfinity.addCompanion(nyssa);
        storyRepository.save(arcofinfinity);

        CastAndCrew arcofinfinitywriter = new CastAndCrew(jByrne, "Writer", CastOrCrew.CREW, arcofinfinity);
        castAndCrewRepository.save(arcofinfinitywriter);
        CastAndCrew arcofinfinitydirector = new CastAndCrew(rJones, "Director", CastOrCrew.CREW, arcofinfinity);
        castAndCrewRepository.save(arcofinfinitydirector);
        CastAndCrew arcofinfinitysEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, arcofinfinity);
        castAndCrewRepository.save(arcofinfinitysEditor);
        CastAndCrew arcofinfinityproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, arcofinfinity);
        castAndCrewRepository.save(arcofinfinityproducer);

        Story snakedance = new Story(
                "Snakedance",
                Format.TV,
                LocalDate.of(1983, 1, 18),
                LocalDate.of(1983, 1, 26),
                "Novelisation (1984), VHS (1994), DVD (2011), Blu-Ray (2023).",
                "img_url",
                "The TARDIS lands on Manussa, where Tegan is still haunted by the Mara and the authorities have forgotten what their own history means.",
                "Sumaran Empire; Still point; snakes; possession; exploding; crystal ball",
                Series.SEASON20,
                2,
                4,
                "6D",
                "https://tardis.wiki/wiki/Snakedance_(TV_story) "
        );
        snakedance.addDoctor(fifthDoctor);
        snakedance.addCompanion(tegan);
        snakedance.addCompanion(nyssa);
        storyRepository.save(snakedance);

        CastAndCrew snakedancewriter = new CastAndCrew(cBailey, "Writer", CastOrCrew.CREW, snakedance);
        castAndCrewRepository.save(snakedancewriter);
        CastAndCrew snakedancedirector = new CastAndCrew(fCumming, "Director", CastOrCrew.CREW, snakedance);
        castAndCrewRepository.save(snakedancedirector);
        CastAndCrew snakedancesEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, snakedance);
        castAndCrewRepository.save(snakedancesEditor);
        CastAndCrew snakedanceproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, snakedance);
        castAndCrewRepository.save(snakedanceproducer);

        Story mawdryn = new Story(
                "Mawdryn Undead",
                Format.TV,
                LocalDate.of(1983, 2, 1),
                LocalDate.of(1983, 2, 9),
                "Novelisation (1983), VHS (1992), DVD (2009), Blu-ray (2023).",
                "img_url",
                "The Doctor meets some old and new friends at an English public school.",
                "Black Guardian; trilogy; public school; bird; head; cackling; UNIT Dating; Blinovitch",
                Series.SEASON20,
                3,
                4,
                "6F",
                "https://tardis.wiki/wiki/Mawdryn_Undead_(TV_story) "
        );
        mawdryn.addDoctor(fifthDoctor);
        mawdryn.addCompanion(tegan);
        mawdryn.addCompanion(turlough);
        mawdryn.addCompanion(nyssa);
        mawdryn.addCompanion(brigadier);
        storyRepository.save(mawdryn);

        CastAndCrew mawdrynwriter = new CastAndCrew(grimwade, "Writer", CastOrCrew.CREW, mawdryn);
        castAndCrewRepository.save(mawdrynwriter);
        CastAndCrew mawdryndirector = new CastAndCrew(pMoffatt, "Director", CastOrCrew.CREW, mawdryn);
        castAndCrewRepository.save(mawdryndirector);
        CastAndCrew mawdrynsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, mawdryn);
        castAndCrewRepository.save(mawdrynsEditor);
        CastAndCrew mawdrynproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, mawdryn);
        castAndCrewRepository.save(mawdrynproducer);

        Story terminus = new Story(
                "Terminus",
                Format.TV,
                LocalDate.of(1983, 2, 15),
                LocalDate.of(1983, 2, 23),
                "Novelisation (1983), VHS (1993), DVD (2009), Blu-ray (2023).",
                "img_url",
                "Turlough sabotages the TARDIS, endangering not only Nyssa’s life but the entire universe.",
                "Black Guardian; trilogy; event one; big bang; Garm; big; space; dog; norse mythology; companion; departure; Nyssa; leave; skirt; Lazars; leprosy; hydromel",
                Series.SEASON20,
                4,
                4,
                "6G",
                "https://tardis.wiki/wiki/Terminus_(TV_story)"
        );
        terminus.addDoctor(fifthDoctor);
        terminus.addCompanion(tegan);
        terminus.addCompanion(turlough);
        terminus.addCompanion(nyssa);
        storyRepository.save(terminus);

        CastAndCrew terminuswriter = new CastAndCrew(sGallagher, "Writer", CastOrCrew.CREW, terminus);
        castAndCrewRepository.save(terminuswriter);
        CastAndCrew terminusdirector = new CastAndCrew(mRidge, "Director", CastOrCrew.CREW, terminus);
        castAndCrewRepository.save(terminusdirector);
        CastAndCrew terminussEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, terminus);
        castAndCrewRepository.save(terminussEditor);
        CastAndCrew terminusproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, terminus);
        castAndCrewRepository.save(terminusproducer);

        Story enlightenment = new Story(
                "Enlightenment",
                Format.TV,
                LocalDate.of(1983, 3, 1),
                LocalDate.of(1983, 3, 9),
                "Novelisation (1984), VHS (1993), DVD (2009), Blu-ray (2023).",
                "img_url",
                "synopsis",
                "Black Guardian; trilogy; White Guardian; Eternals; sailing; space; suicide; ephemerals; woman writer director; female; Imagination; tiara; camp; jewel",
                Series.SEASON20,
                4,
                4,
                "6H",
                "https://tardis.wiki/wiki/Enlightenment_(TV_story)"
        );
        enlightenment.addDoctor(fifthDoctor);
        enlightenment.addCompanion(tegan);
        enlightenment.addCompanion(turlough);
        storyRepository.save(enlightenment);

        CastAndCrew enlightenmentwriter = new CastAndCrew(bClegg, "Writer", CastOrCrew.CREW, enlightenment);
        castAndCrewRepository.save(enlightenmentwriter);
        CastAndCrew enlightenmentdirector = new CastAndCrew(fCumming, "Director", CastOrCrew.CREW, enlightenment);
        castAndCrewRepository.save(enlightenmentdirector);
        CastAndCrew enlightenmentsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, enlightenment);
        castAndCrewRepository.save(enlightenmentsEditor);
        CastAndCrew enlightenmentproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, enlightenment);
        castAndCrewRepository.save(enlightenmentproducer);

        Story kingsdemons = new Story(
                "The King's Demons",
                Format.TV,
                LocalDate.of(1983, 3, 15),
                LocalDate.of(1983, 3, 16),
                "Novelisation (1986), VHS (1995), DVD (2010), Blu-ray (2023).",
                "img_url",
                "The TARDIS crew land during a joust and King John declares them to be demons.",
                "pseudohistorical; Magna Carta; French Knight; outrageous French accent; sword fight; Kamelion; first appearance; shapeshifting robot; we sing in praise of total war; Master",
                Series.SEASON20,
                5,
                2,
                "6J",
                "https://tardis.wiki/wiki/The_King%27s_Demons_(TV_story) "
        );
        kingsdemons.addDoctor(fifthDoctor);
        kingsdemons.addCompanion(tegan);
        kingsdemons.addCompanion(turlough);
        storyRepository.save(kingsdemons);

        CastAndCrew kingsdemonswriter = new CastAndCrew(tDudley, "Writer", CastOrCrew.CREW, kingsdemons);
        castAndCrewRepository.save(kingsdemonswriter);
        CastAndCrew kingsdemonsdirector = new CastAndCrew(tVirgo, "Director", CastOrCrew.CREW, kingsdemons);
        castAndCrewRepository.save(kingsdemonsdirector);
        CastAndCrew kingsdemonssEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, kingsdemons);
        castAndCrewRepository.save(kingsdemonssEditor);
        CastAndCrew kingsdemonsproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, kingsdemons);
        castAndCrewRepository.save(kingsdemonsproducer);

        Story fivedoctors = new Story(
                "The Five Doctors",
                Format.TV,
                LocalDate.of(1983, 11, 25),
                LocalDate.of(1983, 11, 25),
                "Novelisation (1983), VHS/Betamax (1985), VHS (1990, 1995), DVD (1999, 2008), Blu-ray (2023).",
                "img_url",
                "In which four and a bit incarnations of the Doctor are sent to fight all manner of foes.",
                "multi-Doctor; anniversary; Death Zone; Harp of Rassilon; no not the mind probe; gentle incline; small slope; Raston Warrior Robot; Castellan; Borusa; Rassilon",
                Series.SEASON20,
                6,
                1,
                "6K",
                "https://tardis.wiki/wiki/The_Five_Doctors_(TV_story)"
        );
        fivedoctors.addDoctor(fifthDoctor);
        fivedoctors.addDoctor(fourthDoctor);
        fivedoctors.addDoctor(thirdDoctor);
        fivedoctors.addDoctor(secondDoctor);
        fivedoctors.addDoctor(firstDoctor);
        fivedoctors.addCompanion(tegan);
        fivedoctors.addCompanion(turlough);
        fivedoctors.addCompanion(susan);
        fivedoctors.addCompanion(brigadier);
        fivedoctors.addCompanion(sarahJane);
        fivedoctors.addCompanion(romanaTwo);
        storyRepository.save(fivedoctors);

        CastAndCrew fivedoctorswriter = new CastAndCrew(terranceD, "Writer", CastOrCrew.CREW, fivedoctors);
        castAndCrewRepository.save(fivedoctorswriter);
        CastAndCrew fivedoctorsdirector = new CastAndCrew(pMoffatt, "Director", CastOrCrew.CREW, fivedoctors);
        castAndCrewRepository.save(fivedoctorsdirector);
        CastAndCrew fivedoctorssEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, fivedoctors);
        castAndCrewRepository.save(fivedoctorssEditor);
        CastAndCrew fivedoctorsproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, fivedoctors);
        castAndCrewRepository.save(fivedoctorsproducer);



        Story warriorsDeep = new Story(
                "Warriors of the Deep",
                Format.TV,
                LocalDate.of(1984, 1, 5),
                LocalDate.of(1984, 1, 13),
                "Novelisation (1984), Audiobook (1995), VHS (1995), Audio (2006), DVD (2008).",
                "img_url",
                "After arriving on an undersea missile base, the Doctor decides to distract everyone by sabotaging the nuclear reactor and really his day only gets worse from there.",
                "Silurians; Sea Devils; sequel; basically; everyone dies; Myrka; I know kung-fu;",
                Series.SEASON21,
                1,
                4,
                "6L",
                "https://tardis.wiki/wiki/Warriors_of_the_Deep_(TV_story)"
        );
        warriorsDeep.addDoctor(fifthDoctor);
        warriorsDeep.addCompanion(tegan);
        warriorsDeep.addCompanion(turlough);
        storyRepository.save(warriorsDeep);

        CastAndCrew warriorsDeepwriter = new CastAndCrew(jByrne, "Writer", CastOrCrew.CREW, warriorsDeep);
        castAndCrewRepository.save(warriorsDeepwriter);
        CastAndCrew warriorsDeepdirector = new CastAndCrew(pRoberts, "Director", CastOrCrew.CREW, warriorsDeep);
        castAndCrewRepository.save(warriorsDeepdirector);
        CastAndCrew warriorsDeepsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, warriorsDeep);
        castAndCrewRepository.save(warriorsDeepsEditor);
        CastAndCrew warriorsDeepproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, warriorsDeep);
        castAndCrewRepository.save(warriorsDeepproducer);

        Story awakening = new Story(
                "The Awakening",
                Format.TV,
                LocalDate.of(1984, 1, 19),
                LocalDate.of(1984, 1, 20),
                "Novelisation (1985), VHS (1997), DVD (2011).",
                "img_url",
                "Some cosplay gets extremely violent.",
                "Malus; Little Hodcombe; pseudohistorical; Tegan’s Uncle; war games; re-enactment; decapitation; Queen of the May; Will Chandler be a proper name",
                Series.SEASON21,
                2,
                2,
                "6M",
                "https://tardis.wiki/wiki/The_Awakening_(TV_story)"
        );
        awakening.addDoctor(fifthDoctor);
        awakening.addCompanion(tegan);
        awakening.addCompanion(turlough);
        storyRepository.save(awakening);

        CastAndCrew awakeningwriter = new CastAndCrew(pringle, "Writer", CastOrCrew.CREW, awakening);
        castAndCrewRepository.save(awakeningwriter);
        CastAndCrew awakeningdirector = new CastAndCrew(mOMorris, "Director", CastOrCrew.CREW, awakening);
        castAndCrewRepository.save(awakeningdirector);
        CastAndCrew awakeningsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, awakening);
        castAndCrewRepository.save(awakeningsEditor);
        CastAndCrew awakeningproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, awakening);
        castAndCrewRepository.save(awakeningproducer);

        Story frontios = new Story(                "Frontios",
                Format.TV,
                LocalDate.of(1984, 1, 26),
                LocalDate.of(1984, 2, 3),
                "Novelisation (1984), VHS (1997), DVD (2012), Audiobook (2015).",
                "img_url",
                "The TARDIS is destroyed on Frontios, a planet that buries its own dead.",
                "Tractators; earth was hungry; lice; foaming at the mouth; brainy specs; race memory; destruction; TARDIS; destroyed",
                Series.SEASON21,
                3,
                4,
                "6N",
                " https://tardis.wiki/wiki/Frontios_(TV_story)"
        );
        frontios.addDoctor(fifthDoctor);
        frontios.addCompanion(tegan);
        frontios.addCompanion(turlough);
        storyRepository.save(frontios);

        CastAndCrew frontioswriter = new CastAndCrew(bidmead, "Writer", CastOrCrew.CREW, frontios);
        castAndCrewRepository.save(frontioswriter);
        CastAndCrew frontiosdirector = new CastAndCrew(rJones, "Director", CastOrCrew.CREW, frontios);
        castAndCrewRepository.save(frontiosdirector);
        CastAndCrew frontiossEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, frontios);
        castAndCrewRepository.save(frontiossEditor);
        CastAndCrew frontiosproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, frontios);
        castAndCrewRepository.save(frontiosproducer);

        Story resurrectionDaleks = new Story(
                "Resurrection of the Daleks",
                Format.TV,
                LocalDate.of(1984, 2, 8),
                LocalDate.of(1984, 2, 15),
                "VHS (1993), DVD (2002, 2011), Novelisation (2019), Audiobook (2019).",
                "img_url",
                "The Daleks are weak, broken things. In their desperation they turn to their creator: Davros.",
                "Lytton; policemen; duplicates; smoking; cool spring water; Dalek agent; Dirty Den; Leslie Grantham; army; extermination; over-acting; Tegan; departure; leave; companion; gun; Doctor; weapon; Brave heart Tegan",
                Series.SEASON21,
                4,
                4,
                "6P",
                "https://tardis.wiki/wiki/Resurrection_of_the_Daleks_(TV_story)"
        );
        resurrectionDaleks.addDoctor(fifthDoctor);
        resurrectionDaleks.addCompanion(tegan);
        resurrectionDaleks.addCompanion(turlough);
        storyRepository.save(resurrectionDaleks);

        CastAndCrew resurrectionDalekswriter = new CastAndCrew(saward, "Writer", CastOrCrew.CREW, resurrectionDaleks);
        castAndCrewRepository.save(resurrectionDalekswriter);
        CastAndCrew resurrectionDaleksdirector = new CastAndCrew(mRobinson, "Director", CastOrCrew.CREW, resurrectionDaleks);
        castAndCrewRepository.save(resurrectionDaleksdirector);
        CastAndCrew resurrectionDalekssEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, resurrectionDaleks);
        castAndCrewRepository.save(resurrectionDalekssEditor);
        CastAndCrew resurrectionDaleksproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, resurrectionDaleks);
        castAndCrewRepository.save(resurrectionDaleksproducer);

        Story planetFire = new Story(
                "Planet of Fire",
                Format.TV,
                LocalDate.of(1984, 2, 23),
                LocalDate.of(1984, 3, 2),
                "Novelisation (1984), VHS (1998), DVD (2010).",
                "img_url",
                "Turlough rescues a woman from drowning in Lanzarote and discovers an item from his home planet in her possession.",
                "Master; Kamelion; Turlough; death; companion; leaves; last appearance; departure; killed; religious fundamentalism; Sarn; Lanzarote; first appearance; Peri; Numismaton; Logar; Trion; Misos Triangle",
                Series.SEASON21,
                5,
                4,
                "6Q",
                " https://tardis.wiki/wiki/Planet_of_Fire_(TV_story)"
        );
        planetFire.addDoctor(fifthDoctor);
        planetFire.addCompanion(turlough);
        planetFire.addCompanion(peri);
        planetFire.addCompanion(kamelion);
        storyRepository.save(planetFire);

        CastAndCrew planetFirewriter = new CastAndCrew(grimwade, "Writer", CastOrCrew.CREW, planetFire);
        castAndCrewRepository.save(planetFirewriter);
        CastAndCrew planetFiredirector = new CastAndCrew(fCumming, "Director", CastOrCrew.CREW, planetFire);
        castAndCrewRepository.save(planetFiredirector);
        CastAndCrew planetFiresEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, planetFire);
        castAndCrewRepository.save(planetFiresEditor);
        CastAndCrew planetFireproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, planetFire);
        castAndCrewRepository.save(planetFireproducer);

        Story androzani = new Story(
                "The Caves of Androzani",
                Format.TV,
                LocalDate.of(1984, 3, 8),
                LocalDate.of(1984, 3, 16),
                "Novelisation (1984), VHS (1992), DVD (2001, 2010).",
                "img_url",
                "The Doctor and Peri land on Androzani Minor, and are almost immediately fatally poisoned then caught up in a gun-running and drug dealing conflict.",
                "Spectrox; fourth wall; to camera; everyone dies; every man dies; I’m not going to let you stop me now; regeneration; first appearance; Sixth Doctor; Harper",
                Series.SEASON21,
                6,
                4,
                "6R",
                "https://tardis.wiki/wiki/The_Caves_of_Androzani_(TV_story)"
        );
        androzani.addDoctor(fifthDoctor);
        androzani.addCompanion(peri);
        storyRepository.save(androzani);
        CastAndCrew androzaniwriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, androzani);
        castAndCrewRepository.save(androzaniwriter);
        CastAndCrew androzanidirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, androzani);
        castAndCrewRepository.save(androzanidirector);
        CastAndCrew androzanisEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, androzani);
        castAndCrewRepository.save(androzanisEditor);
        CastAndCrew androzaniproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, androzani);
        castAndCrewRepository.save(androzaniproducer);



        Story twinDilemma = new Story(
                "The Twin Dilemma",
                Format.TV,
                LocalDate.of(1984, 3, 22),
                LocalDate.of(1984, 3, 30),
                "Novelisation (1985), VHS (1992), DVD (2009), Audiobook (2012).",
                "img_url",
                "The newly regenerated Doctor is a massive arsehole.",
                "regeneration; trauma; slugs; gastropods; tutor; twins; spangly; may my bones rot for obeying it; exploding typewriter; violence; shouting; arguing; strangles; strangle",
                Series.SEASON21,
                7,
                4,
                "6S",
                "https://tardis.wiki/wiki/The_Twin_Dilemma_(TV_story)"
        );
        twinDilemma.addDoctor(sixthDoctor);
        twinDilemma.addCompanion(peri);
        storyRepository.save(twinDilemma);

        CastAndCrew twinDilemmawriter = new CastAndCrew(aSteven, "Writer", CastOrCrew.CREW, twinDilemma);
        castAndCrewRepository.save(twinDilemmawriter);
        CastAndCrew twinDilemmadirector = new CastAndCrew(pMoffatt, "Director", CastOrCrew.CREW, twinDilemma);
        castAndCrewRepository.save(twinDilemmadirector);
        CastAndCrew twinDilemmasEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, twinDilemma);
        castAndCrewRepository.save(twinDilemmasEditor);
        CastAndCrew twinDilemmaproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, twinDilemma);
        castAndCrewRepository.save(twinDilemmaproducer);




        Story attackCybermen = new Story(
                "Attack of the Cybermen",
                Format.TV,
                LocalDate.of(1985, 1, 5),
                LocalDate.of(1985, 1, 12),
                "Novelisation (1989), Audiobook (1995 – Abridged), VHS (2000), DVD (2009), Blu-Ray (2022).",
                "img_url",
                "The Doctor tries to fix the TARDIS’ chameleon circuit and gets briefly involved in a diamond heist.",
                "Telos; Chameleon Circuit; sewers; hand crushing; crushed hands; Cryons; CyberController; Foreman’s Yard; Totter’s Lane; Halley’s Comet; Ian Levine",
                Series.SEASON22,
                1,
                2,
                "6T",
                "https://tardis.wiki/wiki/Attack_of_the_Cybermen_(TV_story)"
        );
        attackCybermen.addDoctor(sixthDoctor);
        attackCybermen.addCompanion(peri);
        storyRepository.save(attackCybermen);

        CastAndCrew attackCybermenwriter = new CastAndCrew(saward, "Writer", CastOrCrew.CREW, attackCybermen);
        castAndCrewRepository.save(attackCybermenwriter);
        CastAndCrew attackCybermendirector = new CastAndCrew(mRobinson, "Director", CastOrCrew.CREW, attackCybermen);
        castAndCrewRepository.save(attackCybermendirector);
        CastAndCrew attackCybermensEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, attackCybermen);
        castAndCrewRepository.save(attackCybermensEditor);
        CastAndCrew attackCybermenproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, attackCybermen);
        castAndCrewRepository.save(attackCybermenproducer);

        Story varos = new Story(
                "Vengeance on Varos",
                Format.TV,
                LocalDate.of(1985, 1, 19),
                LocalDate.of(1985, 1, 26),
                "Novelisation (1988), VHS (1993), Audiobook (1997 - Abridged), DVD (2001, 2012), Audiobook (2019), Blu-Ray (2022), Tales of the TARDIS (2023).",
                "img_url",
                "The TARDIS runs out of fuel, requiring a trip to a sadistic former penal colony.",
                "Video Nasty; meta; torture; acid bath; Sil; Zeiton 7; greased up hot guy",
                Series.SEASON22,
                2,
                2,
                "6V",
                "https://tardis.wiki/wiki/Vengeance_on_Varos_(TV_story)"
        );
        varos.addDoctor(sixthDoctor);
        varos.addCompanion(peri);
        storyRepository.save(varos);

        CastAndCrew varoswriter = new CastAndCrew(pMartin, "Writer", CastOrCrew.CREW, varos);
        castAndCrewRepository.save(varoswriter);
        CastAndCrew varosdirector = new CastAndCrew(rJones, "Director", CastOrCrew.CREW, varos);
        castAndCrewRepository.save(varosdirector);
        CastAndCrew varossEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, varos);
        castAndCrewRepository.save(varossEditor);
        CastAndCrew varosproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, varos);
        castAndCrewRepository.save(varosproducer);

        Story markRani = new Story(
                "The Mark of the Rani",
                Format.TV,
                LocalDate.of(1985, 2, 2),
                LocalDate.of(1985, 2, 9),
                "Novelisation (1986), VHS (1995), DVD (2006), Blu-Ray (2022).",
                "img_url",
                "The Doctor discovers someone from his year at school is ruining the vibe of a North Eastern mining village.",
                "pseudohistorical; Bad North East accents; the tree won’t hurt you; dog poo face; George Stevenson; Master; Industrial Revolution; luddites",
                Series.SEASON22,
                3,
                2,
                "6X",
                " https://tardis.wiki/wiki/The_Mark_of_the_Rani_(TV_story)"
        );
        markRani.addDoctor(sixthDoctor);
        markRani.addCompanion(peri);
        storyRepository.save(markRani);

        CastAndCrew markRaniwriter = new CastAndCrew(pipNjane, "Writer", CastOrCrew.CREW, markRani);
        castAndCrewRepository.save(markRaniwriter);
        CastAndCrew markRanidirector = new CastAndCrew(sHellings, "Director", CastOrCrew.CREW, markRani);
        castAndCrewRepository.save(markRanidirector);
        CastAndCrew markRanisEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, markRani);
        castAndCrewRepository.save(markRanisEditor);
        CastAndCrew markRaniproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, markRani);
        castAndCrewRepository.save(markRaniproducer);

        Story twoDoctors = new Story(
                "The Two Doctors",
                Format.TV,
                LocalDate.of(1985, 2, 16),
                LocalDate.of(1985, 3, 2),
                "Novelisation (1985), VHS (1993), DVD (2003), Blu-Ray (2022).",
                "img_url",
                "Two Doctors visit the same space station at different times, and are caught up in the same plot.",
                "Sontaran; Augmentation; multi Doctor; Season 6B; vegetarian; violence",
                Series.SEASON22,
                4,
                3,
                "6W",
                "https://tardis.wiki/wiki/The_Two_Doctors_(TV_story)"
        );
        twoDoctors.addDoctor(sixthDoctor);
        twoDoctors.addDoctor(secondDoctor);
        twoDoctors.addCompanion(peri);
        twoDoctors.addCompanion(jamie);
        storyRepository.save(twoDoctors);

        CastAndCrew twoDoctorswriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, twoDoctors);
        castAndCrewRepository.save(twoDoctorswriter);
        CastAndCrew twoDoctorsdirector = new CastAndCrew(pMoffatt, "Director", CastOrCrew.CREW, twoDoctors);
        castAndCrewRepository.save(twoDoctorsdirector);
        CastAndCrew twoDoctorssEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, twoDoctors);
        castAndCrewRepository.save(twoDoctorssEditor);
        CastAndCrew twoDoctorsproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, twoDoctors);
        castAndCrewRepository.save(twoDoctorsproducer);

        Story timelash = new Story(
                "Timelash",
                Format.TV,
                LocalDate.of(1985, 3, 9),
                LocalDate.of(1985, 3, 16),
                "Novelisation (1985), VHS (1998), DVD (2007), Blu-Ray (2022).",
                "img_url",
                "A young Herbert is whisked away from Scotland to the alien world of Karfel.",
                "pseudohistorical; Bandrils; puppet; most people depart with a scream; Paul Darrow unique acting style; Borad; H.G. Wells; Loch Ness Monster",
                Series.SEASON22,
                5,
                2,
                "6Y",
                "https://tardis.wiki/wiki/Timelash_(TV_story)"
        );
        timelash.addDoctor(sixthDoctor);
        timelash.addCompanion(peri);
        storyRepository.save(timelash);

        CastAndCrew timelashwriter = new CastAndCrew(gMcCoy, "Writer", CastOrCrew.CREW, timelash);
        castAndCrewRepository.save(timelashwriter);
        CastAndCrew timelashdirector = new CastAndCrew(pRoberts, "Director", CastOrCrew.CREW, timelash);
        castAndCrewRepository.save(timelashdirector);
        CastAndCrew timelashsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, timelash);
        castAndCrewRepository.save(timelashsEditor);
        CastAndCrew timelashproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, timelash);
        castAndCrewRepository.save(timelashproducer);

        Story revelationDaleks = new Story(
                "Revelation of the Daleks",
                Format.TV,
                LocalDate.of(1985, 3, 23),
                LocalDate.of(1985, 3, 30),
                "VHS (1999), DVD (2005), Novelisation (2019), Audiobook (2020), Blu-Ray (2022).",
                "img_url",
                "The Doctor wishes to pay his respects to his friend Arthur Stengos (a super father and top notch agronomist), but – would you believe it? – he’s walking into a trap.",
                "The Loved One; rock n roll; Davros; Great Healer; Glass Dalek;",
                Series.SEASON22,
                6,
                2,
                "6Z",
                "https://tardis.wiki/wiki/Revelation_of_the_Daleks_(TV_story)"
        );
        revelationDaleks.addDoctor(sixthDoctor);
        revelationDaleks.addCompanion(peri);
        storyRepository.save(revelationDaleks);

        CastAndCrew revelationDalekswriter = new CastAndCrew(saward, "Writer", CastOrCrew.CREW, revelationDaleks);
        castAndCrewRepository.save(revelationDalekswriter);
        CastAndCrew revelationDaleksdirector = new CastAndCrew(gHarper, "Director", CastOrCrew.CREW, revelationDaleks);
        castAndCrewRepository.save(revelationDaleksdirector);
        CastAndCrew revelationDalekssEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, revelationDaleks);
        castAndCrewRepository.save(revelationDalekssEditor);
        CastAndCrew revelationDaleksproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, revelationDaleks);
        castAndCrewRepository.save(revelationDaleksproducer);


        Story trialTimelord = new Story(
                "The Trial of a Time Lord",
                Format.TV,
                LocalDate.of(1986, 9, 6),
                LocalDate.of(1986, 12, 6),
                "VHS (1993), DVD (2008), Blu-Ray (2019).",
                "img_url",
                "The Doctor is put on trial by the Time Lords, and has to fight for his life.",
                "Valeyard; Ravolox; High Council; genocide; trial; courtroom; The Mysterious Planet; Mindwarp; Terror of the Vervoids; The Ultimate Foe; last appearance of Peri; companion; death; Sil; Mentor; big robot; Matrix",
                Series.SEASON23,
                1,
                14,
                "7A, 7B, 7C",
                "https://tardis.wiki/wiki/Season_23_(Doctor_Who_1963)"
        );
        trialTimelord.addDoctor(sixthDoctor);
        trialTimelord.addCompanion(peri);
        trialTimelord.addCompanion(mel);
        storyRepository.save(trialTimelord);

        CastAndCrew trialTimelordwriter1 = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelordwriter1);
        CastAndCrew trialTimelordwriter2 = new CastAndCrew(pMartin, "Writer", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelordwriter2);
        CastAndCrew trialTimelordwriter3 = new CastAndCrew(pipNjane, "Writer", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelordwriter3);
        CastAndCrew trialTimelorddirector = new CastAndCrew(nMallett, "Director", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelorddirector);
        CastAndCrew trialTimelorddirector2 = new CastAndCrew(rJones, "Director", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelorddirector2);
        CastAndCrew trialTimelorddirector3 = new CastAndCrew(cClough, "Director", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelorddirector3);
        CastAndCrew trialTimelordsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelordsEditor);
        CastAndCrew trialTimelordsEditor2 = new CastAndCrew(jnt, "Script Editor", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelordsEditor2);
        CastAndCrew trialTimelordproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, trialTimelord);
        castAndCrewRepository.save(trialTimelordproducer);

        Story mysteriousPlanet = new Story(
                "The Mysterious Planet",
                Format.TV,
                LocalDate.of(1986, 9, 6),
                LocalDate.of(1986, 9, 27),
                "Novelisation (1987), VHS (1993), DVD (2008), Blu-Ray (2019).",
                "img_url",
                "The Doctor, on trial, is shown his adventure on Ravolox as evidence of his interference.",
                "The Trial of a Time Lord; Ravolox; Glitz; big robot; Marble Arch; Earth; fireball; space station",
                Series.SEASON23,
                1,
                4,
                "7A",
                "https://tardis.wiki/wiki/The_Mysterious_Planet_(TV_story)"
        );
        mysteriousPlanet.addDoctor(sixthDoctor);
        mysteriousPlanet.addCompanion(peri);
        storyRepository.save(mysteriousPlanet);

        CastAndCrew mysteriousPlanetwriter = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, mysteriousPlanet);
        castAndCrewRepository.save(mysteriousPlanetwriter);
        CastAndCrew mysteriousPlanetdirector = new CastAndCrew(nMallett, "Director", CastOrCrew.CREW, mysteriousPlanet);
        castAndCrewRepository.save(mysteriousPlanetdirector);
        CastAndCrew mysteriousPlanetsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, mysteriousPlanet);
        castAndCrewRepository.save(mysteriousPlanetsEditor);
        CastAndCrew mysteriousPlanetproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, mysteriousPlanet);
        castAndCrewRepository.save(mysteriousPlanetproducer);

        Story mindwarp = new Story(
                "Mindwarp",
                Format.TV,
                LocalDate.of(1986, 10, 4),
                LocalDate.of(1986, 10, 25),
                "Novelisation (1989), VHS (1993), DVD (2008), Blu-Ray (2019).",
                "img_url",
                "The trial is shown the Doctor’s most recent adventure, and one that will answer the question: ‘Where is Peri?’",
                "The Trial of a Time Lord; Thoros Beta; Mentors; Sil; shouting; brain transplant; last appearance: Peri; companion; leave; departure; death",
                Series.SEASON23,
                2,
                4,
                "7B",
                "https://tardis.wiki/wiki/Mindwarp_(TV_story)"
        );
        mindwarp.addDoctor(sixthDoctor);
        mindwarp.addCompanion(peri);
        storyRepository.save(mindwarp);
        CastAndCrew mindwarpwriter = new CastAndCrew(pMartin, "Writer", CastOrCrew.CREW, mindwarp);
        castAndCrewRepository.save(mindwarpwriter);
        CastAndCrew mindwarpdirector = new CastAndCrew(rJones, "Director", CastOrCrew.CREW, mindwarp);
        castAndCrewRepository.save(mindwarpdirector);
        CastAndCrew mindwarpsEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, mindwarp);
        castAndCrewRepository.save(mindwarpsEditor);
        CastAndCrew mindwarpproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, mindwarp);
        castAndCrewRepository.save(mindwarpproducer);



        Story vervoids = new Story(
                "Terror of the Vervoids",
                Format.TV,
                LocalDate.of(1986, 11, 1),
                LocalDate.of(1986, 11, 22),
                "Novelisation (1987), VHS (1993), DVD (2008), Blu-Ray (2019).",
                "img_url",
                "The Doctor mounts his defence by showing everyone a murder mystery on a cruise liner.",
                "The Trial of a Time Lord; plant creatures; black hole; genocide; scream in same key as theme tune; first appearance; companion; Mel",
                Series.SEASON23,
                3,
                4,
                "7C",
                "https://tardis.wiki/wiki/Terror_of_the_Vervoids_(TV_story)"
        );
        vervoids.addDoctor(sixthDoctor);
        vervoids.addCompanion(mel);
        storyRepository.save(vervoids);

        CastAndCrew vervoidswriter = new CastAndCrew(pipNjane, "Writer", CastOrCrew.CREW, vervoids);
        castAndCrewRepository.save(vervoidswriter);
        CastAndCrew vervoidsdirector = new CastAndCrew(cClough, "Director", CastOrCrew.CREW, vervoids);
        castAndCrewRepository.save(vervoidsdirector);
        CastAndCrew vervoidssEditor = new CastAndCrew(jnt, "Script Editor", CastOrCrew.CREW, vervoids);
        castAndCrewRepository.save(vervoidssEditor);
        CastAndCrew vervoidsproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, vervoids);
        castAndCrewRepository.save(vervoidsproducer);


        Story ultimateFoe = new Story(
                "The Ultimate Foe",
                Format.TV,
                LocalDate.of(1986, 11, 29),
                LocalDate.of(1986, 12, 6),
                "Novelisation (1988), VHS (1993), DVD (2008), Blu-Ray (2019).",
                "img_url",
                "The Doctor’s defence is going badly. Fortunately someone has called himself as a surprise witness: his arch-enemy, the Master.",
                "The Trial of a Time Lord; Valeyard; Matrix; High Council; Master; amalgamation; darker impulses; twelfth and final regenerations",
                Series.SEASON23,
                4,
                2,
                "7C",
                "https://tardis.wiki/wiki/The_Ultimate_Foe_(TV_story)"
        );
        ultimateFoe.addDoctor(sixthDoctor);
        ultimateFoe.addCompanion(mel);
        storyRepository.save(ultimateFoe);

        CastAndCrew ultimateFoewriter1 = new CastAndCrew(holmes, "Writer", CastOrCrew.CREW, ultimateFoe);
        castAndCrewRepository.save(ultimateFoewriter1);
        CastAndCrew ultimateFoewriter2 = new CastAndCrew(pipNjane, "Writer", CastOrCrew.CREW, ultimateFoe);
        castAndCrewRepository.save(ultimateFoewriter2);
        CastAndCrew ultimateFoedirector = new CastAndCrew(cClough, "Director", CastOrCrew.CREW, ultimateFoe);
        castAndCrewRepository.save(ultimateFoedirector);
        CastAndCrew ultimateFoesEditor = new CastAndCrew(saward, "Script Editor", CastOrCrew.CREW, ultimateFoe);
        castAndCrewRepository.save(ultimateFoesEditor);
        CastAndCrew ultimateFoesEditor2 = new CastAndCrew(jnt, "Script Editor", CastOrCrew.CREW, ultimateFoe);
        castAndCrewRepository.save(ultimateFoesEditor2);
        CastAndCrew ultimateFoeproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, ultimateFoe);
        castAndCrewRepository.save(ultimateFoeproducer);

        Story timeRani = new Story(
                "Time and the Rani",
                Format.TV,
                LocalDate.of(1987, 9, 7),
                LocalDate.of(1987, 9, 28),
                "Novelisation (1987), VHS (1995), DVD (2010), Blu-Ray (2021).",
                "img_url",
                "The Rani forces the TARDIS to crash land as part of an incredible scheme.",
                "Spoons; regeneration; first appearance; Seventh Doctor; last appearance; Rani; Lakertya; impersonation",
                Series.SEASON24,
                1,
                4,
                "7D",
                "https://tardis.wiki/wiki/Time_and_the_Rani_(TV_story)"
        );
        timeRani.addDoctor(seventhDoctor);
        timeRani.addCompanion(mel);
        storyRepository.save(timeRani);

        CastAndCrew timeRaniWriters = new CastAndCrew(pipNjane, "Writer", CastOrCrew.CREW, timeRani);
        castAndCrewRepository.save(timeRaniWriters);
        CastAndCrew timeRanidirector = new CastAndCrew(aMorgan, "Director", CastOrCrew.CREW, timeRani);
        castAndCrewRepository.save(timeRanidirector);
        CastAndCrew timeRanisEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, timeRani);
        castAndCrewRepository.save(timeRanisEditor);
        CastAndCrew timeRaniproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, timeRani);
        castAndCrewRepository.save(timeRaniproducer);

        Story paradiseTowers = new Story("Paradise Towers",
                Format.TV,
                LocalDate.of(1987, 10, 5),
                LocalDate.of(1987, 10, 26),
                "Novelisation (1988), VHS (1995), DVD (2011), Audiobook (2012), Blu-Ray (2021).",
                "img_url",
                "The Doctor and Mel arrive at Paradise Towers, hoping to use the swimming pool.",
                "Bad actor; Caretakers; Red; Blue; Kangs; Ballard; High Rise",
                Series.SEASON24,
                2,
                4,
                "7E",
                "https://tardis.wiki/wiki/Paradise_Towers_(TV_story)"
        );
        paradiseTowers.addDoctor(seventhDoctor);
        paradiseTowers.addCompanion(mel);
        storyRepository.save(paradiseTowers);

        CastAndCrew paradiseTowersWriter = new CastAndCrew(wyatt, "Writer", CastOrCrew.CREW, paradiseTowers);
        castAndCrewRepository.save(paradiseTowersWriter);
        CastAndCrew paradiseTowersdirector = new CastAndCrew(nMallett, "Director", CastOrCrew.CREW, paradiseTowers);
        castAndCrewRepository.save(paradiseTowersdirector);
        CastAndCrew paradiseTowerssEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, paradiseTowers);
        castAndCrewRepository.save(paradiseTowerssEditor);
        CastAndCrew paradiseTowersproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, paradiseTowers);
        castAndCrewRepository.save(paradiseTowersproducer);

        Story deltaBannermen = new Story(
                "Delta and the Bannermen",
                Format.TV,
                LocalDate.of(1987, 11, 2),
                LocalDate.of(1987, 11, 16),
                "Novelisation (1989), VHS (2001), DVD (2009), Audiobook (2017), Blu-Ray (2021).",
                "img_url",
                "The Doctor and Mel travel with some aliens to a Welsh holiday camp and then have to avert a genocide.",
                "Chimeron; Holiday Camp; Space Race; Barry Island; Wales; Ken Dodd; rock ‘n’ roll; rock n roll; Shangri-La; Navarino; tonally jarring; question mark umbrella; first appearance; pseudohistorical",
                Series.SEASON24,
                3,
                3,
                "7F",
                "https://tardis.wiki/wiki/Delta_and_the_Bannermen_(TV_story)"
        );
        deltaBannermen.addDoctor(seventhDoctor);
        deltaBannermen.addCompanion(mel);
        storyRepository.save(deltaBannermen);

        CastAndCrew deltaBannermenWriter = new CastAndCrew(kohll, "Writer", CastOrCrew.CREW, deltaBannermen);
        castAndCrewRepository.save(deltaBannermenWriter);
        CastAndCrew deltaBannermendirector = new CastAndCrew(cClough, "Director", CastOrCrew.CREW, deltaBannermen);
        castAndCrewRepository.save(deltaBannermendirector);
        CastAndCrew deltaBannermensEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, deltaBannermen);
        castAndCrewRepository.save(deltaBannermensEditor);
        CastAndCrew deltaBannermenproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, deltaBannermen);
        castAndCrewRepository.save(deltaBannermenproducer);

        Story dragonfire = new Story(
                "Dragonfire",
                Format.TV,
                LocalDate.of(1987, 11, 23),
                LocalDate.of(1987, 12, 7),
                "Novelisation (1989), VHS (1994), DVD (2012), Blu-Ray (2021).",
                "img_url",
                "The Doctor and Mel go hunting for dragons on Iceworld.",
                "Iceworld; time storm; first appearance; Ace; final appearance: Glitz; literal cliffhanger;",
                Series.SEASON24,
                4,
                3,
                "7G",
                " https://tardis.wiki/wiki/Dragonfire_(TV_story)"
        );
        dragonfire.addDoctor(seventhDoctor);
        dragonfire.addCompanion(mel);
        dragonfire.addCompanion(ace);
        storyRepository.save(dragonfire);

        CastAndCrew dragonfireWriter = new CastAndCrew(iBriggs, "Writer", CastOrCrew.CREW, dragonfire);
        castAndCrewRepository.save(dragonfireWriter);
        CastAndCrew dragonfiredirector = new CastAndCrew(cClough, "Director", CastOrCrew.CREW, dragonfire);
        castAndCrewRepository.save(dragonfiredirector);
        CastAndCrew dragonfiresEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, dragonfire);
        castAndCrewRepository.save(dragonfiresEditor);
        CastAndCrew dragonfireproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, dragonfire);
        castAndCrewRepository.save(dragonfireproducer);


        Story remembrance = new Story( "Remembrance of the Daleks",
                Format.TV,
                LocalDate.of(1988, 10, 5),
                LocalDate.of(1988, 10, 26),
                "Novelisation (1990), VHS (1993), DVD (2001, 2007), Audiobook (2015)",
                "img_url",
                "The Doctor returns to London in 1963, where he has unfinished business from his last visit.",
                "Hand; Omega; Skaro; destroyed; Renegade; Imperial; Davros; battle computer; Counter Measures; Special Weapons Dalek; pseudohistorical; baseball bat; Cartmel Masterplan; Other",
                Series.SEASON25,
                1,
                4,
                "7H",
                "https://tardis.wiki/wiki/Remembrance_of_the_Daleks_(TV_story)"
        );
        remembrance.addDoctor(seventhDoctor);
        remembrance.addCompanion(ace);
        storyRepository.save(remembrance);

        CastAndCrew remembranceWriter = new CastAndCrew(aaronovitch, "Writer", CastOrCrew.CREW, remembrance);
        castAndCrewRepository.save(remembranceWriter);
        CastAndCrew remembrancedirector = new CastAndCrew(aMorgan, "Director", CastOrCrew.CREW, remembrance);
        castAndCrewRepository.save(remembrancedirector);
        CastAndCrew remembrancesEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, remembrance);
        castAndCrewRepository.save(remembrancesEditor);
        CastAndCrew remembranceproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, remembrance);
        castAndCrewRepository.save(remembranceproducer);

        Story happinessPatrol = new Story(
                "The Happiness Patrol",
                Format.TV,
                LocalDate.of(1988, 11, 2),
                LocalDate.of(1988, 11, 16),
                "Novelisation (1990), VHS (1997), Audiobook (2009), DVD (2012).",
                "img_url",
                "The Doctor decides to topple an empire in one night.",
                "Thatcher; Bertie Bassett; angry dog puppet; Pink TARDIS; Pipe People; Kandyman",
                Series.SEASON25,
                2,
                3,
                "7L",
                "https://tardis.wiki/wiki/The_Happiness_Patrol_(TV_story)"
        );
        happinessPatrol.addDoctor(seventhDoctor);
        happinessPatrol.addCompanion(ace);
        storyRepository.save(happinessPatrol);

        CastAndCrew happinessPatrolWriter = new CastAndCrew(gCurry, "Writer", CastOrCrew.CREW, happinessPatrol);
        castAndCrewRepository.save(happinessPatrolWriter);
        CastAndCrew happinessPatroldirector = new CastAndCrew(cClough, "Director", CastOrCrew.CREW, happinessPatrol);
        castAndCrewRepository.save(happinessPatroldirector);
        CastAndCrew happinessPatrolsEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, happinessPatrol);
        castAndCrewRepository.save(happinessPatrolsEditor);
        CastAndCrew happinessPatrolproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, happinessPatrol);
        castAndCrewRepository.save(happinessPatrolproducer);

        Story silverNemesis = new Story(
                "Silver Nemesis",
                Format.TV,
                LocalDate.of(1988, 11, 23),
                LocalDate.of(1988, 12, 7),
                "Novelisation (1989), VHS (1993 - Extended Edition), DVD (2010).",
                "img_url",
                "The Doctor has to stop a witch, the Cybermen and some Nazis from getting their hands on a comet.",
                "Cybermen; Peinforte; chess; Cartmel Masterplan; bow; arrow; making of; Courtney Pine; social workers; pseudohistorical",
                Series.SEASON25,
                3,
                3,
                "7K",
                "https://tardis.wiki/wiki/Silver_Nemesis_(TV_story)"
        );
        silverNemesis.addDoctor(seventhDoctor);
        silverNemesis.addCompanion(ace);
        storyRepository.save(silverNemesis);

        CastAndCrew silverNemesisWriter = new CastAndCrew(kClarke, "Writer", CastOrCrew.CREW, silverNemesis);
        castAndCrewRepository.save(silverNemesisWriter);
        CastAndCrew silverNemesisdirector = new CastAndCrew(cClough, "Director", CastOrCrew.CREW, silverNemesis);
        castAndCrewRepository.save(silverNemesisdirector);
        CastAndCrew silverNemesissEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, silverNemesis);
        castAndCrewRepository.save(silverNemesissEditor);
        CastAndCrew silverNemesisproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, silverNemesis);
        castAndCrewRepository.save(silverNemesisproducer);

        Story greatestShow = new Story(
                "The Greatest Show in the Galaxy",
                Format.TV,
                LocalDate.of(1988, 12, 14),
                LocalDate.of(1989, 1, 4),
                "Novelisation (1989), VHS (2000), DVD (2012), Audiobook (2013).",
                "img_url",
                "The Doctor and Ace head to the circus, where someone has sent in the clowns.",
                "Clowns; hippies; circus; rapping; Gods; Ragnarok; werewolf",
                Series.SEASON25,
                4,
                4,
                "7J",
                "https://tardis.wiki/wiki/The_Greatest_Show_in_the_Galaxy_(TV_story)"
        );
        greatestShow.addDoctor(seventhDoctor);
        greatestShow.addCompanion(ace);
        storyRepository.save(greatestShow);

        CastAndCrew greatestShowWriter = new CastAndCrew(wyatt, "Writer", CastOrCrew.CREW, greatestShow);
        castAndCrewRepository.save(greatestShowWriter);
        CastAndCrew greatestShowdirector = new CastAndCrew(aWareing, "Director", CastOrCrew.CREW, greatestShow);
        castAndCrewRepository.save(greatestShowdirector);
        CastAndCrew greatestShowsEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, greatestShow);
        castAndCrewRepository.save(greatestShowsEditor);
        CastAndCrew greatestShowproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, greatestShow);
        castAndCrewRepository.save(greatestShowproducer);

        Story battlefield = new Story(
                "Battlefield",
                Format.TV,
                LocalDate.of(1989, 9, 6),
                LocalDate.of(1989, 9, 27),
                "Novelisation (1991), VHS (1998 - Extended Edition), DVD (2008), Blu-Ray (2020), Audiobook (2022).",
                "img_url",
                "As knights invade from another dimension, the Doctor discovers he's something of a legend.",
                "Merlin; Excalibur; King Arthur; Arthurian; Legend; Myth; Round Table; Knights; maniacal laugh; dimension; pay the tab",
                Series.SEASON26,
                1,
                4,
                "7N",
                "https://tardis.wiki/wiki/Battlefield_(TV_story)"
        );
        battlefield.addDoctor(seventhDoctor);
        battlefield.addCompanion(ace);
        battlefield.addCompanion(brigadier);
        storyRepository.save(battlefield);

        CastAndCrew battlefieldWriter = new CastAndCrew(aaronovitch, "Writer", CastOrCrew.CREW, battlefield);
        castAndCrewRepository.save(battlefieldWriter);
        CastAndCrew battlefielddirector = new CastAndCrew(mKerrigan, "Director", CastOrCrew.CREW, battlefield);
        castAndCrewRepository.save(battlefielddirector);
        CastAndCrew battlefieldsEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, battlefield);
        castAndCrewRepository.save(battlefieldsEditor);
        CastAndCrew battlefieldproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, battlefield);
        castAndCrewRepository.save(battlefieldproducer);

        Story ghostlight = new Story(
                "Ghostlight",
                Format.TV,
                LocalDate.of(1989, 10, 4),
                LocalDate.of(1989, 10, 18),
                "Novelisation (1990), VHS (1994), DVD (2004), Audiobook (2011). Blu-Ray (2020).",
                "img_url",
                "The Doctor takes Ace to a haunted house to confront her worst fears.",
                "Angel; Victorian; pseudohistorical; Gabriel Chase; manipulation; survival of the fittest",
                Series.SEASON26,
                2,
                3,
                "7Q",
                "https://tardis.wiki/wiki/Ghost_Light_(TV_story)"
        );
        ghostlight.addDoctor(seventhDoctor);
        ghostlight.addCompanion(ace);
        storyRepository.save(ghostlight);

        CastAndCrew ghostlightWriter = new CastAndCrew(platt, "Writer", CastOrCrew.CREW, ghostlight);
        castAndCrewRepository.save(ghostlightWriter);
        CastAndCrew ghostlightdirector = new CastAndCrew(aWareing, "Director", CastOrCrew.CREW, ghostlight);
        castAndCrewRepository.save(ghostlightdirector);
        CastAndCrew ghostlightsEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, ghostlight);
        castAndCrewRepository.save(ghostlightsEditor);
        CastAndCrew ghostlightproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, ghostlight);
        castAndCrewRepository.save(ghostlightproducer);

        Story fenric = new Story(
                "The Curse of Fenric",
                Format.TV,
                LocalDate.of(1989, 10, 25),
                LocalDate.of(1989, 11, 15),
                "Novelisation (1990), VHS (1991 - Extended Edition), DVD (2003), Blu-Ray (2020), Tales of the TARDIS (2023).",
                "img_url",
                "The Doctor and Ace arrive at a World War Two naval base, where a game of traps is afoot.",
                "Wolves; manipulation; pseudohistorical; genie; lamp; chess; vampires; faith; Norse mythology; weird flirting; environmental disaster; paradox",
                Series.SEASON26,
                3,
                4,
                "7M",
                "https://tardis.wiki/wiki/The_Curse_of_Fenric_(TV_story)"
        );
        fenric.addDoctor(seventhDoctor);
        fenric.addCompanion(ace);
        storyRepository.save(fenric);

        CastAndCrew fenricWriter = new CastAndCrew(iBriggs, "Writer", CastOrCrew.CREW, fenric);
        castAndCrewRepository.save(fenricWriter);
        CastAndCrew fenricdirector = new CastAndCrew(aWareing, "Director", CastOrCrew.CREW, fenric);
        castAndCrewRepository.save(fenricdirector);
        CastAndCrew fenricsEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, fenric);
        castAndCrewRepository.save(fenricsEditor);
        CastAndCrew fenricproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, fenric);
        castAndCrewRepository.save(fenricproducer);

        Story survival = new Story(
                "Survival",
                Format.TV,
                LocalDate.of(1989, 11, 22),
                LocalDate.of(1989, 12, 6),
                "Novelisation (1990), VHS (1995), DVD (2007), Blu-Ray (2020).",
                "img_url",
                "synopsis",
                "Master; Cheetah People; lesbian subtext; cats; Hale and Pace; last story; classic era; original run; Perivale; survival of the fittest",
                Series.SEASON26,
                4,
                3,
                "7P",
                "https://tardis.wiki/wiki/Survival_(TV_story)"
        );
        survival.addDoctor(seventhDoctor);
        survival.addCompanion(ace);
        storyRepository.save(survival);

        CastAndCrew survivalwriter = new CastAndCrew(rMunro, "Writer", CastOrCrew.CREW, survival);
        castAndCrewRepository.save(survivalwriter);
        CastAndCrew survivaldirector = new CastAndCrew(aWareing, "Director", CastOrCrew.CREW, survival);
        castAndCrewRepository.save(survivaldirector);
        CastAndCrew survivalsEditor = new CastAndCrew(cartmel, "Script Editor", CastOrCrew.CREW, survival);
        castAndCrewRepository.save(survivalsEditor);
        CastAndCrew survivalproducer = new CastAndCrew(jnt, "Producer", CastOrCrew.CREW, survival);
        castAndCrewRepository.save(survivalproducer);


        Story tvm = new Story(
                "Doctor Who",
                Format.TV,
                LocalDate.of(1996, 5, 27),
                LocalDate.of(1996, 5, 27),
                "VHS (1996), Novelisation (1996), Audiobook (1997), DVD (2001, 2010), Blu-Ray (2016)",
                "img_url",
                "The Doctor attempts to stop the Earth from being pulled inside out on New Year's Eve.",
                "Master; Fox; The TV Movie; half human; kiss; romance; Byron; Seventh Doctor; regeneration; temporal orbit; first appearance Eighth Doctor",
                Series.TVM,
                1,
                1,
                "50/LDX071Y/01X",
                "https://tardis.wiki/wiki/Doctor_Who_(TV_story)"
        );
        tvm.addDoctor(eighthDoctor);
        tvm.addCompanion(grace);
        storyRepository.save(tvm);

        CastAndCrew tvmwriter = new CastAndCrew(mJacobs, "Writer", CastOrCrew.CREW, tvm);
        castAndCrewRepository.save(tvmwriter);
        CastAndCrew tvmdirector = new CastAndCrew(gSax, "Director", CastOrCrew.CREW, tvm);
        castAndCrewRepository.save(tvmdirector);
        CastAndCrew tvmproducer = new CastAndCrew(peterWare, "Producer", CastOrCrew.CREW, tvm);
        castAndCrewRepository.save(tvmproducer);
        CastAndCrew tvmproducer2 = new CastAndCrew(mJacobs, "Producer", CastOrCrew.CREW, tvm);
        castAndCrewRepository.save(tvmproducer2);



        Story roseStory = new Story(
                "Rose",
                Format.TV,
                LocalDate.of(2005, 3, 26),
                LocalDate.of(2005, 3, 26),
                "DVD (2005), Blu-Ray (2013), Novelisation (2018), Audiobook (2018).",
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
        CastAndCrew eleventhHourdirector = new CastAndCrew(aSmith, "Director", CastOrCrew.CREW, eleventhHour);
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
        storyRepository.save(timeAngelsStones);

        CastAndCrew timeAngelsStoneswriter = new CastAndCrew(moffat, "Writer", CastOrCrew.CREW, timeAngelsStones);
        castAndCrewRepository.save(timeAngelsStoneswriter);
        CastAndCrew timeAngelsStonesdirector = new CastAndCrew(aSmith, "Director", CastOrCrew.CREW, timeAngelsStones);
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
                "The Doctor, due to a case of mistaken identity, gets roped into a diamond heist with his wife.",
                "Christmas Special; Festive Special; severed heads; robot; Hydroflax; first appearance of Nardole; last appearance of: River Song; Singing Towers; Darillium",
                Series.SERIES9,
                9,
                1,
                "",
                "https://tardis.wiki/wiki/The_Husbands_of_River_Song_(TV_story)"
        );
        husbandsRiver.addDoctor(twelfthDoctor);
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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
                "img_url",
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

