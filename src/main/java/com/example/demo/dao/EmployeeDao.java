package com.example.demo.dao;

import org.springframework.stereotype.Component;

import com.example.demo.employee.Employee;

@Component
public interface EmployeeDao {
	Employee save(Employee bean);

	Employee findAll(Employee bean);

}
