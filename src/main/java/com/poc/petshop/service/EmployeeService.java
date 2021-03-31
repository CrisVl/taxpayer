package com.poc.petshop.service;

import com.poc.petshop.model.Employee;

import java.util.UUID;

public interface EmployeeService {
    Employee getEmployeeById(UUID employeeId);
}
