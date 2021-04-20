package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.BookAwards;

public interface BookAwardsRepository extends JpaRepository<BookAwards, Integer>{
	
	Collection<BookAwards> findByYear(String year);

}
