package ru.ifmo.se.vkhack.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/employee").setViewName("search");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/map").setViewName("map");
    }
}
