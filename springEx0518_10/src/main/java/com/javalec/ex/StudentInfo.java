package com.javalec.ex;

public class StudentInfo {

	private int num;
	private String name;
	private String major;
	private String address;
	private String tel;
	
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void getStudentInfo() {
		System.out.println("---------학생정보---------");
		System.out.println("학번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+major);
		System.out.println("주소 : "+address);
		System.out.println("전화번호 : "+tel);
	}
}
