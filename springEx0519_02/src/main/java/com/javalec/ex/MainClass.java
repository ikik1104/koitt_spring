package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Student stu =  ctx.getBean("student",Student.class);
		stu.getStudent();
		
		Worker worker = ctx.getBean("worker",Worker.class);
		worker.getWorker();
		
		
	}
}
