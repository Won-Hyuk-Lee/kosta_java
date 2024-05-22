package com.kosta.sample.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.kosta.sample.common.MyOracleConnection;

public class BoardDAO {
	
	//보드와 해당하는 리플 같이 가져오겠다
	public BoardVO boardReplySelect(int seq) {
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    DataSource ds = null;
	    MyOracleConnection moc = new MyOracleConnection();
	    BoardVO bvo = null;
	    ReplyVO rvo = null;
	    
	    try {
	    	ds = moc.myOracleDataSource();
			conn = ds.getConnection();
			String sql = "select b.seq, b.title, b.regid, b.regdate, r.rseq , r.reply, r.regid as rregid, r.regdate as rregdate from board b, reply r where b.seq= ? and b.seq = r.seq(+) order by r.seq desc";
			//String sql = "select * from board where seq = ?";
			pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, seq);
	        rs = pstmt.executeQuery();
	        ArrayList<ReplyVO> replyList = new ArrayList();
	        
	        while (rs.next()) {
	            bvo = new BoardVO();
	            rvo = new ReplyVO();
	            bvo.setSeq(rs.getInt("seq"));
	            bvo.setTitle(rs.getString("title"));
	            //bvo.setContents(rs.getString("contents"));
	            bvo.setRegid(rs.getString("regid"));
	            bvo.setRegdate(rs.getString("regdate"));
	            rvo.setRseq(rs.getInt("rseq"));
	            rvo.setReply(rs.getString("reply"));
	            rvo.setRegid(rs.getString("regid"));
	            rvo.setRegdate(rs.getString("regdate"));
	            //rvo.setSeq(rs.getInt("seq"));
	            replyList.add(rvo);
	        }
	        bvo.setReplies(replyList);
	        
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return bvo;
	}
	
	//한건만
	public BoardVO boardSelect(int seq) {
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    DataSource ds = null;
	    MyOracleConnection moc = new MyOracleConnection();
	    BoardVO bvo = null;
	    
	    try {
	        ds = moc.myOracleDataSource();
	        conn = ds.getConnection();
	        String sql = "select * from board where seq = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, seq); // seq는 int형이므로 setInt 사용
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            bvo = new BoardVO();
	            bvo.setSeq(rs.getInt("seq"));
	            bvo.setTitle(rs.getString("title"));
	            bvo.setContents(rs.getString("contents"));
	            bvo.setRegid(rs.getString("regid"));
	            bvo.setRegdate(rs.getString("regdate"));
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        // 리소스 정리
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    return bvo;
	}
	
	
	public ArrayList<BoardVO> boardSelect() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		DataSource ds = null;
		MyOracleConnection moc = new MyOracleConnection(); // 클래스 분리시켜놓아서 인스턴스 생성해서 사용
		try {
			// ---------------DBCP를 사용한 DB 연결 -----------------------
			// conn = moc.oracleConn();
			ds = moc.myOracleDataSource();
			conn = ds.getConnection();
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardVO bvo = new BoardVO();
				bvo.setSeq(rs.getInt("seq"));
				bvo.setTitle(rs.getString("title"));
				bvo.setContents(rs.getString("contents"));
				bvo.setRegid(rs.getString("regid"));
				bvo.setRegdate(rs.getString("regdate"));
				list.add(bvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			moc.oracleClose(conn, pstmt, rs);
		}
		return list;
	}

	public int boardInsert(BoardVO bvo) {
		// seq *title *contents *regid regdate
		// nextval session,cookies sysdate
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertRows = 0;
		DataSource ds = null;
		MyOracleConnection moc = new MyOracleConnection(); // 클래스 분리시켜놓아서 인스턴스 생성해서 사용

		try {
			// ---------------DBCP를 사용한 DB 연결 -----------------------
			// conn = moc.oracleConn();
			ds = moc.myOracleDataSource();
			conn = ds.getConnection();

			String sql = "insert into board values(board_seq.nextval,?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bvo.getTitle());
			pstmt.setString(2, bvo.getContents());
			pstmt.setString(3, bvo.getRegid());
			insertRows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			moc.oracleClose(conn, pstmt);
		}
		return insertRows;
	}

	// public int boardUpdate(String title, String contetns, String regdate ) {
	public int boardUpdate(BoardVO bvo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updateRows = 0;
		DataSource ds = null;
		MyOracleConnection moc = new MyOracleConnection(); // 클래스 분리시켜놓아서 인스턴스 생성해서 사용

		try {
			// ---------------DBCP를 사용한 DB 연결 -----------------------
			// conn = moc.oracleConn();
			ds = moc.myOracleDataSource();
			conn = ds.getConnection();

			String sql = "update board set title=?, contents=? where seq=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bvo.getTitle());
			pstmt.setString(2, bvo.getContents());
			pstmt.setInt(3, bvo.getSeq());
			updateRows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			moc.oracleClose(conn, pstmt);
		}
		return updateRows;
	}

	public int boardDelete(int seq) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int delRows = 0;
		DataSource ds = null;
		MyOracleConnection moc = new MyOracleConnection(); // 클래스 분리시켜놓아서 인스턴스 생성해서 사용

		try {
			// ---------------DBCP를 사용한 DB 연결 -----------------------
			// conn = moc.oracleConn();
			ds = moc.myOracleDataSource();
			conn = ds.getConnection();
			
			String sql = "delete from board where seq=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			delRows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			moc.oracleClose(conn, pstmt);
		}
		return delRows;
	}

}
