package com.codingtest.controller;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codingtest.model.Employee;


@RestController
public class EmployeeController {

	@GetMapping(value = "/employee",
			produces = { "application/json", "application/xml" })
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		emp.setAccountdetails(Arrays.asList("SBI","HDFC","AXIS","INDUSLAND"));

		return emp;
	}

}
