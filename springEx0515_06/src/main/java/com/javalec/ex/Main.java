package com.javalec.ex;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class Main {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources property = env.getPropertySources();
		
		try {
			property.addLast(new ResourcePropertySource("classpath:server.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext)ctx;
		ctx2.load("appCTX.xml");
		ctx2.refresh();
		ServerConn con =  ctx2.getBean("server",ServerConn.class);
		
		
		System.out.println("auth : "+con.getAuth());
		System.out.println("diverClassName : "+con.getDriverClassName());
		System.out.println("url : "+con.getUrl());
		System.out.println("username : "+con.getUsername());
		System.out.println("password : "+con.getPassword());
		System.out.println("name : "+con.getName());
		System.out.println("type : "+con.getType());
		System.out.println("maxActive : "+con.getMaxActive());
		System.out.println("maxWait : "+con.getMaxWait());
		
		ctx2.close();
		ctx.close();
		
	}
}
