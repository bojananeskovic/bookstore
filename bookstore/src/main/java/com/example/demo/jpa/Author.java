package com.example.demo.jpa;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Author {
	
	@Id
	@SequenceGenerator(name="AUTHOR_ID_GENERATOR", sequenceName="author_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUTHOR_ID_GENERATOR")
	private int id;
	
	private String firstName;
	private String lastName;
	private String nationality;
	
	@JsonIgnore
	@OneToMany(mappedBy="authors")
	private List<Author> authors;
	
	public Author() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	

}
