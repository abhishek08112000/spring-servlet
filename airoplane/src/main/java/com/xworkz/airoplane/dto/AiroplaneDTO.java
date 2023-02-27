package com.xworkz.airoplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AiroplaneDTO {

	@Size(min = 3, max = 25, message = "Name should be atleast 3 chars and greater than 25")
	private String company;
	@Size(min = 3, max = 25, message = "Name should be atleast 3 chars and greater than 25")
	private String name;
	//@NonNull
	private Integer cost;
	@NotBlank(message = "Type should be selected")
	private String type;
	@NotBlank(message = "country should be selected")
	private String country; 
}
