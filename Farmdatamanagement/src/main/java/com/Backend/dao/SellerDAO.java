package com.Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.model.Seller;



public interface SellerDAO  extends JpaRepository<Seller, String>{

}
