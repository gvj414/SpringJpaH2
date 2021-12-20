package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.employee.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	EmployeeRepository repo;
	
	public Object getinfo(String fName) {
		return repo.findByfirstName(fName);

	}

	public Object getEmployeeInfo(Employee bean) {
		return repo.save(bean);

	}

}
