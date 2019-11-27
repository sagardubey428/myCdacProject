package com.Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.model.Buyer;


public interface BuyerDAO extends JpaRepository<Buyer, Integer>  {

}
