package com.xworkz.abhishek.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class BevarageDTO {

	private String brandName;
	private int price;
	private LocalDate mfgDate;
	private LocalDate expiryDate;
	private String bevarageName;
	private int avalaibleIn;
	private double milkContentInGm;
	private double sugarContentInGm;

}
