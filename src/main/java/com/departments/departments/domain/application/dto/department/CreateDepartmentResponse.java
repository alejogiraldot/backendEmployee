package com.departments.departments.domain.application.dto.department;

import java.time.LocalDate;
import java.util.List;

import com.departments.departments.domain.core.entity.Employed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
@Getter
@Builder
@AllArgsConstructor

public class CreateDepartmentResponse {

    private final String departmentCode;
    private final String departmentName;
    private final String hourCreation;
}
