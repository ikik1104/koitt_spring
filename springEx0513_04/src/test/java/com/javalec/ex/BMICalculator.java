package com.javalec.ex;

public class BMICalculator {
	
	private double lowWeight; //저체중
	private double normal; //보통
	private double overWeigh; //과체중
	private double obesity; //고비만

	
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
		double result = weight/(h*h);//BMI지수
		System.out.println("당신의 BMI지수 : "+result);
		
		if(result >= obesity) {
			System.out.println("고비만입니다.");
		}else if(result >= overWeigh && result < obesity) {
			System.out.println("과체중입니다.");
		}else if(result >= normal && result < overWeigh) {
			System.out.println("보통입니다.");
		}else{
			System.out.println("저체중입니다.");
		}
	}

}
