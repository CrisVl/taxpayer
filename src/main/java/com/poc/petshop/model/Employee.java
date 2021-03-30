package com.poc.petshop.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Employee extends Person{
    @Temporal(TemporalType.DATE)
    private LocalDate employmentDate;
    private Double salary;
}