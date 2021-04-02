package com.hmrc.taxpayer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person extends BaseEntity {
    private String firstName;
    private String lastName;
    private String middleName;
    private String alias;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String gender;
}
