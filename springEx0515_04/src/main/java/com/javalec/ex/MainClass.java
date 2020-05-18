package com.javalec.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext(); //ctx생성
		ConfigurableEnvironment env = ctx.getEnvironment(); //외부파일 형태를 일단 전부 넣는다.
		MutablePropertySources propertySource =  env.getPropertySources();
		//propertySource 여기안에는 모든 properties파일들이 들어가 있다.
		
		try {
			propertySource.addLast(new ResourcePropertySource("classpath:admin.properties"));
			//내가 만든 properties파일을 마지막에 추가한다.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx; //주소변경
		ctx2.load("classpath:appCTX.xml");
		ctx2.refresh(); //bean호출하기 전에 이미 set으로 값을 다 집어 넣어준다.
		AdminConnection adminConnection = ctx2.getBean("adminConnection",AdminConnection.class);
		
		System.out.println("아이디 : "+adminConnection.getAdminId());
		System.out.println("비밀번호 : "+adminConnection.getAdminPw());
		
		ctx2.close();
		ctx.close();
	
	}
}
