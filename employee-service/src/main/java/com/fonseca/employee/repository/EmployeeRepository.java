package com.fonseca.employee.repository;

import com.fonseca.employee.repository.entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity, String> {
}
