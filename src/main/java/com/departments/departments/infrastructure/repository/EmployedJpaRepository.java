package com.departments.departments.infrastructure.repository;

import com.departments.departments.domain.core.entity.Department;
import com.departments.departments.infrastructure.entity.DepartmentEntity;
import com.departments.departments.infrastructure.entity.EmployedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployedJpaRepository extends JpaRepository<EmployedEntity, Integer> {
}
