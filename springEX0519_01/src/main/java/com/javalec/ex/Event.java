package com.javalec.ex;

public class Event {

	int num;
	String title;
	String start_day;
	String end_day;
	
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

	public String getStart_day() {
		return start_day;
	}

	public void setStart_day(String start_day) {
		this.start_day = start_day;
	}

	public String getEnd_day() {
		return end_day;
	}

	public void setEnd_day(String end_day) {
		this.end_day = end_day;
	}

	public void getEvent() {
		System.out.println("번호 : "+num);
		System.out.println("제목 : "+title);
		System.out.println("시작일 : "+start_day);
		System.out.println("종료일 : "+end_day);
	}
	
}
