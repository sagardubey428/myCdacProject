package com.Backend.model;

import java.sql.Date;

public class Buyerorder {
	private int idbuyerorder;
	private Date buyerorderdate;
	private int idbuyer;
	private int farmproduct;
	
	
	
public int getIdbuyerorder() {
	return idbuyerorder;
}
public void setIdbuyerorder(int idbuyerorder) {
	this.idbuyerorder = idbuyerorder;
}
public Date getBuyerorderdate() {
	return buyerorderdate;
}
public void setBuyerorderdate(Date buyerorderdate) {
	this.buyerorderdate = buyerorderdate;
}
public int getIdbuyer() {
	return idbuyer;
}
public void setIdbuyer(int idbuyer) {
	this.idbuyer = idbuyer;
}
public int getFarmproduct() {
	return farmproduct;
}
public void setFarmproduct(int farmproduct) {
	this.farmproduct = farmproduct;
}
public Buyerorder(int idbuyerorder, Date buyerorderdate, int idbuyer, int farmproduct) {
	
	this.idbuyerorder = idbuyerorder;
	this.buyerorderdate = buyerorderdate;
	this.idbuyer = idbuyer;
	this.farmproduct = farmproduct;
}
public Buyerorder() {

}

}
