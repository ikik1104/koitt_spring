package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Member implements InitializingBean,DisposableBean{

	int num; //번호
	String name;//이름
	String gender;//성별
	int age;//나이
	String tel;//연락처
	String address;//주소
	String op_note;//수술기록 - 13년도 암수술
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Member(int num, String name, String gender, int age, String tel, String address, String op_note) {
		super();
		this.num = num;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tel = tel;
		this.address = address;
		this.op_note = op_note;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getOp_note() {
		return op_note;
	}
	public void setOp_note(String op_note) {
		this.op_note = op_note;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Member destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Member afterPropertiesSet()");
	}
	
	
	
}
