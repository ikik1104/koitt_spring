package com.javalec.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {

	
	public Object loggerAop(ProceedingJoinPoint point) throws Throwable {
		//시작시간
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy년 mm월 dd일 hh:mm:ss");
		String str = dayTime.format(new Date(time));
		System.out.println(str);
		
		try {
			return point.proceed();
		} finally {
			long endtime = System.currentTimeMillis(); 
			SimpleDateFormat dayTime2 = new SimpleDateFormat("yyyy년 mm월 dd일 hh:mm:ss");
			String str2 = dayTime2.format(new Date(endtime));
			System.out.println(str2);
		}

	}
	
}
