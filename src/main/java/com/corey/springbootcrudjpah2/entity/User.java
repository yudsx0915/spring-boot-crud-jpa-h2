package com.corey.springbootcrudjpah2.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String address;

    @Column(name = "test_string", length = 5)
    private String testString;

    @Column(name = "create_date")
    @Temporal(TemporalType.DATE)
    private Date createDate;

    @Temporal(TemporalType.TIME)
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTimeStamp;
}
