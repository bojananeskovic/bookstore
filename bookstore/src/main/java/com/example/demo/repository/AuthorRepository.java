package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{
	
	Collection<Author> findByNationalityContainingIgnoreCase(String nationality);
	
}
