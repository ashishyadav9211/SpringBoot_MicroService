package com.codingtest.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codingtest.entity.Employee;

public interface EmployeeRespository extends JpaRepository<Employee,Serializable>{

	public List<Employee> findByEmpidAndEmpEmail(Integer id, String email);

	

}
