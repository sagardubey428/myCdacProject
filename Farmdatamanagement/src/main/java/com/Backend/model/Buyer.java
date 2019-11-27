package com.Backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="buyer")
public class Buyer {
	@Id
private int idbuyer;
	
private String buyername;
private String buyeaddress;
private String buyercontactno;
private String buyergender;
private String buyerpassword;
public int getIdbuyer() {
	return idbuyer;
}
public void setIdbuyer(int idbuyer) {
	this.idbuyer = idbuyer;
}
public String getBuyername() {
	return buyername;
}
public void setBuyername(String buyername) {
	this.buyername = buyername;
}
public String getBuyeaddress() {
	return buyeaddress;
}
public void setBuyeaddress(String buyeaddress) {
	this.buyeaddress = buyeaddress;
}
public String getBuyercontactno() {
	return buyercontactno;
}
public void setBuyercontactno(String buyercontactno) {
	this.buyercontactno = buyercontactno;
}
public String getBuyergender() {
	return buyergender;
}
public void setBuyergender(String buyergender) {
	this.buyergender = buyergender;
}
public String getBuyerpassword() {
	return buyerpassword;
}
public void setBuyerpassword(String buyerpassword) {
	this.buyerpassword = buyerpassword;
}
public Buyer(int idbuyer, String buyername, String buyeaddress, String buyercontactno, String buyergender,
		String buyerpassword) {
	
	this.idbuyer = idbuyer;
	this.buyername = buyername;
	this.buyeaddress = buyeaddress;
	this.buyercontactno = buyercontactno;
	this.buyergender = buyergender;
	this.buyerpassword = buyerpassword;
}
public Buyer() {
	
}

}
