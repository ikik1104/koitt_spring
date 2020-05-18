package com.javalec.ex;

public class Family {

	private String fatherName;
	private String motherName;
	private String sisterName;
	private String brotherName;
	
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Family(String fatherName, String motherName, String sisterName, String brotherName) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.sisterName = sisterName;
		this.brotherName = brotherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getSisterName() {
		return sisterName;
	}

	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

	public String getBrotherName() {
		return brotherName;
	}

	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}
	
	
	
	
}
