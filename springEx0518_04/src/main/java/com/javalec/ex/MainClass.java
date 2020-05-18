package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		ServerInfo info = ctx.getBean("serverInfo",ServerInfo.class);
		
		System.out.println("auth :"+info.getAuth());
		System.out.println("DriverClassName :"+info.getDriverClassName());
		System.out.println("Url :"+info.getUrl());
		System.out.println("Username :"+info.getUsername());
		System.out.println("Password :"+info.getPassword());
		System.out.println("Name"+info.getName());
		System.out.println("Type :"+info.getType());
		System.out.println("MaxActive :"+info.getMaxActive());
		System.out.println("MaxWait :"+info.getMaxWait());
		
		ctx.close();
	}
}
