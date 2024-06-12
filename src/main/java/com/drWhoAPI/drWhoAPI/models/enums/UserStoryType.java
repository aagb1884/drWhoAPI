package com.drWhoAPI.drWhoAPI.models.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserStoryType {
    REVIEW("Review"),
    WATCHLIST("Want to Watch/Listen/Read");

    private final String value;

    UserStoryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
