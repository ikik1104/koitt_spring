package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		String config1 = "classpath:appCTX.xml";
		String config2 = "classpath:appCTX2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config1,config2);
		
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println("�̸� : "+student1.getName());
		System.out.println("��� : "+student1.getHobbys());

		StudentInfo studentInfo = ctx.getBean("studentInfo",StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		System.out.println("Info�̸� : "+student2.getName());
		System.out.println("Info��� : "+student2.getHobbys());
		
		if(student1.equals(student2)) {
			System.out.println("1,2�� ���� ��ü�Դϴ�.");
		}else {
			System.out.println("1,2�� �ٸ� ��ü�Դϴ�.");
		}
		
		Student student3 = ctx.getBean("student",Student.class);
		if(student1.equals(student3)) {
			System.out.println("1,3�� ���� ��ü�Դϴ�.");
		}else {
			System.out.println("1,3�� �ٸ� ��ü�Դϴ�.");
		}
		
		System.out.println("student3�� �̸� : "+student3.getName());
		Family family = ctx.getBean("family",Family.class);
		System.out.println("�ƹ��� �̸� : "+family.getFatherName());
		System.out.println("��Ӵ� �̸� : "+family.getMotherName());
		System.out.println("���� �̸� : "+family.getSisterName());
		System.out.println("�� �̸� : "+family.getBrotherName());
		
		ctx.close();
		
	}

}
