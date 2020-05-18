package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		Member_all all = ctx.getBean("member_all",Member_all.class);
		ArrayList<Member> list = all.getList();
		Medical_record recode = ctx.getBean("medical1",Medical_record.class);
		
		for (int i = 0; i < list.size(); i++) {
			Member m = list.get(i);
			if(m.name.equals("������")) {
				System.out.println("ȸ����ȣ : "+m.num);
				System.out.println("�̸� : "+m.name);
				System.out.println("���� : "+m.gender);
				System.out.println("���� : "+m.age);
				System.out.println("����ó : "+m.tel);
				System.out.println("�ּ� : "+m.address);
				System.out.println("---");
				System.out.println("��¥ : "+recode.day);
				System.out.println("����ǻ� : "+recode.doctor);
				System.out.println("��簣ȣ�� : "+recode.nurse);
				System.out.println("ġ�� : "+recode.care);
				System.out.println("�����湮������ : "+recode.next);
				
			}
		}
		
		ctx.close();
		
	}

}
