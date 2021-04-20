package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Awards;

public interface AwardsRepository  extends JpaRepository<Awards, Integer>{

	Collection<Awards> findByNameContainingIgnoreCase(String name);
}
