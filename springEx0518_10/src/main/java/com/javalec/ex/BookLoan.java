package com.javalec.ex;

public class BookLoan {

	private int num;
	private String b_num;
	private String b_name;
	private String b_type;
	private String loan_date;
	private String due_date;
	private String overdue_date;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getB_num() {
		return b_num;
	}

	public void setB_num(String b_num) {
		this.b_num = b_num;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_type() {
		return b_type;
	}

	public void setB_type(String b_type) {
		this.b_type = b_type;
	}

	public String getLoan_date() {
		return loan_date;
	}

	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}

	public String getDue_date() {
		return due_date;
	}

	public void setDue_date(String due_date) {
		this.due_date = due_date;
	}

	public String getOverdue_date() {
		return overdue_date;
	}

	public void setOverdue_date(String overdue_date) {
		this.overdue_date = overdue_date;
	}

	public void getBookLoan() {
		System.out.println("---------대여 정보---------");
		System.out.println("학번 : "+num);
		System.out.println("도서번호 : "+b_num);
		System.out.println("도서제목 : "+b_name);
		System.out.println("분류 : "+b_type);
		System.out.println("대출일 : "+loan_date);
		System.out.println("반납일 : "+due_date);
		System.out.println("연체일 : "+overdue_date);
	}
	
}
