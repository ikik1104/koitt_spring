package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StuInfo {

	
	ArrayList<Student> list;

	public StuInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StuInfo(ArrayList<Student> list) {
		super();
		this.list = list;
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	
	
	
}
