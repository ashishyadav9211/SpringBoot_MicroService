package com.codingtest.deSerializable;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codingtest.model.Customer;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		SpringApplication.run(Application.class, args);
		File f = new File("src/main/resources/customer.json");

		ObjectMapper mapper = new ObjectMapper();
		Customer customerObj[] = mapper.readValue(f, Customer[].class);
		List.of(customerObj).forEach(System.out::println);
	}

}
