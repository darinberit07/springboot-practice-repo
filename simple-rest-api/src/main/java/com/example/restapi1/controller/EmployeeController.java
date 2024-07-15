package com.example.restapi1.controller;

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

import com.example.restapi1.model.EmployeeModel;
import com.example.restapi1.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/get/{id}")
	public EmployeeModel getEmpById(@PathVariable Long id) {
		return service.getEmpDetails(id);
	}
	
	@GetMapping("/get/all")
	public List<EmployeeModel> getAllEmp(){
		return service.getAllEmpDetails();
	}
	
	@PostMapping("/add")
	public String addEmp(@RequestBody EmployeeModel employee) {
		return service.addEmpDetails(employee);
	}
	
	@PutMapping("/update/{id}")
	public String updateEmp(@PathVariable Long id, @RequestBody EmployeeModel employee) {
		return service.updateEmpDetails(id, employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmp(@PathVariable Long id) {
		return service.deleteEmpDetails(id);
	}
}
