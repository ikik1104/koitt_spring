package com.javalec.ex.Controller;


import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Command.BCommand;
import com.javalec.ex.Command.BListCommand;
import com.javalec.ex.Dao.IDao;
import com.javalec.ex.Dto.BDto;


@Controller
public class BController {

	@Autowired
	private SqlSession sqlSession;
	
	BCommand comm;
	
	
	@RequestMapping("list")
	public String list(Model model) {
		/*
		comm = new BListCommand();
		comm.execute(sqlSession, model);
		 */
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list",dao.list());
		return "list";
	}
	
	@RequestMapping("write_view")
	public String write_view(Model model) {
		return "write_view";
	}
	
	@RequestMapping("write")
	public String write(BDto dto, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.write(dto);
		return "redirect:list";
	}
	
	@RequestMapping("contentView")
	public String content_view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.upHit(request.getParameter("BId"));
		model.addAttribute("dto",dao.contentView(request.getParameter("BId")));
		return "content_view";
	}
	
	@RequestMapping("modify_view")
	public String modify_view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		
		model.addAttribute("modify_view",dao.contentView(request.getParameter("BId")));
		
		return "modify_view";
	}
	
	@RequestMapping("modify")
	public String modify(BDto dto, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		
		dao.modify(dto);
		
		return "redirect:contentView?BId="+dto.getBId();
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.delete(request.getParameter("bId"));
		return "redirect:list";
	}
	
	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request,Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("reply_view",dao.contentView(request.getParameter("BId")));	
		return "reply_view";
	}
	
	@RequestMapping("reply")
	public String reply(BDto dto) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.reply_shape(dto);
		dao.reply(dto);
		return "redirect:list";
	}
	
	
}
