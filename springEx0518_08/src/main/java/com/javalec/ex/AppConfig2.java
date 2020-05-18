package com.javalec.ex;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("server")
public class AppConfig2 {

	public ServerInfo serverInfo () {
		ServerInfo info = new ServerInfo();
		info.setIpNum("211.208.107.1");
		info.setPortNum("8080");
		
		return info;
	}
}
