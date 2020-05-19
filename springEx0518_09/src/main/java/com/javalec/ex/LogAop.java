package com.javalec.ex;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	//대행클래스 1번 메소드 (처음과 마지막에 실행되는 메소드)
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{ //프록시를 하나 만들어 줌
		
//		System.out.println("조인포인트 실행");
		long startTime = System.currentTimeMillis(); //시작하는 현재시간을 가져옴
		System.out.println(startTime); 
		
		try {
			return joinPoint.proceed(); //이제 현재 진행해야 하는 것을 시작 시켜라
		}finally {
			long endTime = System.currentTimeMillis(); //끝나는 현재 시간을 가져옴
			System.out.println(endTime);
			System.out.println("-----------------------");
		}
	}
	
	
	//처음에 시작되는 메소드
	public void beforeAdvice(Joinpoint joinpoint) {
		System.out.println("처음 실행되는 log");
		long startTime = System.currentTimeMillis(); //시작하는 현재시간을 가져옴
		System.out.println(startTime); 
	}
	
	//종료시 메소드
	public void afterAdvice() {
		System.out.println("마지막에 실행되는 log");
		long startTime = System.currentTimeMillis(); //종료하는 현재시간을 가져옴
		System.out.println(startTime); 
	}
	
}
