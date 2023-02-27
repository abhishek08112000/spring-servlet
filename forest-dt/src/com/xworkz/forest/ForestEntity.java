package com.xworkz.forest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "forest")
@NamedQuery(name = "findByName", query = "select na from ForestEntity na where na.name = 'Bandipura'")
public class ForestEntity {

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "state")
	private String state;
	@Column(name = "area")
	private Integer area;
	@Column(name = "type")
	private String type;
}
