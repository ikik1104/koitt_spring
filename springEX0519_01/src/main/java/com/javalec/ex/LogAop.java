package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	
	public Object loggerAop(ProceedingJoinPoint point) throws Throwable{
		System.out.println("---------------------------------");	
		System.out.println("시작 시간 :"+System.currentTimeMillis());
		try {
			return point.proceed();
		} finally {
			System.out.println("종료 시간 :"+System.currentTimeMillis());
			System.out.println("---------------------------------");	
		}
	}
	
	public void beforeAop() {
		System.out.println("beforeAop 시작 시간 :"+System.currentTimeMillis());
		System.out.println("---------------------------------");	
	}
	
	public void afterAop() {
		System.out.println("---------------------------------");	
		System.out.println("afterAop 종료 시간 :"+System.currentTimeMillis());
	}
}
