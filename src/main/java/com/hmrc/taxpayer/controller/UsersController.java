package com.hmrc.taxpayer.controller;

import com.hmrc.taxpayer.model.Employee;
import com.hmrc.taxpayer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    public List<Employee> getAll() {
        return userService.returnAll();
    }

    @PostMapping(value = "/load")
    public Employee persist(@RequestBody final Employee employee) {
        return userService.saveEmployee(employee);
    }

    @GetMapping(value = "/getById")
    public ResponseEntity<Employee> findById(Long id) {
        return userService.getById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
