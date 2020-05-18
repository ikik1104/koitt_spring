package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		String Location ="classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(Location);
		Stu_score stu =  ctx.getBean("stu",Stu_score.class);

		System.out.println("학번 :"+stu.num);
		System.out.println("이름 :"+stu.name);
		System.out.println("국어점수 :"+stu.kor);
		System.out.println("영어점수 :"+stu.eng);
		System.out.println("수학점수 :"+stu.math);
//		System.out.println("합계 :"+stu.total);
//		System.out.println("평균 :"+stu.avg);
		
		stu.total();
		stu.avg();
		stu.socre();
	
	}
	
}
