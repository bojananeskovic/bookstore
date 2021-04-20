package com.example.demo.jpa;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Genre {
	
	@Id
	@SequenceGenerator(name="GENRE_ID_GENERATOR", sequenceName="genre_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GENRE_ID_GENERATOR")
	private int id;
	private String name;
	
//	@ManyToMany
//	Set<Book> books;
	
	public Genre() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Set<Book> getBooks() {
//		return books;
//	}
//
//	public void setBooks(Set<Book> books) {
//		this.books = books;
//	}
	
	
}
