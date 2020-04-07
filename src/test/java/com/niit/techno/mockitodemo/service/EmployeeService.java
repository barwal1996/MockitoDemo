package com.niit.techno.mockitodemo.service;

import java.util.List;

import com.niit.techno.mockitodemo.exceptions.MethodNotImplementedExceptions;
import com.niit.techno.mockitodemo.model.Employee;

public class EmployeeService {
	
	public List<String> getEmployeeFirstNames(List<Employee> employees){
		throw new MethodNotImplementedExceptions();
	}

}
