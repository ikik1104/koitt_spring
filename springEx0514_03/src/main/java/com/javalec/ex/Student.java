package com.javalec.ex;

public class Student {

	 int num;
	 String name;
	 int kor;
	 int eng;
	 int math;
	 int total;
	 double avg;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int num, String name, int kor, int eng, int math) {
		super();
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3;
	}
	
	
	
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void print() {
		System.out.println("�й� : "+getNum());
		System.out.println("�̸� : "+getName());
		System.out.println("�������� : "+getKor());
		System.out.println("�������� : "+getEng());
		System.out.println("�������� : "+getMath());
		System.out.println("�հ� : "+getTotal());
		System.out.println("��� : "+getAvg());
		System.out.println("-------------------------------");
	}
}
