package com.javalec.ex;

public class Worker {

	String name;
	int age;
	String job;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public void getWorker() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("직업 : "+job);
	}
	
	
}
