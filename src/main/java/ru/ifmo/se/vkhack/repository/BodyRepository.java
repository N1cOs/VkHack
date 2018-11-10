package ru.ifmo.se.vkhack.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ifmo.se.vkhack.domain.Body;

public interface BodyRepository extends CrudRepository<Body, Long> {
    Body findByIdBody(Long idBody);
}
