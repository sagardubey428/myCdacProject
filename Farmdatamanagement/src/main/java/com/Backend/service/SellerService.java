package com.Backend.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.dao.SellerDAO;
import com.Backend.dao.SellerProductDAO;
import com.Backend.model.Farmer;
import com.Backend.model.Seller;
import com.Backend.model.Sellerproduct;

@Service
public class SellerService {
	
	private SellerProductDAO SellerProduct;
	private SellerDAO Sellerdb;
	@Autowired
	public  void sellerproductwithdao(SellerProductDAO Seller3) {
		System.out.println("Sellerservice wired with sellerdao repositry");
		SellerProduct=Seller3;
		
	}
	@Autowired
	public  void Sellerservicewithdao(SellerDAO Seller1) {
		System.out.println("Sellerservice wired with sellerdao repositry");
		Sellerdb=Seller1;
		
	}
	public List<Seller> findAllseller() {
		return Sellerdb.findAll();
		
	}
	
	@Transactional
	public Seller FindSellerbyid(String username) {
		
		Optional<Seller> x= Sellerdb.findById(username);
		Seller y =null;
		
		if(x.isPresent())
		{
			y=x.get();
			
		}
		else
		{
			System.out.println("login failed");
			y =new Seller(0, "notfound", "notfound", "notfound", "notfound",
					"notfound","notfound");	
		}
		//Seller mk=new Seller(0,"null","sdf","sd","sd","fd","f");
		
		return y;
	}
/*
	@Transactional
	public Seller Findbyid(String Username) {
		Optional<Seller> x= Sellerdb.findById(Username);
		Seller y =null;
		
		if(x.isPresent())
		{
			y=x.get();
			
		}
		else
		{
			System.out.println("login failed");
			y =new Seller(0, "notfound", "notfound", "notfound", "notfound",
					"notfound","notfound");	
		}
		
		return y;
		
	}*/
	public void SaveSellerToDb(Seller seller2) {
	Sellerdb.save(seller2);
		
	}
	public void SaveTheSellerproduct(Sellerproduct product) {
		SellerProduct.save(product);
		
	}
	
	

}
