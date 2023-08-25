package com.departments.departments.domain.application.ports.input.service;

import com.departments.departments.domain.application.dto.department.CreateDepartmentRequest;
import com.departments.departments.domain.application.dto.department.CreateDepartmentResponse;
import com.departments.departments.domain.application.dto.department.FindDepartmentResponse;

import java.util.List;

public interface DepartmentService {

    CreateDepartmentResponse createDepartment(CreateDepartmentRequest createDepartmentRequest);
    FindDepartmentResponse findDepartment(Integer id);
    List<FindDepartmentResponse> findAllDepartment();
}
