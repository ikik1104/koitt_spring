package com.javalec.ex.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BController {

	@RequestMapping("board/form")
	public String form() {
		
		return "board/form";
	}
	
	@RequestMapping(value="board/formOk",method = RequestMethod.POST)
	public String formOk(HttpServletRequest request, Model model ) {
		System.out.println("post");
		model.addAttribute("id",request.getParameter("id"));
		model.addAttribute("pw",request.getParameter("pw"));
		
		return "board/formOk";
	}
	
	@RequestMapping(value="board/formOk",method = RequestMethod.GET)
	public ModelAndView formOk(HttpServletRequest request) {
		System.out.println("get");
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("id",request.getParameter("id"));
		mv.addObject("pw",request.getParameter("pw"));
		mv.setViewName("board/formOk");
		
		return mv;
	}
	
}
