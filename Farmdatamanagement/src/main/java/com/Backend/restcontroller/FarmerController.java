package com.Backend.restcontroller;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.InvalidKeyException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.model.Buyer;
import com.Backend.model.Farm;
import com.Backend.model.Farmer;
import com.Backend.model.Farmproduce;
import com.Backend.model.Seller;
import com.Backend.model.Sellerproduct;
import com.Backend.service.BuyerService;
import com.Backend.service.Decryption;
import com.Backend.service.Encrption;

import com.Backend.service.FarmerServiceImpl;
import com.Backend.service.Message;
import com.Backend.service.SellerService;






@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class FarmerController {
	private static final Object[] String = null;
	private FarmerServiceImpl farmer;
	private Encrption E;
	private Decryption D;
	private SellerService Seller2;
	private BuyerService buyer;
	
	@Autowired
	public void wiringtobuyer(BuyerService S)
	{
		System.out.println("controller wired with buyer service");
		buyer=S;
	} //we have provide dependency injection using setter method.
	@Autowired
	public void Encrption123(Decryption S)
	{
		System.out.println("controller wired wih Decryption service");
		D=S;
	} 
	@Autowired
	public void Encrption(Encrption q)
	{
		System.out.println("controller wired wih Encrption service");
		E=q;
	} 
	@Autowired
	public void WireingWithSellerService(SellerService Sellerr)
	{
		System.out.println("controller wired wih service");
		Seller2=Sellerr;
	}
	@Autowired
	public void setthefarmer(FarmerServiceImpl thefarmer)
	{
		System.out.println("controller wired wih service");
		farmer=thefarmer;
	}
	//expose "/farmer" and return the list of Farmer
		@GetMapping("/farmer")
		public List<Farmer> findAll()
		{
			
			return farmer.findAll();
			
		}
		
		@GetMapping("/farmerproduct")
		public List<Farmproduce> findAllFarmproducef()
		{
			
			return farmer.findAllFarmproduce();
			
		}
		
		@GetMapping("/seller")
		public List<Seller> findAllSeller()
		{
			
			return Seller2.findAllseller();
			
		}
		
		@GetMapping("/login")
		public Farmer f55(@RequestParam("x") String mn )//assume single select
		{
			Farmer m =farmer.Findbyid(mn);
			
			return m;
			
		}
		@GetMapping("/sellerLogin")
		public Seller SellerLogin(@RequestParam("x") String mn )//assume single select
		{
			Seller m =Seller2.FindSellerbyid(mn);
			//Seller mk=new Seller(0,"null","sdf","sd","sd","fd","f");
			System.out.print(mn);
			System.out.print(m.toString());
			return m;
			
		}
		@GetMapping("/buyerlogin")
		public Buyer BuyerLogin(@RequestParam("x") String mn , @RequestParam("y") String pswd )//assume single select
		{
			System.out.println(mn);
			System.out.println(pswd);
			Buyer m =buyer.FindSellerbyid(mn,pswd);
			
			return m;
			
		}
		@GetMapping("/getFarmDetails")
		public Farm GetFarmDetails(@RequestParam("x") int mn  )//assume single select
		{
			
			Farm m =farmer.FindFarm(mn);
			
			return m;
			
		}
		
	/*	
		@GetMapping("/allfarmers/{username}")
		public Farmer getFarmer(@PathVariable String username)
		{
			Farmer theFarmer=farmer.findById(username);
			if(theFarmer==null)
			{
				throw new RuntimeException("Farmer not found with username"+ theFarmer);
			}
			return theFarmer;
		}*/
		@PostMapping("/farmerreg")
		public Farmer addEmployee(@RequestBody Farmer theFarmer)
		{
			System.out.println(theFarmer.toString());
			//theFarmer.setIdfarm(3);
			farmer.savee(theFarmer);
			
			return theFarmer;
		}
		@PostMapping("/Buyer-reg")
		public Buyer addSeller(@RequestBody Buyer b)
		{
			
			buyer.SaveBuyerToDB(b);
			
			return b;
		}
		@PostMapping("/Sellerreg")
		public Seller addSeller(@RequestBody Seller m)
		{
			System.out.println(m.getSellername());
			m.setIdseller(0);
			Seller2.SaveSellerToDb(m);
			
			return m;
		}
		@PostMapping("/SellerProduct-Reg")
		public void SellerProductreg(@RequestBody Sellerproduct product)
		{
			
			Seller2.SaveTheSellerproduct(product);
			//System.out.println(theFarmer.getFarmername());
			//return theFarmer;
		}
		
		
		
		@PostMapping("/farmproductreg")
		public void addFarmerProduct(@RequestBody Farmproduce product)
		{
			
			farmer.savetheproduct(product);
			//System.out.println(theFarmer.getFarmername());
			//return theFarmer;
		}
		
		
		@PostMapping("/farmerregencrption")
		public void FarmerRegEncrption(@RequestBody Farmer theFarmer) throws InvalidKeyException, FileNotFoundException, IOException, Exception
		{
			String data1=theFarmer.toString();
			System.out.println(data1);
			new Encrption(data1, "KeyPair/privateKey").writeToFile("MyData/SignedData.txt");
			
			System.out.println(theFarmer.getFarmername());
			
		}
		
		@GetMapping("/farmerdecrption")
		public Object farmerDecrption() throws Exception
		{
			String m=D.Decryption1("MyData/SignedData.txt", "KeyPair/publicKey");
			//String m=D.j;
			//String[] a=m.split(",");
			//String g=((java.lang.String) String[0]).replace("idfarmer=", "");
			//System.out.println(a[0]);
			//System.out.println(g);
			//System.out.println(a[2]);
			Object g=(Object)m;
			Message m1=new Message();
			m1.messagep =m;
			
			//System.out.println(m1);
			return m1;
			
		}
		
}
/*The @RequestMapping annotation is used to provide routing information. It tells to the Spring that
 *  any HTTP request should map to the corresponding method. We need to import org.springframework.web.annotation package in our file.
 *  
 *  The @RestController annotation informs to the Spring to render the result back to the caller.
 *  Spring Boot manages dependencies and configuration automatically.
 *  
 *  Starters are a set of convenient dependency descriptors which we can include in our application.

Spring Boot provides built-in starters which makes development easier and rapid. For example, if we want to get started using Spring and JPA for
 database access, just include the spring-boot-starter-data-jpa dependency in your project.

Starter should follow a naming pattern like: spring-boot-starter-*, where * is a particular type of application. This naming structure is intended to help when you need to find a starter.
 *  
 *  spring-boot-starter-web--->It is used for building web, including RESTful, applications using Spring MVC.
 *   Uses Tomcat as the default embedded container.
 *  
 *  
 *  
 *  */
