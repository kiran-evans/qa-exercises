package com.example.demo.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.Biscuit;
import com.example.demo.repo.BiscuitRepo;

@Service
@Primary
public class BiscuitServiceDB implements BiscuitService {
	
	private BiscuitRepo repo;

	public BiscuitServiceDB(BiscuitRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Biscuit makeBiscuit(Biscuit biscuit) {
		return this.repo.save(biscuit);
	}

	@Override
	public List<Biscuit> getAllBiscuits() {
		return this.repo.findAll();
	}

	@Override
	public Biscuit getById(Integer id) {
		return this.repo.findById(id).get();
	}

	@Override
	public Biscuit updateBiscuit(String name, Double cost, Integer id) {
		Biscuit biscuit = this.getById(id);
		
		if (name != null && !name.isBlank())
			biscuit.setName(name);
		if (cost != null)
			biscuit.setCost(cost);
		
		return this.repo.save(biscuit);
	}

	@Override
	public boolean deleteBiscuit(Integer id) {
		this.repo.deleteById(id);
		return true;
	}

}
