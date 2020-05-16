package com.opcode.employees.controllers;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opcode.employees.model.Employee;
import com.opcode.employees.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeController {

	@Resource
	private EmployeeRepository employeeRepository;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees(@RequestParam(value = "last",required = false) String lastName){
		
		if(lastName != null) {
			return employeeRepository.findByLastName(lastName);
		}
		
		return employeeRepository.findAll();
	};
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee( @PathVariable("id") Integer id   ) {
				
		Optional<Employee> emp = employeeRepository.findById(id);
		
		return emp.orElse(null);
	}
	
	
}
