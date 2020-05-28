package com.javalec.ex.Dao;

import java.util.ArrayList;

import com.javalec.ex.Dto.BDto;

public interface IDao {
	//구현부가 없다
	
	public ArrayList<BDto> list();
	public void write(final BDto dto);
	public void delete(final String bId);
	public BDto contentView(String BId);
	public void upHit(final String bId);
	public BDto reply_view(String bId);
	public void reply(final BDto dto);
}
