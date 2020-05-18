package com.javalec.ex;

import java.util.ArrayList;

public class StuScore {

	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	public StuScore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StuScore(int num, int kor, int eng, int math) {
		super();
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3;
	}



	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}


	public void scoPrint() {
		
		System.out.println(kor+"/"+eng+"/"+math+"/"+total+"/"+avg);
		
	}
	
	
}
