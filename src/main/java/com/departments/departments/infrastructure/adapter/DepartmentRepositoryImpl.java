package com.departments.departments.infrastructure.adapter;

import com.departments.departments.domain.application.ports.output.repository.DepartmentRepository;
import com.departments.departments.domain.core.entity.Department;
import com.departments.departments.infrastructure.entity.DepartmentEntity;
import com.departments.departments.infrastructure.mapper.DepartmentInfrastructureMapper;

import com.departments.departments.infrastructure.repository.DepartmentJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

    private final DepartmentJpaRepository departmentJpaRepository;
    private final DepartmentInfrastructureMapper departmentInfrastructureMapper;

    public DepartmentRepositoryImpl(DepartmentJpaRepository departmentJpaRepository, DepartmentInfrastructureMapper departmentInfrastructureMapper) {
        this.departmentJpaRepository = departmentJpaRepository;
        this.departmentInfrastructureMapper = departmentInfrastructureMapper;
    }

    @Override
    public Department save(Department department) {
        return departmentInfrastructureMapper.departmentEntityToDepartment(
                departmentJpaRepository.save(
                        departmentInfrastructureMapper.departmentToDepartmentEntity(department)
                )
        );
    }

    @Override
    public Optional<Department> findById(Integer id) {
        return departmentJpaRepository.findById(id).map(departmentInfrastructureMapper::departmentEntityToDepartment);
    }

    @Override
    public List<Department> findAll() {
        List<DepartmentEntity> departmentEntities = departmentJpaRepository.findAll();
        return departmentInfrastructureMapper.departmentEntitiesToDepartments(departmentEntities);
    }


}
