package com.poc.petshop.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="vetenarians")
public class VeterinaryDoctor extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long veterinaryRegistryId;
    @Temporal(TemporalType.DATE)
    private LocalDate qualificationDate;
}
