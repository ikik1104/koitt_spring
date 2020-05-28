package com.javalec.ex.Command;

import java.util.Map;

import org.springframework.ui.Model;

import com.javalec.ex.Dao.BDao;
import com.javalec.ex.Dto.BDto;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		BDto dto = (BDto)map.get("bDto");
		
		BDao dao = new BDao();
		dao.reply(dto);
		
		
	}

}
