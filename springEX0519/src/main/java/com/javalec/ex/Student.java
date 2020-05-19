package com.javalec.ex;

public class Student {

	int stu_num;
	String stu_name;
	String major;
	String tel;
	String address;
	String email;
	
	
	public int getStu_num() {
		return stu_num;
	}
	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void getStudent() {
		System.out.println("학번 : "+stu_num);
		System.out.println("이름 : "+stu_name);
		System.out.println("학과 : "+major);
		System.out.println("번호 : "+tel);
		System.out.println("주소 : "+address);
		System.out.println("이메일 : "+email);
	}
	
}
