package com.xworkz.parkingapp.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;
@Repository
public class ParkingInfoRepoImpl implements ParkingInfoRepo{
	@Autowired
	EntityManagerFactory factory;
	
	@Override
	public boolean saveInfo(ParkingInfoEntity entity) {
		
		System.out.println("inside saveInfo");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

}
