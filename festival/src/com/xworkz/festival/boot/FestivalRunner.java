package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.EntityFestival;

public class FestivalRunner {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		EntityFestival festival = new EntityFestival("Holi Habba", "Bagalkot", 3, "All", "Kaman");
//		EntityFestival festival1 = new EntityFestival("Bakrid", "India", 1, "Mutton", "Allha");
//		EntityFestival festival2 = new EntityFestival("Deepavali", "India", 2, "All sweet", "Laxmi");
//		EntityFestival festival3 = new EntityFestival("Deepavali", "India", 2, "All sweet", "Laxmi");
//		EntityFestival festival4 = new EntityFestival("Deepavali", "India", 2, "All sweet", "Laxmi");
//		EntityFestival festival5 = new EntityFestival("Deepavali", "India", 2, "All sweet", "Laxmi");

		manager.persist(festival);
		transaction.commit();
		manager.close();
	}
}
