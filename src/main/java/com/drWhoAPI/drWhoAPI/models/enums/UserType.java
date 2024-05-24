package com.drWhoAPI.drWhoAPI.models.enums;

public enum UserType {

    ADMIN("Website Admin"),
    REVIEWER("User/Reviewer");

    private final String value;

    UserType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
