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
        
        Companion donna = new Companion ("Donna", "Noble", "", "2008, 2023", "Catherine Tate", "");
        companionRepository.save(donna);
        
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
        Person chibnall = new Person("Chris Chibnall", "Writer and Doctor Who Show Runner (2018 - 2022)");
        personRepository.save(chibnall);
        Person cClarke = new Person("Chris Clarke", "Writer");
        personRepository.save(cClarke);
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
        Person rtd = new Person("Russell T. Davies", "Writer and Doctor Who Show Runner (2005 - 2010, 2023 - )");
        personRepository.save(rtd);
        Person gDavis = new Person("Gerry Davies", "Writer and Doctor Who Script Editor (1966 - 1967)");
        personRepository.save(gDavis);
        Person terranceD = new Person("Terrance Dicks", "Writer and Doctor Who Script Editor (1968 - 1974)");
        personRepository.save(terranceD);
        Person sDollard = new Person("Sarah Dollard", "Writer");
        personRepository.save(sDollard);
        Person tDudley = new Person("Terence Dudley", "Writer");
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
        Person moffat = new Person("Steven Moffat", "Writer and Doctor Who Show Runner (2010 - 2017)");
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
        CastAndCrew name = new CastAndCrew(lucarotti, "Writer", CastOrCrew.CREW, marcoPolo);
        castAndCrewRepository.save(name);


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

        Story massacre = new Story(
                "The Massacre",
                Format.TV,
                LocalDate.of(1966, 02, 05),
                LocalDate.of(1966, 02, 26),
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
        CastAndCrew writerMassacre = new CastAndCrew(tosh, "Writer", CastOrCrew.CREW, massacre);
        castAndCrewRepository.save(writerMassacre);


        Story ark = new Story(
                "The Ark",
                Format.TV,
                LocalDate.of(1966, 03, 05),
                LocalDate.of(1996, 03, 26),
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


        Story clawsAxos = new Story(
                "The Claws of Axos",
                Format.TV,
                LocalDate.of(1971, 3, 13),
                LocalDate.of(1971, 4, 3),
                "Novelisation (1977), VHS (1992), DVD (2005, 2012), Blu-Ray (2021)",
                "img_url",
                "A group of gold-skinned aliens arrive on Earth and are absolutely lovely.",
                "Axonite; Pigbin Josh; Civil Servant; recolourised",
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

        Story seaDevils = new Story(
                "The Sea Devils",
                Format.TV,
                LocalDate.of(1972, 2, 26),
                LocalDate.of(1972, 4, 1),
                "Novelisation (1974), VHS (1995), Audio (2006), DVD (2008), Audiobook (2012), Blu-Ray (2023).",
                "img_url",
                "The Doctor and Jo visit the Master in a high security prison, and hear about a series of mysterious sinkings in the area.",
                "Master; Silurian; Navy",
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



        Story terrorZygons = new Story(
                "title",
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

        CastAndCrew name = new CastAndCrew(rBanksStewart, "Writer", CastOrCrew.CREW, seedsDoom);
        castAndCrewRepository.save(name);



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


        Story story = new Story(
                "title",
                Format.TV,
                LocalDate.of(1976),
                LocalDate.of(1976),
                "releases",
                "img_url",
                "synopsis",
                "keywords",
                Series.SEASON15,
                story_number,
                num_episodes,
                "productionCode",
                "wikiLink"
        );
        story.addDoctor(fourthDoctor);
        story.addCompanion(sarahJane);
        storyRepository.save(story);

        CastAndCrew name = new CastAndCrew(person, "Writer", CastOrCrew.CREW, story);
        castAndCrewRepository.save(name);

        Story fangRock = new Story();
        Story invisibleEnemy = new Story();
        Story fendahl = new Story();
        Story sunmakers = new Story();
        Story underworld = new Story();
        Story invasionTime = new Story();
        Story ribos = new Story();
        Story piratePlanet = new Story();
        Story stonesBlood = new Story();
        Story tara = new Story();
        Story kroll = new Story();
        Story armageddon = new Story();
        Story destinyDaleks = new Story();
        Story cityDeath = new Story();
        Story creaturePit = new Story();
        Story nightmareEden = new Story();
        Story nimon = new Story();
        Story leisureHive = new Story();
        Story meglos = new Story();
        Story fullCircle = new Story();
        Story stateDecay = new Story();
        Story warriorsgate = new Story();
        Story traken = new Story();
        Story logopolis = new Story();
        Story castrovalva = new Story();
        Story fourDoomsday = new Story();
        Story kinda = new Story();
        Story visitation = new Story();
        Story blorchid = new Story();
        Story earthshock = new Story();
        Story timeflight = new Story();
        Story arcofinfinity = new Story();
        Story snakedance = new Story();
        Story mawdryn = new Story();
        Story terminus = new Story();
        Story enlightenment = new Story();
        Story kingsdemons = new Story();
        Story fivedoctors = new Story();
        Story warriorsDeep = new Story();
        Story awakening = new Story();
        Story frontios = new Story();
        Story resurrectionDaleks = new Story();
        Story planetFire = new Story();
        Story androzani = new Story();
        Story twinDilemma = new Story();
        Story attackCybermen = new Story();
        Story varos = new Story();
        Story markRani = new Story();
        Story twoDoctors = new Story();
        Story timelash = new Story();
        Story revelationDaleks = new Story();
        Story trialTimelord = new Story();
        Story mysteriousPlanet = new Story();
        Story mindwarp = new Story();
        Story vervoids = new Story();
        Story ultimateFoe = new Story();
        Story timeRani = new Story();
        Story paradiseTowers = new Story();
        Story deltaBannermen = new Story();
        Story dragonfire = new Story();
        Story remembrance = new Story();
        Story happinessPatrol = new Story();
        Story silverNemesis = new Story();
        Story greatestShow = new Story();
        Story battlefield = new Story();
        Story ghostlight = new Story();
        Story fenric = new Story();
        Story survival = new Story();
        Story tvm = new Story();
        Story roseStory = new Story();
        Story endWorld = new Story();
        Story unquiet = new Story();
        Story aliensLondon = new Story();
        Story wwthree = new Story();
        Story dalek = new Story();
        Story longGame = new Story();
        Story fathersday = new Story();
        Story emptyChild = new Story();
        Story drDances = new Story();
        Story boomTown = new Story();
        Story badWolf = new Story();
        Story partingWays = new Story();
        Story xmasInvasion = new Story();
        Story newEarth = new Story();
        Story toothClaw = new Story();
        Story schoolReunion = new Story();
        Story girlFireplace = new Story();
        Story riseCybermen = new Story();
        Story ageSteel = new Story();
        Story idiotLantern = new Story();
        Story impossPlanet = new Story();
        Story satanPit = new Story();
        Story loveMonsters = new Story();
        Story fearHer = new Story();
        Story armyofghosts = new Story();
        Story doomsday = new Story();
        Story runawayBride = new Story();
        Story smithJones = new Story();
        Story shakespeareCode = new Story();
        Story gridlock = new Story();
        Story daleksManhattan = new Story();
        Story evolutionDaleks = new Story();
        Story lazarus = new Story();
        Story fortytwo = new Story();
        Story humanNature = new Story();
        Story famblood = new Story();
        Story blink = new Story();
        Story utopia = new Story();
        Story soundDrums = new Story();
        Story lastTimelords = new Story();
        Story voyageDamned = new Story();
        Story partnerscrime = new Story();
        Story firepompeii = new Story();
        Story planetOod = new Story();
        Story sontaranstrategem = new Story();
        Story poisonSky = new Story();
        Story drDaughter = new Story();
        Story unicornWasp = new Story();
        Story silenceLibrary = new Story();
        Story forestDead = new Story();
        Story midnight = new Story();
        Story turnLeft = new Story();
        Story stolenEarth = new Story();
        Story journeyEnd = new Story();
        Story nextDr = new Story();
        Story planetDead = new Story();
        Story watersMars = new Story();
        Story endTime = new Story();
        Story eleventhHour = new Story();
        Story beastBelow = new Story();
        Story victoryDaleks = new Story();
        Story timeAngels = new Story();
        Story fleshStone = new Story();
        Story vampiresVenice = new Story();
        Story amyChoise = new Story();
        Story hungryEarth = new Story();
        Story coldBlood = new Story();
        Story vincentDoctor = new Story();
        Story lodger = new Story();
        Story pandorica = new Story();
        Story bigBang = new Story();
        Story christmasCarol = new Story();
        Story impossAstronaut = new Story();
        Story dayMoon = new Story();
        Story blackSpot = new Story();
        Story drWife = new Story();
        Story rebelFlesh = new Story();
        Story almostPpl = new Story();
        Story goodManWar = new Story();
        Story killHitler = new Story();
        Story nightTerrors = new Story();
        Story girlWaited = new Story();
        Story godComplex = new Story();
        Story closingTime = new Story();
        Story weddingRiver = new Story();
        Story drWidow = new Story();
        Story asylumDaleks = new Story();
        Story dinoSpaceship = new Story();
        Story townMercy = new Story();
        Story powerThree = new Story();
        Story angelsManhattan = new Story();
        Story snowmen = new Story();
        Story bellsStJohn = new Story();
        Story name = new Story();
        Story akhaten = new Story();
        Story coldWar = new Story();
        Story hide = new Story();
        Story centreTARDIS = new Story();
        Story crimsonHorror = new Story();
        Story nightmareSilver = new Story();
        Story nameDoctor = new Story();
        Story nightDoctor = new Story();
        Story dayDoctor = new Story();
        Story timeDoctor = new Story();
        Story deepBreath = new Story();
        Story intoDalek = new Story();
        Story robotSherwood = new Story();
        Story listen = new Story();
        Story timeHeist = new Story();
        Story caretaker = new Story();
        Story killMoon = new Story();
        Story mummy = new Story();
        Story flatline = new Story();
        Story forestNight = new Story();
        Story darkwater = new Story();
        Story deathHeaven = new Story();
        Story lastXmas = new Story();
        Story magician = new Story();
        Story witch = new Story();
        Story underLake = new Story();
        Story beforeFlood = new Story();
        Story girlDied = new Story();
        Story womanLived = new Story();
        Story zygonInvasion = new Story();
        Story zygonInversion = new Story();
        Story sleepnomore = new Story();
        Story faceraven = new Story();
        Story heaven = new Story();
        Story hell = new Story();
        Story husbandsRiver = new Story();
        Story drMysterio = new Story();
        Story pilot = new Story();
        Story smile = new Story();
        Story thinIce = new Story();
        Story knock = new Story();
        Story oxygen = new Story();
        Story extremis = new Story();
        Story pyramidEndWorld = new Story();
        Story lieLand = new Story();
        Story empressMars = new Story();
        Story eatersLight = new Story();
        Story worldenough = new Story();
        Story drfalls = new Story();
        Story twicetime = new Story();
        Story womanFell = new Story();
        Story ghostMonument = new Story();
        Story rosa = new Story();
        Story arachnids = new Story();
        Story tsuranga = new Story();
        Story demonsPunjab = new Story();
        Story kerblam = new Story();
        Story witchfinders = new Story();
        Story takesAway = new Story();
        Story ranksoor = new Story();
        Story resolution = new Story();
        Story spyfall = new Story();
        Story orphan = new Story();
        Story tesla = new Story();
        Story fugitiveJudoon = new Story();
        Story praxeus = new Story();
        Story canuhearme = new Story();
        Story villaDiodati = new Story();
        Story ascenscionCybs = new Story();
        Story timelessChild = new Story();
        Story revolutionDaleks = new Story();
        Story halloweenApocalypse = new Story();
        Story warSontarans = new Story();
        Story onceTime = new Story();
        Story villageAngels = new Story();
        Story survivorsFlux = new Story();
        Story vanquishers = new Story();
        Story eveDaleks = new Story();
        Story legendSeaDevils = new Story();
        Story powerDr = new Story();
        Story starbeast = new Story();
        Story wildblueyonder = new Story();
        Story giggle = new Story();
        Story rubyRoad = new Story();
        Story spaceBabies = new Story();
        Story devilChord = new Story();
        Story boom = new Story();
        Story yards = new Story();
        Story dotBubble = new Story();
        Story rogue = new Story();
        Story legendRuby = new Story();
        Story empireDeath = new Story();
    }
}
