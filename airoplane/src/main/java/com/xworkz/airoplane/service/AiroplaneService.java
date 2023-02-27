package com.xworkz.airoplane.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.airoplane.dto.AiroplaneDTO;

public interface AiroplaneService {

	Set<ConstraintViolation<AiroplaneDTO>> validateAndSave(AiroplaneDTO dto);
	
	default AiroplaneDTO findbyId(int id) {
		return null;
	}
}
