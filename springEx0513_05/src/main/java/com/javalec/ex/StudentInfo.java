package com.javalec.ex;

public class StudentInfo {

	Student student;
	
	public StudentInfo() {
		
	}
	
	//������
	public StudentInfo(Student student) {
		this.student = student;
	}

	//setter
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void getStudntInfo() {
		if(student!=null) {
			System.out.println("�л� �̸� : "+student.name);
			System.out.println("�л� ���� : "+student.age);
			System.out.println("�г� : "+student.gradeNum);
			System.out.println("�й� : "+student.classNum);
			System.out.println("-------------------------");
		}
	}
	
	
}
