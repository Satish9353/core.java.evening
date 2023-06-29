package com.xworkz.parkingapp.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.ParkingEntity;

@Repository
public class ParkingRepoImpl implements ParkingRepo{
	
	@Autowired
	EntityManagerFactory factory;
	public ParkingRepoImpl() {
		System.out.println("repo impl created");
	}
	@Override
	public ParkingEntity userSingIn(String email) {
		System.out.println("parking entity repo created");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("ess",email);
		Object object = query.getSingleResult();
		ParkingEntity entity = (ParkingEntity) object;
		return entity;
		
	}

	@Override
	public boolean updateTime(ParkingEntity entity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(entity);
		transaction.commit();
		manager.close();
		return false;
	}

}
