package ru.ifmo.se.vkhack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @Autowired
    NewsRepository newsRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    WorkerRepository workerRepository;

    @GetMapping
    public String getNews(@RequestParam("id_worker") Long id_worker, Model model) {

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
