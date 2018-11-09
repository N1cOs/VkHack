package ru.ifmo.se.vkhack.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

    @Id
    @Column(name = "number")
    private Long idDepartment;

    private String description;

}
