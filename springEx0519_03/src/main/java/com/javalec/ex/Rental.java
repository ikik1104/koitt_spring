package com.javalec.ex;

public class Rental {

	int num;
	String name;
	String bname;
	String breturn;
	String tel;
	
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

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBreturn() {
		return breturn;
	}

	public void setBreturn(String breturn) {
		this.breturn = breturn;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void getRental() {
		System.out.println("회원번호 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("대여책 : "+bname);
		System.out.println("반납 :"+breturn);
		System.out.println("연락처 :"+tel);
	}
}
