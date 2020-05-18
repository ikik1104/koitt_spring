package com.javalec.ex;

public class MyCalculator {

	int firstNum;
	int secondNum;
	Calculator cal;
	
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	
	public void add() {
		cal.add(firstNum, secondNum);
	}
	
	public void sub() {
		cal.sub(firstNum, secondNum);
	}
	
	public void multi() {
		cal.multi(firstNum, secondNum);
	}
	
	public void div() {
		cal.div(firstNum, secondNum);
	}
}
