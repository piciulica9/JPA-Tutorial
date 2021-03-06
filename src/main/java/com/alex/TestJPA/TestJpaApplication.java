package com.alex.TestJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.alex.TestJPA.Models.model.Limba;
import com.alex.TestJPA.Models.model.Termen;
import com.alex.TestJPA.Repositories.LimbaRepository;
import com.alex.TestJPA.Repositories.TermenRepository;

@SpringBootApplication
public class TestJpaApplication implements CommandLineRunner {
	
	@Autowired
	private ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(TestJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("run started");
		
		System.out.println("Context " + context);
		
		System.out.println("Check this");
		System.out.println(context.getBean(TermenRepository.class).findAll().size());
		System.out.println("TermenRepository");
		System.out.println(context.getBean(TermenRepository.class));
		
	}
}
