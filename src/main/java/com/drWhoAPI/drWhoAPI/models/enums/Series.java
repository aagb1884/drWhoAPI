package com.drWhoAPI.drWhoAPI.models.enums;

public enum Series {
    SEASON1("Season 1"),
    SEASON2("Season 2"),
    SEASON3("Season 3"),
    SEASON4("Season 4"),
    SEASON5("Season 5"),
    SEASON6("Season 6"),
    SEASON7("Season 7"),
    SEASON8("Season 8"),
    SEASON9("Season 9"),
    SEASON10("Season 10"),
    SEASON11("Season 11"),
    SEASON12("Season 12"),
    SEASON13("Season 13"),
    SEASON14("Season 14"),
    SEASON15("Season 15"),
    SEASON16("Season 16"),
    SEASON17("Season 17"),
    SEASON18("Season 18"),
    SEASON19("Season 19"),
    SEASON20("Season 20"),
    SEASON21("Season 21"),
    SEASON22("Season 22"),
    SEASON23("Season 23"),
    SEASON24("Season 24"),
    SEASON25("Season 25"),
    SEASON26("Season 26"),
    TVM("The TV Movie"),
    SERIES1("Series 1"),
    SERIES2("Series 2"),
    SERIES3("Series 3"),
    SERIES4("Series 4"),
    TENNANTSPECIALS("2008 - 2010 Specials"),
    SERIES5("Series 5"),
    SERIES6A("Series 6A"),
    SERIES6B("Series 6B"),
    SERIES7A("Series 7A"),
    SERIES7B("Series 7B"),
    FIFTYSPECIALS("Fiftieth Anniversary Specials"),
    SERIES8("Series 8"),
    SERIES9("Series 9"),
    SERIES10("Series 10"),
    SERIES11("Series 11"),
    SERIES12("Series 12"),
    SERIES13("Flux/Series 13"),
    WHITTAKERSPECIALS("2022 Specials"),
    SIXTYSPECIALS("Sixtieth Anniversary Specials"),
    SEASON12024("Series 1 (2024)"),
    BBCRADIO("BBC Radio"),
    TARGET("Target Books"),
    NEWADVENTURES("The New Adventures"),
    MISSINGADVENTURES("The Missing Adventures"),
    EDA("Eighth Doctor Adventures"),
    PDA("Past Doctor Adventures"),
    NSA("New Series Adventures"),
    TELOS("Telos Novella"),
    BIGFINISH("Big Finish"),
    BBV("BBV Productions"),
    IDW("IDW Comic"),
    TITAN("Titan Comic"),
    DWM("Doctor Who Magazine Comic"),
    BBCCOMIC("BBC Comic Book"),
    OTHER("Other");


    private final String value;

    Series(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
