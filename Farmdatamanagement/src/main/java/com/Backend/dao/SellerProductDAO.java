package com.Backend.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Backend.model.Sellerproduct;


public interface SellerProductDAO extends JpaRepository<Sellerproduct, Integer>{

}
