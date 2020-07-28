package com.javalec.ex.Command;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.ex.Dao.IDao;
import com.javalec.ex.Dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list",dao.list());
	}


}
