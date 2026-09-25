package com.preparando_spring.worker.repositories;

import com.preparando_spring.worker.entities.Department;
import com.preparando_spring.worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
