package ru.ifmo.se.vkhack.domain;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Date;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_new")
    private Long idNews;

    @JoinColumn(name = "id_creator")
    @ManyToOne
    private Worker workerCreator;

    private String description;
    private String title;
    @Column(name = "creating_time")
    private Date createdTime;
    @Column(name = "target_time")
    private Date targetTime;


    public void setWorkerCreator(Worker workerCreator) {
        this.workerCreator = workerCreator;
    }

    public Worker getWorkerCreator() {

        return workerCreator;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {

        return title;
    }

    @JoinColumn(name = "id_department")
    @ManyToOne
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
