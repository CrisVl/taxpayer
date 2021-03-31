package com.poc.petshop.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Entity
public abstract class Person extends BaseEntity implements Serializable {
    private String firstName;
    private String lastName;
    private String middleName;
    private String alias;
    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;
    private String gender; //should be refactored to point to an Enum

}
