package com.example.demo.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.SequenceGenerator;

@Entity
public class BookAwards {
	
	
	@Id
	@SequenceGenerator(name="BOOKAWARDS_ID_GENERATOR", sequenceName="bookaward_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BOOKAWARDS_ID_GENERATOR")
	private int id;
	
	private String year;
	
	private String place;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "book_id")
    Book book;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "award_id")
    Awards award;
    
    public BookAwards() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Awards getAward() {
		return award;
	}

	public void setAward(Awards award) {
		this.award = award;
	}
    
    
	
}
