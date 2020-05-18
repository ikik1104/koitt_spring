package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

//AdminConnection class�� ȣ��Ǳ����� admin.properties�� ���� �־������ --> main����
public class AdminConnection implements EnvironmentAware,InitializingBean,DisposableBean{
	//AdminConnection��ü�� �������ڸ��� ���� �Ҵ��ϰ� �ʹٸ�
	//1. �ܺο� ������ ����� ##.properties -> id,pw�� ���� ����� ���´�.
	private Environment env;
	private String adminId;
	private String adminPw;
	
	//----------------------------------------------------------------------------------
		//EnvironmentAware --> �ܺ������� ����ü (1.properties, admin.properties ... ���)
		//admin������ �����ؼ� ���� �Ҵ�
		public void setEnvironment(Environment env) { //main���� �̹� admin.properties�� ����� �ִ�.
			//ȯ�濡 �ִ� �͵��� ���� ���ڵ�.
			System.out.println("setEnvironment ���� ��");
			setEnv(env); //this.env�� ���ο��� ���� �������� �ֵ��� �־��ش�.
		}

		//Init() ��ü������ ����
		public void afterPropertiesSet() throws Exception {
			System.out.println("��ü ������ env���� admin_id,admin_pw ���� �Ҵ�");
			setAdminId(env.getProperty("admin.id"));
			setAdminPw(env.getProperty("admin.pw"));
		}

		public void destroy() throws Exception {
			System.out.println("�� ��ü ����");
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
	
	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	
	
	public AdminConnection(String adminId, String adminPw) {
		super();
		this.adminId = adminId;
		this.adminPw = adminPw;
	}

	public AdminConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
