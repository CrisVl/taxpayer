package com.hmrc.taxpayer.controller;

import com.hmrc.taxpayer.model.Employee;
import com.hmrc.taxpayer.model.VeterinaryDoctor;
import com.hmrc.taxpayer.services.VeterinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {

    private final VeterinaryService userService;

    @Autowired
    public UsersController(VeterinaryService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    public Set<VeterinaryDoctor> getAll() {
        return userService.findAll();
    }

    @PostMapping(value = "/load")
    public VeterinaryDoctor persist(@RequestBody final VeterinaryDoctor veterinaryDoctor) {
        return userService.save(veterinaryDoctor);
    }

    @GetMapping(value = "/getById")
    public ResponseEntity<Employee> findById(Long id) {
        return userService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

}
