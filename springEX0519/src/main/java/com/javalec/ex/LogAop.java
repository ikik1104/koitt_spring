package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.io.Resource;

public class LogAop {

	public Object loggerAop(ProceedingJoinPoint point) throws Throwable {
			//시작전 실행 명령
			System.out.println("메소드 시작시간 : "+System.currentTimeMillis());
		try {
			return point.proceed(); //실행메소드를 가지고 온다.
		} finally {
			//실행 후 실행명령
			System.out.println("메소드 종료시간 : "+System.currentTimeMillis());
		}
	}
	
	public void beforeAdvice() {
		System.out.println("(before) 메소드 시작시간 : "+System.currentTimeMillis());
	}
	
	public void afterAdvice() {
		System.out.println("(after) 메소드 시작시간 : "+System.currentTimeMillis());
	}
	
}
