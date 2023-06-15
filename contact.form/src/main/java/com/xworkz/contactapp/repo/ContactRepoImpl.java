package com.xworkz.contactapp.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.contactapp.dto.ContactDTO;
import com.xworkz.contactapp.entity.ContactEntity;

@Repository
public class ContactRepoImpl implements ContactRepo {
	
	@Autowired
	EntityManagerFactory factory;
	@Override
	public ContactDTO save(ContactEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		
		return null;
	}

}
