package com.codingtest;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public int enggineStatus;

	public Engine() 
	{
		System.out.println("*** Engine Constructor Called ****");
	}
	
}
