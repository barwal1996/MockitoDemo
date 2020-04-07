package com.niit.techno.mockitodemo;

import java.util.ArrayList;
import java.util.List;

import com.niit.techno.mockitodemo.model.Employee;
import com.niit.techno.mockitodemo.service.EmployeeService;

public class EmployeeUtil {
	
	private EmployeeService empService;
	
	public EmployeeUtil(EmployeeService empService) {
		  this.empService = empService;
		 }
	
	public List<String> getAllEmployeeFirstNamesInUpperCase(List<Employee> employees) {
		  List<String> empNamesInLowerCase = empService.getEmployeeFirstNames(employees);
		  List<String> result = new ArrayList<String>(empNamesInLowerCase.size());

		  for (String name : empNamesInLowerCase) {
		   if (name == null) {
		    continue;
		   }

		   result.add(name.toUpperCase());
		  }

		  return result;
		 }


}