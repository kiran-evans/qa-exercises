package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BiscuitServiceList implements BiscuitService {
	
	private List<Biscuit> biscuits = new ArrayList<>();

	// Create
	@Override
	public Biscuit makeBiscuit(String name, Double cost) {
		if (name != null && !name.isBlank() && cost != null) {
			Biscuit biscuit = new Biscuit(name, cost);
			biscuit.setId(biscuits.size()); // Auto set id to index of biscuit
			biscuits.add(biscuit);
			System.out.println(biscuit.print());
			return biscuit;
		}
		
		System.out.println("Name and cost must both be provided.");
		
		return null;
	}
	
	// Read
	@Override
	public List<Biscuit> getAllBiscuits() {
		return this.biscuits;
	}

	@Override
	public Biscuit getById(Integer id) {
		return this.biscuits.get(id);
	}
	
	// Update
	@Override
	public Biscuit updateBiscuit(String name, Double cost, Integer id) {
		Biscuit biscuit = this.biscuits.get(id);
		
		if (name != null && !name.isBlank())
			biscuit.setName(name);
		if (cost != null)
			biscuit.setCost(cost);
		
		System.out.println(biscuit.print());
		return biscuit;
	}

	// Delete
	@Override
	public boolean deleteBiscuit(Integer id) {
		return this.biscuits.remove(this.biscuits.get(id)); // Find corresponding Biscuit and remove it from biscuits
	}
	
	
	// Constructor
	public BiscuitServiceList(List<Biscuit> biscuits) {
		super();
		this.biscuits = biscuits;
	}

}
