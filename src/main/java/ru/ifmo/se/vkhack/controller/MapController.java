package ru.ifmo.se.vkhack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/news")
public class MapController {
    @RequestMapping(value = "/employee/search", method = RequestMethod.POST)
    public String getSuitableEmployees(@RequestParam("search") String searchingInfo, Model model){
        String lol = "123";
        model.addAttribute("workers", lol);
        return "searchAnswer";
    }
}


