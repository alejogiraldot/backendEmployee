package com.departments.departments.domain.application.ports.output.repository;

import com.departments.departments.domain.core.entity.Department;
import com.departments.departments.domain.core.entity.Employed;

import java.util.Optional;

public interface EmployedRepository {
    Employed save(Employed employed);

    Optional<Employed> findById(Integer id);
    void deleteById(Integer id);

}
