package com.hmrc.taxpayer.model;

import com.hmrc.taxpayer.model.common.ContactDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee extends Person {
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private ContactDetails contactDetails;
}
