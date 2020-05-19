package com.javalec.ex;

public class Join {

	int num;
	String id;
	String pw;
	String name;
	String date;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void getJoin() {
		System.out.println("회원번호 : "+num);
		System.out.println("아이디 : "+id);
		System.out.println("비밀번호 : "+pw);
		System.out.println("이름 : "+name);
		System.out.println("가입일 : "+date);
	}
	
}
