package com.nilanjan.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nilanjan.employeeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
