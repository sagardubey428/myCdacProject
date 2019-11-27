package com.Backend.model;

import java.sql.Date;

public class farmerorder
{

	int idfarmerorder;
	Date orderdate;
	int idfarmer;
	int idsellerproduct;
	public int getIdfarmerorder() {
		return idfarmerorder;
	}
	public void setIdfarmerorder(int idfarmerorder) {
		this.idfarmerorder = idfarmerorder;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public int getIdfarmer() {
		return idfarmer;
	}
	public void setIdfarmer(int idfarmer) {
		this.idfarmer = idfarmer;
	}
	public int getIdsellerproduct() {
		return idsellerproduct;
	}
	public void setIdsellerproduct(int idsellerproduct) {
		this.idsellerproduct = idsellerproduct;
	}
	public farmerorder(int idfarmerorder, Date orderdate, int idfarmer, int idsellerproduct) {
		
		this.idfarmerorder = idfarmerorder;
		this.orderdate = orderdate;
		this.idfarmer = idfarmer;
		this.idsellerproduct = idsellerproduct;
	}
	public farmerorder() {
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
