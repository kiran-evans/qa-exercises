package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Biscuit;

public interface BiscuitRepo extends JpaRepository<Biscuit, Integer> {

}
