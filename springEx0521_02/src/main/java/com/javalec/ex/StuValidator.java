package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.Dto.StuDto;

public class StuValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return StuDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		StuDto stu = (StuDto)obj;
		
		if(stu.getName()==null || stu.getName().trim().isEmpty()) {
			errors.rejectValue("name", "공백에러");
		}
		
	}

}
