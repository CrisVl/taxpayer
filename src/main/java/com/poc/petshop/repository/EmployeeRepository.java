package com.poc.petshop.repository;

import com.poc.petshop.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
