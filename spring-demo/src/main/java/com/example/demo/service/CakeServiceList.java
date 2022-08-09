package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.Cake;

@Service
public class CakeServiceList implements CakeService {
	
	private List<Cake> cakes = new ArrayList<>();

	// Create
	@Override
	public Cake makeCake(Cake cake) {
		if (cake.getName() != null && !cake.getName().isBlank() && cake.getCost() != null) {
			cakes.add(cake);
			System.out.println(cake.toString());
			return cake;
		}
		
		System.out.println("Name and cost must both be provided.");
		
		return null;
	}
	
	// Read
	@Override
	public List<Cake> getAllCakes() {
		return this.cakes;
	}

	@Override
	public Cake getById(Integer id) {
		return this.cakes.get(id);
	}
	
	// Update
	@Override
	public Cake updateCake(String name, Double cost, Integer id) {
		Cake cake = this.cakes.get(id);
		
		if (name != null && !name.isBlank())
			cake.setName(name);
		if (cost != null)
			cake.setCost(cost);
		
		System.out.println(cake.toString());
		return cake;
	}

	// Delete
	@Override
	public boolean deleteCake(Integer id) {
		return this.cakes.remove(this.cakes.get(id)); // Find corresponding Cake and remove it from biscuits
	}
	
	
	// Constructor
	public CakeServiceList(List<Cake> cakes) {
		super();
		this.cakes = cakes;
	}

}
