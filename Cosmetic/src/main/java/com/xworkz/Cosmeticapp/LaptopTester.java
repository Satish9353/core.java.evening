package com.xworkz.Cosmeticapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.Cosmeticapp.dto.LaptopDTO;

public class LaptopTester {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		//insert operation
		
		
		  manager.persist(new LaptopDTO(1,"hp","8gb",50000.00,"black"));
		  manager.persist(new LaptopDTO(2,"dell","6gb",45000.00,"white"));
		  manager.persist(new LaptopDTO(3,"asus","8gb",30000.00,"black"));
		  manager.persist(new LaptopDTO(4,"macbook","8gb",150000.00,"silver"));
		  manager.persist(new LaptopDTO(5,"lenovo","6gb",45000.00,"black"));
		 
		
		//update operation
		manager.merge(new LaptopDTO(5,"lenovo","8gb",45000.00,"black"));
		
		//fetch the data
		LaptopDTO dto = manager.find(LaptopDTO.class,5);
		System.out.println(dto);
		
		//delete operation
		manager.remove(dto);
 
		Query query = manager.createQuery("select entity from LaptopDTO entity");
		List<LaptopDTO> li = query.getResultList();
		System.out.println(li);
		manager.getTransaction().commit();	
	}

}
