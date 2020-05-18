package com.javalec.ex;

public class Stu_score {

	int num; //학생번호
	String name; //이름
	int kor; //국어점수
	int eng; //영어점수
	int math; //수학점수
	int total; //합계
	int avg; //평균
	Score_process pro;
	
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public void setPro(Score_process pro) {
		this.pro = pro;
	}
	
	
	public void total() {
		this.total = pro.total(kor, eng, math);
	}
	
	public void avg() {
		this.avg = pro.avg(total);
	}
	
	public void socre() {
		pro.score(avg);
	}
	
	
	
}
