package com.departments.departments.infrastructure.mapper;

import com.departments.departments.domain.application.dto.department.FindDepartmentResponse;
import com.departments.departments.domain.core.entity.Department;
import com.departments.departments.domain.core.entity.Employed;
import com.departments.departments.infrastructure.entity.DepartmentEntity;
import com.departments.departments.infrastructure.entity.EmployedEntity;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DepartmentInfrastructureMapper {
    public DepartmentEntity departmentToDepartmentEntity(Department department){

        return DepartmentEntity.builder()
                .departmentCode(department.getDepartmentCode())
                .departmentName(department.getDepartmentName())
                .hourCreation(department.getHourCreation())
                .build();
    }

    public Department departmentEntityToDepartment(DepartmentEntity departmentEntity){

        return  Department.builder()
                .id(departmentEntity.getId())
                .departmentCode(departmentEntity.getDepartmentCode())
                .departmentName(departmentEntity.getDepartmentName())
                .hourCreation(departmentEntity.getHourCreation())
                .build();
    }

    public List<DepartmentEntity> departmentsToDepartmentEntities(List<Department> departments) {
        return departments.stream()
                .map(this::departmentToDepartmentEntity)
                .collect(Collectors.toList());
    }

    public List<Department> departmentEntitiesToDepartments(List<DepartmentEntity> departmentEntities) {
        return departmentEntities.stream()
                .map(this::departmentEntityToDepartment)
                .collect(Collectors.toList());
    }

    public List<FindDepartmentResponse> departmentsToFindDepartmentResponses(List<Department> departments) {
        return departments.stream()
                .map(this::departmentToFindDepartmentResponse)
                .collect(Collectors.toList());
    }

    public FindDepartmentResponse departmentToFindDepartmentResponse(Department department) {
        return new FindDepartmentResponse(
                department.getDepartmentCode(),
                department.getDepartmentName(),
                department.getHourCreation().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );
    }
}
