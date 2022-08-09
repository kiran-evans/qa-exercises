package com.example.demo.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Cake;
import com.example.demo.service.CakeService;

@RestController
public class CakeController {
	
	private CakeService service;
	
	@Autowired
	public CakeController(CakeService service) {
		super();
		this.service = service;
	}

	// Create
	@PostMapping("/create")
	public Cake makeBiscuit(@RequestBody Cake cake) {
		return this.service.makeBiscuit(cake);
	}
	
	// Gets
	@GetMapping("/getAll")
	public List<Cake> getAllBiscuits() {
		return this.service.getAllBiscuits();
	}
	
	@GetMapping("/getById/{id}")
	public Cake getById(@PathVariable() Integer id) {
		return this.service.getById(id);
	}
	
	// Update
	@PatchMapping("/update/{id}")
	public Cake updateBiscuit(@PathParam("name") String name, @PathParam("cost") Double cost, @PathVariable Integer id) {
		return this.service.updateBiscuit(name, cost, id);
	}
	
	// Delete
	@DeleteMapping("/delete/{id}")
	public boolean deleteBiscuit(@PathVariable Integer id) {
		return this.service.deleteBiscuit(id);
	}
}
