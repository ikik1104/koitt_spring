package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping(value = "event/eventList")
	public String eventList(HttpServletRequest request, Model model) {		
		
		String contextPath = request.getContextPath();
		String id ="admin";
		model.addAttribute("id",id);
		
		return "event/eventList";
	}
	
}
