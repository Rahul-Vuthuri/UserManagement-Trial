package com.cg.Employee_Management_System26.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.Employee_Management_System26.entity.Employee;

@Repository
public interface EmployeRepo extends JpaRepository<Employee, Long> {
	

}
