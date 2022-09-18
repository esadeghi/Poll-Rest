package com.ehsan.pollrest.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Poll {

    @Id
    @GeneratedValue
    private int Id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String question;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="ID")
    @OrderBy
    private Set<Option> options;
}