package com.drWhoAPI.drWhoAPI.models.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserType {

    ADMIN("Website Admin"),
    REVIEWER("User/Reviewer");

    private final String value;

    UserType(String value) {
        this.value = value;
    }

    @JsonValue
    String getValue() {
        return this.value;
    }

}
