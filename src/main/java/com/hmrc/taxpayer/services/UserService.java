package com.hmrc.taxpayer.services;

import com.hmrc.taxpayer.model.Employee;
import com.hmrc.taxpayer.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Employee> returnAll() {
        return usersRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return usersRepository.save(employee);
    }

    public Optional<Employee> getById(Long id) {
        return Optional.ofNullable(usersRepository.findById(id));
    }

}
