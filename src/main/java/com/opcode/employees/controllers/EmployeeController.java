package com.opcode.employees.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opcode.employees.model.Employee;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee( @PathVariable("id") Integer id   ) {
				
		return null;
	}
}
