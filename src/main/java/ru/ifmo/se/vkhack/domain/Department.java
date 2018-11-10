package ru.ifmo.se.vkhack.domain;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class Department {

    @Id
    @Column(name = "number")
    private Long idDepartment;

    @OneToOne
    @JoinColumn(name = "id_body")
    private Body body;

    private String description;

    @Column(name = "work_time")
    private String workingTime;

    private String phone;

    public void setIdDepartment(Long idDepartment) {
        this.idDepartment = idDepartment;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getIdDepartment() {

        return idDepartment;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Body getBody() {

        return body;
    }

    public String getDescription() {
        return description;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public String getPhone() {
        return phone;
    }
}
