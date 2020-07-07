package com.alex.TestJPA.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alex.TestJPA.Models.model.Limba;
import com.alex.TestJPA.Repositories.LimbaRepository;

@RestController
@RequestMapping("/limba")
public class LimbaController {
	
	@Autowired
	private LimbaRepository limbaRepository;
	
	@GetMapping("/{id}")
	@ResponseBody
	public Limba getLimbaById(@PathVariable Long id) {
		System.out.println("LimbaRepository getLimbaById: " + id);
		
		if(limbaRepository.findById(id).isPresent())
			return limbaRepository.findById(id).get();
		else
			return null;
		
	}
	

}
