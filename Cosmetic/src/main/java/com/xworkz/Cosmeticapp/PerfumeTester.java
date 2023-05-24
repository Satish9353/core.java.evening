package com.xworkz.Cosmeticapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.Cosmeticapp.dto.PerfumeDTO;


public class PerfumeTester {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		  //insert the data
			
			  manager.persist(new PerfumeDTO(1,"Park Avenue","Deodorant","03-03-2023","04-03-2025",390.00));
			  manager.persist(new PerfumeDTO(2,"Fogg","Body Perfume","02-02-2023","04-03-2026",250.00));
			  manager.persist(new PerfumeDTO(3,"Wild Stone","Body Perfume","03-03-2023","04-03-2025",600.00));
			  manager.persist(new PerfumeDTO(4,"Axe","Body Perfume","03-03-2022","04-03-2025",350.00));
			  manager.persist(new PerfumeDTO(5,"KS","Deodorant","03-03-2022","04-03-2024",390.00));
			 
		 
		
		//update the data
		manager.merge(new PerfumeDTO(5,"KS","Deodorant","03-03-2022","04-03-2024",350.00));
 
		//fetch the data
		PerfumeDTO dto = manager.find(PerfumeDTO.class,5);
		System.out.println(dto);
		
		//delete the data
		manager.remove(dto);
		
		//fetch all the data
		Query query = manager.createQuery("select entity from PerfumeDTO entity");
		List<PerfumeDTO> list = query.getResultList();
		System.out.println(list);
		
		manager.getTransaction().commit();
	}

}
