package com.javalec.ex;

public class Calculator {
	//�����ϴ� �޼ҵ常 ����
	
	
	//���ϱ�
	public void add(int f, int s) {
		System.out.println("addition");
		int result = f+s;
		System.out.println(f+"+"+s+"="+result);
	}
	
	//����
	public void sub(int f, int s) {
		System.out.println("subtraction");
		int result = f-s;
		System.out.println(f+"-"+s+"="+result);
	}
	
	//���ϱ�
	public void multi(int f, int s) {
		System.out.println("multiplication");
		int result = f*s;
		System.out.println(f+"*"+s+"="+result);
	}
	
	//������
	public void div(int f, int s) {
		System.out.println("division");
		int result = f/s;
		System.out.println(f+"/"+s+"="+result);
	}
	
	
}
