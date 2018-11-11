package ru.ifmo.se.vkhack.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ifmo.se.vkhack.domain.Department;
import ru.ifmo.se.vkhack.domain.News;

import java.util.Collection;

public interface NewsRepository extends CrudRepository<News, Long> {
    Collection<News> findAllByDepartment(Department department);
    News findByIdNews(Long id);
}
