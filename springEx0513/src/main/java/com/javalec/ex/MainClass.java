package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml"; //여기에있는걸로 사용하겠다
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator myCal =  ctx.getBean("myCalculator",MyCalculator.class);
		
		myCal.add();
		myCal.sub();
		myCal.multi();
		myCal.div();
		
		/*
		//예전ver
		MyCalculator mycal = new MyCalculator();
		mycal.setCal(new Calculator()); // Calculator 객체 생성
		mycal.setFirstNum(10);
		mycal.setSecondNum(2);
		
		mycal.add();
		mycal.sub();
		mycal.multi();
		mycal.div();
		*/
	}
}
