package com.example.demo.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<Cake> makeCake(@RequestBody Cake cake) {
		return new ResponseEntity<Cake>(this.service.makeCake(cake), HttpStatus.CREATED);
	}
	
	// Read
	@GetMapping("/getAll")
	public List<Cake> getAllCakes() {
		return this.service.getAllCakes();
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Cake> getById(@PathVariable() Integer id) {
		return new ResponseEntity<Cake>(this.service.getById(id), HttpStatus.OK);
	}
	
	// Update
	@PatchMapping("/update/{id}")
	public ResponseEntity<Cake> updateCake(@PathParam("flavour") String flavour, @PathParam("servings") Integer servings, @PathParam("cost") Double cost, @PathVariable Integer id) {
		return new ResponseEntity<Cake>(this.service.updateCake(flavour, servings, cost, id), HttpStatus.OK);
	}
	
	// Delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteCake(@PathVariable Integer id) {
		return new ResponseEntity<Boolean>(this.service.deleteCake(id), HttpStatus.OK);
	}
}
