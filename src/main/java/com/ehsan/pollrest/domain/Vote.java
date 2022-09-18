package com.ehsan.pollrest.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Vote {

    @Id
    @GeneratedValue
    private long Id;

    @ManyToOne
    @JoinColumn(name = "Id")
    private Option option;
}
