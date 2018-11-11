package ru.ifmo.se.vkhack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ifmo.se.vkhack.domain.Body;
import ru.ifmo.se.vkhack.domain.Department;
import ru.ifmo.se.vkhack.domain.News;
import ru.ifmo.se.vkhack.domain.Worker;
import ru.ifmo.se.vkhack.repository.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VkHackApplicationTests {

    private final static Logger logger = LoggerFactory.getLogger(VkHackApplicationTests.class);

    @Autowired
    WorkerRepository repository;
    @Autowired
    NewsRepository newsRepository;
    @Autowired
    BodyRepository bodyRepository;
    @Autowired
    DepartmentRepository departmentRepository;

    @Test
    public void contextLoads() {
        Collection<Worker> workers = repository.findAllBySurname("Петрова");
        workers.forEach(n -> logger.info(n.getName()));
    }

    @Test
    public void testNews(){
        Worker ivanov = repository.findByIdWorker(2l);
        logger.info(ivanov.getName());
        Collection<News> suitableNews = newsRepository.findAllByDepartment(ivanov.getDepartment());
        suitableNews.forEach(n -> logger.info(n.getDescription()));
    }

    @Test
    public void testBody(){
        News news = newsRepository.findByIdNews(1l);
        Set<Worker> workerSet = news.getWorkerSet();
        workerSet.forEach(n -> logger.info(n.getName()));

    }

}
