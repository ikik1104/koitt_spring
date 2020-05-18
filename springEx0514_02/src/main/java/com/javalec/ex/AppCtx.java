package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

	//1. appCTX.xml
	//2. <bean id="student" class="com.javalec.ex.Student" />
	//3. 	<Constructor-arg value="ȫ�浿" />
	//4. 	<property name="" value="" />

	@Bean
	public Student student1() {
		//constructor-arg �� ���� ���
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("����");
		hobbys.add("����");
		hobbys.add("����");
		
		Student student1 = new Student("ȫ�浿", 30, hobbys);
		student1.setHeight(175);
		student1.setWeight(65);
		
		return student1;
	}
	
	@Bean
	public Student student2() {
		//constructor-arg �� ���� ���
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("����");
		hobbys.add("�౸");
		hobbys.add("�߱�");
		
		Student student2 = new Student("������", 33, hobbys);
		student2.setHeight(184);
		student2.setWeight(75);
		
		return student2;
	}

}
