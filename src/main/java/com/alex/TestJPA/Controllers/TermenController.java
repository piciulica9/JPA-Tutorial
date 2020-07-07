package com.alex.TestJPA.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alex.TestJPA.Models.model.Termen;
import com.alex.TestJPA.Repositories.TermenRepository;

@RestController
@RequestMapping("/termen")
public class TermenController {
	
	@Autowired
	private TermenRepository termenRepository;
	
	
	@GetMapping("/{id}")
	@ResponseBody
	public Termen getTermenById(@PathVariable Long id) {
		System.out.println("TermenController getTermenById: " + id);
		
		if(termenRepository.findById(id).isPresent())
			return termenRepository.findById(id).get();
		else
			return null;
		
	}
	

}
