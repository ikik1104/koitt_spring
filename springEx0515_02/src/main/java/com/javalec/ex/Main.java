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
			if(m.name.equals("유관순")) {
				System.out.println("회원번호 : "+m.num);
				System.out.println("이름 : "+m.name);
				System.out.println("성별 : "+m.gender);
				System.out.println("나이 : "+m.age);
				System.out.println("연락처 : "+m.tel);
				System.out.println("주소 : "+m.address);
				System.out.println("---");
				System.out.println("날짜 : "+recode.day);
				System.out.println("담당의사 : "+recode.doctor);
				System.out.println("담당간호사 : "+recode.nurse);
				System.out.println("치료 : "+recode.care);
				System.out.println("다음방문예약일 : "+recode.next);
				
			}
		}
		
		ctx.close();
		
	}

}
