package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Medical_record implements InitializingBean,DisposableBean{

	int num;//ȸ����ȣ
	String day;//��¥
	String doctor;//����ǻ�
	String nurse;//��� ��ȣ��
	String care;//ġ�� - ��������
	String next;//�����湮����
	public Medical_record() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medical_record(int num, String day, String doctor, String nurse, String care, String next) {
		super();
		this.num = num;
		this.day = day;
		this.doctor = doctor;
		this.nurse = nurse;
		this.care = care;
		this.next = next;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getNurse() {
		return nurse;
	}
	public void setNurse(String nurse) {
		this.nurse = nurse;
	}
	public String getCare() {
		return care;
	}
	public void setCare(String care) {
		this.care = care;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Medical_recode destroy()");
		
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Medical_recode afterPropertiesSet()");
	}
	
	
	
}
