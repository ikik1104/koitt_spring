package com.javalec.ex;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.ex.Student;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		
		//�ΰ��� ���� ����.
		Student student1 = ctx.getBean("student",Student.class);
		Student student2 = ctx.getBean("student",Student.class);
		System.out.println("student1 �л��̸� : "+student1.getName());
		System.out.println("student1 �л����� : "+student1.getAge());
		
		System.out.println("----------------------------------------------------------");
		
		student2.setName("������");
		student2.setAge(30);
		System.out.println("student1 �л��̸� : "+student1.getName());
		System.out.println("student1 �л����� : "+student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("2���� ��ü�� �����ϴ�.");
		}else {
			System.out.println("2���� ��ü�� �ٸ��ϴ�.");
		}
		
		
	}
}
