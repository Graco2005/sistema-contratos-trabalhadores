package com.preparando_spring.worker.repositories;

import com.preparando_spring.worker.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
