package com.javalec.ex;

public class Score_process {

	
	public int total (int k, int e, int m) {
		int result = k+e+m;
		System.out.println("�հ� : "+result);
		return result;
	}
	
	public int avg (int total) {
		int result = total/3;
		System.out.println("��� : "+result);
		return result;
	}
	
	public void score(int avg) {

		if(avg>=90) {
			System.out.println("A����Դϴ�.");
		}else if(avg>=80 && avg<90) {
			System.out.println("B����Դϴ�.");
		}else if(avg>=70 && avg<80) {
			System.out.println("C����Դϴ�.");
		}else if(avg>=60 && avg<70) {
			System.out.println("D����Դϴ�.");
		}else if(avg<60) {
			System.out.println("F����Դϴ�.");
		}
		
	}
	
}
