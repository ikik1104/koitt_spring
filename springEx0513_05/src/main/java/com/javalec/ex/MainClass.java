package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml"); //다 가져온다
		StudentInfo stuInfo = ctx.getBean("studentInfo",StudentInfo.class); //get Bean "studentInfo"만 가져온다.
		
		//생성자를 통한 데이터 주입 -> 출력
		stuInfo.getStudntInfo();
		
		//setter
		Student stu2 = ctx.getBean("student2",Student.class);
		stuInfo.setStudent(stu2);
		stuInfo.getStudntInfo();
		
		ctx.close();
		
	}

}
