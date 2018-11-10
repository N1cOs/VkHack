package ru.ifmo.se.vkhack.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Body {

    @Id
    @Column(name = "id_body")
    private Long idBody;

    private String address;

    @Column(name = "time")
    private String workingTime;


    private String name;

    public void setIdBody(Long idBody) {
        this.idBody = idBody;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdBody() {
        return idBody;
    }

    public String getAddress() {
        return address;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public String getName() {
        return name;
    }
}
