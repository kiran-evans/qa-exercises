package com.example.demo;
import java.util.List;

public interface BiscuitService {

	Biscuit makeBiscuit(String name, Double cost);

	List<Biscuit> getAllBiscuits();

	Biscuit getById(Integer id);

	Biscuit updateBiscuit(String name, Double cost, Integer id);

	boolean deleteBiscuit(Integer id);

}
