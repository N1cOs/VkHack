package ru.ifmo.se.vkhack.domain;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Position {

    @OneToMany(mappedBy = "id_worker")
    private Collection<Worker> workers;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
