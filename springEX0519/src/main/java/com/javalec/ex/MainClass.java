package com.javalec.ex;

import javax.print.Doc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Student stu = ctx.getBean("student",Student.class);
		stu.getStudent();
		
		StudentScore score = ctx.getBean("studentScore",StudentScore.class);
		score.getStudentScore();
		
		DoctorRecode dr =  ctx.getBean("doctorRecode",DoctorRecode.class);
		dr.getDoctorRecode();
		
	}
}
