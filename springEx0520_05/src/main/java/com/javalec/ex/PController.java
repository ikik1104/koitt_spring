package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {

	// http:/localhost:8181/ex/student/~ 어떠한 데이터가 들어오든지 다 여기로 와라 
	@RequestMapping("student/{studentId}")
	public String pathViewOk(@PathVariable String studentId, Model model) {
		
		//그걸 담아서 옮겨라
		model.addAttribute("studentId",studentId);
		return "student/pathViewOk";
	}
	
}
