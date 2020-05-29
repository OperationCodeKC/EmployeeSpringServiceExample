package com.opcode.employees.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.opcode.employees.model.Employee;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {

	
	@XmlElement(name = "employee")
	private List<Employee> employees;
	
	public Employees() {
		
	}
	
	public Employees(List<Employee> employees) {
		super();
		this.employees = employees;
	}

	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
