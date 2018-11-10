package ru.ifmo.se.vkhack.domain;

import javax.persistence.*;

@Entity
public class Worker {

    @Id
    @Column(name = "id_worker")
    private Long idWorker;
    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private String phone;

    @Column(name = "work_time")
    private String workTime;

    @ManyToOne
    @JoinColumn(name = "id_position")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "id_department")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "group_lead_id")
    private Worker groupLead;

    @Override
    public String toString() {
        return name + surname + patronymic + email + phone + position.getName() + department.getDescription();
    }

    public void setGroupLead(Worker groupLead) {
        this.groupLead = groupLead;
    }

    public Worker getGroupLead() {
        return groupLead;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setIdWorker(Long idWorker) {
        this.idWorker = idWorker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Long getIdWorker() {
        return idWorker;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWorkTime() {
        return workTime;
    }

    public Position getPosition() {
        return position;
    }
}
