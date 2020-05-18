package com.javalec.ex;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javalec.ex.Student;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		
		//두개는 서로 같다.
		Student student1 = ctx.getBean("student",Student.class);
		Student student2 = ctx.getBean("student",Student.class);
		System.out.println("student1 학생이름 : "+student1.getName());
		System.out.println("student1 학생나이 : "+student1.getAge());
		
		System.out.println("----------------------------------------------------------");
		
		student2.setName("김유신");
		student2.setAge(30);
		System.out.println("student1 학생이름 : "+student1.getName());
		System.out.println("student1 학생나이 : "+student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("2개의 객체는 같습니다.");
		}else {
			System.out.println("2개의 객체는 다름니다.");
		}
		
		
	}
}
