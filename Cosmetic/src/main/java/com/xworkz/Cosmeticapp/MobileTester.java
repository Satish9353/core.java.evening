package com.xworkz.Cosmeticapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.Cosmeticapp.dto.MobileDTO;


public class MobileTester {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		//to insert the data
		
		  manager.persist(new MobileDTO(1,"vivo","4gb","64gb",14999.00));
		  manager.persist(new MobileDTO(2,"oppo","3gb","32gb",12999.00));
		  manager.persist(new MobileDTO(3,"samsung","6gb","128gb",18999.00));
		  manager.persist(new MobileDTO(4,"redmi","4gb","64gb",13499.00));
		  manager.persist(new MobileDTO(5,"poco","8gb","128gb",19999.00));
		 
		//to update the data
		manager.merge(new MobileDTO(5,"Iphone","6gb","64gb",55000.00));
		
		//fetch the data
		MobileDTO dto = manager.find(MobileDTO.class,5);
		System.out.println(dto);
		
		//delete the data
		manager.remove(dto);
		
		
		//fetch all the data
		Query query = manager.createQuery("select entity from MobileDTO entity");
		List<MobileDTO> list = query.getResultList();
		System.out.println(list);
		manager.getTransaction().commit();
		
	}

}
