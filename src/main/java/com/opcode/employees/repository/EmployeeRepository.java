package com.opcode.employees.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opcode.employees.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findByLastName(String lastname);
	
}
