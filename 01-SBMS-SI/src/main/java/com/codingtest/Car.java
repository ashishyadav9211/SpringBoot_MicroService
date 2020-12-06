package com.codingtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private Engine eng;
	
	public Car() {
	System.out.println("*** Car :: Constructor ****");
	}

	@Autowired
	public void setEng(Engine eng) {
		System.out.println("*** Setter method Called ****");
		this.eng = eng;
	}

	
	public void drive() 
	{
		System.out.println("*** drive method called ***");
		if(eng.enggineStatus==0)
			System.out.println(" *** Engine Started *****");
	}
	
}
