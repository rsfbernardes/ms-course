package com.rsfbernardes.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsfbernardes.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
	
	
}
