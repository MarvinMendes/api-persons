package com.dio.api.persons.apipersons.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {
    RESIDENCIAL("RESIDENCIAL"),
    MOBILE("MOBILE"),
    COMMERCIAL("COMMERCIAL");

    private final String description;
}
