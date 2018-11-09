package ru.ifmo.se.vkhack;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.ifmo.se.vkhack.repository.WorkerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VkHackApplicationTests {

    @Autowired
    WorkerRepository repository;

    @Test
    public void contextLoads() {

    }

}
