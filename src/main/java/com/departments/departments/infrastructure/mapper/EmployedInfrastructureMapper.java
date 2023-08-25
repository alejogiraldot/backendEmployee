package com.departments.departments.infrastructure.mapper;

import com.departments.departments.domain.core.entity.Department;
import com.departments.departments.domain.core.entity.Employed;
import com.departments.departments.infrastructure.entity.DepartmentEntity;
import com.departments.departments.infrastructure.entity.EmployedEntity;
import org.springframework.stereotype.Component;



@Component
public class EmployedInfrastructureMapper {
    public EmployedEntity employedToEmployedEntity(Employed employed){

        return EmployedEntity.builder()
                .documentType(employed.getDocumentType())
                .documentNumber(employed.getDocumentNumber())
                .name(employed.getName())
                .lastName(employed.getLastName())
                .department(DepartmentEntity.builder()
                        .id(employed.getDepartmentId().getId())
                        .build())
                .city(employed.getCity())
                .direction(employed.getDirection())
                .employedCity(employed.getEmployedCity())
                .phoneNumber(employed.getPhoneNumber())
                .hourCreation(employed.getHourCreation())
                .build();
    }

    public Employed employedEntityToEmployed(EmployedEntity employedEntity){
        return Employed.builder()
                .id(employedEntity.getId())
                .documentType(employedEntity.getDocumentType())
                .documentNumber(employedEntity.getDocumentNumber())
                .name(employedEntity.getName())
                .lastName(employedEntity.getLastName())
                .city(employedEntity.getCity())
                .departmentId(departmentEntityToDepartment(employedEntity.getDepartment()))
                .direction(employedEntity.getDirection())
                .employedCity(employedEntity.getEmployedCity())
                .phoneNumber(employedEntity.getPhoneNumber())
                .hourCreation(employedEntity.getHourCreation())
                .build();
    }


    public Department departmentEntityToDepartment(DepartmentEntity departmentEntity){
        return Department.builder()
                .id(departmentEntity.getId())
                .departmentName(departmentEntity.getDepartmentName())
                .departmentCode(departmentEntity.getDepartmentCode())
                .hourCreation(departmentEntity.getHourCreation())
                .build();
    }
}
