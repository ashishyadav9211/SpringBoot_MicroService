package com.codingtest.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	/**
	 * 'required' attribute can hold true or false value. true is the default value. 
	 * That means depedent bean object is mandatory to create target bean object.
     * If we specify 'required' as false, even if dependent is not available target object will be created.
	 */
	
	// injecting the dependent bean using byname autowiring mechanism
	@Autowired(required = false)
	@Qualifier("de")
	private Engine eng;

	// injecting the dependent bean using bytype autowiring mechanism
//	@Autowired(required = false)
//	private Engine eng;

	public void drive() {
		Integer start = eng.start();

		if (start == 0) {
			System.out.println("Journey Started...........");
		}
	}
}