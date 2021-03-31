package com.poc.petshop.controller;

import com.poc.petshop.model.Employee;
import com.poc.petshop.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/employee")
@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") UUID veterinaryRegistryId) {
        return new ResponseEntity<>(vetenaryDoctorService.getEmployeeById(veterinaryRegistryId), HttpStatus.OK);
    }
}
