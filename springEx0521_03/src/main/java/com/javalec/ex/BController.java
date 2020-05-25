package com.javalec.ex;

import javax.validation.Valid;
import javax.xml.bind.Validator;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dto.BoardDto;
import com.javalec.ex.Dto.LoginDto;
import com.javalec.ex.Validator.LoginValidator;


@Controller
public class BController {

	@RequestMapping("login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("loginOk")
	public String loginOk(LoginDto loginDto,BindingResult result) {
		
		String page = "loginOk";
		
		LoginValidator val = new LoginValidator();
		val.validate(loginDto, result);
		
		if(result.hasErrors()) {
			page = "login";
		}
		
		return page;
	}

	@RequestMapping("board")
	public String board() {
		return "board";
	}
	
	@RequestMapping("boardOk")
	public String boardOk(@Valid BoardDto boardDto,BindingResult result ) {
		String page = "boardOk";

		if(result.hasErrors()) {
			page = "board";
		}
		
		return page;
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new LoginValidator());
	}
	
}
