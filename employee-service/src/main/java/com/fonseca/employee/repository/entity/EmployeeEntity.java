package com.fonseca.employee.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "employees")
public class EmployeeEntity {
    @MongoId
    private String id;
    private String name;
    private Integer age;
    private String position;
    private AddressEntity addressEntity;
}
