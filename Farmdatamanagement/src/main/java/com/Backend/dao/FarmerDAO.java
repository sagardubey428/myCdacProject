package com.Backend.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.model.Farmer;



public interface FarmerDAO extends JpaRepository<Farmer, String> {
	
}
