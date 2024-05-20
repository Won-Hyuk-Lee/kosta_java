package com.kosta.sample.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kosta.sample.jdbc.EmpVO;

public class MyBoard {
	final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	final String DB_ID = "it";
	final String DB_PW = "0000";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void oracleConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			conn = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
			if (conn != null) {
				System.out.println("conn ok");
			} else {
				System.out.println("conn no");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param table = String 테이블명
	 * @param attribute = String 속성
	 * @throws SQLException
	 */
	public void boardSelect(String table, String attribute) throws SQLException {

		pstmt = conn.prepareStatement("select " + table + " from " + attribute);
		rs = pstmt.executeQuery();

		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		while (rs.next() == true) {
			EmpVO vo = new EmpVO();
			vo.setEmpno(rs.getInt("empno"));
			vo.setEname(rs.getString("ename"));
			list.add(vo);
		}

		System.out.println("총:" + list.size());
		for (int i = 0; i < list.size(); i++) {
			int a = list.get(i).getEmpno();
			String b = list.get(i).getEname();
			System.out.println(a + "\t" + b);
		}
	}
	
	public void boardDelete(int empno) throws SQLException {
		//pstmt.executeUpdate("delete from emp where empno = " + empno);
		//pstmt.executeUpdate("rollback");
	}

	public void boardDelete(EmpVO e) throws SQLException {
		pstmt.executeUpdate("delete from emp where empno = " + e.getEmpno() + "");
	}

	public void oracleClose() throws SQLException {
		conn.close();
	}

}
