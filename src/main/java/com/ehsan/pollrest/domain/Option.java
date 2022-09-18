package com.ehsan.pollrest.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Option {

    @Id
    @GeneratedValue
    private long Id;

    private String value;
}
