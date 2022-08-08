package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.*;

@RestController
public class BiscuitController {
	 
	private List<Biscuit> biscuits = new ArrayList<>();
	
	
	// Create
	@PostMapping("/create")
	public Biscuit makeBiscuit(@PathParam("name") String name, @PathParam("cost") Double cost) {
		Biscuit biscuit = new Biscuit(name, cost);
		biscuit.setId(biscuits.size()); // Auto set id to index of biscuit
		biscuits.add(biscuit);
		System.out.println(biscuit.print());
		return biscuit;
	}
	
	// Gets
	@GetMapping("/getAll")
	public List<Biscuit> getAllBiscuits() {
		return this.biscuits;
	}
	
	@GetMapping("/getById/{id}")
	public Biscuit getById(@PathVariable() Integer id) {
		return this.biscuits.get(id);
	}
	
	// Update
	@PatchMapping("/update/{id}")
	public Biscuit updateBiscuit(@PathParam("name") String name, @PathParam("cost") Double cost, @PathVariable Integer id) {
		Biscuit biscuit = this.biscuits.get(id);
		
		biscuit.setName(name);
		biscuit.setCost(cost);
		System.out.println(biscuit.print());
		return biscuit;
	}
	
	// Delete
	@DeleteMapping("/delete/{id}")
	public boolean deleteBiscuit(@PathVariable Integer id) {
		return this.biscuits.remove(this.biscuits.get(id)); // Find corresponding Biscuit and remove it from biscuits
	}
}
