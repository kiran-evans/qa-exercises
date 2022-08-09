package com.example.demo.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Biscuit;
import com.example.demo.service.BiscuitService;

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
	public Biscuit makeBiscuit(@RequestBody Biscuit biscuit) {
		return this.service.makeBiscuit(biscuit);
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
