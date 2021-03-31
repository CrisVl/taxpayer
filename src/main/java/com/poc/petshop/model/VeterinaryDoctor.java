package com.poc.petshop.model;


import com.poc.petshop.model.enums.Speciality;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class VeterinaryDoctor extends Employee implements Serializable {

    @Column(unique=true)
    private UUID veterinaryRegistryId;
    @Temporal(TemporalType.DATE)
    private LocalDate qualificationDate;

    @Column(columnDefinition = "ENUM('CARDIOLOGY', 'DENTISTRY', 'NUTRITIONIST')")
    @Enumerated(EnumType.STRING)
    private Speciality speciality;
}
