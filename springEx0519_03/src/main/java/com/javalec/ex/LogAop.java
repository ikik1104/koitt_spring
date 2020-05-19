package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {

	@Pointcut("within(com.javalec.ex.*)")
	public void PointCut() {
		
	}
	
	@Around("PointCut()")
	public Object loggerAop(ProceedingJoinPoint point) throws Throwable{
			System.out.println("(around)시작 시간 :"+System.currentTimeMillis());
		try {
			return point.proceed();
		} finally {
			System.out.println("(around)종료시간 : "+System.currentTimeMillis());
			System.out.println("-----------------------------------");
		}
	}
	
	
	@Before("PointCut()")
	public void beforeAop() {
		System.out.println("(Before)시작시간 : "+System.currentTimeMillis());
	}
	
	
}
