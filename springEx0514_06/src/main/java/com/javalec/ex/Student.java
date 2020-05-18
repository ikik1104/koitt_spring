package com.javalec.ex;

import java.util.ArrayList;

public class Student {

	int num;
	String name;
	String major;
	String address;
	String tel;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int num, String name, String major, String address, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.major = major;
		this.address = address;
		this.tel = tel;
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
	
	public void stuPrint() {
		System.out.print(num+"/"+name+"/"+"mojor"+"/"+address+"/");
	}
	
	
}
