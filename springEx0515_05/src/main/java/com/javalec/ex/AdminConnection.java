package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware,InitializingBean,DisposableBean{

	private Environment env;
	private String id;
	private String pw;

	//adminConnection Ŭ������ �����Ǳ� ���� 
	//impliments  �������̵� �޼ҵ�
	public void setEnvironment(Environment env) {
		System.out.println("AdminConnection env�� ���� ����");
		setEnv(env);
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("AdminConnection ����� init ���� �޼ҵ�");
		setId(env.getProperty("admin.id"));
		setPw(env.getProperty("admin.pw"));
	}
	
	
	public void destroy() throws Exception {
		System.out.println("AdminConnection ����� destroy ����");
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
