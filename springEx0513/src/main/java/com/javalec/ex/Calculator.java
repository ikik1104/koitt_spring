package com.javalec.ex;

public class Calculator {
	//실행하는 메소드만 존재
	
	
	//더하기
	public void add(int f, int s) {
		System.out.println("addition");
		int result = f+s;
		System.out.println(f+"+"+s+"="+result);
	}
	
	//빼기
	public void sub(int f, int s) {
		System.out.println("subtraction");
		int result = f-s;
		System.out.println(f+"-"+s+"="+result);
	}
	
	//곱하기
	public void multi(int f, int s) {
		System.out.println("multiplication");
		int result = f*s;
		System.out.println(f+"*"+s+"="+result);
	}
	
	//나누기
	public void div(int f, int s) {
		System.out.println("division");
		int result = f/s;
		System.out.println(f+"/"+s+"="+result);
	}
	
	
}
