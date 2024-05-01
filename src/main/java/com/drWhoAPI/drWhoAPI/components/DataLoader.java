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
                "The Mutants; The Dead Planet; The Survivors; The Escape; The Ambush; The Expedition; The Ordeal; The Rescue; Skaro; Thals",
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
                "Missing Episode; The Roof of the World; The Singing Sands; Five Hundred Eyes; The Wall of Lies; Rider from Shang-Tu; Mighty Kublai Khan; Assassin at Peking",
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
"The Temple of Evil; The Warriors of Death; The Bride of Sacrifice; The Day of Darkness; Yetaxa; change history",
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
"A Land of Fear; Guests of Madame Guillotine; A Change of Identity; The Tyrant of France; A Bargain of Necessity; Prisoners of Conciergerie; Napoleon; Robespierre; missing episodes",
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
                "The Powerful Enemy; Desperate Measures; Sandy; Vicki",
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
                "The Slave Traders; All Roads Lead to Rome; Conspiracy; Inferno; shipping",
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
                "The Lion; The Knight of Jaffa; The Wheel of Fortune; The Warlords; Richard; Lionheart",
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
                "The Executioners; The Death of Time; Flight Through Eternity; Journey Into Terror; The Death of Doctor Who; The Planet of Decision; Marie Celeste; Mechanoids; stupid Dalek;",
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
"The Watcher; The Meddling Monk; A Battle of Wits; Checkmate; Time Lord; another; TARDIS",
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
                "Temple of Secrets; Small Prophet, Quick Return; Death of a Spy; Horse of Destruction; Companion; leave; Vicki; departure; Troy",
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
                "The Nightmare Begins; Day of Armageddon; Devil’s Planet; The Traitors; Counter Plot; Coronas of the Sun; The Feast of Steven; Volcano; Golden Death; Escape Switch; The Abandoned Planet; Destruction of Time; Dalek; masterplan; companion; death",
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
                "War of God; The Sea Beggar; Priest of Death; Bell of Doom; double; The Massacre of St Bartholomew’s Eve; missing episodes",
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
"A Holiday for the Doctor; Don’t Shoot the Pianist; Johnny Ringo; The OK Corral; gunfight; western; musical; ballad; last chance saloon",
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
                "title",
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
"Companion; departure; leave; Dodo; post office tower; BT tower",
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
"Missing episodes; pirates; Henry Avery",
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
"Regeneration; missing episodes; Cybermen; Mondas",
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
"Missing episodes; regeneration; Dalek",
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
                "Missing Episodes; companion; Jamie",
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
"Missing episodes; Daleks; Victorian; alchemy; Skaro",
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
                "Missing episodes; Yeti; Great Intelligence",
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
                "Missing episodes; John Smith; Cybermen;",
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

        Story story = new Story(
                "title",
                Format.TV,
                LocalDate.of(),
                LocalDate.of(),
                "releases",
                "img_url",
                "synopsis",
                "keywords",
                Series.SEASON7,
                story_number,
                num_episodes,
                "productionCode",
                "wikiLink"
        );
        CastAndCrew name = new CastAndCrew(person, "role", CastOrCrew.CREW, story);
        castAndCrewRepository.save(name);
    }
}
