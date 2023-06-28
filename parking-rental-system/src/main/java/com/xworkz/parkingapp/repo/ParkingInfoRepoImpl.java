package com.xworkz.parkingapp.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parkingapp.entity.ParkingInfoEntity;

@Repository
public class ParkingInfoRepoImpl implements ParkingInfoRepo {

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

	@Override
	public List<ParkingInfoEntity> findByLocation(String location) {
		System.out.println("running findByLoaction in repo" + location);

		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createNamedQuery("findByLoaction");
		query.setParameter("ab", location);
		List<ParkingInfoEntity> result = query.getResultList();
		System.out.println("result from repo" + result);
		entityManager.close();
		return result;
	}

	@Override
	public ParkingInfoEntity findByAll(String location, String vtype, String vclassification, String term) {
		System.out.println("running findByAll in repo");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByAll");
		query.setParameter("loc",location);
		query.setParameter("vt",vtype);
		query.setParameter("vc", vclassification);
		query.setParameter("t", term);
		List<ParkingInfoEntity> list = query.getResultList();
		System.out.println("list from repo"+list);
		manager.close();
		return (ParkingInfoEntity) list;
	}

}
