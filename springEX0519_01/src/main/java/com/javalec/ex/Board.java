package com.javalec.ex;

public class Board {

	int num;
	String title;
	String content;
	String date;
	String name;
	
	
	
	public int getNum() {
		return num;
	}



	public void setNum(int num) {
		this.num = num;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void getBoard() {
		System.out.println("글번호 : "+num);
		System.out.println("글제목 : "+title);
		System.out.println("내용 : "+content);
		System.out.println("작성일 : "+date);
		System.out.println("작성자 : "+name);
	}
}
