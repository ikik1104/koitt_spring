package com.javalec.ex.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.ex.Student;

@Controller
public class JController {
	
	@RequestMapping("/main")
	public String main() {
		
		return "main";
	}

	@RequestMapping("/login")
	public String login() {
		
		return "/login";
	}
	
//	@RequestMapping("/loginOk")
//	public String loginOk(HttpServletRequest request,Model model) {
//		
//		model.addAttribute("id",request.getParameter("id"));
//		model.addAttribute("pw",request.getParameter("pw"));
//		
//		return "join/loginOk";
//	}
	
	@RequestMapping("/loginOk")
	public String loginOk(@RequestParam("id")String id, @RequestParam("pw")String pw,Model model) {
		
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		
		return "join/loginOk";
	}
	
	@RequestMapping("/join")
	public String join() {
		return "join/join";
	}
	
//	@RequestMapping("/joinOk")
//	public String joinOk(@RequestParam("num")String num,@RequestParam("name")String name,
//						@RequestParam("kor")String kor,@RequestParam("eng")String eng,
//						@RequestParam("math")String math,@RequestParam("total")String total,
//						@RequestParam("avg")String avg,Model model) {
//		
//		model.addAttribute("num",num);
//		model.addAttribute("name",name);
//		model.addAttribute("kor",kor);
//		model.addAttribute("eng",eng);
//		model.addAttribute("math",math);
//		model.addAttribute("total",total);
//		model.addAttribute("avg",avg);
//		
//		return "join/joinOk";
//	}
	
	@RequestMapping("/joinOk")
	public String joinOk(Student student) {
		
		
		
		return "join/joinOk";
	}
	
			
}
