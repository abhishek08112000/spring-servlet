package com.xworkz.bigbasket.repository;

import com.xworkz.bigbasket.dto.EntityBigbasket;

public interface BigbasketRepository {

	boolean save(EntityBigbasket bigbasket);
	
	EntityBigbasket findById(int id);
}
