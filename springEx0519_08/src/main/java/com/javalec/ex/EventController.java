package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {

	@RequestMapping(value = "event_list")
	public String eventList(HttpServletRequest request, Model model) {
		
		return "event_list";
	}
}
