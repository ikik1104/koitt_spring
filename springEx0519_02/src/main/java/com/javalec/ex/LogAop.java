package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(com.javalec.ex.*)")
	private void pointcutMetuod() {
		
	}

//	@Around("whitin(com.javalec.ex.Student)")
	@Around("pointcutMetuod()")
	public Object loggerAop(ProceedingJoinPoint point) throws Throwable{
		System.out.println("------------------------------------------------");
			System.out.println("시작시간 : "+System.currentTimeMillis());
		try {
			return point.proceed();
		} finally {
			System.out.println("종료시간 : "+System.currentTimeMillis());
			System.out.println("------------------------------------------------");
		}
	}
	
//	@Before("whitin(com.javalec.ex.Worker)")	
	@Before("pointcutMetuod()")
	public void beforeAdvice() {
		System.out.println("------------------------------------------------");
		System.out.println("(brfore) 시작시간 : "+System.currentTimeMillis());
	}
	
	
//	@After("whitin(com.javalec.ex.Worker)")	
	@After("pointcutMetuod()")
	public void afterAdvice() {
		System.out.println("------------------------------------------------");
		System.out.println("(After) 종료시간 : "+System.currentTimeMillis());
	}
	
}
