package com.javalec.ex.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(Model model) {
		  // key, value
		Map<String,Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request"); //key값을 넣으면 value값을 얻는다.
									// value의 리턴값을 Object여서 형변환을 해줘야 한다.
		String bid = request.getParameter("bId");
		BDao dao = new BDao();
		BDto dto = dao.contentView(bid);
		
		model.addAttribute("dto",dto);
		
	}

}
