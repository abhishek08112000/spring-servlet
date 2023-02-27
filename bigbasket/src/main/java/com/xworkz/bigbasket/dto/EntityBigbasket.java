package com.xworkz.bigbasket.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "bigbasket_table")
public class EntityBigbasket {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "owner_name")
	private String ownerName;
	@Column(name = "mobile_no")
	private Integer mobileNo;
	@Column(name = "no_of_employes")
	private Integer noOfEmployees;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "shop_name")
	private String shopName;
	@Column(name = "area")
	private String area;
	@Column(name = "item")
	private String item;
	@Column(name = "price")
	private Integer price;
	@Column(name = "security")
	private Boolean security;
}
