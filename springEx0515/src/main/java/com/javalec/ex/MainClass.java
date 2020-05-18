package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh(); //init()
		
		Student student = ctx.getBean("student",Student.class);
		
		
		System.out.println("�̸� : "+student.getName());
		System.out.println("���� : "+student.getAge());
		
		ctx.close(); //disposableBean()
		
	}
}
 