package com.departments.departments.domain.core.entity;

import java.time.LocalDate;

public class Employed extends BaseEntity<Integer>{

    private final String documentType;
    private final String documentNumber;
    private final String name;
    private final String lastName;
    private final Department departmentId;
    private final String city;
    private final String direction;
    private final String employedCity;
    private final String phoneNumber;
    private LocalDate hourCreation;

    public Employed(String documentType, String documentNumber, String name, String lastName, Department departmentId, String city, String direction, String employedCity, String phoneNumber, LocalDate hourCreation) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.lastName = lastName;
        this.departmentId = departmentId;
        this.city = city;
        this.direction = direction;
        this.employedCity = employedCity;
        this.phoneNumber = phoneNumber;
        this.hourCreation = hourCreation;
    }

    private Employed(Builder builder) {
        super.setId(builder.id);
        documentType = builder.documentType;
        documentNumber = builder.documentNumber;
        name = builder.name;
        lastName = builder.lastName;
        departmentId = builder.departmentId;
        city = builder.city;
        direction = builder.direction;
        employedCity = builder.employedCity;
        phoneNumber = builder.phoneNumber;
        setHourCreation(builder.hourCreation);
    }


    public static Builder builder() {
        return new Builder();
    }
    public String getDocumentType() {
        return documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public String getCity() {
        return city;
    }

    public String getDirection() {
        return direction;
    }

    public String getEmployedCity() {
        return employedCity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getHourCreation() {
        return hourCreation;
    }

    public void setHourCreation(LocalDate hourCreation) {
        this.hourCreation = hourCreation;
    }


    public static final class Builder {
        private Integer id;
        private String documentType;
        private String documentNumber;
        private String name;
        private String lastName;
        private Department departmentId;
        private String city;
        private String direction;
        private String employedCity;
        private String phoneNumber;
        private LocalDate hourCreation;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder id(Integer val) {
            id = val;
            return this;
        }

        public Builder documentType(String val) {
            documentType = val;
            return this;
        }

        public Builder documentNumber(String val) {
            documentNumber = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder lastName(String val) {
            lastName = val;
            return this;
        }

        public Builder departmentId(Department val) {
            departmentId = val;
            return this;
        }

        public Builder city(String val) {
            city = val;
            return this;
        }

        public Builder direction(String val) {
            direction = val;
            return this;
        }

        public Builder employedCity(String val) {
            employedCity = val;
            return this;
        }

        public Builder phoneNumber(String val) {
            phoneNumber = val;
            return this;
        }

        public Builder hourCreation(LocalDate val) {
            hourCreation = val;
            return this;
        }

        public Employed build() {
            return new Employed(this);
        }
    }

}
