package ru.ifmo.se.vkhack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ifmo.se.vkhack.domain.Worker;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

import java.util.Collection;
@Controller
public class WorkersController {
    private final WorkerRepository workerRepository;

    @Autowired
    public WorkersController(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @RequestMapping(value = "/employee/search", method = RequestMethod.POST)
    public String getSuitableEmployees(@RequestParam("search") String searchingInfo, Model model){
        Collection<Worker> workers = workerRepository.findAllBySurname("Иванов");
        model.addAttribute("workers", workers);
        return "searchAnswer";
    }
}
