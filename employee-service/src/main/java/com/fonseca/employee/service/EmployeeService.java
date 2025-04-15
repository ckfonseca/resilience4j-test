package com.fonseca.employee.service;

import com.fonseca.employee.client.DocumentClient;
import com.fonseca.employee.domain.DocumentToListDTO;
import com.fonseca.employee.domain.EmployeeToListDTO;
import com.fonseca.employee.domain.EmployeeToSaveDTO;
import com.fonseca.employee.mapper.EmployeeMapper;
import com.fonseca.employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    private final DocumentClient documentClient;

    public void insert(EmployeeToSaveDTO employeeDTO) {

        Optional.of(employeeDTO)
                .map(this.employeeMapper::employeeToSaveDTOToEmployeeEntity)
                .ifPresent(this.employeeRepository::save);
    }

    public List<EmployeeToListDTO> findAll() {

        return this.employeeRepository.findAll()
                .stream()
                .map(this.employeeMapper::employeeEntityToEmployeeToListDTO)
                .toList();
    }

    public EmployeeToListDTO findById(String id) {
        var employee = this.employeeRepository.findById(id)
                .map(this.employeeMapper::employeeEntityToEmployeeToListDTO)
                .orElseThrow(RuntimeException::new);
        var documentList = documentClient.findByEmployeeId(id);
        log.info("Documents -> {}", documentList);
        employee.setDocumentList(documentList);

        return employee;
    }
}
