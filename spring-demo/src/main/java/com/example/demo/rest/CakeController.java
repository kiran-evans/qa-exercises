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
	public Cake makeCake(@RequestBody Cake cake) {
		return this.service.makeCake(cake);
	}
	
	// Gets
	@GetMapping("/getAll")
	public List<Cake> getAllCakes() {
		return this.service.getAllCakes();
	}
	
	@GetMapping("/getById/{id}")
	public Cake getById(@PathVariable() Integer id) {
		return this.service.getById(id);
	}
	
	// Update
	@PatchMapping("/update/{id}")
	public Cake updateCake(@PathParam("name") String name, @PathParam("cost") Double cost, @PathVariable Integer id) {
		return this.service.updateCake(name, cost, id);
	}
	
	// Delete
	@DeleteMapping("/delete/{id}")
	public boolean deleteCake(@PathVariable Integer id) {
		return this.service.deleteCake(id);
	}
}
