package com.kosta.sample.board;

import java.sql.SQLException;

public class MyBoardCallTest {

	public static void main(String[] args) throws SQLException {
		BoardDAO dao = new BoardDAO();
		
		System.out.println(dao.boardSelect(3));
	}

}
