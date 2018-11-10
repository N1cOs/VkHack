package ru.ifmo.se.vkhack.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ifmo.se.vkhack.domain.Position;

public interface PositionRepository extends CrudRepository<Position, Long> {
    Position findByName(String name);
}
