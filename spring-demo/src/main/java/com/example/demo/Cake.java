package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cake {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String flavour;
	private Integer servings;
	private Double cost;
	
	@Override
	public String toString() {
		return "id: " + this.id + ", flavour: " + this.flavour + ", servings: " + this.servings + ", cost: £" + this.cost;
	}

	public Cake() {
		super();
	}
	
	public Cake(String flavour, Integer servings, Double cost) {
		super();
		this.flavour = flavour;
		this.servings = servings;
		this.cost = cost;
	}

	public Cake(Integer id, String flavour, Integer servings, Double cost) {
		super();
		this.id = id;
		this.flavour = flavour;
		this.servings = servings;
		this.cost = cost;
	}

	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFlavour() {
		return this.flavour;
	}
	
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public Double getCost() {
		return this.cost;
	}
	
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
}
