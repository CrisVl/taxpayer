package com.poc.petshop.controller;

import com.poc.petshop.model.Employee;
import com.poc.petshop.repository.EmployeeRepository;
import com.poc.petshop.service.EmployeeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("{id}")
    public String findOwners(Model model){
        return
    }
}
