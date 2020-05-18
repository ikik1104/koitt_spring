package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Student stu1 = ctx.getBean("student1",Student.class);
		stu1.print();
		
		Student stu2 = ctx.getBean("student2",Student.class);
		stu2.print();
		
	}
	
	
}
