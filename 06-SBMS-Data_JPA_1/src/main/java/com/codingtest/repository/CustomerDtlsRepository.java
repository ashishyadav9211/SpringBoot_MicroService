package com.codingtest.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codingtest.entity.CustomerEntity;

public interface CustomerDtlsRepository extends JpaRepository<CustomerEntity, Serializable> {

	public CustomerEntity findByCustomerEmail(String email);

	public CustomerEntity findByCustomerName(String name);

	public CustomerEntity findByCustomerNameAndCustomerEmail(String name, String email);

	@Query(value="select customerName from CustomerEntity")
	public List<String> findAllNames(Sort sort);

	@Query(value = "select * from customer_dtl",nativeQuery = true)
	public List<CustomerEntity> fetchAllCustomerDetaisl();
	
	@Query(value = "select customer_name from customer_dtls", nativeQuery = true)
	public List<String> findCustomerNamesList();


}