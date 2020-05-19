package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
				
		StudentInfo info = ctx.getBean("studentInfo",StudentInfo.class);
		info.getStudentInfo();
		
		BookLoan book = ctx.getBean("bookLoan",BookLoan.class);
		book.getBookLoan();
		
		StudentScore score = ctx.getBean("studentScore",StudentScore.class);
		score.getStudentScore();
		
		ctx.close();
		
	}
}
