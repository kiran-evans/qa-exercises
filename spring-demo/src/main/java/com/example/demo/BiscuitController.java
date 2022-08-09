package com.example.demo;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BiscuitController {
	
	private BiscuitService service;
	
	@Autowired
	public BiscuitController(BiscuitService service) {
		super();
		this.service = service;
	}

	// Create
	@PostMapping("/create")
	public Biscuit makeBiscuit(@PathParam("name") String name, @PathParam("cost") Double cost) {
		return this.service.makeBiscuit(name, cost);
	}
	
	// Gets
	@GetMapping("/getAll")
	public List<Biscuit> getAllBiscuits() {
		return this.service.getAllBiscuits();
	}
	
	@GetMapping("/getById/{id}")
	public Biscuit getById(@PathVariable() Integer id) {
		return this.service.getById(id);
	}
	
	// Update
	@PatchMapping("/update/{id}")
	public Biscuit updateBiscuit(@PathParam("name") String name, @PathParam("cost") Double cost, @PathVariable Integer id) {
		return this.service.updateBiscuit(name, cost, id);
	}
	
	// Delete
	@DeleteMapping("/delete/{id}")
	public boolean deleteBiscuit(@PathVariable Integer id) {
		return this.service.deleteBiscuit(id);
	}
}
