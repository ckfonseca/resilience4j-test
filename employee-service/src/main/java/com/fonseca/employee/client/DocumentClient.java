package com.fonseca.employee.client;

import com.fonseca.employee.domain.DocumentToListDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "document-service", url = "${client.documents.url}")
public interface DocumentClient {

    @GetMapping("/documents/{employeeId}")
    List<DocumentToListDTO> findByEmployeeId(@PathVariable String employeeId);
}
