package com.example.demo.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Cake;
import com.example.demo.repo.CakeRepo;

@Service
@Primary
public class CakeServiceDB implements CakeService {
	
	private CakeRepo repo;

	public CakeServiceDB(CakeRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Cake makeCake(Cake cake) {
		return this.repo.save(cake);
	}

	@Override
	public List<Cake> getAllCakes() {
		return this.repo.findAll();
	}

	@Override
	public Cake getById(Integer id) {
		return this.repo.findById(id).get();
	}

	@Override
	public Cake updateCake(String flavour, Integer servings, Double cost, Integer id) {
		Cake cake = this.getById(id);
		
		if (flavour != null && !flavour.isBlank())
			cake.setFlavour(flavour);
		if (servings != null)
			cake.setServings(servings);
		if (cost != null)
			cake.setCost(cost);
		
		return this.repo.save(cake);
	}

	@Override
	public boolean deleteCake(Integer id) {
		this.repo.deleteById(id);
		return true;
	}

}
