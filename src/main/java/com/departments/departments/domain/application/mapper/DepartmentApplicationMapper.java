package com.departments.departments.domain.application.mapper;

import com.departments.departments.domain.application.dto.department.CreateDepartmentRequest;
import com.departments.departments.domain.application.dto.department.CreateDepartmentResponse;
import com.departments.departments.domain.application.dto.department.FindDepartmentResponse;
import com.departments.departments.domain.application.dto.employed.FindEmployedResponse;
import com.departments.departments.domain.core.entity.Department;
import com.departments.departments.domain.core.entity.Employed;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DepartmentApplicationMapper {

    public Department createDepartmentRequestToDepartment(CreateDepartmentRequest createDepartmentRequest){
        return Department.builder()
                .departmentName(createDepartmentRequest.getDepartmentName())
                .departmentCode(createDepartmentRequest.getDepartmentCode())
                .build();
    }

    public CreateDepartmentResponse createDepartmentResponseToDepartment(Department department){
        return CreateDepartmentResponse.builder()
                .departmentName(department.getDepartmentName())
                .departmentCode(department.getDepartmentCode())
                .hourCreation(department.getHourCreation().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .build();
    }

    public FindDepartmentResponse employedToFindEmployedResponse(Department department){
        return FindDepartmentResponse.builder()
                .hourCreation(department.getHourCreation().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .departmentCode(department.getDepartmentCode())
                .departmentName(department.getDepartmentName())
                .build();
    }

    public FindDepartmentResponse departmentsToFindDepartmentResponses(Department department) {
        return new FindDepartmentResponse(
                department.getDepartmentCode(),
                department.getDepartmentName(),
                department.getHourCreation().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );
    }

    public List<FindDepartmentResponse> departmentsToFindDepartmentResponses(List<Department> departments) {
        return departments.stream()
                .map(this::departmentsToFindDepartmentResponses)
                .collect(Collectors.toList());
    }

}
