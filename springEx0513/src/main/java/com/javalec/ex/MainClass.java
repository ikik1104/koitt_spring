package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml"; //���⿡�ִ°ɷ� ����ϰڴ�
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator myCal =  ctx.getBean("myCalculator",MyCalculator.class);
		
		myCal.add();
		myCal.sub();
		myCal.multi();
		myCal.div();
		
		/*
		//����ver
		MyCalculator mycal = new MyCalculator();
		mycal.setCal(new Calculator()); // Calculator ��ü ����
		mycal.setFirstNum(10);
		mycal.setSecondNum(2);
		
		mycal.add();
		mycal.sub();
		mycal.multi();
		mycal.div();
		*/
	}
}
