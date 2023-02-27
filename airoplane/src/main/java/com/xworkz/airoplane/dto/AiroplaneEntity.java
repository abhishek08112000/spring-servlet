package com.xworkz.airoplane.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "airoplane_details")
public class AiroplaneEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "company_name")
	private String company;
	@Column(name = "airoplane_name")
	private String name;
	@Column(name = "cost")
	private Integer cost;
	@Column(name = "type")
	private String type;
	@Column(name = "country")
	private String country;
}
