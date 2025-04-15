package com.fonseca.employee.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeToSaveDTO {
    @NotBlank
    private String name;
    private Integer age;
    @NotBlank
    private String position;
    private AddressToSaveDTO addressEntity;
}
