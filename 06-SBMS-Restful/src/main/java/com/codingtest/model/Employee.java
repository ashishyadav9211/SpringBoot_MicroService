package com.codingtest.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	@XmlElementWrapper(name = "accounts")
	@XmlElement(name = "account")
	public List<String> getAccountdetails() {
		return accountdetails;
	}

	public void setAccountdetails(List<String> accountdetails) {
		this.accountdetails = accountdetails;
	}

	private String empId;
	private String name;
	private String designation;
	private double salary;
	
	private List<String> accountdetails;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

}