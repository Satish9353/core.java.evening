package com.xworkz.parkingapp.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserParkingRepoImpl implements UserParkingRepo {
	
	@Autowired
	private  EntityManagerFactory factory;
	
	public UserParkingRepoImpl() {
		System.out.println("inside UserParkingRepoImpl");
	}
	@Override
	public boolean saveInfo(UserParkingEntity entity) {
		System.out.println("running saveInfo");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		
		return true;
	}

}
