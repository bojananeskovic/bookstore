package com.example.demo.jpa;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Awards {

	@Id
	@SequenceGenerator(name="AWARDS_ID_GENERATOR", sequenceName="award_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AWARDS_ID_GENERATOR")
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "award")
    Set<BookAwards> bookAwards;
	
	public Awards() {}

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

	public Set<BookAwards> getBookAwards() {
		return bookAwards;
	}

	public void setBookAwards(Set<BookAwards> bookAwards) {
		this.bookAwards = bookAwards;
	}
	
	
	
}
