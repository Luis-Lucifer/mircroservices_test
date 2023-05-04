package com.nilanjan.addressapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilanjan.addressapp.entity.Address;
import com.nilanjan.addressapp.repo.AddressRepo;
import com.nilanjan.addressapp.response.AddressResponse;

@Service
public class AddressService {

	@Autowired
	private AddressRepo addressRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public AddressResponse findAddressByEmployeeId(int employeeId){
		
		Address address = addressRepo.findById(employeeId).get();
		AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
		
		return addressResponse; 
	}
}
