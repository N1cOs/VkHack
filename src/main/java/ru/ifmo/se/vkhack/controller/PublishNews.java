package ru.ifmo.se.vkhack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import ru.ifmo.se.vkhack.domain.Body;
import ru.ifmo.se.vkhack.domain.Department;
import ru.ifmo.se.vkhack.domain.News;
import ru.ifmo.se.vkhack.repository.BodyRepository;
import ru.ifmo.se.vkhack.repository.DepartmentRepository;
import ru.ifmo.se.vkhack.repository.NewsRepository;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

import java.util.Date;

@Controller
@RequestMapping("/publish")
public class PublishNews {

    private final NewsRepository newsRepository;
    private final BodyRepository bodyRepository;
    private final DepartmentRepository departmentRepository;
    private final WorkerRepository workerRepository;

    private final static Logger logger = LoggerFactory.getLogger(NewsController.class);


    @Autowired
    public PublishNews(NewsRepository newsRepository, BodyRepository bodyRepository,
                       DepartmentRepository departmentRepository, WorkerRepository workerRepository) {
        this.newsRepository = newsRepository;
        this.bodyRepository = bodyRepository;
        this.departmentRepository = departmentRepository;
        this.workerRepository = workerRepository;
    }


    @PostMapping
    public String addNews(@SessionAttribute("idWorker") Long idWorker, @RequestParam("heading") String heading, @RequestParam("message") String message,
                          @RequestParam("position") String position,
                          @RequestParam("location") String location){
        News news = new News();
        news.setCreatedTime(new Date());
        news.setTitle(heading);
        news.setDescription(message);
        Body body = bodyRepository.findByName(location);
        Department department = departmentRepository.findByBody(body);
        logger.info(workerRepository.findByIdWorker(idWorker).getName());
        news.setDepartment(department);
        news.setWorkerCreator(workerRepository.findByIdWorker(idWorker));
        newsRepository.save(news);
        return "redirect:/news";
    }
}
