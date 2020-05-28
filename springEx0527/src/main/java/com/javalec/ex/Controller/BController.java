package com.javalec.ex.Controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Dao.IDao;

@Controller
public class BController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("list")
	public String list(Model model) {
		IDao dao =  sqlSession.getMapper(IDao.class);
		model.addAttribute("list",dao.list());
		
		return "list";
	}
	
}
