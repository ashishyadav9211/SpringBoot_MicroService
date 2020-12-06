package com.codingtest;

import java.lang.reflect.Field;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		Class<?> cls = Class.forName("com.codingtest.Car");
		Field fds = cls.getDeclaredField("price");
		fds.setAccessible(true);
		Object object = cls.newInstance();
		fds.set(object, 40);
		System.out.println(object);
	}

}
