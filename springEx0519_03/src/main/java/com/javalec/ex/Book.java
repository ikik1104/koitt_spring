package com.javalec.ex;

public class Book {

	int bnum;
	String bname;
	String btype;
	String bwriter;

	
	
	public int getBnum() {
		return bnum;
	}



	public void setBnum(int bnum) {
		this.bnum = bnum;
	}



	public String getBname() {
		return bname;
	}



	public void setBname(String bname) {
		this.bname = bname;
	}



	public String getBtype() {
		return btype;
	}



	public void setBtype(String btype) {
		this.btype = btype;
	}



	public String getBwriter() {
		return bwriter;
	}



	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}



	public void getBook() {
		System.out.println("책 번호 :"+bnum);
		System.out.println("책이름 : "+bname);
		System.out.println("분류 : "+btype);
		System.out.println("저자 : "+bwriter);
		
	}
}
