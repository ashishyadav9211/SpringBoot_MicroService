package com.codingtest;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.codingtest.entity.CustomerEntity;
import com.codingtest.entity.Employee;
import com.codingtest.repository.CustomerDtlsRepository;
import com.codingtest.repository.EmployeeRespository;

@SpringBootApplication
public class Application {


	public static void main(String[] args) 
	{		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeRespository respository=context.getBean(EmployeeRespository.class);
		
		/**
		 *  saving all emmployee
		 */
//		Employee e1=new Employee(101,"Soni","aoni@gmail.com","Samastipurly");
//		Employee e2=new Employee(102,"toni","boni@gmail.com","Patna");
//		Employee e3=new Employee(103,"Aoni","coni@gmail.com","Mumbai");
//		List<Employee> emplist=List.of(e1,e2,e3);
//
//		System.out.println(respository.saveAll(emplist));
		
//		System.out.println(respository.save(emp));

//		List<Employee> empdtl=respository.findByEmpidAndEmpEmail(104,"moni@gmail.com");
//		empdtl.forEach(System.out::println);

//		save(T)
//		saveAll(Iterable<T>)
//
//		findById(Serializable id)
//		findAllById(Iterable<ID> ids)
//		findAll( )
//
//		delete(T entity)
//		deleteById(ID id)
//		deleteAllById(Iterable<ID> ids)
//		deleteAll( )
//
//		exists(ID id)
//		count( )
//
//		deleteById(Serializable id);
		
//----------------------------------------------------------------------------------------------
		CustomerDtlsRepository repository = context.getBean(CustomerDtlsRepository.class);
//
//		CustomerEntity entity = new CustomerEntity();
//		entity.setCustomerId(102);
//		entity.setCustomerName("JOhn");
//		entity.setCustomerEmail("john.p@gmail.com");
//
//		repository.save(entity);
//		
//		CustomerEntity entitys = repository.findByCustomerEmail("john.p@gmail.com");
//		
		//CustomerEntity entity = repository.findByCustomerName("Smith");
		
		//CustomerEntity entity  = repository.findByCustomerNameAndCustomerEmail("Smith", "smith@gmail.com");
		
	//	System.out.println(entitys);
		
//		List<String> names = repository.findCustomerNamesList();
//		System.out.println(names);

		/**
		 * Sorting Based on Name		
		 */
		
	//	repository.findAllNames(Sort.by("customerName").descending()).forEach(System.out::println);

		//repository.findAll(Sort.by("customerName").descending()).forEach(System.out::println);;
		/**
		 * PAGINATION EXAMPLES
		 */
				
//		int pageNo = 0; //pageNo starts from 0 (0 means fst page)
//		int pageSize = 1;
//		Page<CustomerEntity> page = repository.findAll(PageRequest.of(pageNo,pageSize));
//		
//		List<CustomerEntity> list = page.getContent();
//		list.forEach(entity -> {
//			System.out.println(entity);
//		});
		

		/**
		 *  QUERY BY EXAMPLES
		 * 	In this approch based on data available in entity class object 
		 *  query will be constructed.
		 */

		CustomerEntity entity = new CustomerEntity();
		entity.setCustomerName("Apple");
		entity.setCustomerId(190);
		Example<CustomerEntity> exmpl = Example.of(entity);
		
		List<CustomerEntity> list = repository.findAll(exmpl);
		list.forEach(each -> {
			System.out.println("::"+each);
		});
		context.close();
	}

}
