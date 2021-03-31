package com.poc.petshop.model;

import java.util.Set;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Builder
public class Employee extends Person implements Serializable {

    @Temporal(TemporalType.DATE)
    private LocalDate employmentDate;
    private Double salary;
    @OneToMany(targetEntity=VeterinaryDoctor.class,cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, orphanRemoval = true, mappedBy="id")
    private Set<VeterinaryDoctor> veterinaryDoctors;
}