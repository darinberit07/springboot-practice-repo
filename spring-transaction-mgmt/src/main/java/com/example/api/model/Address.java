package com.example.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADDRESS_DETAILS")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	private String empAddress;
	
	@OneToOne
	private Employee employee;
	
	public Address(){}

	public Address(Long empId, String empAddress, Employee employee) {
		this.addressId = empId;
		this.empAddress = empAddress;
		this.employee = employee;
	}

	public Long getEmpId() {
		return addressId;
	}

	public void setEmpId(Long empId) {
		this.addressId = empId;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
}
