package com.xworkz.airoplane.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.airoplane.dto.AiroplaneDTO;
import com.xworkz.airoplane.dto.AiroplaneEntity;

@Repository
public class AiroplaneRepositoryImpl implements AiroplaneRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public boolean save(AiroplaneEntity entity) {
		System.out.println("running save in repository");
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public AiroplaneEntity findById(int id) {
		System.out.println("finding by id in repo.. " + id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		AiroplaneEntity dataBase = manager.find(AiroplaneEntity.class, id);
		manager.close();
		return dataBase;
	}

}
