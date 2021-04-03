package com.hmrc.taxpayer.model.common;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hmrc.taxpayer.model.BaseEntity;
import com.hmrc.taxpayer.model.Employee;
import com.hmrc.taxpayer.model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetails extends BaseEntity {
    private String emailAddress;
    private String mobileTelNo;
    private String homeTelNo;
    private String workTelNo;

    @OneToOne(mappedBy = "contactDetails", fetch = FetchType.EAGER)
    @JsonIgnore
    private Employee employee;
}
