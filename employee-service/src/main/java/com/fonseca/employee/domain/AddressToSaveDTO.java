package com.fonseca.employee.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressToSaveDTO {
    private String uuid;
    @NotBlank
    private String type;
    private String street;
    private String city;
    private String state;
    private String country;
    @NotBlank
    private String zipCode;
}
