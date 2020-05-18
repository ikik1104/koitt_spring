package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String location = "classpath:application.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(location);
		Temperature temp =  ctx.getBean("temp",Temperature.class);
		
		System.out.println("±¹°¡¸í : "+temp.nav);
		System.out.println("¿Âµµ (¼·¾¾): "+temp.temp);
		
		temp.calculator();
		
		
	}
}
