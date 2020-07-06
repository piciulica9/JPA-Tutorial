package com.alex.TestJPA.Data.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Definitie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	private String definitie;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="TERMEN_ID")
	private Termen termen;
	
}
