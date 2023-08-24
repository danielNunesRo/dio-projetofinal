package com.daniel.api.post.diopostapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String number;
	
	@Column(name = "available_limit",scale = 2, precision = 13)
	private Number limit;
	
	public Card() {
		
	}

	public Card(String number, Number limit) {
		this.number = number;
		this.limit = limit;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Number getLimit() {
		return limit;
	}

	public void setLimit(Number limit) {
		this.limit = limit;
	}
	
	
	
	
}
