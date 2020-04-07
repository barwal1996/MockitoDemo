package com.niit.techno.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.niit.techno.mockitodemo.model.Employee;
import com.niit.techno.mockitodemo.service.EmployeeService;

public class EmployeeUtilTest {
	
	@Test
	public void getAllEmployeeFirstNamesInUpperCase_employees_namesMustBeInUpperCase() {

		  Employee emp1 = new Employee(1, "Hari krishna", "Gurram", 12345, "India");
		  Employee emp2 = new Employee(2, "Kiran", "Kumnoor", 234556, "Germany");
		  Employee emp3 = new Employee(3, "Soumen", "Mondle", 56789, "India");
		  Employee emp4 = new Employee(4, "Sravya", "Guruju", 567890, "Japan");
		  Employee emp5 = new Employee(5, "Rachit", "Kumar", 123645, "India");

		  List<Employee> employees = new ArrayList<Employee>();
		  List<String> employeeNames = new ArrayList<String>();

		  employees.add(emp1);
		  employees.add(emp2);
		  employees.add(emp3);
		  employees.add(emp4);
		  employees.add(emp5);

		  employeeNames.add("Hari krishna");
		  employeeNames.add("Kiran");
		  employeeNames.add("Soumen");
		  employeeNames.add("Sravya");
		  employeeNames.add("Rachit");
		  
		  EmployeeService empService =mock(EmployeeService.class);
		  when(empService.getEmployeeFirstNames(employees)).thenReturn(employeeNames);
		  
		  EmployeeUtil empUtil = new EmployeeUtil(empService);
		  List<String>employeeFirstNames = empUtil.getAllEmployeeFirstNamesInUpperCase(employees);
		  
		  assertEquals(employeeFirstNames.size(),5);
		  assertEquals(employeeFirstNames.get(0),"Hari Krishna".toUpperCase());
		  assertEquals(employeeFirstNames.get(1),"Kiran".toUpperCase());

		  assertEquals(employeeFirstNames.get(2),"Soumen".toUpperCase());

		  assertEquals(employeeFirstNames.get(3),"Sravya".toUpperCase());
		  
		  assertEquals(employeeFirstNames.get(4),"Rachit".toUpperCase());
	  

}

	
}
