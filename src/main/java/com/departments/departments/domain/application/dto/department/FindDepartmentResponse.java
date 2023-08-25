package com.departments.departments.domain.application.dto.department;

import com.departments.departments.domain.core.entity.Employed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class FindDepartmentResponse {
    private final String hourCreation;
    private final String departmentCode;
    private final String departmentName;
}
