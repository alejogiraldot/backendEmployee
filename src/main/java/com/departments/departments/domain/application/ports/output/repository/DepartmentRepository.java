package com.departments.departments.domain.application.ports.output.repository;

import com.departments.departments.domain.core.entity.Department;
import com.departments.departments.domain.core.entity.Employed;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository {

    Department save(Department department);
    Optional<Department> findById(Integer id);
    List<Department> findAll();

}
