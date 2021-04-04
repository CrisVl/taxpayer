package com.hmrc.taxpayer.model.common;


import com.hmrc.taxpayer.model.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class ContactDetails extends BaseEntity {
    private String emailAddress;
    private String mobileTelNo;
    private String homeTelNo;
    private String workTelNo;
}
