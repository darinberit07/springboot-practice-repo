package com.example.qualifier_primary.service;

import org.springframework.stereotype.Service;

@Service
public class Cat implements Animal{

	@Override
	public String makeSound() {
		return "Meow! CAT CLASS";
		
	}

}
