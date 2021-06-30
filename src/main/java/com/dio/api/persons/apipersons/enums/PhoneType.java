package com.dio.api.persons.apipersons.enums;

import lombok.Getter;

@Getter
public enum PhoneType {
    RESIDENTIAL("RESIDENTIAL"),
    MOBILE("MOBILE"),
    COMMERCIAL("COMMERCIAL");

    private final String description;

    private PhoneType(String description) {
        this.description = description;
    }
}
