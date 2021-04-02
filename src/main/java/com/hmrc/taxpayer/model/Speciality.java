package com.hmrc.taxpayer.model;

import com.hmrc.taxpayer.model.enums.SpecialityType;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "speciality")
public class Speciality {
    @Column(name = "speciality_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private SpecialityType alertType;
}
