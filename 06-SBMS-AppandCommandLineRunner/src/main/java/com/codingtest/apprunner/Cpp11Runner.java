package com.codingtest.apprunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class Cpp11Runner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("=====Running Applicaton Runner====");
	}

	

}
