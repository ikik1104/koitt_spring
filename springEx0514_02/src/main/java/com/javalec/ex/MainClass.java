package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		/*
	���� appCTX.xml�� ����� ��
	AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		 */
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println("�л� 1 �̸� : "+student1.getName());
		System.out.println("�л� 1 ���� : "+student1.getAge());
		System.out.println("�л� 1 ��� : "+student1.getHobbys());
		System.out.println("�л� 1 Ű : "+student1.getHeight());
		System.out.println("�л� 1 ������ : "+student1.getWeight());
		
	}

}
