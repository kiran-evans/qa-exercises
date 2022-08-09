package com.example.demo.service;
import java.util.List;

import com.example.demo.Cake;

public interface CakeService {

	Cake makeCake(Cake cake);

	List<Cake> getAllCakes();

	Cake getById(Integer id);

	Cake updateCake(String name, Double cost, Integer id);

	boolean deleteCake(Integer id);

}
