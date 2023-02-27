package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.EntityFestival;

public class FindByName {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByName");
		//Object object= query.getSingleResult();
		EntityFestival festival = (EntityFestival) query.getSingleResult();
		System.out.println(festival);
	} 
}
