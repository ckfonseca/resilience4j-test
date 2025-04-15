package com.fonseca.employee.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeToListDTO {
    private String id;
    @NotBlank
    private String name;
    private Integer age;
    @NotBlank
    private String position;
    private AddressToListDTO addressEntity;
    private List<DocumentToListDTO> documentList;
}
