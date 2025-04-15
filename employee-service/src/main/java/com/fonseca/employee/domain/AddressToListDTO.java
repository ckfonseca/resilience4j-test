package com.fonseca.employee.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressToListDTO {
    private String id;
    @NotBlank
    private String type;
    private String street;
    private String city;
    private String state;
    private String country;
    @NotBlank
    private String zipCode;
}
