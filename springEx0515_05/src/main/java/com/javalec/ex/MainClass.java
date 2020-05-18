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
		ConfigurableEnvironment env = ctx.getEnvironment(); //��� �ܺ����� ��������
		MutablePropertySources propertySource = env.getPropertySources();//properties���� �����´�. ( ������ ���� �ϳ� �߰��ϱ� ���ؼ� ) �����ϴ� ����? �� �����°ǰ�
		
		try {
 			propertySource.addLast(new ResourcePropertySource("classpath:admin.properties"));//�������� �߰��Ѵ�
 			//env�� �� ������ Ȯ��
 			System.out.println(env.getProperty("admin.id"));
 			System.out.println(env.getProperty("admin.pw"));
 			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//genericXmlApplicationContext�� �������� ���ؼ� ����ȯ�� ���ش�.
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext)ctx;
		
		ctx2.load("appCTX.xml");
		ctx2.refresh(); //AdminConnection -> init�޼ҵ尡 ������ �ȴ�. (id,pw�� ���� �Ҵ�ȴ�.)
		
		//id,pw,env�� �� ���ִ� ��ü�� ���������.
		AdminConnection adminConnection = ctx2.getBean("adminConnection",AdminConnection.class);
		System.out.println("ID :"+adminConnection.getId());
		System.out.println("PW :"+adminConnection.getPw());
		
		ctx2.close();
		ctx.close();
		
		
	}
}
