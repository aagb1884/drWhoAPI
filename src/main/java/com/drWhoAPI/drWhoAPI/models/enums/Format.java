package com.drWhoAPI.drWhoAPI.models.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Format {

    AUDIO("Audio"),
    TV("TV"),
    FILM("Film"),
    PROSE("Prose"),
    COMIC("Comic"),
    WEBCAST("Webcast"),
    OTHER("Other");


    private final String value;

    Format(String value) {
        this.value = value;
    }

    @JsonValue
    String getValue() {
        return this.value;
    }

}
