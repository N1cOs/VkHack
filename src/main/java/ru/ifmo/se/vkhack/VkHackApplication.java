package ru.ifmo.se.vkhack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class VkHackApplication {

    public static void main(String[] args) {
        SpringApplication.run(VkHackApplication.class, args);
    }
}
