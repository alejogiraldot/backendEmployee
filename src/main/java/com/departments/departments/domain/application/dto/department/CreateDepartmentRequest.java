package com.departments.departments.domain.application.dto.department;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
public class CreateDepartmentRequest {
    @NotNull
    private final String departmentCode;
    @NotNull
    private final String departmentName;

}
