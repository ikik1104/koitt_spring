package com.javalec.ex;

public class Stu_score {

	int num; //�л���ȣ
	String name; //�̸�
	int kor; //��������
	int eng; //��������
	int math; //��������
	int total; //�հ�
	int avg; //���
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
