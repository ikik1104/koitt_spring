package com.javalec.ex;

public class Student {

	int num;
	String name;
	String gradeNum;
	String classNum;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	public void getStudent() {
		System.out.println("학번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("학년"+gradeNum);
		System.out.println("반"+classNum);
	}
	
	
}
