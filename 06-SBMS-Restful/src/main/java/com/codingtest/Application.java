package com.codingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
/**
 * 
 * @author Ashish
 *
 *This is where content negotiation comes into picture. As name suggests it negotiates the response type based on the request. This content negotiation can be achieved in following ways-
Using Path Extension - In the request we specify the required response type using the extension like .json,.xml or .txt. This has the highest preference
Using url parameter - In the request we specify the required response type using the url parameter like format=xml or format=json. This has the second highest preference
Using Accept Headers - When making a request using HTTP we specify required response by setting the Accept header property. Its something like this
 */
@SpringBootApplication
@EnableJpaAuditing
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
