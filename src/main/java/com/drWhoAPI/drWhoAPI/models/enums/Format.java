package com.drWhoAPI.drWhoAPI.models.enums;

public enum Format {

    AUDIO("Audio"),
    TV("TV"),
    FILM("Film"),
    PROSE("Prose"),
    COMIC("Comic"),
    OTHER("Other");


    private final String value;

    Format(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
