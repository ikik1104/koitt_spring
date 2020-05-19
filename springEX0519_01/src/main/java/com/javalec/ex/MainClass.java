package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Board board = ctx.getBean("board",Board.class);
//		board.getBoard();
		
		Event event = ctx.getBean("event",Event.class);
		event.getEvent();
		
		Join join = ctx.getBean("join",Join.class);
//		join.getJoin();
		
		ctx.close();
		
		
	}
}
