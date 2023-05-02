package com.nilanjan.employeeapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilanjan.employeeapp.entity.Employee;
import com.nilanjan.employeeapp.repo.EmployeeRepo;
import com.nilanjan.employeeapp.response.EmployeeResponse;

@Service
public class EmployeeService {	
	
	@Autowired
	private EmployeeRepo EmployeeRepo;
	
	@Autowired
	private ModelMapper modelMapper; 
	
	
	public EmployeeResponse getEmployeeById(int id) {
		
		Employee employee = EmployeeRepo.findById(id).get();
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
			
		return employeeResponse;
		
	}
}
