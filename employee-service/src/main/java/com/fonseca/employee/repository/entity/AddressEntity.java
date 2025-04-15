package com.fonseca.employee.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "addresses")
public class AddressEntity {
    @MongoId
    private String id;
    private String type;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
