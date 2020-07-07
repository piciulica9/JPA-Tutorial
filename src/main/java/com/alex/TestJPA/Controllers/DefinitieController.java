package com.alex.TestJPA.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alex.TestJPA.Models.model.Definitie;
import com.alex.TestJPA.Repositories.DefinitieRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@RestController
@RequestMapping("/definitie")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DefinitieController {

	@Autowired
	private DefinitieRepository definitieRepository;
	
	@GetMapping("/{id}")
	@ResponseBody
	public Definitie getDefinitieById(@PathVariable Long id) {
		System.out.println("DefinitieRepository getDefinitieById: " + id);
		
		
		if(definitieRepository.findById(id).isPresent())
			return definitieRepository.findById(id).get();
		else
			return null;
		
	}
}
