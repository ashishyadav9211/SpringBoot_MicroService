package com.codingtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Ashish
 *         We have below 3 modes for Spring Boot Banner a)OFF b)LOG
 *         c)CONSOLE (default) OFF mode means banner will not be printed
 *         spring.main.banner-mode = OFF -> LOG mode means it will write banner
 *         to log file also -> Console is the default mode, it will print banner
 *         in console using system.out
 * 
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
