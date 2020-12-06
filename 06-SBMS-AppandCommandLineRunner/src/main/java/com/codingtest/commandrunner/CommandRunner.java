package com.codingtest.commandrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order
@DependsOn("AppRnner")
public class CommandRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("===Command Line Runner Examples ---------");
	}

}
