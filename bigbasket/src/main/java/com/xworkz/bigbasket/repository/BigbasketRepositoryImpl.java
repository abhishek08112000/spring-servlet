package com.xworkz.bigbasket.repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bigbasket.dto.EntityBigbasket;

@Repository
public class BigbasketRepositoryImpl implements BigbasketRepository {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public boolean save(EntityBigbasket bigbasket) {
		System.out.println("running save in repository");
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = manager.getTransaction();
		entityTransaction.begin();
		manager.persist(bigbasket);
		entityTransaction.commit();
		manager.close();
		return false;
	}
	
	@Override
	public EntityBigbasket findById(int id) {
		System.out.println("finding by id in repo.. " + id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		EntityBigbasket bigbasket = entityManager.find(EntityBigbasket.class, id);
		entityManager.close();
		return bigbasket;
	}

}
