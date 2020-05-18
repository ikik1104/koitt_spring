package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware,InitializingBean,DisposableBean{

	private Environment env;
	private String id;
	private String pw;

	//adminConnection 클래스가 생성되기 전에 
	//impliments  오버라이딩 메소드
	public void setEnvironment(Environment env) {
		System.out.println("AdminConnection env에 값을 설정");
		setEnv(env);
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("AdminConnection 실행시 init 실행 메소드");
		setId(env.getProperty("admin.id"));
		setPw(env.getProperty("admin.pw"));
	}
	
	
	public void destroy() throws Exception {
		System.out.println("AdminConnection 종료시 destroy 실행");
	}
	
	
	public void setEnv(Environment env) {
		this.env = env;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Environment getEnv() {
		return env;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}

	
	
	


	
}
