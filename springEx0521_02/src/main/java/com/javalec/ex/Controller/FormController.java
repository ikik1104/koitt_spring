package com.javalec.ex.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.StuValidator;
import com.javalec.ex.Dto.StuDto;

@RequestMapping
public class FormController {

	@RequestMapping("/form")
	public String form() {
		
		return "form";
	}
	
	@RequestMapping("/formOk")
	public String formOk(@ModelAttribute("stu")StuDto stuDto, BindingResult result) {
		
		String page = "formOk";
		StuValidator validator = new StuValidator();
		validator.validate(stuDto, result);
		
		if(result.hasErrors()) {
			page="form";
		}
		
		return "formOk";
	}
	
}
