package com.kosta.sample.json;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCTest {
	public static void main(String[] args) {
		// 객체사용후 close하기위해 지역변수로 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 오라클 드라이버를 사용하겠다는 의미
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 자신의 주소값에 scott 라는 아이디와 tiger 의 비밀번호로 접속함
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "it", "0000");

			stmt = conn.createStatement();
			// EMP 테이블 전체조회하기위한 쿼리문
			String query = "SELECT * FROM EMP";

			//select문이기때문에 executeQuery으로사용
			rs = stmt.executeQuery(query);

			while(rs.next()) {
				int empNo = rs.getInt("EMPNO");
				System.out.println(empNo);
				
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 항상 사용후 무조건 닫아주자!
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} 
}
