package com.xworkz.Cosmeticapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.Cosmeticapp.dto.CosmeticDTO;

public class CosmeticTester {
	
	public static void main(String[] args) {
				
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");//persistence unit name
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
	    //for insert
		  manager.persist(new CosmeticDTO(1,"lipstick","waterproof",100.00));//return type void
		  manager.persist(new CosmeticDTO(4,"lipstick","waterproof",100.00));
		  manager.persist(new CosmeticDTO(2,"foundation","waterproof",750.00));
		  manager.persist(new CosmeticDTO(3,"kajal","waterproof",50.00));
		 
		 
		//for update
		manager.merge(new CosmeticDTO(6,"eye line","waterproof",70.00));//return type entity
		
		  //for fetch operation we comment transaction method.
		  CosmeticDTO dto =manager.find(CosmeticDTO.class,4); //return type entity
		  System.out.println(dto);
		  
		  //for delete operation we use remove().
		  manager.remove(dto);//return type void
		  
			/*
			 * Query query = manager.createQuery("select entity from CosmeticDTO entity");
			 * List<CosmeticDTO> list = query.getResultList(); System.out.println(list);
			 */
		
		  manager.getTransaction().commit();
		
	}

}
