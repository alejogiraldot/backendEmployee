package com.departments.departments;

import com.departments.departments.domain.application.dto.department.CreateDepartmentRequest;
import com.departments.departments.domain.application.dto.department.CreateDepartmentResponse;
import com.departments.departments.domain.application.dto.department.FindDepartmentResponse;
import com.departments.departments.domain.application.dto.employed.FindEmployedResponse;
import com.departments.departments.domain.application.ports.input.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
@CrossOrigin("*")
public class DepartmentController {
    private final DepartmentService departmentService;


    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping
    public ResponseEntity<CreateDepartmentResponse> createBorrow(@RequestBody CreateDepartmentRequest createDepartmentRequest) {
        CreateDepartmentResponse departmentResponse = departmentService.createDepartment(createDepartmentRequest);
        return ResponseEntity.ok(departmentResponse);
    }

    @GetMapping(value = "/{id-department}")
    public ResponseEntity<FindDepartmentResponse> findEmployed(@PathVariable("id-department") Integer idDepartment) {
        return ResponseEntity.ok(departmentService.findDepartment(idDepartment));
    }
    @GetMapping(value = "/findAll")
    public ResponseEntity<List<FindDepartmentResponse>> getAllDepartments() {
        List<FindDepartmentResponse> departments = departmentService.findAllDepartment();
        return ResponseEntity.ok(departments);
    }

}
