package com.poc.petshop.repository;

import com.poc.petshop.model.VeterinaryDoctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinaryDoctorRepository extends JpaRepository<VeterinaryDoctor, Long> {
}
