package com.example.restapi1.service;

import java.util.List;

import com.example.restapi1.model.EmployeeModel;

public interface EmployeeService {
	EmployeeModel getEmpDetails(Long empId);
	List<EmployeeModel> getAllEmpDetails();
	String addEmpDetails(EmployeeModel employee);
	String updateEmpDetails(Long empId, EmployeeModel employee);
	String deleteEmpDetails(Long empId);
}
