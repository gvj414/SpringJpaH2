package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 SpringApplication.run(DemoApplication.class, args);
		/*
		 * ConfigurableApplicationContext configurableApplicationContext =
		 * SpringApplication.run(DemoApplication.class, args); EmployeeRepository
		 * employeeRepository =
		 * configurableApplicationContext.getBean(EmployeeRepository.class); Employee
		 * myEmployee = new Employee( "Alex", "John", "233 fremont rd", "phx", "AZ");
		 * employeeRepository.save(myEmployee);
		 */
	}

}
