package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCTX {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("À¥Å÷");
		hobbys.add("°ÔÀÓ");
		hobbys.add("µ¶¼­");
		
		Student student1 = new Student("È«±æµ¿", 30, hobbys);
		student1.setHeight(180);
		student1.setWeight(70);
		
		return student1;
	}
}
