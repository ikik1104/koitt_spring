package com.javalec.ex;

public class StudentInfo {

	Student student;
	
	public StudentInfo() {
		
	}
	
	//생성자
	public StudentInfo(Student student) {
		this.student = student;
	}

	//setter
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudntInfo() {
		if(student!=null) {
			System.out.println("학생 이름 : "+student.name);
			System.out.println("학생 나이 : "+student.age);
			System.out.println("학년 : "+student.gradeNum);
			System.out.println("학반 : "+student.classNum);
			System.out.println("-------------------------");
		}
	}
	
	
}
