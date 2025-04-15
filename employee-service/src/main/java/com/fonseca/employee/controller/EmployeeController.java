package com.fonseca.employee.controller;

import com.fonseca.employee.domain.EmployeeToListDTO;
import com.fonseca.employee.domain.EmployeeToSaveDTO;
import com.fonseca.employee.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody @Valid EmployeeToSaveDTO employeeDTO) {
        this.employeeService.insert(employeeDTO);
    }

    @GetMapping
    public ResponseEntity<List<EmployeeToListDTO>> findAll() {
        var employeeList = this.employeeService.findAll();

        if(employeeList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(employeeList);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeToListDTO findById(@PathVariable String id) {

        return this.employeeService.findById(id);
    }
}
