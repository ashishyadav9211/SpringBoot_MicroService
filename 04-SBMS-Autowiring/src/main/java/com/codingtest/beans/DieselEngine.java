package com.codingtest.beans;

import org.springframework.stereotype.Component;

@Component("de")
public class DieselEngine implements Engine {

	@Override
	public Integer start() {
		System.out.println("DieselEngine :: start() method called");
		return 0;
	}
}	