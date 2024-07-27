package com.example.api.controller;


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

import com.example.api.model.Employee;
import com.example.api.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/get/{id}")
	public Employee getEmpById(@PathVariable Long id) {
		return service.getEmployee(id);
	}
	
	@GetMapping("/get/all")
	public List<Employee> getAllEmpDetails(){
		return service.getAllEmployee();
	}
	
	@PostMapping("/add")
	public String addEmp(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@PutMapping("/update/{id}")
	public String updateEmp(@PathVariable Long id, @RequestBody Employee employee) {
		return service.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmp(@PathVariable Long id) {
		return service.deleteEmployee(id);
	}
}
