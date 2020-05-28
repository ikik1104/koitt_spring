package com.javalec.ex.Controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Command.BCommand;
import com.javalec.ex.Command.BContentCommand;
import com.javalec.ex.Command.BDeleteCommand;
import com.javalec.ex.Command.BListCommand;
import com.javalec.ex.Command.BReplyCommand;
import com.javalec.ex.Command.BReplyViewCommand;
import com.javalec.ex.Command.BWriteCommand;
import com.javalec.ex.Dto.BDto;
import com.javalec.ex.Util.Constant;

@Controller
public class BController {

	BCommand bcom;
	public JdbcTemplate template;

	//셋팅
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
		
	
	
	//리스트 페이지
	@RequestMapping("list")
	public String list (Model model){
		bcom = new BListCommand();
		bcom.execute(model);
		return "list";
	}
	
	//뷰페이지
	@RequestMapping("contentView")
	public String contentView(HttpServletRequest request,Model model) {
		model.addAttribute("request",request);
		
		bcom = new BContentCommand();
		bcom.execute(model);
		return "content_view";
	}
	
	//입력폼으로
	@RequestMapping("write")
	public String write(Model model) {
		return "write_view";
	}
	
	//insert
	@RequestMapping("write_view")
	public String write_view(HttpServletRequest request,Model model) {
		model.addAttribute("request",request);
		bcom = new BWriteCommand();
		bcom.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		bcom = new BDeleteCommand();
		bcom.execute(model);
		
		return "redirect:list";
	}
	
	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		model.addAttribute("request",request);
		bcom = new BReplyViewCommand();
		bcom.execute(model);
		
		return "reply_view";
	}
	
	@RequestMapping("reply")
	public String reply(BDto bdto, Model model) {
		model.addAttribute("bDto",bdto);
		bcom = new BReplyCommand();
		bcom.execute(model);
		return "redirect:list";
	}
	
}
