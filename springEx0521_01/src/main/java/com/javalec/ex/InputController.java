package com.javalec.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InputController {

	@RequestMapping("input")
	public String input() {
		return "input";
	}
	
	@RequestMapping("inputOk")
	public String inputOk(@ModelAttribute("login") @Valid LoginDto loginDto,BindingResult result) {
		//유효성 검사를 해서 다시 input으로 돌려줄지 inputOk로 갈지 
		
		String page = "inputOk";
	
	/* 어노테이션을 이용하는 방법을 위해 주석처리
	 * 	
		LoginValidator validator = new LoginValidator();
		validator.validate(loginDto, result); 
		//검색할 데이터 , LoginValidator.java에서  유효성 검사를 마친 결과를 담는다?
	*/	
		if(result.hasErrors()) {// 에러가 담겨 있으면
			page="input"; //input페이지로 이동
			//에러가 없으면 inputOk
		}
		return page;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new LoginValidator());
	}
}
