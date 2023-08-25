    package com.departments.departments.domain.application.mapper;

    import com.departments.departments.domain.application.dto.department.FindDepartmentResponse;
    import com.departments.departments.domain.application.dto.employed.*;
    import com.departments.departments.domain.core.entity.Department;
    import com.departments.departments.domain.core.entity.Employed;
    import org.springframework.stereotype.Component;

    import java.time.format.DateTimeFormatter;
    import java.util.List;
    import java.util.stream.Collectors;

    @Component
    public class EmployedApplicationMapper {
        public Employed createEmployedRequestToEmployed(CreateEmployedRequest createEmployedRequest){
            return Employed.builder()
                    .documentType(createEmployedRequest.getDocumentType())
                    .documentNumber(createEmployedRequest.getDocumentNumber())
                    .name(createEmployedRequest.getName())
                    .lastName(createEmployedRequest.getLastName())
                    .departmentId(createEmployedRequest.getDepartmentId())
                    .city(createEmployedRequest.getCity())
                    .direction(createEmployedRequest.getDirection())
                    .employedCity(createEmployedRequest.getEmployedCity())
                    .phoneNumber(createEmployedRequest.getPhoneNumber())
                    .build();
        }

        public CreateEmployedResponse employedToCreateEmployedResponse(Employed employed){
            return CreateEmployedResponse.builder()
                    .documentNumber(employed.getDocumentNumber())
                    .documentType(employed.getDocumentType())
                    .name(employed.getName())
                    .lastName(employed.getLastName())
                    .departmentId(employed.getDepartmentId())
                    .employedCity(employed.getEmployedCity())
                    .city(employed.getCity())
                    .direction(employed.getDirection())
                    .phoneNumber(employed.getPhoneNumber())
                    .hourCreation(employed.getHourCreation().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                    .build();
        }


        public FindEmployedResponse employedToFindEmployedResponse(Employed employed){
            return FindEmployedResponse.builder()
                    .city(employed.getCity())
                    .departmentId(employed.getDepartmentId())
                    .documentNumber(employed.getDocumentNumber())
                    .documentType(employed.getDocumentType())
                    .name(employed.getName())
                    .phoneNumber(employed.getPhoneNumber())
                    .hourCreation(employed.getHourCreation().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                    .build();
        }



    }


