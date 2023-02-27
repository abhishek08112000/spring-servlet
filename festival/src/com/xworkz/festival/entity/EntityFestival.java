package com.xworkz.festival.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "festival")
@NamedQuery(name = "findByName", query = "select n from EntityFestival n where n.name = 'Deepavali'")
@NamedQuery(name = "findByNameAndRegionAndMainGod", query = "select na from EntityFestival na where na.name = 'Dasara' and na.region='Mysore' and na.mainGod = 'Chamundeshwari'")
@NamedQuery(name = "findByMainGod", query = "select n from EntityFestival n where  n.mainGod = 'Laxmi'")
public class EntityFestival {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "region")
	private String region;
	@Column(name = "total_days")
	private Integer totalDays;
	@Column(name = "sweet")
	private String sweet;
	@Column(name = "main_god")
	private String mainGod;

	public EntityFestival(String name, String region, Integer totalDays, String sweet, String mainGod) {
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}

}
