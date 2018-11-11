package ru.ifmo.se.vkhack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import ru.ifmo.se.vkhack.domain.News;
import ru.ifmo.se.vkhack.domain.Worker;
import ru.ifmo.se.vkhack.repository.NewsRepository;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/read")
public class ReadMessages {

    private WorkerRepository workerRepository;
    private NewsRepository newsRepository;

    public ReadMessages(WorkerRepository workerRepository, NewsRepository newsRepository) {
        this.workerRepository = workerRepository;
        this.newsRepository = newsRepository;
    }

    @PostMapping
    public void getName(@SessionAttribute("idWorker") Long idWorker,
                        @RequestParam("newsId") Long idNews,  HttpServletResponse resp) throws IOException {
        Worker worker = workerRepository.findByIdWorker(idWorker);
        News news = newsRepository.findByIdNews(idNews);
        worker.getReadNews().add(news);
        Set<Worker> readNews = news.getWorkerSet();
        Worker[] workers = new Worker[readNews.size()];
        readNews.toArray(workers);
        String[] workerNames = new String[workers.length];
        for(int i = 0; i < workers.length; i++){
            workerNames[i] = "\"" +  workers[i].getShortName() + "\"";
        }
        resp.getWriter().println(Arrays.toString(workerNames));
    }
}
