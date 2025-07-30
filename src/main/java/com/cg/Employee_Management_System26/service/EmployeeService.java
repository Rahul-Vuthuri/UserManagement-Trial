package com.cg.Employee_Management_System26.service;

import java.util.List;

import com.cg.Employee_Management_System26.entity.Employee;

public interface EmployeeService {
	public List<Employee>getAllEmployees();
	
	public Employee getEmployeeById(Long id);
	
	public void saveEmployee(Employee emp);
	
	public void deleteEmployee(Long id);

}
