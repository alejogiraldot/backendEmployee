package com.departments.departments.domain.application.adapter;

import com.departments.departments.domain.application.dto.employed.*;
import com.departments.departments.domain.application.mapper.EmployedApplicationMapper;
import com.departments.departments.domain.application.ports.input.service.EmployedService;
import com.departments.departments.domain.application.ports.output.repository.DepartmentRepository;
import com.departments.departments.domain.application.ports.output.repository.EmployedRepository;
import com.departments.departments.domain.core.entity.Employed;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EmployedServiceImpl implements EmployedService {
    private final EmployedRepository employedRepository;
    private final EmployedApplicationMapper employedApplicationMapper;
    private final DepartmentRepository departmentRepository;


    public EmployedServiceImpl(EmployedRepository employedRepository, EmployedApplicationMapper employedApplicationMapper, DepartmentRepository departmentRepository) {
        this.employedRepository = employedRepository;
        this.employedApplicationMapper = employedApplicationMapper;
        this.departmentRepository = departmentRepository;
    }


    @Override
    public CreateEmployedResponse createEmployed(CreateEmployedRequest createEmployedRequest) {
        Employed employed = employedApplicationMapper.createEmployedRequestToEmployed(createEmployedRequest);
        employed.setHourCreation(LocalDate.now());
        employed = employedRepository.save(employed);
        return employedApplicationMapper.employedToCreateEmployedResponse(Employed.builder()
                        .employedCity(employed.getEmployedCity())
                        .city(employed.getCity())
                        .departmentId(departmentRepository.findById(employed.getDepartmentId().getId()).orElseThrow())
                        .hourCreation(employed.getHourCreation())
                        .direction(employed.getDirection())
                        .phoneNumber(employed.getPhoneNumber())
                        .lastName(employed.getLastName())
                        .documentNumber(employed.getDocumentNumber())
                        .name(employed.getName())
                        .documentType(employed.getDocumentType())
                .build());
    }

    @Override
    public FindEmployedResponse findEmployed(Integer id) {
        return employedApplicationMapper.employedToFindEmployedResponse(employedRepository.findById(id).orElseThrow());
    }

    @Override
    public void deleteById(Integer id) {
        employedRepository.deleteById(id);
    }


}
