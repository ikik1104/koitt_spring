package com.javalec.ex;

public class BMICalculator {
	
	private double lowWeight; //��ü��
	private double normal; //����
	private double overWeigh; //��ü��
	private double obesity; //���

	
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setOverWeigh(double overWeigh) {
		this.overWeigh = overWeigh;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

	public void bmicalculation(double weight, double height) {
		double h = height *0.01;
		double result = weight/(h*h);//BMI����
		System.out.println("����� BMI���� : "+result);
		
		if(result >= obesity) {
			System.out.println("����Դϴ�.");
		}else if(result >= overWeigh && result < obesity) {
			System.out.println("��ü���Դϴ�.");
		}else if(result >= normal && result < overWeigh) {
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("��ü���Դϴ�.");
		}
	}

}
