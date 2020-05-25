package com.javalec.ex;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class LoginValidator implements Validator{

	//검색 할 객체
	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginDto.class.isAssignableFrom(clazz);
	}

	//검증할 방법을 구현
	@Override
	public void validate(Object obj, Errors errors) {
		LoginDto loginDto = (LoginDto) obj;
/*		
  		if(loginDto.getId()==null || loginDto.getId().trim().isEmpty()) {
			errors.rejectValue("id", "아이디 공백에러");
		}  	
*/
		//위 if문과 같다.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, loginDto.getId(), "아이디 공백에러");
		
		
		
/*
		if(loginDto.getPw()==null || loginDto.getPw().trim().isEmpty()) {
			errors.rejectValue("pw", "패스워드 공백에러");
		}
*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, loginDto.getPw(), "패스워드 공백에러");
		
		
	}

}
