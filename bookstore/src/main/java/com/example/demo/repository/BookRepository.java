package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

	Collection<Book> findByTitleContainingIgnoreCase(String title);
	Collection<Book> findByLanguageContainingIgnoreCase(String language);
	
}
