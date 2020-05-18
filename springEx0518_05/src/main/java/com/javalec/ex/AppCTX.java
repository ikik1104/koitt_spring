package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class AppCTX {

	@Value("${line}")
	private String line;
	@Value("${statn_nm}")
	private String statn_nm;
	@Value("${adres}")
	private String adres;
	@Value("${rdnmadr}")
	private String rdnmadr;
	@Value("${telno}")
	private String telno;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer property() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource rs = new ClassPathResource("sub.properties");
		
		configurer.setLocation(rs);
		
		return configurer;
	}
	
	@Bean
	public Sub sub() {
		Sub sub = new Sub();
		sub.setLine(line);
		sub.setStatn_nm(statn_nm);
		sub.setAdres(adres);
		sub.setRdnmadr(rdnmadr);
		sub.setTelno(telno);
		
		return sub;
	}
	
	
}
