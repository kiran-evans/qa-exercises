package com.example.demo.service;
import java.util.List;

import com.example.demo.Cake;

public interface CakeService {

	Cake makeBiscuit(Cake cake);

	List<Cake> getAllBiscuits();

	Cake getById(Integer id);

	Cake updateBiscuit(String name, Double cost, Integer id);

	boolean deleteBiscuit(Integer id);

}
