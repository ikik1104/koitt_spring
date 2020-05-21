package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LController {

	@RequestMapping("form")
	public String form (HttpServletRequest request, Model model) {
		
		return "form";
	}
	
	@PostMapping("/formOk")
	public String formOk(@ModelAttribute("stu") Student student) {
		
		return "formOk";
	}
	
	
	@RequestMapping("/checkOk")
	public String CheckOk(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("naver_id")) {
			model.addAttribute("id",id);
			model.addAttribute("pw",pw);
			return "loginOk";
		}else {
			return "loginFail";
		}
	}
	
	@RequestMapping("loginOk")
	public String loginOk() {
		return "loginOk";
	}
	
	@RequestMapping("loginFail")
	public String loginFail() {
		return "loginFail";
	}
	
}
