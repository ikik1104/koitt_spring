package com.javalec.ex.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Command.BCommand;
import com.javalec.ex.Command.BContentCommand;
import com.javalec.ex.Command.BListCommand;
import com.javalec.ex.Util.Constant;

@Controller
public class BController {
	BCommand bcom = null;

	//JDBC연결
	public JdbcTemplate template;
	
	@Autowired // 자동으로 servlet-context에 있는 db연결 정보가 set된다.
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
		/*
		 *   JDBC템플릿관련 모든 메소드가 Constant에 선언된 template에 담겨있다. 
		 *  (JDBCTemplate + bean:property 담김)
		 */
	}

	
	//링크연결
	@RequestMapping("list")
	public String list(Model model) {
		bcom = new BListCommand();
		bcom.execute(model);
		
		return "list";
	}
	
	@RequestMapping()
	public String contentView(HttpServletRequest request,Model model) {
		
		model.addAttribute("request",request);
		bcom = new BContentCommand();
		bcom.execute(model);
		return "content_view";
	}
	

}
