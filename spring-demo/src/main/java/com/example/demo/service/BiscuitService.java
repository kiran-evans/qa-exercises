package com.example.demo.service;
import java.util.List;

import com.example.demo.Biscuit;

public interface BiscuitService {

	Biscuit makeBiscuit(Biscuit biscuit);

	List<Biscuit> getAllBiscuits();

	Biscuit getById(Integer id);

	Biscuit updateBiscuit(String name, Double cost, Integer id);

	boolean deleteBiscuit(Integer id);

}
