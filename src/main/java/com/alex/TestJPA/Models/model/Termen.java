package com.alex.TestJPA.Models.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
<<<<<<< HEAD
import javax.persistence.OneToMany;
=======
>>>>>>> af92437fdb0d9be120254ca1fdb4b1322fff0bef

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity

//@JsonIgnoreProperties({"limba", "definitii"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Termen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	private String termen;
	
	@ManyToOne
	(
		cascade={CascadeType.PERSIST, CascadeType.REMOVE}
	)
	@JoinColumn(name="LIMBA_ID")
	//@JsonProperty("limba")
	private Limba limba;
	
	@OneToMany
	(
		mappedBy="termen", 
		cascade={CascadeType.PERSIST},
		fetch = FetchType.LAZY
	)
	//@JsonProperty("definitii")
	private List<Definitie> definitii;
}
