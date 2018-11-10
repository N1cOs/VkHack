package ru.ifmo.se.vkhack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ifmo.se.vkhack.domain.Department;
import ru.ifmo.se.vkhack.domain.Worker;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

@Controller
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    WorkerRepository workerRepository;
    @GetMapping
    public String getNews(@RequestParam("id_worker") Long id_worker, Model model) {
        Worker worker = workerRepository.findByIdWorker(id_worker);
        model.addAttribute("worker", worker);
        return "profile";
    }
}

