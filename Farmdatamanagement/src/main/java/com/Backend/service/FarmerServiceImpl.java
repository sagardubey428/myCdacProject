package com.Backend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.dao.FarmDao;
import com.Backend.dao.FarmProduceDAO;
import com.Backend.dao.FarmerDAO;

import com.Backend.dao.SellerDAO;
import com.Backend.model.Farm;
import com.Backend.model.Farmer;
import com.Backend.model.Farmproduce;
import com.Backend.model.Seller;




@Service
public class FarmerServiceImpl  {

private FarmerDAO FarmerDao;         //service layer will talk to DAO layer 
	private  FarmProduceDAO farmerproduct;
	private FarmDao f;
	//private SellerDAO seller;
	@Autowired
	public  FarmerServiceImpl(FarmerDAO theFarmer) {
		System.out.println("service wired wih farmerdaorepositry");
		FarmerDao=theFarmer;
		
	}
	@Autowired
	public  void FarmerServiceImplwithFarmproduce(FarmProduceDAO product) {
		System.out.println("service wired with farmproducedao repositry");
		farmerproduct=product;
		
	}
	
	@Autowired
	public  void FarmerServicewithseller(FarmDao S) {
		System.out.println("service wired wih farmdao repositry");
		f=S;
		
	}
	
	
	public List<Farmproduce> findAllFarmproduce() {
		return farmerproduct.findAll();
		
	}
	
	public List<Farmer> findAll() {
		return FarmerDao.findAll();
		
	}
	
	
	
	@Transactional
	public Farmer Findbyid(String Username) {
		Optional<Farmer> x= FarmerDao.findById(Username);
		Farmer y =null;
		
		if(x.isPresent())
		{
			y=x.get();
			
		}
		else
		{
			System.out.println("login failed");
			y =new Farmer(0, "notfound", "notfound", "notfound", "notfound",
					"notfound",0);	
		}
		//logic is mobile object iemi no is zero then mobile no is not found.
		return y;
	}

	
	@Transactional
	public Farm FindFarm(int x) {
		Optional<Farm> y= f.findById(x);
		Farm z =null;
		
		if(y.isPresent())
		{
			z=y.get();
			
		}
		else
		{
			System.out.println("login failed");
			z =new Farm(0,"not found","not found",0);	
		}
		//logic is mobile object iemi no is zero then mobile no is not found.
		return z;
	}



	/*

	@Override
	public void Delete(String Username) {
		FarmerDao.Delete(Username);

	}
*/
	@Transactional
	public void savee(Farmer theFarmer) {
		FarmerDao.save(theFarmer);
		List<Farmer> a=new ArrayList<Farmer>();
		a.add(theFarmer);
		System.out.println(theFarmer.toString());
}
	public void savetheproduct(Farmproduce product) {
		String p=product.getFarmproductpicture();
		String Q="assets/";
		String g=p.replace("C:\\fakepath\\", "");
		System.out.println(g);
		String d=Q+g;
		product.setFarmproductpicture(d);
		
	
		farmerproduct.save(product);
		
	}
}
