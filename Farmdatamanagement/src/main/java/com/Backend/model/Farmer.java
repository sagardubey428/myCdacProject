package com.Backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="farmer")
public class Farmer {
@Id
String farmername;
int idfarmer;
String farmeraddress;
String farmercontactno;
String farmergender;
String farmerpswd;
int idfarm;
public int getIdfarmer() {
	return idfarmer;
}
public void setIdfarmer(int idfarmer) {
	this.idfarmer = idfarmer;
}
public String getFarmername() {
	return farmername;
}
public void setFarmername(String farmername) {
	this.farmername = farmername;
}
public String getFarmeraddress() {
	return farmeraddress;
}
public void setFarmeraddress(String farmeraddress) {
	this.farmeraddress = farmeraddress;
}
public String getFarmercontactno() {
	return farmercontactno;
}
public void setFarmercontactno(String farmercontactno) {
	this.farmercontactno = farmercontactno;
}
public String getFarmergender() {
	return farmergender;
}

public void setFarmergender(String farmergender) {
	this.farmergender = farmergender;
}
public String getFarmerpswd() {
	return farmerpswd;
}
public void setFarmerpswd(String farmerpswd) {
	this.farmerpswd = farmerpswd;
}
public int getIdfarm() {
	return idfarm;
}
public void setIdfarm(int idfarm) {
	this.idfarm = idfarm;
}


public Farmer(int idfarmer, String farmername, String farmeraddress, String farmercontactno, String farmergender,
		String farmerpswd, int idfarm) {
	super();
	this.idfarmer = idfarmer;
	this.farmername = farmername;
	this.farmeraddress = farmeraddress;
	this.farmercontactno = farmercontactno;
	this.farmergender = farmergender;
	this.farmerpswd = farmerpswd;
	this.idfarm = idfarm;
}

public Farmer() {
	
}
@Override
public String toString() {
	return "idfarmer=" + idfarmer + ", farmername=" + farmername + ", farmeraddress=" + farmeraddress
			+ ", farmercontactno=" + farmercontactno + ", farmergender=" + farmergender + ", farmerpswd=" + farmerpswd
			+ ", idfarm=" + idfarm + "";
}

}