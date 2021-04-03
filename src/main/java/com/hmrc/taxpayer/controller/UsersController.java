package com.hmrc.taxpayer.controller;

import com.hmrc.taxpayer.model.Employee;
import com.hmrc.taxpayer.model.Person;
import com.hmrc.taxpayer.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Period;
import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<Employee> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Employee> persist(@RequestBody final Employee employee) {
        usersRepository.save(employee);
        return usersRepository.findAll();
    }

}
