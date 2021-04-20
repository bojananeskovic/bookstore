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
public class PublishingHouse {

	@Id
	@SequenceGenerator(name="PUBLISHINGHOUSE_ID_GENERATOR", sequenceName="publishingHouse_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PUBLISHINGHOUSE_ID_GENERATOR")
	private int id;
	
	private String name;
	private String location;
	
	@JsonIgnore
	@OneToMany(mappedBy="publishingHouse")
	private List<PublishingHouse> publishingHouse;
	
	public PublishingHouse() {}

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
