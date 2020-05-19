package com.javalec.ex;

public class DoctorRecode {

	int mem_num;
	String mem_name;
	String doctor;
	String date;
	public int getMem_num() {
		return mem_num;
	}
	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public void getDoctorRecode() {
		System.out.println("----------- 환자 정보 ----------");
		System.out.println("환자번호 : "+mem_num);
		System.out.println("이름 : "+mem_name);
		System.out.println("담당의 : "+doctor);
		System.out.println("날짜 : "+date);
	}
	
}
