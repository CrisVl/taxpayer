package com.hmrc.taxpayer.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Employee extends Person{
    @Column(name = "date_of_birth")
    @Temporal(TemporalType.DATE)
    private LocalDate employmentDate;
}
