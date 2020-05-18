package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		Sub sub = ctx.getBean("sub",Sub.class);
		System.out.println("Line"+sub.getLine());
		System.out.println("Statn_nm"+sub.getStatn_nm());
		System.out.println("Adres"+sub.getAdres());
		System.out.println("Rdnmadr"+sub.getRdnmadr());
		System.out.println("Telno"+sub.getTelno());
		ctx.close();
		System.out.println("----------------------------------");
		
		GenericXmlApplicationContext ctx2 = new GenericXmlApplicationContext();
		ctx2.load("appCTX.xml");
		ctx2.refresh();
		Sub sub2 = ctx2.getBean("sub",Sub.class);
		
		System.out.println("Line"+sub2.getLine());
		System.out.println("Statn_nm"+sub2.getStatn_nm());
		System.out.println("Adres"+sub2.getAdres());
		System.out.println("Rdnmadr"+sub2.getRdnmadr());
		System.out.println("Telno"+sub2.getTelno());
		
	}
}
