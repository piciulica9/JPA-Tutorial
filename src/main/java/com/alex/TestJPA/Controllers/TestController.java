package com.alex.TestJPA.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alex.TestJPA.Data.model.Termen;
import com.alex.TestJPA.Repositories.LimbaRepository;
import com.alex.TestJPA.Repositories.TermenRepository;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	LimbaRepository limbaRepository;
	
	@Autowired
	TermenRepository termenRepository;
	
	@GetMapping(value = "")
	public void test() {
		
		System.out.println("Test controller test method");
		
		System.out.println("LimbaRepository " + limbaRepository);
		System.out.println("TermenRepository " + termenRepository);
		
		System.out.println(termenRepository.count());
		System.out.println(limbaRepository.count());
		
		System.out.println(termenRepository.findAll());
		
		System.out.println("GitKraken developer branch test");
	}

}
