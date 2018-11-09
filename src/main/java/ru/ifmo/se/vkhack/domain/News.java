package ru.ifmo.se.vkhack.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class News {

    @Id
    @Column(name = "id_new")
    private Long idNews;

    private String description;
    private Date createdTime;
    private Date targetTime;


    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {

        return department;
    }

    public Long getIdNews() {
        return idNews;
    }

    public String getDescription() {
        return description;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getTargetTime() {
        return targetTime;
    }

    public void setIdNews(Long idNews) {
        this.idNews = idNews;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setTargetTime(Date targetTime) {
        this.targetTime = targetTime;
    }
}
