package com.alex.TestJPA.Models.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Limba {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	private String limba;
	
	@OneToMany
	(
			mappedBy="limba",
			fetch = FetchType.LAZY
	)
	@ToString.Exclude
	@JsonIgnore
	private List<Termen> termeni;

}
