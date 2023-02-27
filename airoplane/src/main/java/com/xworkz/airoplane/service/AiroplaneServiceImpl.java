package com.xworkz.airoplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.airoplane.dto.AiroplaneDTO;
import com.xworkz.airoplane.dto.AiroplaneEntity;
import com.xworkz.airoplane.repository.AiroplaneRepository;

@Service
public class AiroplaneServiceImpl implements AiroplaneService {

	@Autowired
	private AiroplaneRepository airoplaneRepository;
	
	@Override
	public Set<ConstraintViolation<AiroplaneDTO>> validateAndSave(AiroplaneDTO dto) {
		System.out.println("running validate and save");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AiroplaneDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto " + dto);
			return violations;
		} else {
			System.out.println("violations is not here can save the data");
			AiroplaneEntity entity = new AiroplaneEntity();
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setCountry(dto.getCountry());
			boolean saved= this.airoplaneRepository.save(entity);
			System.out.println(saved);
			return Collections.emptySet();
		}

	}
	
	
	@Override
	public AiroplaneDTO findbyId(int id) {
		if(id>0) {
			AiroplaneEntity entity = this.airoplaneRepository.findById(id);
			if(entity != null) {
				System.out.println("entity is found in service for id " + id);
				AiroplaneDTO dto = new AiroplaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				return dto;
			}
			else {
				System.err.println("entity not found for id " + id);
			}
		}
		return AiroplaneService.super.findbyId(id);
	}

}
