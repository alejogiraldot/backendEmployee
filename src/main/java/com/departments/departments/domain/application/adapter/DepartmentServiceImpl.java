package com.departments.departments.domain.application.adapter;

import com.departments.departments.domain.application.dto.department.CreateDepartmentRequest;
import com.departments.departments.domain.application.dto.department.CreateDepartmentResponse;
import com.departments.departments.domain.application.dto.department.FindDepartmentResponse;
import com.departments.departments.domain.application.mapper.DepartmentApplicationMapper;
import com.departments.departments.domain.application.ports.input.service.DepartmentService;
import com.departments.departments.domain.application.ports.output.repository.DepartmentRepository;
import com.departments.departments.domain.core.entity.Department;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final DepartmentApplicationMapper departmentApplicationMapper;

    public DepartmentServiceImpl(DepartmentRepository departmentRepository, DepartmentApplicationMapper departmentApplicationMapper) {
        this.departmentRepository = departmentRepository;
        this.departmentApplicationMapper = departmentApplicationMapper;
    }

    @Override
    public CreateDepartmentResponse createDepartment(CreateDepartmentRequest createDepartmentRequest) {
        Department department = departmentApplicationMapper.createDepartmentRequestToDepartment(createDepartmentRequest);
        department.setHourCreation(LocalDate.now());
        return departmentApplicationMapper.createDepartmentResponseToDepartment(departmentRepository.save(department));
    }

    @Override
    public FindDepartmentResponse findDepartment(Integer id) {
        return departmentApplicationMapper.employedToFindEmployedResponse(departmentRepository.findById(id).orElseThrow());
    }

    @Override
    public List<FindDepartmentResponse> findAllDepartment() {
        List<Department> departments = departmentRepository.findAll();
        return departmentApplicationMapper.departmentsToFindDepartmentResponses(departments);
    }



}
