package com.fonseca.employee.mapper;

import com.fonseca.employee.domain.EmployeeToListDTO;
import com.fonseca.employee.domain.EmployeeToSaveDTO;
import com.fonseca.employee.repository.entity.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeEntity employeeToSaveDTOToEmployeeEntity(EmployeeToSaveDTO employeeDTO);
    EmployeeToSaveDTO employeeEntityToEmployeeToSaveDTO(EmployeeEntity employeeEntity);
    EmployeeEntity employeeToListDTOToEmployeeEntity(EmployeeToListDTO employeeDTO);
    EmployeeToListDTO employeeEntityToEmployeeToListDTO(EmployeeEntity employeeEntity);
}
