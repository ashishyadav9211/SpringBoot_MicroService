package com.codingtest.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@XmlRootElement
@Data
public class EmployeeDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2745090976364745628L;

	@XmlElementWrapper(name = "accounts")
	@XmlElement(name = "account")
	public List<AccountDto> getAccountdetails() {
		return account;
	}

	public void setAccountdetails(List<AccountDto> accountdetails) {
		this.account = accountdetails;
	}

	private String empId;
	private String name;
	private String designation;
	private double salary;
	private String email;
	
	private List<AccountDto> account;

	public EmployeeDto() {
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