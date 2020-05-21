package com.javalec.ex;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@RequestMapping("/main")
	public String main() {

		return "main";
	}
	

	@RequestMapping("/form1")
	public String form1() {

		return "form1";
	}
	
	@RequestMapping("/form2")
	public String form2() {
		
		return "form2";
	}
	
	@RequestMapping("/form3")
	public String form3() {
		
		return "form3";
	}
	
	
	@RequestMapping("/formOk1")
	public String formOk1(HttpServletRequest request, Model model) {
		
		model.addAttribute("num",request.getParameter("num"));
		model.addAttribute("title",request.getParameter("title"));
		model.addAttribute("content",request.getParameter("content"));
		model.addAttribute("date",request.getParameter("date"));
		model.addAttribute("group",request.getParameter("group"));
		model.addAttribute("step",request.getParameter("step"));
		model.addAttribute("indent",request.getParameter("indent"));
		
		return "formOk1";
	}
	
	@RequestMapping("/formOk2")
	public String formOk2(@RequestParam("num")int num, @RequestParam("title")String title,
						 @RequestParam("content")String content, @RequestParam("date")String date,
						 @RequestParam("group")int group, @RequestParam("step")int step,
						 @RequestParam("indent")int indent, Model model) {
		
		model.addAttribute("num",num);
		model.addAttribute("title",title);
		model.addAttribute("content",content);
		model.addAttribute("date",date);
		model.addAttribute("group",group);
		model.addAttribute("step",step);
		model.addAttribute("indent",indent);
		
		return "formOk2";
	}
	
	@RequestMapping("/formOk3")
	public String formOk3(Board board) {
		
		return "formOk3";
	}
	
	
	
}
