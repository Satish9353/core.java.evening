package com.xworkz.parkingapp.user;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepoImpl implements UserRepo {

	@Autowired
	private  EntityManagerFactory factory;
	
	public UserRepoImpl() {
		System.out.println("inside UserParkingRepoImpl");
	}
	@Override
	public boolean saveInfo(UserEntity entity) {
		System.out.println("running saveInfo");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		
		return true;
	}
	@Override
	public UserEntity findByUserEmail(String userEmail) {

		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createNamedQuery("findByUserEmail");
		query.setParameter("email", userEmail);
		try {
	   Object obj=query.getSingleResult();
	   return (UserEntity) obj;
		}catch(Exception e) {
			return null;
		}finally {
			entityManager.close();
			
		}
			
	}


	
	

}
