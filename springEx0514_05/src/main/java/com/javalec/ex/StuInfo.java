package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StuInfo {
	ArrayList<Student> stuList = new ArrayList<Student>();
	ArrayList<StuScore> scoreList = new ArrayList<StuScore>();

	@Bean
	public Student student1() {
		
		Student stu1 = new Student(1001, "홍길동", "컴퓨터전공" , "서울시", "010-1111-1111");
		Student stu2 = new Student(1002, "김유신", "영문학전공" , "서울시", "010-1111-1111");
		Student stu3 = new Student(1003, "유관순", "국문학전공" , "서울시", "010-1111-1111");
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		
		stu3.setStuList(stuList);
		
		return stu3;
	}
	
	@Bean
	public StuScore stuScore() {
		
		StuScore stu1 = new StuScore(1003, 100, 50, 80);
		StuScore stu3 = new StuScore(1002, 70, 10, 60);
		StuScore stu2 = new StuScore(1001, 70, 100, 60);

		scoreList.add(stu1);
		scoreList.add(stu2);
		scoreList.add(stu3);
		
		stu2.setScoList(scoreList);
		
		return stu2;
	}
	
}
