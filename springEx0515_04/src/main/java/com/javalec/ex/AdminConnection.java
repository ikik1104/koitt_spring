package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

//AdminConnection class가 호출되기전에 admin.properties를 집어 넣어놓은다 --> main에서
public class AdminConnection implements EnvironmentAware,InitializingBean,DisposableBean{
	//AdminConnection객체가 생성되자마자 값을 할당하고 싶다면
	//1. 외부에 파일을 만든다 ##.properties -> id,pw를 먼저 만들어 놓는다.
	private Environment env;
	private String adminId;
	private String adminPw;
	
	//----------------------------------------------------------------------------------
		//EnvironmentAware --> 외부파일의 집합체 (1.properties, admin.properties ... 등등)
		//admin시작전 실행해서 값을 할당
		public void setEnvironment(Environment env) { //main에서 이미 admin.properties가 담겨져 있다.
			//환경에 있는 것들을 가져 오겠따.
			System.out.println("setEnvironment 설정 됨");
			setEnv(env); //this.env에 메인에서 먼저 설정해준 애들을 넣어준다.
		}

		//Init() 객체생성시 실행
		public void afterPropertiesSet() throws Exception {
			System.out.println("객체 생성시 env에서 admin_id,admin_pw 값을 할당");
			setAdminId(env.getProperty("admin.id"));
			setAdminPw(env.getProperty("admin.pw"));
		}

		public void destroy() throws Exception {
			System.out.println("빈 객체 종료");
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
