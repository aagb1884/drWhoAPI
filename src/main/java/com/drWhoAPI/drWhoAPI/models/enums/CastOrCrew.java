package com.drWhoAPI.drWhoAPI.models.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CastOrCrew {

    CAST("Cast"),
    CREW("Crew");


    private final String value;

    CastOrCrew(String value) {
        this.value = value;
    }

    @JsonValue
    String getValue() {
        return this.value;
    }
}
