package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

	//1. appCTX.xml
	//2. <bean id="student" class="com.javalec.ex.Student" />
	//3. 	<Constructor-arg value="홍길동" />
	//4. 	<property name="" value="" />

	@Bean
	public Student student1() {
		//constructor-arg 와 같은 방식
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("웹툰");
		hobbys.add("게임");
		hobbys.add("독서");
		
		Student student1 = new Student("홍길동", 30, hobbys);
		student1.setHeight(175);
		student1.setWeight(65);
		
		return student1;
	}
	
	@Bean
	public Student student2() {
		//constructor-arg 와 같은 방식
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("축구");
		hobbys.add("야구");
		
		Student student2 = new Student("김유신", 33, hobbys);
		student2.setHeight(184);
		student2.setWeight(75);
		
		return student2;
	}

}
