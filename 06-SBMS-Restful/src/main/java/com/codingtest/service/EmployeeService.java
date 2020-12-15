package com.codingtest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingtest.entity.Account;

import com.codingtest.entity.Employee;
import com.codingtest.model.AccountDto;
import com.codingtest.model.EmployeeDto;
import com.codingtest.repository.AccountRepository;
import com.codingtest.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	AccountRepository accountRepository;

	@PersistenceContext
	private EntityManager entityManager;

	public void saveOrUpdateEmployee(List<EmployeeDto> employees) {
		
		System.out.println("================================="+entityManager);
		Set<Employee> empset = new HashSet<>();
		Account acc = new Account();
		employees.forEach(e -> {
			Employee emp = new Employee();
			e.getAccountdetails().forEach(ac -> {
				Account accnt = new Account();
				BeanUtils.copyProperties(ac, accnt);
				emp.getAccount().add(accnt);

			});
//			Set<Account> accset=new HashSet<>();
//			emp.setAccount(accset);
			BeanUtils.copyProperties(e, emp);
			empset.add(emp);
		});

		System.out.println("Empset  ::" + empset);
		List<Employee> saveAll = employeeRepository.saveAll(empset);
	}

//	private Set<Account> mapEmployeeToAccount(Set<Account> accset, Employee emp, EmployeeDto empdto) {
//		Set<AccountDto> accountdetails = empdto.getAccountdetails();
//		accountdetails.forEach(e1 -> {
//			Account acc = new Account();
//			BeanUtils.copyProperties(e1, acc);
//			acc.setEmployee(emp);
//			accset.add(acc);
//		});
//
//		return accset;
//	}
}
