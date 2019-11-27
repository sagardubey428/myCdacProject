package com.Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.model.Farm;



public interface FarmDao extends JpaRepository<Farm, Integer>{

}
