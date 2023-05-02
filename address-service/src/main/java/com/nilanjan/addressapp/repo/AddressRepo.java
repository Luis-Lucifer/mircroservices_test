 package com.nilanjan.addressapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nilanjan.addressapp.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {
	
	
	 @Query(nativeQuery = true, value = "SELECT ea.id, ea.street, ea.landmark, ea.state, ea.zip FROM microservices.address ea join microservices.employee e on e.id = ea.employee_id where ea.employee_id = :employeeId;")
	 Address findAddressByEmployeeId(@Param("employeeId") int employeeId);

}
