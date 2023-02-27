package com.xworkz.bigbasket.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.bigbasket.dto.BigbasketDTO;

public interface BigbasketService {

	Set<ConstraintViolation<BigbasketDTO>> validateAndSave(BigbasketDTO dto);
	
	default BigbasketDTO findById(int id) {
		return null;
	}
}
