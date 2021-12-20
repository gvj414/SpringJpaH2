package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employee.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@GetMapping(value = "/GetEmployeeInfo/FName/{FName}", produces= {"application/json"})
	public Object getInfo(@PathVariable("FName") String FName) {
		return service.getinfo(FName);

	}

	@PostMapping(value = "/SaveEmployeeInfo", produces= {"application/json"})
	public Object Load(@RequestBody Employee bean) {
		return service.getEmployeeInfo(bean);

	}
	
	
}
