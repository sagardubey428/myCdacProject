package com.Backend.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.Backend.model.Farmer;

/*

public class FarmerDaoImpl implements FarmerDAO {

private EntityManager entityManager;
	
	//set up Constructor injection
	
	@Autowired
	public void EmployeeDAOHibernateImpl(EntityManager theEntitymanager) 
	{
		entityManager=theEntitymanager;
	}
	
	
	@Override
	public List<Farmer> findAll() {
		//get the Hibernate Session
				Session currentSession=entityManager.unwrap(Session.class);
				
				//Create A Query
				Query<Farmer>theQuery=currentSession.createQuery("from farmer",Farmer.class);
				
				//execute the query and get result list
				
				List<Farmer> farmer=theQuery.getResultList();
				
				//return the List
				return farmer;
	}

	@Override
	public Farmer findById(String username) {
Session currentSession=entityManager.unwrap(Session.class);
		
		//get the Employee
		Farmer thefarmer=currentSession.get(Farmer.class,username);
		
		// return the Employee
		return thefarmer;
	}

	@Override
	public void savee(Farmer thefarmer) {
		//get the current hibernate Session
				Session  currentSession=entityManager.unwrap(Session.class);
				
				//Save employee
				
				currentSession.saveOrUpdate(thefarmer); //if id=0 save/insert else update
				
	}

	@Override
	public void Delete(String Username) {
		
		Session currentSession=entityManager.unwrap(Session.class);
		
		// Delete The employee
		
		Query theQuery=currentSession.createQuery("Delete from employee where id=:employeeID");
		
		theQuery.setParameter("employeeID", Username);
		
		theQuery.executeUpdate();

	}

}*/
