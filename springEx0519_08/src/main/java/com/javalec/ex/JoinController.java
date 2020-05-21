package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {

	@RequestMapping(value = "join")
	public String eventList(HttpServletRequest request, Model model) {
		
		return "join";
	}
}
