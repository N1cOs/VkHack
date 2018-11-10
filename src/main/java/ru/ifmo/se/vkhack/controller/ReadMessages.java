package ru.ifmo.se.vkhack.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/read")
public class ReadMessages {

    @PostMapping
    public void getName(@SessionAttribute("idWorker") Long idWorker, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().println("lol");
    }
}
