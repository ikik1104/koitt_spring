package com.javalec.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext(); //ctx����
		ConfigurableEnvironment env = ctx.getEnvironment(); //�ܺ����� ���¸� �ϴ� ���� �ִ´�.
		MutablePropertySources propertySource =  env.getPropertySources();
		//propertySource ����ȿ��� ��� properties���ϵ��� �� �ִ�.
		
		try {
			propertySource.addLast(new ResourcePropertySource("classpath:admin.properties"));
			//���� ���� properties������ �������� �߰��Ѵ�.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx; //�ּҺ���
		ctx2.load("classpath:appCTX.xml");
		ctx2.refresh(); //beanȣ���ϱ� ���� �̹� set���� ���� �� ���� �־��ش�.
		AdminConnection adminConnection = ctx2.getBean("adminConnection",AdminConnection.class);
		
		System.out.println("���̵� : "+adminConnection.getAdminId());
		System.out.println("��й�ȣ : "+adminConnection.getAdminPw());
		
		ctx2.close();
		ctx.close();
	
	}
}
