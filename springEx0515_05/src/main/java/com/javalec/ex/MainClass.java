package com.javalec.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment(); //모든 외부파일 가져오기
		MutablePropertySources propertySource = env.getPropertySources();//properties들을 가져온다. ( 데이터 값을 하나 추가하기 위해서 ) 저장하는 공간? 을 가져온건가
		
		try {
 			propertySource.addLast(new ResourcePropertySource("classpath:admin.properties"));//마지막에 추가한다
 			//env에 잘 들어갔는지 확인
 			System.out.println(env.getProperty("admin.id"));
 			System.out.println(env.getProperty("admin.pw"));
 			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//genericXmlApplicationContext를 가져오지 못해서 형변환을 해준다.
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext)ctx;
		
		ctx2.load("appCTX.xml");
		ctx2.refresh(); //AdminConnection -> init메소드가 실행이 된다. (id,pw에 값이 할당된다.)
		
		//id,pw,env가 다 들어가있는 객체가 만들어진다.
		AdminConnection adminConnection = ctx2.getBean("adminConnection",AdminConnection.class);
		System.out.println("ID :"+adminConnection.getId());
		System.out.println("PW :"+adminConnection.getPw());
		
		ctx2.close();
		ctx.close();
		
		
	}
}
