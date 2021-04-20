package com.example.demo.jpa;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {
	
	@Id
	@SequenceGenerator(name="ACCOUNT_ID_GENERATOR", sequenceName="account_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCOUNT_ID_GENERATOR")
	private int id;
	
	@Column(name = "amount", nullable = false)
	private int amount;
	@Column(name = "discount", nullable = false)
	private boolean discount;
	
//	@ManyToMany
//    Set<Book> books;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="worker_id")
	private Worker workers;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="membershipCard_id")
	private MembershipCard membershipCard;
	
	public Account() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isDiscount() {
		return discount;
	}

	public void setDiscount(boolean discount) {
		this.discount = discount;
	}

//	public Set<Book> getBooks() {
//		return books;
//	}
//
//	public void setBooks(Set<Book> books) {
//		this.books = books;
//	}
	
	
}
