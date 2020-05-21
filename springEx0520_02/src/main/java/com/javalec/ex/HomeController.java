package com.javalec.ex;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/form")
	public String form() {
		
		return "join";
	}
	
	
	@RequestMapping(value="/joinOk", method = RequestMethod.POST)
	public String formOk(HttpServletRequest request, Model model) {
		
		System.out.println("post");
		
		model.addAttribute("num",request.getParameter("num"));
		model.addAttribute("name",request.getParameter("name"));
		model.addAttribute("address",request.getParameter("address"));
		model.addAttribute("tel",request.getParameter("tel"));
		model.addAttribute("birth",request.getParameter("birth"));
		
		return "joinOk";
	}
	
	@RequestMapping(value="/joinOk", method = RequestMethod.GET)
	public ModelAndView formOk(HttpServletRequest request) {
		System.out.println("get");
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("num",request.getParameter("num"));
		mv.addObject("name",request.getParameter("name"));
		mv.addObject("address",request.getParameter("address"));
		mv.addObject("tel",request.getParameter("tel"));
		mv.addObject("birth",request.getParameter("birth"));
		mv.setViewName("joinOk");
		
		return mv;
	}
	
	
}
