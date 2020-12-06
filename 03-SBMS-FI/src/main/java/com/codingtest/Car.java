package com.codingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine eng;

	public void drive() {
		System.out.println("*** drive method called ***");
		if (eng.enggineStatus == 0)
			System.out.println(" *** Engine Started *****");
	}

}
