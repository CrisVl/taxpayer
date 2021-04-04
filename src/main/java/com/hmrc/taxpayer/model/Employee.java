package com.hmrc.taxpayer.model;

import com.hmrc.taxpayer.model.common.ContactDetails;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee extends Person {

    @Temporal(TemporalType.DATE)
    private Date employmentDate;
    private BigDecimal salary;

    @OneToOne(cascade = CascadeType.ALL)
    private ContactDetails contactDetails;
}
