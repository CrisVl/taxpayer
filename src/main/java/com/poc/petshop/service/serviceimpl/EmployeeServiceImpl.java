package com.poc.petshop.service.serviceimpl;

import com.poc.petshop.model.Employee;
import com.poc.petshop.repository.EmployeeRepository;
import com.poc.petshop.service.EmployeeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Set<Employee> findAll() {
        Set<Employee> employees = new HashSet<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }


    @Override
    public Employee findById(Long Long) {
        return employeeRepository.findById(Long).orElse(null);
    }

    @Override
    public Employee save(Employee object) {
        return employeeRepository.save(object);
    }

    @Override
    public void delete(Employee object) {
        employeeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        employeeRepository.deleteById(aLong);
    }
}
