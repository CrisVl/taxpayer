package com.hmrc.taxpayer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    private Integer id;
    private String name;
    private String teamName;
    private Integer salary;

}
