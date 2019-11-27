package com.Backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="farm")
public class Farm 
{
	@Id
	private int farmerplotno;
	//private int idfarm;
	private String farmlocation;
	private String farmspace;
	private int surveyno;
	


/*
public int getIdfarm() {
	return idfarm;
}
public void setIdfarm(int idfarm) {
	this.idfarm = idfarm;
}*/
public String getFarmlocation() {
	return farmlocation;
}
public void setFarmlocation(String farmlocation) {
	this.farmlocation = farmlocation;
}
public String getFarmspace() {
	return farmspace;
}
public void setFarmspace(String farmspace) {
	this.farmspace = farmspace;
}
public int getSurveyno() {
	return surveyno;
}
public void setSurveyno(int surveyno) {
	this.surveyno = surveyno;
}
public int getFarmerplotno() {
	return farmerplotno;
}
public void setFarmerplotno(int farmerplotno) {
	this.farmerplotno = farmerplotno;
}


public Farm() {
	//default constructor.
}
@Override
public String toString() {
	return "Farm [farmerplotno=" + farmerplotno + ", farmlocation=" + farmlocation + ", farmspace=" + farmspace
			+ ", surveyno=" + surveyno + "]";
}
public Farm(int farmerplotno, String farmlocation, String farmspace, int surveyno) {
	super();
	this.farmerplotno = farmerplotno;
	this.farmlocation = farmlocation;
	this.farmspace = farmspace;
	this.surveyno = surveyno;
}


}
