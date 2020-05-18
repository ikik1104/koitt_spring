package com.javalec.ex;

public class Temperature {

	String nav;
	int temp;
	Calculator cal;
	
	public void setNav(String nav) {
		this.nav = nav;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public void setCal(Calculator cal) {
		this.cal = cal;
	}
	
	public void calculator() {
		cal.cal(temp);
	}
	
}
