package com.codingtest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_tbl")
public class Employee {
	@Id
	private Integer empid;
	
	private String empName;
	
	private String empEmail;
	private String empState;

}
