package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();
		
		Server server = ctx.getBean("server",Server.class);
		
		System.out.println("auth : "+server.getAuth());
		System.out.println("driverClassName : "+server.getDriverClassName());
		System.out.println("url : "+server.getUrl());
		System.out.println("username : "+server.getUsername());
		System.out.println("password : "+server.getPassword());
		
		System.out.println("name : "+server.getName());
		System.out.println("type : "+server.getType());
		System.out.println("maxActive : "+server.getMaxActive());
		System.out.println("maxWait : "+server.getMaxWait());
		
		ctx.close();
	}
	
}
