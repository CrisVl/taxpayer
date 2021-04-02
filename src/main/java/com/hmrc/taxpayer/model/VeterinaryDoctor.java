package com.hmrc.taxpayer.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "veterinary_doctor")
public class VeterinaryDoctor extends Employee{
        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
                inverseJoinColumns = @JoinColumn(name = "speciality_id"))
        private Speciality specialities;

    }
}
