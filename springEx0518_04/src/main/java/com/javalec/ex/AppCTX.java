package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePropertySource;

@Configuration
public class AppCTX {

	@Value("${auth}")
	private String auth;
	@Value("${driverClassName}")
	private String driverClassName;
	@Value("${url}")
	private String url;
	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;
	@Value("${name}")
	private String name;
	@Value("${type}")
	private String type;
	@Value("${maxActive}")
	private String maxActive;
	@Value("${maxWait}")
	private String maxWait;
	
	//AppCTX가 실행되기 전에 미리 넣어놔야한다.
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer(); //외부파일을 가져올 수 있는 객체 생성
		
		Resource[] location = new Resource[2]; //server1.properties, server2.properties
		location[0] = new ClassPathResource("server1.properties");
		location[1] = new ClassPathResource("server2.properties");
//		Resource location = new ClassPathResource("server.properties"); //한개의 properties만 사용 할 경우

		configurer.setLocations(location);
		
		return configurer;
	}
	
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setAuth(auth);
		serverInfo.setDriverClassName(driverClassName);
		serverInfo.setUrl(url);
		serverInfo.setUsername(username);
		serverInfo.setPassword(password);
		serverInfo.setName(name);
		serverInfo.setType(type);
		serverInfo.setMaxActive(maxActive);
		serverInfo.setMaxWait(maxWait);
		
		return serverInfo;
		
	}
	
	
}
