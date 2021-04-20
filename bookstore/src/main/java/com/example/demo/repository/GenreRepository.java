package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>{

	Collection<Genre> findByNameContainingIgnoreCase(String name);
}
