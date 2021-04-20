package com.example.demo.jpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {

	@Id
	@SequenceGenerator(name="BOOK_ID_GENERATOR", sequenceName="book_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BOOK_ID_GENERATOR")
	private int id;
	
	private String title;
	private int price;
	private int quantity;
	private String cover;
	private int numberOfPages;
	private String description;
	private String language;

	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="publishingHouse_id")
	private PublishingHouse publishingHouse;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author authors;
	
	@JsonIgnore
	@OneToMany(mappedBy = "id")
    Set<BookAwards> book;
	
	@ManyToMany
	Set<Account> accounts;
	
	@ManyToMany
	Set<Genre> genre;
	
	public Book() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
}
