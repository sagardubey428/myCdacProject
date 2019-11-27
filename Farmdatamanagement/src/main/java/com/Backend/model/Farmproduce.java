package com.Backend.model;

//import java.awt.Image;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name="farmproduce")
public class Farmproduce
{
	@Id
int idfarmproduct;
String farmproductname;
String farmproductprice;
Date farmproductdate;
String farmproductcategory;

private String farmproductpicture;
int idfarmer;
public int getIdfarmproduct() {
	return idfarmproduct;
}
public void setIdfarmproduct(int idfarmproduct) {
	this.idfarmproduct = idfarmproduct;
}
public String getFarmproductname() {
	return farmproductname;
}
public void setFarmproductname(String farmproductname) {
	this.farmproductname = farmproductname;
}
public String getFarmproductprice() {
	return farmproductprice;
}
public void setFarmproductprice(String farmproductprice) {
	this.farmproductprice = farmproductprice;
}
public Date getFarmproductdate() {
	return farmproductdate;
}
public void setFarmproductdate(Date farmproductdate) {
	this.farmproductdate = farmproductdate;
}
public String getFarmproductcategory() {
	return farmproductcategory;
}
public void setFarmproductcategory(String farmproductcategory) {
	this.farmproductcategory = farmproductcategory;
}

public String getFarmproductpicture() {
	return farmproductpicture;
}
public void setFarmproductpicture(String farmproductpicture) {
	this.farmproductpicture = farmproductpicture;
}
public Farmproduce(int idfarmproduct, String farmproductname, String farmproductprice, Date farmproductdate,
		String farmproductcategory, String farmproductpicture, int idfarmer) {
	
	this.idfarmproduct = idfarmproduct;
	this.farmproductname = farmproductname;
	this.farmproductprice = farmproductprice;
	this.farmproductdate = farmproductdate;
	this.farmproductcategory = farmproductcategory;
	this.farmproductpicture = farmproductpicture;
	this.idfarmer = idfarmer;
}
public Farmproduce() {
	
}
	
	
	
}                                   
