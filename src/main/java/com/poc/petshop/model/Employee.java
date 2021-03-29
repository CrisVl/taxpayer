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
@Table(name = "employees", catalog = "test") // to get rig of catalog
public class Employee extends Person{
    @Temporal(TemporalType.DATE)
    private LocalDate employmentDate;
    private Double salary;
}
