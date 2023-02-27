package com.xworkz.bigbasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigbasket.dto.BigbasketDTO;
import com.xworkz.bigbasket.dto.EntityBigbasket;
import com.xworkz.bigbasket.repository.BigbasketRepository;

@Service
public class BigbasketServiceImpl implements BigbasketService {

	@Autowired
	private BigbasketRepository bigbasketRepository;
	
	@Override
	public Set<ConstraintViolation<BigbasketDTO>> validateAndSave(BigbasketDTO dto) {
		System.out.println("Running validateAndSave in service method");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator= factory.getValidator();
		Set<ConstraintViolation<BigbasketDTO>> violations= validator.validate(dto);
		if(violations != null && !violations.isEmpty()) {
			System.err.println("violations in dto " + dto);
			return violations;
		}
		else {
			System.out.println("no violations in dto, can save the data");
			EntityBigbasket basket = new EntityBigbasket();
			basket.setOwnerName(dto.getOwnerName());
			basket.setMobileNo(dto.getMobileNo());
			basket.setNoOfEmployees(dto.getNoOfEmployees());
			basket.setEmail(dto.getEmail());
			basket.setPassword(dto.getPassword());
			basket.setShopName(dto.getShopName());
			basket.setArea(dto.getArea());
			basket.setItem(dto.getItem());
			basket.setPrice(dto.getPrice());
			basket.setSecurity(dto.getSecurity());
			boolean saved = this.bigbasketRepository.save(basket);
			System.out.println("Saved is " + saved);
			return Collections.emptySet();
		}
	}
	
	@Override
	public BigbasketDTO findById(int id) {
		if(id>0) {
			EntityBigbasket bigbasket = this.bigbasketRepository.findById(id);
			if(bigbasket != null) {
				System.out.println("Entity is found in service for id " + id);
				BigbasketDTO dto = new BigbasketDTO();
				dto.setOwnerName(bigbasket.getOwnerName());
				dto.setMobileNo(bigbasket.getMobileNo());
				dto.setNoOfEmployees(bigbasket.getNoOfEmployees());
				dto.setEmail(bigbasket.getEmail());
				dto.setPassword(bigbasket.getPassword());
				dto.setShopName(bigbasket.getShopName());
				dto.setArea(bigbasket.getArea());
				dto.setItem(bigbasket.getItem());
				dto.setPrice(bigbasket.getPrice());
				dto.setSecurity(bigbasket.getSecurity());
				return dto; 
			}
		}
		return BigbasketService.super.findById(id);
	}

}
