package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String Location ="classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(Location);
		Stu_score stu =  ctx.getBean("stu",Stu_score.class);

		System.out.println("�й� :"+stu.num);
		System.out.println("�̸� :"+stu.name);
		System.out.println("�������� :"+stu.kor);
		System.out.println("�������� :"+stu.eng);
		System.out.println("�������� :"+stu.math);
//		System.out.println("�հ� :"+stu.total);
//		System.out.println("��� :"+stu.avg);
		
		stu.total();
		stu.avg();
		stu.socre();
	
	}
	
}
