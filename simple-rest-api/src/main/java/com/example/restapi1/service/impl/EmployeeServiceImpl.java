package com.example.restapi1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi1.model.EmployeeModel;
import com.example.restapi1.repository.EmployeeRepository;
import com.example.restapi1.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public EmployeeModel getEmpDetails(Long empId) {
		return repository.findById(empId).get();
	}

	@Override
	public List<EmployeeModel> getAllEmpDetails() {
		return repository.findAll();
	}

	@Override
	public String addEmpDetails(EmployeeModel employee) {
		repository.save(employee);
		return "Details Added Successfully";
	}

	@Override
	public String updateEmpDetails(Long empId, EmployeeModel employee) {
		EmployeeModel existingEmployee = repository.findById(empId).get();
        existingEmployee.setEmpName(employee.getEmpName());
        existingEmployee.setEmpDesignation(employee.getEmpDesignation());
		repository.save(existingEmployee);
		return "Details Updated Sucessfully";
	}

	@Override
	public String deleteEmpDetails(Long empId) {
		repository.deleteById(empId);
		return "Details deleted successfully";
	}

}
