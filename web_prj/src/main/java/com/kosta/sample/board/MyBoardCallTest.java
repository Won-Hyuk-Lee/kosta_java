package com.kosta.sample.board;

import java.sql.SQLException;
import java.util.List;

public class MyBoardCallTest {

	public static void main(String[] args) throws SQLException {
		BoardDAO dao = new BoardDAO();

//		System.out.println(dao.boardReplySelect(2));

		BoardDAO bd = new BoardDAO();
		BoardVO bvo = bd.boardReplySelect(1);
		int seq = bvo.getSeq();
		String title = bvo.getTitle();
		System.out.println(seq + "\t" + title);
		List<ReplyVO> rlist = bvo.getReplies();

		for (ReplyVO ass : rlist) {
			System.out.print(ass.getRseq() + "  ");
			System.out.print(ass.getReply() + "\n");
		}
	}

}
