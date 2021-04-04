package com.hmrc.taxpayer.repository;

import com.hmrc.taxpayer.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Employee, Integer> {

    Employee findById(Long id);
}
