package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		StuInfo stuInfo = ctx.getBean("stuInfo",StuInfo.class);
		ArrayList<Student> list = stuInfo.getList();
		
		StuScore score = ctx.getBean("stuScore3",StuScore.class);

		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			if(score.num == stu.num) {
				System.out.println("<<  "+stu.name+" 학생 성적 출력 >>");
				System.out.print(stu.num+"/");
				System.out.print(stu.name+"/");
				System.out.print(stu.major+"/");
				System.out.print(stu.address+"/");
				System.out.print(stu.tel+"/");
				System.out.print(score.kor+"/");
				System.out.print(score.eng+"/");
				System.out.print(score.math+"/");
				System.out.print(score.total+"/");
				System.out.print(score.avg);
			}
		}
		
	}

}
