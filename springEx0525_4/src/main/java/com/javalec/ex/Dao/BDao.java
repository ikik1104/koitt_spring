package com.javalec.ex.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.javalec.ex.Dto.BDto;
import com.javalec.ex.Util.Constant;

public class BDao {
	//사용
	JdbcTemplate template;

	public BDao() {
		template = Constant.template;
	}

	//전체리스트
	public ArrayList<BDto> list(){
		String sql = "select * from mvc_board";
		
		return (ArrayList<BDto>)template.query(sql,new BeanPropertyRowMapper<BDto>(BDto.class));
	}
	
	//상세보기
	public BDto contentView(String BId) {
		//조회수 증가 메소드
		upHit(BId);
		String sql = "select * from mvc_board where bid="+BId;
		
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	//조회수 증가
	private void upHit(final String bId) {
		String sql = "update mvc_board set bhit = bhit+1 where bid=?";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
			}
		});
	}

	//글 작성 
	public void write(final BDto dto) {
		
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql = "insert into mvc_board values(mvc_board_seq.nextval,?,?,?,sysdate,null,0,mvc_board_seq.currval,0,0)";
				PreparedStatement pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getBName());
				pstmt.setString(2, dto.getBTitle());
				pstmt.setString(3, dto.getBContent());
				
				return pstmt;
			}
		});
	}

	//게시글 삭제
	public void delete(final String bId) {
		String sql = "delete from mvc_board where bId=?";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(bId));
			}
		});
		
	}

	//답변 입력창으로
	public BDto reply_view(String bId) {
		String sql = "select * from mvc_board where bid="+bId;
		
		return template.queryForObject(sql, new BeanPropertyRowMapper<BDto>(BDto.class));
	}

	
	//답변달기
	public void reply(final BDto dto) {
		String sql = "insert into mvc_board values(mvc_board_seq.nextval,?,?,?,sysdate,null,0,?,?,?)";
		
		template.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, dto.getBName());
				ps.setString(2, dto.getBTitle());
				ps.setString(3, dto.getBContent());
				ps.setInt(4, dto.getBGroup());
				ps.setInt(5, dto.getBStep()+1);
				ps.setInt(6, dto.getBIndent()+1);
			}
		});
		
	}
	
	
}
