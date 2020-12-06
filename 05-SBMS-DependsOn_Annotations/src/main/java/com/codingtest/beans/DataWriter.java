package com.codingtest.beans;

import org.springframework.stereotype.Component;

@Component("dw")
public class DataWriter {

	public DataWriter() {
		System.out.println("Logic to write data to file....");
	}

}