package com.javalec.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX2.xml");
		Car car = ctx.getBean("car",Car.class);
		
		car.run();
		car.stop();
		car.use();
		
	}
}
