package com.Backend.service;

import java.util.List;

import com.Backend.model.Farmer;


public interface FarmerInterface {

	public List<Farmer> findAll();

	  
	public Farmer findById(String Username);
	
	public void save(Farmer theFarmer);
	
	public void Delete(String Username);
}
