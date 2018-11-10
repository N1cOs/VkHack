package ru.ifmo.se.vkhack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ifmo.se.vkhack.domain.Worker;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WorkersController {
    private final WorkerRepository workerRepository;

    @Autowired
    public WorkersController(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @RequestMapping(value = "/employee/search", method = RequestMethod.POST)
    public String getSuitableEmployees(@RequestParam("search") String searchingInfo, Model model){
        Iterable<Worker> workers = workerRepository.findAll();
        String[] words = searchingInfo.split("\\s+");
        List<Worker> matchWorkers = new ArrayList<>();
        for (String word : words) {
            workers.forEach(worker -> {
                if((worker.getName().equalsIgnoreCase(word) || worker.getSurname().equalsIgnoreCase(word) ||
                        worker.getPatronymic().equalsIgnoreCase(word)) && !matchWorkers.contains(worker)){
                    matchWorkers.add(worker);
                }
            });
        }
        if(matchWorkers.size() == 0){
            model.addAttribute("noWorkers", "Извините, но Ваш запрос не дал положительных результатов");
            return "searchAnswer";
        }
        model.addAttribute("workers", matchWorkers);
        return "searchAnswer";
    }
}
