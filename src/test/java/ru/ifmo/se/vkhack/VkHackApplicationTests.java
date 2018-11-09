package ru.ifmo.se.vkhack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ifmo.se.vkhack.domain.News;
import ru.ifmo.se.vkhack.domain.Worker;
import ru.ifmo.se.vkhack.repository.NewsRepository;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VkHackApplicationTests {

    private final static Logger logger = LoggerFactory.getLogger(VkHackApplicationTests.class);

    @Autowired
    WorkerRepository repository;
    @Autowired
    NewsRepository newsRepository;

    @Test
    public void contextLoads() {
        Iterable<Worker> workers = repository.findAllBySurname("Петрова");
        workers.forEach(n -> logger.info(n.getName()));
    }

    @Test
    public void testNews(){
        Worker ivanov = repository.findByIdWorker(2l);
        logger.info(ivanov.getName());
        Iterable<News> suitableNews = newsRepository.findAllByDepartment(ivanov.getDepartment());
        suitableNews.forEach(n -> logger.info(n.getDescription()));
    }

}
