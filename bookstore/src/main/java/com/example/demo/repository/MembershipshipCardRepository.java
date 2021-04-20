package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.MembershipCard;

public interface MembershipshipCardRepository extends JpaRepository<MembershipCard, Integer>{

	Collection<MembershipCard> findBySerialNumber(int serialNumber);
}
