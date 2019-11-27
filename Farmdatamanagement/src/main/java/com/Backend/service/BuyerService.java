package com.Backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.dao.BuyerDAO;

import com.Backend.model.Buyer;



@Service
public class BuyerService {

	private BuyerDAO buyer;
	@Autowired
	public  void buyerwithbuyerdao(BuyerDAO buy) {
		System.out.println("Sellerservice wired with sellerdao repositry");
		buyer=buy;
		
	}
	public Buyer FindSellerbyid(String mn, String pswd) {
		List<Buyer> h=buyer.findAll();
		Buyer c=new Buyer(0,"not found","not found","not found","not found","not found");
		for(Buyer i:h) {
			if((i.getBuyername().equals(mn)) && i.getBuyerpassword().equals(pswd)) {
				System.out.println("reached");
				 c=i;
				
			}
		}
		return c;
				
		
	}
	public void SaveBuyerToDB(Buyer b) {
		buyer.save(b);
		
	}
	

}
