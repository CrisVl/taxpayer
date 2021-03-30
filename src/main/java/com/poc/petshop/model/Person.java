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
@MappedSuperclass
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
    private String middleName;
    private String alias;
    @Temporal(TemporalType.DATE)
    private LocalDate dateOfBirth;
    private String gender; //should be refactored to point to an Enum
}
