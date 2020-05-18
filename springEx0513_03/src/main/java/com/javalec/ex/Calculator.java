package com.javalec.ex;

public class Calculator {

	public void cal(double temp) {
		double result = temp * 9/5 + 32;
		System.out.println("( "+temp+" 를 화씨로 변경합니다. )");
		System.out.println("화씨 : "+result);
	}
}
