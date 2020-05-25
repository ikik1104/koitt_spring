package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dto.MemberDto;

@Controller
public class JController {

	
	@RequestMapping("/join")
	public String join() {
		
		return "join";
	}
	
	@RequestMapping("/joinInsert")
	public String joinInsert(@ModelAttribute("dto") MemberDto memberDto, Model model) {
		
		return "joinOk";
	}
	
}
