package com.codingtest.apprunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(1)
public class App2Runner2 implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("=====Running Applicaton2 Runner2====");
	}

	

}
