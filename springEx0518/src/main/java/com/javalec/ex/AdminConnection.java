package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements DisposableBean, InitializingBean, EnvironmentAware {

	private Environment env;
	private String adminId;
	private String adminPw;
	

	//Ŭ���� ���� �� env�� ȣ��
	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment()");
		setEnv(env); //env��ü�� this.env������ �Է�
	}

	// AdminConnection class�� ���� �� �� ����
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}

	// xml���� bean��ü�� �Ҹ� �� �� ����
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

	
	//setter/getter
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
}
