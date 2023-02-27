package com.xworkz.airoplane.repository;


import com.xworkz.airoplane.dto.AiroplaneEntity;

public interface AiroplaneRepository {

	boolean save(AiroplaneEntity entity);

	AiroplaneEntity findById(int id);
}
