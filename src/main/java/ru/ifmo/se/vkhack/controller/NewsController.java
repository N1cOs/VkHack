package ru.ifmo.se.vkhack.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.ifmo.se.vkhack.domain.Department;
import ru.ifmo.se.vkhack.domain.News;
import ru.ifmo.se.vkhack.domain.Worker;
import ru.ifmo.se.vkhack.repository.DepartmentRepository;
import ru.ifmo.se.vkhack.repository.NewsRepository;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {
    private final NewsRepository newsRepository;
    private final WorkerRepository workerRepository;

    @Autowired
    public NewsController(NewsRepository newsRepository, WorkerRepository workerRepository) {
        this.newsRepository = newsRepository;
        this.workerRepository = workerRepository;
    }

    @GetMapping
    public String getNews(@SessionAttribute("idWorker") Long id_worker, Model model) {
        Worker worker = workerRepository.findByIdWorker(id_worker);
        Department depart = worker.getDepartment();
        Iterable<News> news = newsRepository.findAll();
        List<News> matchNews = new ArrayList<>();
        news.forEach(new_obj -> {
            if(new_obj.getDepartment().equals(depart)){
                matchNews.add(new_obj);
            }
        });
        model.addAttribute("news", matchNews);
        return "news";
    }
}
