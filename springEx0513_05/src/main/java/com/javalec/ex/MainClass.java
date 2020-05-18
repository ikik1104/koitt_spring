package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml"); //�� �����´�
		StudentInfo stuInfo = ctx.getBean("studentInfo",StudentInfo.class); //get Bean "studentInfo"�� �����´�.
		
		//�����ڸ� ���� ������ ���� -> ���
		stuInfo.getStudntInfo();
		
		//setter
		Student stu2 = ctx.getBean("student2",Student.class);
		stuInfo.setStudent(stu2);
		stuInfo.getStudntInfo();
		
		ctx.close();
		
	}

}
