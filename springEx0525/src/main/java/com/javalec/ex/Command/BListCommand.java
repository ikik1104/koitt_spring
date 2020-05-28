package com.javalec.ex.Command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {

		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list",dtos);
		
	}

}
