package com.example.demo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Biscuit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private Double cost;
	
	@Override
	public String toString() {
		return "id: " + this.id + ", name: " + this.name + ", cost: £" + this.cost;
	}

	public Biscuit() {
		super();
	}
	
	public Biscuit(String name, Double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getCost() {
		return this.cost;
	}
	
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
}
