package com.hmrc.taxpayer.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class VeterinaryDoctor extends BaseEntity {
    private String firstName;
    private String lastName;
    private String middleName;
    private String alias;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String gender;
}
