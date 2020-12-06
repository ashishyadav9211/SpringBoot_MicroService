package com.codingtest.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Ashish 
 *         DataWriter component is responsible to write data to file
 *         DataReader component is responsible to read data from file Ex: To
 *         create DataReader object, first DataWriter object should be created.
 *         We can achieve this by using @DependsOn.
 */
@Component
@DependsOn("dw")
public class DataReader {

	public DataReader() {
		System.out.println("Logic to read data from file....");
	}
}