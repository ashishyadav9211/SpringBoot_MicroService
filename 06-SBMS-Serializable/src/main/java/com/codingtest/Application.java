package com.codingtest;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codingtest.model.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Application.class, args);
//		Customer c = new Customer();
//		c.setCustomerId(101);
//		c.setCustomerName("John");
//		c.setCustomerEmail("john.k@ibm.com");
//		
//		ObjectMapper mapper = new ObjectMapper();
//		String customerJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(c);
//		//String customerJson = mapper.writeValueAsString(c);
//		System.out.println(customerJson);
//		Customer obj=mapper.readValue(customerJson, Customer.class);
//		System.err.println(obj);
		File file=new File("src/main/resources/customer.json");
		ObjectMapper mapper=new ObjectMapper();
		Customer[] readValue = mapper.readValue(file, Customer[].class);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(readValue));
		
	}

}
