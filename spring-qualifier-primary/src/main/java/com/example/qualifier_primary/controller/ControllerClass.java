package com.example.qualifier_primary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qualifier_primary.service.Animal;

@RestController
public class ControllerClass {
	
	@Autowired
	private Animal primaryAnimal;
	
	@Autowired
	@Qualifier("cat")
	private Animal qualifierAnimal;
	
//	//When using constructor injection
//	public ControllerClass(Animal primaryAnimal, @Qualifier("cat") Animal qualifierAnimal) {
//		this.primaryAnimal = primaryAnimal;
//		this.qualifierAnimal = qualifierAnimal;
//	}

	@GetMapping("/primary")
	public String primaryMakeSoundMethod() {
		return "Primary - "+primaryAnimal.makeSound();
	}
	
	@GetMapping("/qualifier")
	public String qualifierMakeSoundMethod() {
		return "Qualifier - "+qualifierAnimal.makeSound();
	}
}
