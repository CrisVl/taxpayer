package com.poc.petshop.controller;

import com.poc.petshop.model.VeterinaryDoctor;
import com.poc.petshop.repository.VeterinaryDoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/veterinarians")
public class VeterinaryDoctorController {
    VeterinaryDoctorRepository veterinaryDoctorRepository;

    @Autowired
    @GetMapping("/all")
    public List<VeterinaryDoctor> getAll() {
        return veterinaryDoctorRepository.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<VeterinaryDoctor> getId(@PathVariable("veterinaryRegistryId") final Long id) {
        return veterinaryDoctorRepository.findById(id);
    }
}
