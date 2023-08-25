package com.departments.departments.domain.application.ports.input.service;

import com.departments.departments.domain.application.dto.department.FindDepartmentResponse;
import com.departments.departments.domain.application.dto.employed.*;
import com.departments.departments.domain.application.dto.department.CreateDepartmentRequest;

public interface EmployedService {
    CreateEmployedResponse createEmployed(CreateEmployedRequest createEmployedRequest);

    FindEmployedResponse findEmployed(Integer id);
    void deleteById(Integer id);



}
