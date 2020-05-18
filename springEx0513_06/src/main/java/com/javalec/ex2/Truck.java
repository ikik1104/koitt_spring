package com.javalec.ex2;
import com.javalec.ex2.Car;

public class Truck implements Car {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("시속 200km로 달립니다.");
	}

	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("느리게 멈춤니다.");

	}

	public void use() {
		System.out.println("- 짐을 옮길 수 있습니다.");
		System.out.println("- 덮개 기능도 있음");
	}

}
