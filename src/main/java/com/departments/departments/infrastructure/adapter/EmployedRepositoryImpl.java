package com.departments.departments.infrastructure.adapter;

import com.departments.departments.domain.application.ports.output.repository.DepartmentRepository;
import com.departments.departments.domain.application.ports.output.repository.EmployedRepository;
import com.departments.departments.domain.core.entity.Department;
import com.departments.departments.domain.core.entity.Employed;
import com.departments.departments.infrastructure.mapper.EmployedInfrastructureMapper;
import com.departments.departments.infrastructure.repository.EmployedJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EmployedRepositoryImpl implements EmployedRepository {
    private final EmployedJpaRepository employedJpaRepository;
    private final EmployedInfrastructureMapper employedInfrastructureMapper;

    public EmployedRepositoryImpl(EmployedJpaRepository employedJpaRepository, EmployedInfrastructureMapper employedInfrastructureMapper) {
        this.employedJpaRepository = employedJpaRepository;
        this.employedInfrastructureMapper = employedInfrastructureMapper;
    }
    @Override
    public Employed save(Employed employed) {
        return employedInfrastructureMapper.employedEntityToEmployed(
                employedJpaRepository.save(
                        employedInfrastructureMapper.employedToEmployedEntity(employed)
                )
        );
    }

    @Override
    public Optional<Employed> findById(Integer id) {
        return employedJpaRepository.findById(id).map(employedInfrastructureMapper::employedEntityToEmployed);
    }

    @Override
    public void deleteById(Integer id) {
        employedJpaRepository.deleteById(id);

    }
}
