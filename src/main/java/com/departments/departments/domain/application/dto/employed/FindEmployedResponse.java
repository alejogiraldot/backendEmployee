package com.departments.departments.domain.application.dto.employed;



import com.departments.departments.domain.core.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
public class FindEmployedResponse {

    private final String documentType;
    private final String documentNumber;
    private final String name;
    private final String city;
    private final String phoneNumber;
    private final Department departmentId;
    private final String hourCreation;
}
