package com.example.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.model.ModelClass;
import com.example.aop.service.ServiceClass;

@RestController
@RequestMapping("/api")
public class ControllerClass {
	
	@Autowired
	private ServiceClass service;
	
	@GetMapping("/get/{id}")
	public ModelClass findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping("get/all")
	public List<ModelClass> findAll(){
		return service.findAll();
	}
	
	@PostMapping("/add")
	public String addDetails(@RequestBody ModelClass model) {
		return service.addDetails(model);
	}
	
	@PutMapping("/update")
	public String updateDetails(@PathVariable Long id, @RequestBody ModelClass model) {
		return service.updateDetails(id, model);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteDetails(@PathVariable Long id) {
		return service.deleteById(id);
	}
}
