package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.model.Employee;
import com.example.api.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	public Employee getEmployee(Long empId) {
		return repository.findById(empId).get();
	}
	
	public List<Employee> getAllEmployee(){
		return repository.findAll();
	}
	
	public String saveEmployee(Employee employee) {
		repository.save(employee);
		return "Save Success!";
	}
	
	public String updateEmployee(Long empId, Employee employee) {
		Employee existingEmployee = repository.findById(empId).get();
        existingEmployee.setEmpName(employee.getEmpName());
		repository.save(existingEmployee);
		return "Update Success";
	}
	
	public String deleteEmployee(Long empId){
		repository.deleteById(empId);
		return "Delete Success";
	}
}
