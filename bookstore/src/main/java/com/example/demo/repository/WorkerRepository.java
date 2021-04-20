package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Integer>{
	
	Collection<Worker> findById(String uniqueNumber);
}
