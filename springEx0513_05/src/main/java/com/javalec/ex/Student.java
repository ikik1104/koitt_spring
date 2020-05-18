package com.javalec.ex;

public class Student {
	
	String name;
	String age;
	String gradeNum;
	String classNum;
	
	public Student(){
		
	}

	//»ý¼ºÀÚ
	public Student(String name, String age, String gradeNum, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
}
