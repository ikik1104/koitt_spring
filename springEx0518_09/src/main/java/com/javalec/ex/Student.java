package com.javalec.ex;

public class Student {
	
	private String name; //이름
	private int age; //나이
	private int grade; //학년
	private int classNum; //반
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public Student(String name, int age, int grade, int classNum) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNum = classNum;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

//	메소드
	public void getStudentInfo() {
		System.out.println("학생이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("학년 : "+grade);
		System.out.println("반 : "+classNum);
		
	}
	
	
	

}
