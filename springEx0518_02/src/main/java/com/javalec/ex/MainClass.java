package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//xml에서 값을 다 주입했기 때문에 값을 따로 주입할 필요가 없다.
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();
		
		AdminConnection con = ctx.getBean("adminConnection",AdminConnection.class);
		
		System.out.println("AdminId = "+con.getAdminId());
		System.out.println("AdminPw = "+con.getAdminId());
		System.out.println("sub_AdminId = "+con.getSub_adminId());
		System.out.println("sub_AdminPw = "+con.getSub_adminPw());
		
		ctx.close();
	}
}
