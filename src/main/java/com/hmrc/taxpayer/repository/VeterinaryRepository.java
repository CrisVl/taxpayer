package com.hmrc.taxpayer.repository;


import com.hmrc.taxpayer.model.VeterinaryDoctor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VeterinaryRepository extends JpaRepository<VeterinaryDoctor, Integer> {
}
