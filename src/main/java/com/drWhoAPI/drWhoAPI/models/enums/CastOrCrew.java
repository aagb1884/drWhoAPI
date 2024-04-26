package com.drWhoAPI.drWhoAPI.models.enums;

public enum CastOrCrew {

    CAST("Cast"),
    CREW("Crew");


    private final String value;

    CastOrCrew(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
