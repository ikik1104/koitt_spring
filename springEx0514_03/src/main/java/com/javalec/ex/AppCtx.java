package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
public class AppCtx {

	@Bean
	public Student student1() {
		Student stu1 = new Student(1, "홍길동", 10, 30, 50);
		return stu1;
	}
	
	@Bean
	public Student student2() {
		Student stu2 = new Student(2, "이순신", 40, 50, 90);
		return stu2;
	}
	
}
