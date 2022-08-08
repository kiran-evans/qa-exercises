package com.example.demo;

public class Biscuit {
	private Integer id;
	private String name;
	private Double cost;
	
	public String print() {
		return "id: " + this.id + ", name: " + this.name + ", cost: £" + this.cost;
	}
	
	public Biscuit(String name, Double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
}
