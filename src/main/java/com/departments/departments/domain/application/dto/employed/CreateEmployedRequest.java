package com.departments.departments.domain.application.dto.employed;
import com.departments.departments.domain.core.entity.Department;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CreateEmployedRequest {
    @NotNull
    private final String documentType;
    @NotNull
    private final String documentNumber;
    @NotNull
    private final String name;
    @NotNull
    private final String lastName;
    @NotNull
    private final Department departmentId;
    @NotNull
    private final String city;
    @NotNull
    private final String direction;
    @NotNull
    private final String employedCity;
    @NotNull
    private final String phoneNumber;
}
