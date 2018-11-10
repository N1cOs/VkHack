package ru.ifmo.se.vkhack.repository;

import org.springframework.data.repository.CrudRepository;
import ru.ifmo.se.vkhack.domain.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
    Department findByIdDepartment(Long idDepartment);
}
