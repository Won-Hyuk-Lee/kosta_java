package com.kosta.sample.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.kosta.sample.board.BoardVO;
import com.kosta.sample.common.MyOracleConnection;

//Data Access Object : DML

public class UserDAO {
	public int userInsert(UserVO uvo) {
		MyOracleConnection moc = new MyOracleConnection();  //클래스 분리시켜놓아서 인스턴스 생성해서 사용
		DataSource ds = null;
		Connection conn = null;
		PreparedStatement pstmt  = null;
		int insertRows = 0;
		
		//파라미터가 잘 넘어왔는지 확인용 코드 (seq=0, regdate=null)
		System.out.println(uvo.toString());
		
		try {
			//conn = moc.oracleConn();
			ds = moc.myOracleDataSource();
			conn = ds.getConnection();
			if(conn != null) System.out.println("conn ok ");
			else System.out.println("conn fail ");
			
			String sql = "insert into users values(users_seq.nextval,?,?,?,?,sysdate, 'u')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uvo.getUserid());
			pstmt.setString(2, uvo.getUname());
			pstmt.setString(3, uvo.getEmail());
			pstmt.setString(4, uvo.getPasswd());
			insertRows =  pstmt.executeUpdate();
		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return insertRows;
	}
	
	public UserVO userLogin(String userid, String passwd) {
		
		boolean userCheck = false;
		Connection conn = null;
		PreparedStatement pstmt  = null;
		ResultSet rs = null;
		DataSource ds = null;
		MyOracleConnection moc = new MyOracleConnection();  //클래스 분리시켜놓아서 인스턴스 생성해서 사용
		UserVO uvo = new UserVO();
		
		try {
			//---------------DBCP를 사용한 DB 연결 -----------------------
			//conn = moc.oracleConn();
			ds = moc.myOracleDataSource();
			conn = ds.getConnection();  
			
			String sql = "select userid, uname, grade from users where userid=? and passwd=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			rs =  pstmt.executeQuery();
			
			if(rs.next()) {
				uvo.setUserid(rs.getString("userid"));
				uvo.setUname(rs.getString("uname"));
				uvo.setGrade(rs.getString("grade"));
				uvo.setLoginCheck(true);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			moc.oracleClose(conn, pstmt, rs);
		}
		return uvo;
	}
	
}
