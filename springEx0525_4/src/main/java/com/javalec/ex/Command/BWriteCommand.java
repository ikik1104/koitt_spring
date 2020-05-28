package com.javalec.ex.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.Dao.BDao;
import com.javalec.ex.Dto.BDto;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String bname = request.getParameter("bName");
		String btitle = request.getParameter("bTitle");
		String bcontent = request.getParameter("bContent");
		
		BDao dao = new BDao();
		BDto dto = new BDto(0, bname, btitle, bcontent, null, 0, 0, 0, 0);
		dao.write(dto);
		
	}

}
