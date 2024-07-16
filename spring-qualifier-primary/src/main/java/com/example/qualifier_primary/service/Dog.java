package com.example.qualifier_primary.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Dog implements Animal{

	@Override
	public String makeSound() {
		return "Bark! DOG CLASS";
		
	}

}
