package ru.ifmo.se.vkhack.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ifmo.se.vkhack.domain.Worker;

public interface WorkerRepository extends CrudRepository<Worker, Long> {
    Iterable<Worker> findAllBySurname(String surname);
    Worker findByIdWorker(Long idWorker);
}
