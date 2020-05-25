package com.javalec.ex.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.Dto.LoginDto;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return LoginDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {

		LoginDto login = (LoginDto)obj;
		
		if(login.getId()==null || login.getId().trim().isEmpty()) {
			errors.rejectValue("id", "아이디 공백에러");
		}
		
//		if(login.getPw()==null || login.getPw().trim().isEmpty()) {
//			errors.rejectValue("pw", "패스워드 공백에러");
//		}
		
		
	}

}
