package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(StuInfo.class);
		Student stu = ctx.getBean("student1",Student.class);
		StuScore score = ctx.getBean("stuScore",StuScore.class);
		
		for (int i = 0; i < stu.stuList.size(); i++) {
			Student student = stu.stuList.get(i);
			
			for (int j = 0; j < score.scoList.size(); j++) {
				StuScore stuscore = score.scoList.get(j);
				if(student.num == stuscore.num) {
					student.stuPrint();
					stuscore.scoPrint();
				}
			}
			
			
		}
		
	}
}
