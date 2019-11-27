package com.Backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sellerproduct")
public class Sellerproduct {
	@Id
	int idsellerproduct;
	String sellername;
	String Productpicture;
	String Productcategory;
	String sellerproductprice;
	int idseller;
	
	
	public int getIdsellerprodut() {
		return idsellerproduct;
	}
	public void setIdsellerprodut(int idsellerprodut) {
		this.idsellerproduct = idsellerprodut;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getProductpicture() {
		return Productpicture;
	}
	public void setProductpicture(String productpicture) {
		Productpicture = productpicture;
	}
	public String getProductcategory() {
		return Productcategory;
	}
	public void setProductcategory(String productcategory) {
		Productcategory = productcategory;
	}
	public String getSellerproductprice() {
		return sellerproductprice;
	}
	public void setSellerproductprice(String sellerproductprice) {
		this.sellerproductprice = sellerproductprice;
	}
	public int getIdseller() {
		return idseller;
	}
	public void setIdseller(int idseller) {
		this.idseller = idseller;
	}
	public Sellerproduct(int idsellerprodut, String sellername, String productpicture, String productcategory,
			String sellerproductprice, int idseller) {
		
		this.idsellerproduct = idsellerprodut;
		this.sellername = sellername;
		Productpicture = productpicture;
		Productcategory = productcategory;
		this.sellerproductprice = sellerproductprice;
		this.idseller = idseller;
	}
	public Sellerproduct() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
