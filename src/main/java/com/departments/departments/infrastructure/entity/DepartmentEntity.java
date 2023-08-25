package com.departments.departments.infrastructure.entity;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "department")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String departmentCode;
    private  String departmentName;
    private LocalDate hourCreation;

}
