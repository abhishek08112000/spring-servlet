package com.xworkz.bigbasket.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BigbasketDTO {

	@Size(min = 3, max = 20, message = "Name can not be less than 3 and greater than 20")
	private String ownerName;
	//@Size(min = 10,max = 11 ,message = "mobile number must be 10 digits")
	private Integer mobileNo;
	//@Size(min = 3, max = 200, message = "Number of employees can not be less than 3 and greater than 20")
	private Integer noOfEmployees;
	@Size(message = "Email should be given valid")
	private String email;
	@Size(min = 8, max = 100, message = "password should be 8 charecters")
	private String password;
	@Size(min = 3, max = 20, message = "Shop name can not be less than 3 and greater than 20")
	private String shopName;
	@NotBlank(message = "Area should be selected")
	private String area;
	@NotBlank(message = "Item should be selected")
	private String item;
	@NonNull
	@Min(150)
	private Integer price;
	@NotNull(message = "Security should be selected")
	private Boolean security;
}
