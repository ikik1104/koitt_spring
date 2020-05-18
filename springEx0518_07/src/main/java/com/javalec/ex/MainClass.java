package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String config="";
		
		System.out.println("1)window  2)tablet  3)mobile");
		switch (scan.nextInt()) {
		case 1:
			config="window";
			break;
		case 2:
			config="tablet";
			break;
		case 3:
			config="mobile";
			break;
		}
		scan.close();
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("appCTX1.xml","appCTX2.xml","appCTX3.xml");
		ctx.refresh();
		
		Server server = ctx.getBean("server",Server.class);
		System.out.println("브라우저 : "+server.getBrowser());
		System.out.println("IP : "+server.getIp());
		
		ctx.close();
		
		
	}
}
