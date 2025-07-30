package com.cg.Employee_Management_System26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Employee_Management_System26.entity.Employee;
import com.cg.Employee_Management_System26.repository.EmployeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeRepo repo;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> employee=repo.findAll();
		return employee;
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		Employee employee=repo.findById(id).get();
		return employee;
	}

	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	
	

}
