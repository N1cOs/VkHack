package ru.ifmo.se.vkhack.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ifmo.se.vkhack.domain.Department;
import ru.ifmo.se.vkhack.domain.News;

public interface NewsRepository extends CrudRepository<News, Long> {
    Iterable<News> findAllByDepartment(Department department);
}
