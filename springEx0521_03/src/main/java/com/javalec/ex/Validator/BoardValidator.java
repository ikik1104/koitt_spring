package com.javalec.ex.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.Dto.BoardDto;

public class BoardValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		return BoardDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {

		BoardDto board = (BoardDto)obj;
		
		if(board.getName()==null || board.getName().trim().isEmpty()) {
			errors.rejectValue("id", "아이디 공백에러");
		}
		
		if(board.getTitle()==null || board.getTitle().trim().isEmpty()) {
			errors.rejectValue("pw", "패스워드 공백에러");
		}
		
		
	}

}
