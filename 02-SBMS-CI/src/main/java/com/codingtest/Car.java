package com.codingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine eng;

	@Autowired // it is option while going for constructot injection
	public Car(Engine eng) {
		System.out.println("*** Car :: Constructor ****");
		this.eng = eng;
	}

	public void drive() {
		System.out.println("*** drive method called ***");
		if (eng.enggineStatus == 0)
			System.out.println(" *** Engine Started *****");
	}

}
