package com.example.demo.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.jpa.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{
	Collection<Account> findByDiscount(boolean discount);
}
