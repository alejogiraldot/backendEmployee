package com.departments.departments.infrastructure.entity;

import com.departments.departments.domain.core.entity.Department;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Employed")
public class EmployedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String documentType;
    private  String documentNumber;
    private  String name;
    private  String lastName;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "department_id")
    private DepartmentEntity department;
    private  String city;
    private  String direction;
    private  String employedCity;
    private  String phoneNumber;
    private  LocalDate hourCreation;
}

