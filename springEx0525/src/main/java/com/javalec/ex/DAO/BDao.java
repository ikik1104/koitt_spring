package com.javalec.ex.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.DTO.BDto;
import com.javalec.ex.Util.Constant;

public class BDao {
	//jdbc template
	JdbcTemplate template;
	
	//생성자
	public BDao() {
		//datasSource 담겨있는 jdbcTemplate 객체
		template = Constant.template;
	}

	//리스트 불러오기
	public ArrayList<BDto> list(){
		String sql="select * from mvc_board order by bGroup desc";
		
		//기존리턴타입 : Object
		
		//받는 값이 여러개 이면 template.query
		return (ArrayList<BDto>)template.query(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}
	
	
	//상세보기
	public BDto contentView(String bId) {
		//조회수 1증가
		upHit(bId);
		
		String sql = "select * from mvc_board where bid="+bId;
		//받는 값이 한개이면 template.queryForObject
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}
	
	public void upHit(final String bId) {
		String sql = "update mvc_board set bHit = bHit+1 where bId=?";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
			}
		});
	}
}
