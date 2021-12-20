package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.employee.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	Employee findByfirstName(String FName);
}
