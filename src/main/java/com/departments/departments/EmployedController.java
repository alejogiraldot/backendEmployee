package com.departments.departments;

import com.departments.departments.domain.application.dto.employed.*;
import com.departments.departments.domain.application.ports.input.service.EmployedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("employee")
public class EmployedController {
    private final EmployedService employedService;

    public EmployedController(EmployedService employedService) {
        this.employedService = employedService;
    }

    @PostMapping
    public ResponseEntity<CreateEmployedResponse> createBorrow(@RequestBody CreateEmployedRequest createEmployedRequest) {
        CreateEmployedResponse createEmployedResponse = employedService.createEmployed(createEmployedRequest);
        return ResponseEntity.ok(createEmployedResponse);
    }

    @GetMapping(value = "/{id-employed}")
    public ResponseEntity<FindEmployedResponse> findEmployed(@PathVariable("id-employed") Integer idEmployed) {
        return ResponseEntity.ok(employedService.findEmployed(idEmployed));
    }
    @DeleteMapping(value = "/{id-department}")
    public void deleteById(@PathVariable("id-department") Integer idEmployed){
        employedService.deleteById(idEmployed);
    }

}
