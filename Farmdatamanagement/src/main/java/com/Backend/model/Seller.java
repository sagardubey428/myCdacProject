package com.Backend.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="seller")
public class Seller {

//@GeneratedValue(strategy=GenerationType.AUTO)
	
int idseller;
@Id
String sellername;
String sellerphoneno;
String selleraddress;
String sellergender;
String sellerpassword;
String sellershopname;
public int getIdseller() {
	return idseller;
}
public void setIdseller(int idseller) {
	this.idseller = idseller;
}
public String getSellername() {
	return sellername;
}
public void setSellername(String sellername) {
	this.sellername = sellername;
}
public String getSellerphoneno() {
	return sellerphoneno;
}
public void setSellerphoneno(String sellerphoneno) {
	this.sellerphoneno = sellerphoneno;
}
public String getSelleraddress() {
	return selleraddress;
}
public void setSelleraddress(String selleraddress) {
	this.selleraddress = selleraddress;
}
public String getSellergender() {
	return sellergender;
}
public void setSellergender(String sellergender) {
	this.sellergender = sellergender;
}
public String getSellerpassword() {
	return sellerpassword;
}
public void setSellerpassword(String sellerpassword) {
	this.sellerpassword = sellerpassword;
}
public String getSellershopname() {
	return sellershopname;
}
public void setSellershopname(String sellershopname) {
	this.sellershopname = sellershopname;
}
public Seller(int idseller, String sellername, String sellerphoneno, String selleraddress, String sellergender,
		String sellerpassword, String sellershopname) {
	
	this.idseller = idseller;
	this.sellername = sellername;
	this.sellerphoneno = sellerphoneno;
	this.selleraddress = selleraddress;
	this.sellergender = sellergender;
	this.sellerpassword = sellerpassword;
	this.sellershopname = sellershopname;
}
public Seller() {

}
@Override
public String toString() {
	return "Seller [idseller=" + idseller + ", sellername=" + sellername + ", sellerphoneno=" + sellerphoneno
			+ ", selleraddress=" + selleraddress + ", sellergender=" + sellergender + ", sellerpassword="
			+ sellerpassword + ", sellershopname=" + sellershopname + "]";
}



	
	
}
