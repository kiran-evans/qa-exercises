package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Cake;

public interface CakeRepo extends JpaRepository<Cake, Integer> {

}
