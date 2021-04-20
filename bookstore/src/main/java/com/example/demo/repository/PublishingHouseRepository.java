package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.PublishingHouse;

public interface PublishingHouseRepository extends JpaRepository<PublishingHouse, Integer> {

	Collection<PublishingHouse> findByNameContainingIgnoreCase(String name);
	Collection<PublishingHouse> findByLocationContainingIgnoreCase(String location);
}
