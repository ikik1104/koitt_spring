package com.javalec.ex;

import java.util.Scanner;

import javax.print.attribute.standard.Severity;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String config="";
		
			System.out.println("서버를 선택해주세요. 1) test-server  2)실제-server");
			switch (scan.nextInt()) {
			case 1:
				config="test";
				break;
			case 2:
				config="server";
				break;
			}
			scan.close();

			GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
			ctx.getEnvironment().setActiveProfiles(config); //얘네를 가져올거다.
			ctx.load("appCTX1.xml","appCTX2.xml");
			ctx.refresh();
			
			ServerInfo serverInfo = ctx.getBean("serverInfo",ServerInfo.class); //config를 넣어준다.
			System.out.println("서버 접속 완료");
			System.out.println("접속 IP : "+serverInfo.getIpNum());
			System.out.println("접속 Port :"+serverInfo.getPortNum());
			System.out.println("--------------------------------------");
			System.out.println("url : "+serverInfo.getIpNum()+":"+serverInfo.getPortNum());
			
			ctx.close();
			
	}
}
