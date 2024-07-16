package com.example.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.api.model.Address;
import com.example.api.model.Employee;
import com.example.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private AddressService addressService;
	
	@Transactional
	public Employee saveEmployee(Employee employee) throws Exception{
		Employee savedEmployee = employeeRepository.save(employee);
		
		if(employee.getEmpName().isEmpty()) {
			throw new RuntimeException();
		}
		
		Address address = new Address();
		address.setEmpId(1L);
		address.setEmpAddress("Place");
		address.setEmployee(employee);
		addressService.addAddress(address);
		
		return savedEmployee;
		
	}
}
