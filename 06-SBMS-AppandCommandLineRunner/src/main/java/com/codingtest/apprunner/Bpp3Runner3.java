package com.codingtest.apprunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("AppRnner")
public class Bpp3Runner3 implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {

		System.out.println("=====Running Applicaton3 Runner3====");
	}

	

}
