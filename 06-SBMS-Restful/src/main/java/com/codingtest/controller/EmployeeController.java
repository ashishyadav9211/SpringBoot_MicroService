package com.codingtest.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingtest.entity.Employee;
import com.codingtest.model.EmployeeDto;
import com.codingtest.service.EmployeeService;


@RestController
public class EmployeeController {

	private static List<EmployeeDto> emplist=new ArrayList<>();
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/employee",
			produces = { "application/xml", "application/json" })
	public EmployeeDto firstPage() 
	{
		EmployeeDto emp = new EmployeeDto();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);
		return emp;
	}

	@PostMapping(value = "/saveorupdate_employees",produces = {"application/xml"},consumes = "application/json")
	public ResponseEntity<List<EmployeeDto>> saveOrUpdateEmployee(@RequestBody List<EmployeeDto> employees) 
	{
		System.out.println(employees);
		System.out.println("=========================================");
		 employeeService.saveOrUpdateEmployee(employees);
		ResponseEntity<List<EmployeeDto>> responseEntity=new ResponseEntity<>(HttpStatus.CREATED);
		return responseEntity;		
	}
	
}
