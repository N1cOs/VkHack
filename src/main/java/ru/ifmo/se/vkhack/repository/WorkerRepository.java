package ru.ifmo.se.vkhack.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ifmo.se.vkhack.domain.Worker;

import java.util.Collection;

public interface WorkerRepository extends CrudRepository<Worker, Long> {
    Collection<Worker> findAllBySurname(String surname);
    Worker findByIdWorker(Long idWorker);
    Worker findByEmail(String email);
}
