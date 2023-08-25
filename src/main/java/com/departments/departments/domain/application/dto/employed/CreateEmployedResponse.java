package com.departments.departments.domain.application.dto.employed;

import com.departments.departments.domain.core.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CreateEmployedResponse {
    private final String documentType;
    private final String documentNumber;
    private final String name;
    private final String lastName;
    private final Department departmentId;
    private final String city;
    private final String direction;
    private final String employedCity;
    private final String phoneNumber;
    private final String hourCreation;
}
