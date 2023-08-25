package com.departments.departments.domain.core.entity;

import java.time.LocalDate;
import java.util.List;

public class Department extends BaseEntity<Integer>{
    private final String departmentCode;
    private final String departmentName;
    private LocalDate hourCreation;


    private Department(Builder builder) {
        super.setId(builder.id);
        departmentCode = builder.departmentCode;
        departmentName = builder.departmentName;
        hourCreation = builder.hourCreation;

    }

    public Department(String departmentCode, String departmentName, LocalDate hourCreation) {
        this.departmentCode = departmentCode;
        this.departmentName = departmentName;
        this.hourCreation = hourCreation;

    }

    public static Builder builder() {
        return new Builder();
    }
    public static final class Builder {
        private Integer id;
        private String departmentCode;
        private String departmentName;
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

        public Builder departmentCode(String val) {
            departmentCode = val;
            return this;
        }

        public Builder departmentName(String val) {
            departmentName = val;
            return this;
        }

        public Builder hourCreation(LocalDate val) {
            hourCreation = val;
            return this;
        }


        public Department build() {
            return new Department(this);
        }
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public LocalDate getHourCreation() {
        return hourCreation;
    }

    public void setHourCreation(LocalDate hourCreation) {
        this.hourCreation = hourCreation;
    }

}
