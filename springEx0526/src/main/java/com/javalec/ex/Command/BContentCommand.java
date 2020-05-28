package com.javalec.ex.Command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;

import com.javalec.ex.Dao.BDao;
import com.javalec.ex.Dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		//model -> hasmap
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String id = request.getParameter("bId");
		
		BDao dao = new BDao();
		BDto dto = dao.contentView(id);
		model.addAttribute("content_view",dto);
	}

}
