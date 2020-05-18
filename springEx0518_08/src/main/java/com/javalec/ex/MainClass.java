package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String config="";
		Scanner scan = new Scanner(System.in);
		System.out.println("서버를 선택하세요. 1)test  2)server");
		
		switch (scan.nextInt()) {
		case 1:
			config="test";
			break;
		case 2:
			config="server";
			break;
		}
		scan.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config); //그 프로파일을 찾아준다.
		ctx.register(AppConfig1.class,AppConfig2.class);
		
		ctx.refresh();
		ServerInfo info =  ctx.getBean("serverInfo",ServerInfo.class);
		System.out.println("서버 IP : "+info.getIpNum());
		System.out.println("포트 : "+info.getPortNum());
		
		ctx.close();
	}
}
