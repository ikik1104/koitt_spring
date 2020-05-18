package com.javalec.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
		} catch (Exception e) {
			
		}
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext)ctx;
		ctx2.load("appCTX.xml");
		ctx2.refresh(); //admin.id, admin.pw에 env에서 값을 주입
		AdminConnection con =  ctx2.getBean("adminConnection",AdminConnection.class);
		System.out.println("admin.Id = "+con.getAdminId());
		System.out.println("admin.pw = "+con.getAdminPw());
		
		ctx2.close();
		ctx.close();
		
	}
}
